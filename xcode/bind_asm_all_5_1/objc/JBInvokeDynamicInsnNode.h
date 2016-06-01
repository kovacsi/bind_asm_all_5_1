#import <Foundation/Foundation.h>
#import "JBHandle.h"


@interface JBInvokeDynamicInsnNode : NSObject

+ (JBInvokeDynamicInsnNode*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(JBHandle*)arg2 withObject:(id)arg3;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end
