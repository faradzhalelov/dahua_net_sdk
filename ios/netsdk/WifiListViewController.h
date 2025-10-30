//
//  WifiListViewController.h
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/12/10.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface WifiListViewController : UIViewController<UITableViewDelegate, UITableViewDataSource>

@property (strong, nonatomic) NSString *strIP;
@property (strong, nonatomic) NSString *strUser;
@property (strong, nonatomic) NSString *strPwd;

@property (nonatomic) long lLoginID;
@end
