#import <Foundation/Foundation.h>
#import "Label.h"

@interface JSRInlinerAdapter : NSObject

+ (JSRInlinerAdapter*)valueWithMethodVisitor:(id)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withString:(id)arg5;
- (void)visitJumpInsnWithInt:(int)arg0 withLabel:(Label*)arg1;
- (void)visitEnd;

@end