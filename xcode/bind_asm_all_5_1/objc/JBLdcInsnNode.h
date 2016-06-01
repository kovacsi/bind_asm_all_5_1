#import <Foundation/Foundation.h>


@interface JBLdcInsnNode : NSObject

+ (JBLdcInsnNode*)valueWithObject:(id)arg0;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end
