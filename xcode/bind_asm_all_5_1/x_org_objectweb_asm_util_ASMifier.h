#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_util_ASMifier : NSObject
+ (void) mainWithId:(id) arg0;
- (id) visitClassAnnotationWithStringWithBool:(NSString*) arg0 :(bool) arg1;
- (id) visitClassTypeAnnotationWithIntWithIdWithStringWithBool:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (void) visitClassAttributeWithId:(id) arg0;
- (void) visitClassEnd;
- (void) visitAnnotationEnd;
- (id) visitFieldAnnotationWithStringWithBool:(NSString*) arg0 :(bool) arg1;
- (id) visitFieldTypeAnnotationWithIntWithIdWithStringWithBool:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (void) visitFieldAttributeWithId:(id) arg0;
- (void) visitFieldEnd;
- (id) visitMethodAnnotationWithStringWithBool:(NSString*) arg0 :(bool) arg1;
- (id) visitMethodTypeAnnotationWithIntWithIdWithStringWithBool:(int) arg0 :(id) arg1 :(NSString*) arg2 :(bool) arg3;
- (void) visitMethodAttributeWithId:(id) arg0;
- (void) visitMethodEnd;
- (id) visitTypeAnnotationWithStringWithIntWithIdWithStringWithBool:(NSString*) arg0 :(int) arg1 :(id) arg2 :(NSString*) arg3 :(bool) arg4;
@end
