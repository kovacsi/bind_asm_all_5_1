#import <Foundation/Foundation.h>
#import "Method.h"
#import "Type.h"
#import "Handle.h"
#import "Label.h"

@interface GeneratorAdapter : NSObject

+ (GeneratorAdapter*)valueWithMethodVisitor:(id)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
+ (GeneratorAdapter*)valueWithInt:(int)arg0 withMethod:(Method*)arg1 withMethodVisitor:(id)arg2;
+ (GeneratorAdapter*)valueWithInt:(int)arg0 withMethod:(Method*)arg1 withString:(NSString*)arg2 withType:(id)arg3 withClassVisitor:(id)arg4;
- (void)pushWithBoolean:(bool)arg0;
- (void)pushWithInt:(int)arg0;
- (void)pushWithLong:(long)arg0;
- (void)pushWithFloat:(float)arg0;
- (void)pushWithDouble:(double)arg0;
- (void)pushWithString:(NSString*)arg0;
- (void)pushWithType:(Type*)arg0;
- (void)pushWithHandle:(org_objectweb_asm_Handle*)arg0;
- (void)loadThis;
- (void)loadArgWithInt:(int)arg0;
- (void)loadArgsWithInt:(int)arg0 withInt:(int)arg1;
- (void)loadArgs;
- (void)loadArgArray;
- (void)storeArgWithInt:(int)arg0;
- (Type*)getLocalTypeWithInt:(int)arg0;
- (void)loadLocalWithInt:(int)arg0;
- (void)loadLocalWithInt:(int)arg0 withType:(Type*)arg1;
- (void)storeLocalWithInt:(int)arg0;
- (void)storeLocalWithInt:(int)arg0 withType:(Type*)arg1;
- (void)arrayLoadWithType:(Type*)arg0;
- (void)arrayStoreWithType:(Type*)arg0;
- (void)pop;
- (void)pop2;
- (void)dup;
- (void)dup2;
- (void)dupX1;
- (void)dupX2;
- (void)dup2X1;
- (void)dup2X2;
- (void)swap;
- (void)swapWithType:(Type*)arg0 withType:(Type*)arg1;
- (void)mathWithInt:(int)arg0 withType:(Type*)arg1;
- (void)not;
- (void)iincWithInt:(int)arg0 withInt:(int)arg1;
- (void)castWithType:(Type*)arg0 withType:(Type*)arg1;
- (void)boxWithType:(Type*)arg0;
- (void)valueOfWithType:(Type*)arg0;
- (void)unboxWithType:(Type*)arg0;
- (Label*)newLabel;
- (void)markWithLabel:(Label*)arg0;
- (Label*)mark;
- (void)ifCmpWithType:(Type*)arg0 withInt:(int)arg1 withLabel:(Label*)arg2;
- (void)ifICmpWithInt:(int)arg0 withLabel:(Label*)arg1;
- (void)ifZCmpWithInt:(int)arg0 withLabel:(Label*)arg1;
- (void)ifNullWithLabel:(Label*)arg0;
- (void)ifNonNullWithLabel:(Label*)arg0;
- (void)goToWithLabel:(Label*)arg0;
- (void)retWithInt:(int)arg0;
- (void)tableSwitchWithInt:(id)arg0 withTableSwitchGenerator:(id)arg1;
- (void)tableSwitchWithInt:(id)arg0 withTableSwitchGenerator:(id)arg1 withBoolean:(bool)arg2;
- (void)returnValue;
- (void)getStaticWithType:(Type*)arg0 withString:(NSString*)arg1 withType:(Type*)arg2;
- (void)putStaticWithType:(Type*)arg0 withString:(NSString*)arg1 withType:(Type*)arg2;
- (void)getFieldWithType:(Type*)arg0 withString:(NSString*)arg1 withType:(Type*)arg2;
- (void)putFieldWithType:(Type*)arg0 withString:(NSString*)arg1 withType:(Type*)arg2;
- (void)invokeVirtualWithType:(Type*)arg0 withMethod:(Method*)arg1;
- (void)invokeConstructorWithType:(Type*)arg0 withMethod:(Method*)arg1;
- (void)invokeStaticWithType:(Type*)arg0 withMethod:(Method*)arg1;
- (void)invokeInterfaceWithType:(Type*)arg0 withMethod:(Method*)arg1;
- (void)invokeDynamicWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(org_objectweb_asm_Handle*)arg2 withObject:(id)arg3;
- (void)newInstanceWithType:(Type*)arg0;
- (void)newArrayWithType:(Type*)arg0;
- (void)arrayLength;
- (void)throwException;
- (void)throwExceptionWithType:(Type*)arg0 withString:(NSString*)arg1;
- (void)checkCastWithType:(Type*)arg0;
- (void)instanceOfWithType:(Type*)arg0;
- (void)monitorEnter;
- (void)monitorExit;
- (void)endMethod;
- (void)catchExceptionWithLabel:(Label*)arg0 withLabel:(Label*)arg1 withType:(Type*)arg2;

@end