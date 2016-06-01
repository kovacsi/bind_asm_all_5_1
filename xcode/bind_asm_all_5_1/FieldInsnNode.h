#import <Foundation/Foundation.h>

@interface FieldInsnNode : NSObject

+ (FieldInsnNode*)valueWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
- (void)setOpcodeWithInt:(int)arg0;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end