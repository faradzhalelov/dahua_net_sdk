//
//  AppDelegate.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/5.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "AppDelegate.h"
#import "MainMenuViewController.h"
#import "netsdk.h"
#import "Global.h"
#import "GlobalDefine.h"
#import "Reachability.h"

#ifdef NSFoundationVersionNumber_iOS_9_x_Max
#import <UserNotifications/UserNotifications.h>
#endif

#define IOS13_OR_LATER ([[[UIDevice currentDevice] systemVersion] floatValue] >= 13.0)
#define IOS12_OR_LATER ([[[UIDevice currentDevice] systemVersion] floatValue] >= 12.0)
#define IOS10_OR_LATER ([[[UIDevice currentDevice] systemVersion] floatValue] >= 10.0)
#define IOS9_OR_LATER ([[[UIDevice currentDevice] systemVersion] floatValue] >= 9.0)
#define IOS8_OR_LATER ([[[UIDevice currentDevice] systemVersion] floatValue] >= 8.0)
#define IOS7_OR_LATER ([[[UIDevice currentDevice] systemVersion] floatValue] >= 7.0)

@interface AppDelegate ()<UNUserNotificationCenterDelegate>

@property(nonatomic, strong) Reachability *reachability;

@end

@implementation AppDelegate



- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions {
    // Override point for customization after application launch.
    
    self.window = [[UIWindow alloc] initWithFrame:[[UIScreen mainScreen]bounds]];
    
    [self.window makeKeyAndVisible];
    
    self.MainMenuView = [[UINavigationController alloc] initWithRootViewController:[[MainMenuViewController alloc]init]];
    self.window.rootViewController = self.MainMenuView;
    
    self.window.backgroundColor = [UIColor whiteColor];
    [self.window makeKeyAndVisible];
    
    
    
    
    // 注册消息推送
    if ([[UIDevice currentDevice].systemVersion floatValue] < 8.0) {
        [[UIApplication sharedApplication] registerForRemoteNotificationTypes: UIRemoteNotificationTypeBadge | UIRemoteNotificationTypeSound | UIRemoteNotificationTypeAlert];
    }else{
        // iOS8.0+
        [[UIApplication sharedApplication]registerUserNotificationSettings:[UIUserNotificationSettings                                                                   settingsForTypes:(UIUserNotificationTypeSound |UIUserNotificationTypeAlert | UIUserNotificationTypeBadge)                                                                           categories:nil]];
        [[UIApplication sharedApplication]registerForRemoteNotifications];
    }
    
    //添加网络变化的回调

    [[NSNotificationCenter defaultCenter] addObserver:self
                                             selector:@selector(reachabilityChanged:)
                                                 name:KNETWORKREACHABILITYCHANGEDNOTIFICATION
                                               object:nil];
  
    self.reachability = [Reachability reachabilityWithHostName:@"www.baidu.com"];
    [self.reachability startNotifier];

    return YES;
}



- (void)replyPushNotificationAuthorization:(UIApplication *)application
{
    if (IOS10_OR_LATER) {
        UNUserNotificationCenter *center = [UNUserNotificationCenter currentNotificationCenter];
        // 必须代理，不然无法监听通知的接受与点击事件
        center.delegate = self;
        [center requestAuthorizationWithOptions:(UNAuthorizationOptionBadge|UNAuthorizationOptionSound|UNAuthorizationOptionAlert) completionHandler:^(BOOL granted, NSError * _Nullable error) {
            if (!error  && granted) {
                NSLog(@"注册成功");
            }
            else {
                NSLog(@"注册失败");
            }
        }];
        // 获取权限设置
        [center getNotificationSettingsWithCompletionHandler:^(UNNotificationSettings * _Nonnull settings) {
            NSLog(@"=======%@", settings);
        }];
    }
    else if (IOS8_OR_LATER) {
        UIUserNotificationSettings *settings = [UIUserNotificationSettings settingsForTypes:UIUserNotificationTypeAlert | UIUserNotificationTypeBadge | UIUserNotificationTypeSound categories:nil];
        [application registerForRemoteNotifications];
    }
    else {
        [application registerForRemoteNotificationTypes:UIRemoteNotificationTypeBadge | UIRemoteNotificationTypeAlert | UIRemoteNotificationTypeSound];
    }
    
    // 注册远端消息通知获取device token
    [application registerForRemoteNotifications];
}

- (void)application:(UIApplication *)application didRegisterForRemoteNotificationsWithDeviceToken:(nonnull NSData *)deviceToken {
    
    NSLog(@"regisger success:%@", deviceToken);
    g_deviceToken = deviceToken;
    //注册成功，将deviceToken保存到应用服务器数据库中
    
    // iOS13获取token有变化
    if ([[[UIDevice currentDevice] systemVersion] floatValue] >= 13) {
        if (![deviceToken isKindOfClass:[NSData class]]) {
            // 记录获取token失败的描述
            NSLog(@"get token failed");
            return;
        }
        const unsigned *tokenBytes = (const unsigned *)[deviceToken bytes];
        NSString *strToken = [NSString stringWithFormat:@"%08x%08x%08x%08x%08x%08x%08x %08x",
                              ntohl(tokenBytes[0]),
                              ntohl(tokenBytes[1]),
                              ntohl(tokenBytes[2]),
                              ntohl(tokenBytes[3]),
                              ntohl(tokenBytes[4]),
                              ntohl(tokenBytes[5]),
                              ntohl(tokenBytes[6]),
                              ntohl(tokenBytes[7])];
        NSLog(@"deviceToken1:%@", strToken);
        g_Token = strToken;
        return;
    } else {
        NSString *deviceString = [[deviceToken description] stringByTrimmingCharactersInSet:[NSCharacterSet characterSetWithCharactersInString:@"<>"]];
        deviceString = [deviceString stringByReplacingOccurrencesOfString:@" " withString:@" "];
        
        NSLog(@"deviceToken : %@", deviceString);
        g_Token = deviceString;
        
    }
    
}

