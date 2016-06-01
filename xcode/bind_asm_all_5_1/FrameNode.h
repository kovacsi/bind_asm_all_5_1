#import <Foundation/Foundation.h>

@interface FrameNode : NSObject

+ (FrameNode*)valueWithInt:(int)arg0 withInt:(int)arg1 withObject:(id)arg2 withInt:(int)arg3 withObject:(id)arg4;
- (int)getType;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)cloneWithMap:(id)arg0;

@end