#import <Foundation/Foundation.h>
#import "JBMethod.h"
#import "JBType.h"
#import "JBHandle.h"
#import "JBLabel.h"

#define ADD 96
#define SUB 100
#define MUL 104
#define DIV 108
#define REM 112
#define NEG 116
#define SHL 120
#define SHR 122
#define USHR 124
#define AND 126
#define OR 128
#define XOR 130
#define EQ 153
#define NE 154
#define LT 155
#define GE 156
#define GT 157
#define LE 158

@interface JBGeneratorAdapter : NSObject

+ (JBGeneratorAdapter*)valueWithMethodVisitor:(id)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
+ (JBGeneratorAdapter*)valueWithInt:(int)arg0 withMethod:(JBMethod*)arg1 withMethodVisitor:(id)arg2;
+ (JBGeneratorAdapter*)valueWithInt:(int)arg0 withMethod:(JBMethod*)arg1 withString:(NSString*)arg2 withType:(id)arg3 withClassVisitor:(id)arg4;
- (void)pushWithBoolean:(bool)arg0;
- (void)pushWithInt:(int)arg0;
- (void)pushWithLong:(long)arg0;
- (void)pushWithFloat:(float)arg0;
- (void)pushWithDouble:(double)arg0;
- (void)pushWithString:(NSString*)arg0;
- (void)pushWithType:(JBType*)arg0;
- (void)pushWithHandle:(JBHandle*)arg0;
- (void)loadThis;
- (void)loadArgWithInt:(int)arg0;
- (void)loadArgsWithInt:(int)arg0 withInt:(int)arg1;
- (void)loadArgs;
- (void)loadArgArray;
- (void)storeArgWithInt:(int)arg0;
- (JBType*)getLocalTypeWithInt:(int)arg0;
- (void)loadLocalWithInt:(int)arg0;
- (void)loadLocalWithInt:(int)arg0 withType:(JBType*)arg1;
- (void)storeLocalWithInt:(int)arg0;
- (void)storeLocalWithInt:(int)arg0 withType:(JBType*)arg1;
- (void)arrayLoadWithType:(JBType*)arg0;
- (void)arrayStoreWithType:(JBType*)arg0;
- (void)pop;
- (void)pop2;
- (void)dup;
- (void)dup2;
- (void)dupX1;
- (void)dupX2;
- (void)dup2X1;
- (void)dup2X2;
- (void)swap;
- (void)swapWithType:(JBType*)arg0 withType:(JBType*)arg1;
- (void)mathWithInt:(int)arg0 withType:(JBType*)arg1;
- (void)not;
- (void)iincWithInt:(int)arg0 withInt:(int)arg1;
- (void)castWithType:(JBType*)arg0 withType:(JBType*)arg1;
- (void)boxWithType:(JBType*)arg0;
- (void)valueOfWithType:(JBType*)arg0;
- (void)unboxWithType:(JBType*)arg0;
- (JBLabel*)newLabel;
- (void)markWithLabel:(JBLabel*)arg0;
- (JBLabel*)mark;
- (void)ifCmpWithType:(JBType*)arg0 withInt:(int)arg1 withLabel:(JBLabel*)arg2;
- (void)ifICmpWithInt:(int)arg0 withLabel:(JBLabel*)arg1;
- (void)ifZCmpWithInt:(int)arg0 withLabel:(JBLabel*)arg1;
- (void)ifNullWithLabel:(JBLabel*)arg0;
- (void)ifNonNullWithLabel:(JBLabel*)arg0;
- (void)goToWithLabel:(JBLabel*)arg0;
- (void)retWithInt:(int)arg0;
- (void)tableSwitchWithInt:(id)arg0 withTableSwitchGenerator:(id)arg1;
- (void)tableSwitchWithInt:(id)arg0 withTableSwitchGenerator:(id)arg1 withBoolean:(bool)arg2;
- (void)returnValue;
- (void)getStaticWithType:(JBType*)arg0 withString:(NSString*)arg1 withType:(JBType*)arg2;
- (void)putStaticWithType:(JBType*)arg0 withString:(NSString*)arg1 withType:(JBType*)arg2;
- (void)getFieldWithType:(JBType*)arg0 withString:(NSString*)arg1 withType:(JBType*)arg2;
- (void)putFieldWithType:(JBType*)arg0 withString:(NSString*)arg1 withType:(JBType*)arg2;
- (void)invokeVirtualWithType:(JBType*)arg0 withMethod:(JBMethod*)arg1;
- (void)invokeConstructorWithType:(JBType*)arg0 withMethod:(JBMethod*)arg1;
- (void)invokeStaticWithType:(JBType*)arg0 withMethod:(JBMethod*)arg1;
- (void)invokeInterfaceWithType:(JBType*)arg0 withMethod:(JBMethod*)arg1;
- (void)invokeDynamicWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(JBHandle*)arg2 withObject:(id)arg3;
- (void)newInstanceWithType:(JBType*)arg0;
- (void)newArrayWithType:(JBType*)arg0;
- (void)arrayLength;
- (void)throwException;
- (void)throwExceptionWithType:(JBType*)arg0 withString:(NSString*)arg1;
- (void)checkCastWithType:(JBType*)arg0;
- (void)instanceOfWithType:(JBType*)arg0;
- (void)monitorEnter;
- (void)monitorExit;
- (void)endMethod;
- (void)catchExceptionWithLabel:(JBLabel*)arg0 withLabel:(JBLabel*)arg1 withType:(JBType*)arg2;

@end
