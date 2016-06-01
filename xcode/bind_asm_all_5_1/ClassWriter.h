#import <Foundation/Foundation.h>
#import "ClassReader.h"
#import "TypePath.h"
#import "Attribute.h"
#import "Handle.h"

@interface ClassWriter : NSObject

+ (ClassWriter*)valueWithInt:(int)arg0;
+ (ClassWriter*)valueWithClassReader:(ClassReader*)arg0 withInt:(int)arg1;
- (void)visitWithInt:(int)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withString:(id)arg5;
- (void)visitSourceWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (void)visitOuterClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitAttributeWithAttribute:(Attribute*)arg0;
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
- (int)newInvokeDynamicWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(org_objectweb_asm_Handle*)arg2 withObject:(id)arg3;
- (int)newFieldWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (int)newMethodWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (int)newNameTypeWithString:(NSString*)arg0 withString:(NSString*)arg1;

@end