#import <Foundation/Foundation.h>

@interface InsnNode : NSObject

+ (InsnNode*)valueWithInt:(int)arg0;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end