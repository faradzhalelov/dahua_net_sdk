//
//  APConfigViewController.h
//  NetSDK_Demo
//
//  Created by NetSDK on 2018/12/10.
//  Copyright © 2018年 NetSDK. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface APConfigViewController : UIViewController
@property (nonatomic) NSString *m_strSSID;
@property (nonatomic) int   m_nAuthMode;
@property (nonatomic) int   m_nEncrAlgr;

@property (nonatomic) long lLoginID;

@end
