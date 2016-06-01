#import <Foundation/Foundation.h>


@interface JBFrame : NSObject

+ (JBFrame*)valueWithInt:(int)arg0 withInt:(int)arg1;
+ (JBFrame*)valueWithFrame:(JBFrame*)arg0;
- (JBFrame*)initWithFrame:(JBFrame*)arg0;
- (void)setReturnWithValue:(id)arg0;
- (int)getLocals;
- (int)getMaxStackSize;
- (id)getLocalWithInt:(int)arg0;
- (void)setLocalWithInt:(int)arg0 withValue:(id)arg1;
- (int)getStackSize;
- (id)getStackWithInt:(int)arg0;
- (void)clearStack;
- (id)pop;
- (void)pushWithValue:(id)arg0;
- (void)executeWithAbstractInsnNode:(id)arg0 withInterpreter:(id)arg1;
- (bool)mergeWithFrame:(JBFrame*)arg0 withInterpreter:(id)arg1;
- (bool)mergeWithFrame:(JBFrame*)arg0 withBoolean:(id)arg1;
- (NSString*)toString;

@end
