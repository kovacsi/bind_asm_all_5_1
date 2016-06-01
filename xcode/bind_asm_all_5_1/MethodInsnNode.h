#import <Foundation/Foundation.h>

@interface MethodInsnNode : NSObject

+ (MethodInsnNode*)valueWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
+ (MethodInsnNode*)valueWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4;
- (void)setOpcodeWithInt:(int)arg0;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end