#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_commons_LocalVariablesSorter : NSObject
+ (x_org_objectweb_asm_commons_LocalVariablesSorter*) valueWithIntWithStringWithMethodVisitor:(int) arg0 :(NSString*) arg1 :(id) arg2;
- (void) visitVarInsnWithIntWithInt:(int) arg0 :(int) arg1;
- (void) visitIincInsnWithIntWithInt:(int) arg0 :(int) arg1;
- (void) visitMaxsWithIntWithInt:(int) arg0 :(int) arg1;
- (void) visitLocalVariableWithStringWithStringWithStringWithLabelWithLabelWithInt:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2 :(id) arg3 :(id) arg4 :(int) arg5;
- (id) visitLocalVariableAnnotationWithIntWithTypePathWithLabelWithLabelWithIntWithStringWithBoolean:(int) arg0 :(id) arg1 :(id) arg2 :(id) arg3 :(id) arg4 :(NSString*) arg5 :(bool) arg6;
- (void) visitFrameWithIntWithIntWithObjectWithIntWithObject:(int) arg0 :(int) arg1 :(id) arg2 :(int) arg3 :(id) arg4;
- (int) newLocalWithType:(id) arg0;
@end
