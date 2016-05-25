#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_commons_MethodRemapper : NSObject
+ (x_org_objectweb_asm_commons_MethodRemapper*) valueWithIdWithId:(id) arg0 :(id) arg1;
- (id) visitAnnotationDefault;
- (id) visitParameterAnnotationWithIntWithStringWithBool:(int) arg0 :(NSString*) arg1 :(bool) arg2;
- (id) visitInsnAnnotationWithIntWithIdWithStringWithBool:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (void) visitTryCatchBlockWithIdWithIdWithIdWithString:(id) arg0 :(id) arg1 :(id) arg2 :(NSString*) arg3;
- (id) visitTryCatchAnnotationWithIntWithIdWithStringWithBool:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
@end
