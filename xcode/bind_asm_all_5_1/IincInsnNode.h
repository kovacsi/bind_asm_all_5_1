#import <Foundation/Foundation.h>

@interface IincInsnNode : NSObject

+ (IincInsnNode*)valueWithInt:(int)arg0 withInt:(int)arg1;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end