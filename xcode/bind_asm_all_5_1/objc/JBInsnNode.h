#import <Foundation/Foundation.h>


@interface JBInsnNode : NSObject

+ (JBInsnNode*)valueWithInt:(int)arg0;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end
