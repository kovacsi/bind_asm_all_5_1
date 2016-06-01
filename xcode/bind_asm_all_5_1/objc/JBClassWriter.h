#import <Foundation/Foundation.h>
#import "JBClassReader.h"
#import "JBTypePath.h"
#import "JBAttribute.h"
#import "JBHandle.h"

#define COMPUTE_MAXS 1
#define COMPUTE_FRAMES 2

@interface JBClassWriter : NSObject

+ (JBClassWriter*)valueWithInt:(int)arg0;
+ (JBClassWriter*)valueWithClassReader:(JBClassReader*)arg0 withInt:(int)arg1;
- (void)visitWithInt:(int)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withString:(id)arg5;
- (void)visitSourceWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (void)visitOuterClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitAttributeWithAttribute:(JBAttribute*)arg0;
- (void)visitInnerClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withInt:(int)arg3;
- (id)visitFieldWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withObject:(id)arg4;
- (id)visitMethodWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(id)arg4;
- (void)visitEnd;
- (id)toByteArray;
- (int)newConstWithObject:(id)arg0;
- (int)newUTF8WithString:(NSString*)arg0;
- (int)newClassWithString:(NSString*)arg0;
- (int)newMethodTypeWithString:(NSString*)arg0;
- (int)newHandleWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
- (int)newHandleWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4;
- (int)newInvokeDynamicWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(JBHandle*)arg2 withObject:(id)arg3;
- (int)newFieldWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (int)newMethodWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (int)newNameTypeWithString:(NSString*)arg0 withString:(NSString*)arg1;

@end
