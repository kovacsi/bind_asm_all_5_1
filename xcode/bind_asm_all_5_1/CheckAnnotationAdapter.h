#import <Foundation/Foundation.h>

@interface CheckAnnotationAdapter : NSObject

+ (CheckAnnotationAdapter*)valueWithAnnotationVisitor:(id)arg0;
- (void)visitWithString:(NSString*)arg0 withObject:(id)arg1;
- (void)visitEnumWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (id)visitAnnotationWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (id)visitArrayWithString:(NSString*)arg0;
- (void)visitEnd;

@end