#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_commons_LocalVariablesSorter : NSObject
+ (x_org_objectweb_asm_commons_LocalVariablesSorter*) valueWithIntWithStringWithId:(int) arg0 :(NSString*) arg1 :(id) arg2;
- (void) visitLocalVariableWithStringWithStringWithStringWithIdWithIdWithInt:(NSString*) arg0 :(NSString*) arg1 :(NSString*) arg2 :(id) arg3 :(id) arg4 :(int) arg5;
- (id) visitLocalVariableAnnotationWithIntWithIdWithIdWithIdWithIdWithStringWithBool:(int) arg0 :(id) arg1 :(id) arg2 :(id) arg3 :(id) arg4 :(NSString*) arg5 :(bool) arg6;
- (int) newLocalWithId:(id) arg0;
@end
