#import <Foundation/Foundation.h>
#import "org_objectweb_asm_Handle.h"
#import "org_objectweb_asm_Label.h"

@interface org_objectweb_asm_commons_RemappingMethodAdapter : NSObject

- (void)visitFrameWithInt:(int)arg0 withInt:(int)arg1 withObject:(id)arg2 withInt:(int)arg3 withObject:(id)arg4;
- (void)visitFieldInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
- (void)visitMethodInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
- (void)visitMethodInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4;
- (void)visitInvokeDynamicInsnWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(org_objectweb_asm_Handle*)arg2 withObject:(id)arg3;
- (void)visitTypeInsnWithInt:(int)arg0 withString:(NSString*)arg1;
- (void)visitLdcInsnWithObject:(id)arg0;
- (void)visitMultiANewArrayInsnWithString:(NSString*)arg0 withInt:(int)arg1;
- (void)visitTryCatchBlockWithLabel:(org_objectweb_asm_Label*)arg0 withLabel:(org_objectweb_asm_Label*)arg1 withLabel:(org_objectweb_asm_Label*)arg2 withString:(NSString*)arg3;
- (void)visitLocalVariableWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withLabel:(org_objectweb_asm_Label*)arg3 withLabel:(org_objectweb_asm_Label*)arg4 withInt:(int)arg5;

@end