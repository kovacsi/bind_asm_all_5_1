#import <Foundation/Foundation.h>

@interface TypeInsnNode : NSObject

+ (TypeInsnNode*)valueWithInt:(int)arg0 withString:(NSString*)arg1;
- (void)setOpcodeWithInt:(int)arg0;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end