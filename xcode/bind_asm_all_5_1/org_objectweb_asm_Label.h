#import <Foundation/Foundation.h>

@interface org_objectweb_asm_Label : NSObject

+ (org_objectweb_asm_Label*)value;
- (int)getOffset;
- (NSString*)toString;

@end