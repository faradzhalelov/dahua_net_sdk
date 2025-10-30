//
//  FunctionMenuTableViewController.m
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/7/9.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import "FunctionListTableViewController.h"
#import "LivePreviewViewController.h"
#import "SnapPictureViewController.h"
#import "TalkViewController.h"
#import "ControlDeviceViewController.h"
#import "AlarmPushViewController.h"
#import "netsdk.h"
#import "Global.h"
#import "FileBrowserTableViewController.h"
#import "MutiPreviewViewController.h"
#import "AlarmListenViewController.h"
#import "PlayBackViewController.h"
#import "VideoTalkViewController.h"

static NSString* CellIdentifier = @"CELL";

@interface FunctionListTableViewController ()

@property (copy, nonatomic) NSArray *arrController;

@end

@implementation FunctionListTableViewController

@synthesize arrController;

- (id)initWithStyle:(UITableViewStyle)style {
    
    self = [super initWithStyle:style];
    if (self) {
        arrController = @[
                          [[LivePreviewViewController alloc] init],
                          [[MutiPreviewViewController alloc] init],
                          [[PlayBackViewController alloc] init],
                          [[TalkViewController alloc] init],
                          [[SnapPictureViewController alloc] init],
                          [[AlarmListenViewController alloc] init],
                          [[AlarmPushViewController alloc] init],
                          [[ControlDeviceViewController alloc] init],
                          [[VideoTalkViewController alloc] init],
                          [[LocalViewTableViewController alloc] init]
                          ];
    }
    return self;
}

- (void)viewDidLoad {
    [super viewDidLoad];
    
    // Uncomment the following line to preserve selection between presentations.
    // self.clearsSelectionOnViewWillAppear = NO;
    
    // Uncomment the following line to display an Edit button in the navigation bar for this view controller.
    // self.navigationItem.rightBarButtonItem = self.editButtonItem;
    
    self.title = _L(@"Function List");
    self.view.backgroundColor = BASE_BACKGROUND_COLOR;
    
    [self.tableView registerClass:[UITableViewCell class] forCellReuseIdentifier:CellIdentifier];
    self.navigationItem.backBarButtonItem = [[UIBarButtonItem alloc] initWithTitle:_L(@"Back") style:UIBarButtonItemStylePlain target:nil action:nil];
    
}

- (NSArray*)tableTitles {
    
    return @[_L(@"Live Preview(Single Channel)"),
             _L(@"Live Preview(Double Channel)"),
             _L(@"Playback"),
             _L(@"Talk"),
             _L(@"Snap Picture"),
             _L(@"Alarm Listen"),
             _L(@"Alarm Push"),
             _L(@"Control Device"),
             _L(@"Video Talk"),
             _L(@"File Browser")
             ];
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

#pragma mark - Table view data source

- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView {

    return 1;
}

- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section {

    return [self tableTitles].count;
}

- (CGFloat)tableView:(UITableView *)tableView heightForFooterInSection:(NSInteger)section
{
    return 10;
}

- (CGFloat)tableView:(UITableView *)tableView heightForHeaderInSection:(NSInteger)section
{
    return 10;
}

- (CGFloat)tableView:(UITableView *)tableView heightForRowAtIndexPath:(NSIndexPath *)indexPath
{
    return kScreenHeight/10;
}

- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath {
    
    UITableViewCell *cell = [tableView dequeueReusableCellWithIdentifier:CellIdentifier forIndexPath:indexPath];
    
    if (nil == cell) {
        cell = [[UITableViewCell alloc] initWithStyle:UITableViewCellStyleDefault reuseIdentifier:CellIdentifier];
    }
    UIViewController *controller = arrController[indexPath.row];
    cell.textLabel.text = [self tableTitles][indexPath.row];
    cell.textLabel.font = [UIFont systemFontOfSize:24];
    cell.textLabel.adjustsFontSizeToFitWidth = TRUE;
    if ([controller isKindOfClass:[UIViewController class]]) {
        cell.accessoryType = UITableViewCellAccessoryDisclosureIndicator;
    }
    
    return cell;
}

- (void)tableView:(UITableView *)tableView didSelectRowAtIndexPath:(NSIndexPath *)indexPath {
    
    id controller = arrController[indexPath.row];
    if ([controller isKindOfClass:[UIViewController class]]) {
        if ([self.navigationController.viewControllers indexOfObject:controller] == NSNotFound) {
            [self.navigationController pushViewController:controller animated:YES];
        }
    }
    [tableView deselectRowAtIndexPath: indexPath animated: YES];
}

- (void)didMoveToParentViewController:(UIViewController *)parent {
    
    if (!parent) {
        CLIENT_Logout(g_loginID);
        g_loginID = 0;
    }
}

/*
// Override to support conditional editing of the table view.
- (BOOL)tableView:(UITableView *)tableView canEditRowAtIndexPath:(NSIndexPath *)indexPath {
    // Return NO if you do not want the specified item to be editable.
    return YES;
}
*/

/*
// Override to support editing the table view.
- (void)tableView:(UITableView *)tableView commitEditingStyle:(UITableViewCellEditingStyle)editingStyle forRowAtIndexPath:(NSIndexPath *)indexPath {
    if (editingStyle == UITableViewCellEditingStyleDelete) {
        // Delete the row from the data source
        [tableView deleteRowsAtIndexPaths:@[indexPath] withRowAnimation:UITableViewRowAnimationFade];
    } else if (editingStyle == UITableViewCellEditingStyleInsert) {
        // Create a new instance of the appropriate class, insert it into the array, and add a new row to the table view
    }   
}
*/

/*
// Override to support rearranging the table view.
- (void)tableView:(UITableView *)tableView moveRowAtIndexPath:(NSIndexPath *)fromIndexPath toIndexPath:(NSIndexPath *)toIndexPath {
}
*/

/*
// Override to support conditional rearranging of the table view.
- (BOOL)tableView:(UITableView *)tableView canMoveRowAtIndexPath:(NSIndexPath *)indexPath {
    // Return NO if you do not want the item to be re-orderable.
    return YES;
}
*/

/*
#pragma mark - Navigation

// In a storyboard-based application, you will often want to do a little preparation before navigation
- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender {
    // Get the new view controller using [segue destinationViewController].
    // Pass the selected object to the new view controller.
}
*/

@end