- (void)application:(UIApplication *)application didFailToRegisterForRemoteNotificationsWithError:(NSError *)error {
    
    NSLog(@"Regist failed(%@)",error);
    NSLog(@"[DeviceToken Error]:%@", error.description);
}

//App处于前台接受通知时
- (void) userNotificationCenter:(UNUserNotificationCenter *)center willPresentNotification:(UNNotification *)notification withCompletionHandler:(void (^)(UNNotificationPresentationOptions))completionHandler {
    
    // 收到推送的请求
    UNNotificationRequest *request = notification.request;
    
    // 收到推送的内容
    UNNotificationContent *content = request.content;
    
    // 收到用户的基本信息
    NSDictionary *userInfo = content.userInfo;
    
    // 收到推送消息的角标
    NSNumber *badge = content.badge;
    
    // 收到推送消息body
    NSString *body = content.body;
    
    // 推送消息的声音
    UNNotificationSound *sound = content.sound;
    
    // 推送消息的副标题
    NSString *subtitle = content.subtitle;
    
    // 推送消息的标题
    NSString *title = content.title;
    
    if ([notification.request.trigger isKindOfClass:[UNPushNotificationTrigger class]]) {
        NSLog(@"iOS10 收到远程通知:%@", userInfo);
    }
    else {
        // 本地通知
    }
    
    completionHandler(UNNotificationPresentationOptionBadge |
                      UNNotificationPresentationOptionSound |
                      UNNotificationPresentationOptionAlert );
}

// App通知的点击事件
- (void)userNotificationCenter:(UNUserNotificationCenter *)center didReceiveNotificationResponse:(UNNotificationResponse *)response withCompletionHandler:(void (^)())completionHandler {
    
    // 收到推送的请求
    UNNotificationRequest *request = response.notification.request;
    
    // 收到推送的内容
    UNNotificationContent *content = request.content;
    
    // 收到用户的基本信息
    NSDictionary *userInfo = content.userInfo;
    
    // 收到推送消息的角标
    NSNumber *badge = content.badge;
    
    // 收到推送消息body
    NSString *body = content.body;
    
    // 推送消息的声音
    UNNotificationSound *sound = content.sound;
    
    // 推送消息的副标题
    NSString *subtitle = content.subtitle;
    
    // 推送消息的标题
    NSString *title = content.title;
    
    if ([response.notification.request.trigger isKindOfClass:[UNPushNotificationTrigger class]]) {
        NSLog(@"iOS10 收到远程通知:%@",userInfo);
    }
    else {
        
    }
    
    completionHandler();
}

#pragma mark -iOS 10之前收到通知
- (void)application:(UIApplication *)application didReceiveRemoteNotification:(NSDictionary *)userInfo{
    
    // 处理推送消息
    NSLog(@"iOS6及以下系统，收到通知:%@", userInfo);
    NSLog(_L(@"Receive remote notification : %@"), userInfo);
    UIAlertView *alert = [[UIAlertView alloc]initWithTitle:@"通知"
                                                   message:@"我的信息"
                                                  delegate:self
                                         cancelButtonTitle:@"取消"
                                         otherButtonTitles:nil, nil];
    
    [alert show];
    
}
- (void)application:(UIApplication *)application didReceiveRemoteNotification:(nonnull NSDictionary *)userInfo fetchCompletionHandler:(nonnull void (^)(UIBackgroundFetchResult))completionHandler {
    NSLog(@"iOS7及以上系统，收到通知:%@",userInfo);
    completionHandler(UIBackgroundFetchResultNewData);
}

//网络变化回调
-(void)reachabilityChanged:(NSNotification*)note
{
    Reachability* curReach = [note object];
    NSParameterAssert([curReach isKindOfClass:[Reachability class]]);
    NetworkStatus netStatus = [curReach currentReachabilityStatus];
    switch (netStatus) {
        case kNotReachable: {
            
            break;
        }
        case kReachableViaWWAN: {
            break;
        }
        case kReachableViaWiFi: {
            break;
        }
    }
    
}


- (void)applicationWillResignActive:(UIApplication *)application {
    // Sent when the application is about to move from active to inactive state. This can occur for certain types of temporary interruptions (such as an incoming phone call or SMS message) or when the user quits the application and it begins the transition to the background state.
    // Use this method to pause ongoing tasks, disable timers, and invalidate graphics rendering callbacks. Games should use this method to pause the game.
    
    NSLog(@"applicationWillResignActive");
}


- (void)applicationDidEnterBackground:(UIApplication *)application {
    // Use this method to release shared resources, save user data, invalidate timers, and store enough application state information to restore your application to its current state in case it is terminated later.
    // If your application supports background execution, this method is called instead of applicationWillTerminate: when the user quits.
    
    NSLog(@"applicationDidEnterBackground");
}


- (void)applicationWillEnterForeground:(UIApplication *)application {
    // Called as part of the transition from the background to the active state; here you can undo many of the changes made on entering the background.
    
    NSLog(@"applicationWillEnterForeground");
}


- (void)applicationDidBecomeActive:(UIApplication *)application {
    // Restart any tasks that were paused (or not yet started) while the application was inactive. If the application was previously in the background, optionally refresh the user interface.
    
    NSLog(@"applicationDidBecomeActive");
}


- (void)applicationWillTerminate:(UIApplication *)application {
    // Called when the application is about to terminate. Save data if appropriate. See also applicationDidEnterBackground:.
    
    NSLog(@"applicationWillTerminate");
    CLIENT_Cleanup();
}


@end
