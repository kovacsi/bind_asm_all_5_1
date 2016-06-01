#import <Foundation/Foundation.h>

@interface TraceAnnotationVisitor : NSObject

+ (TraceAnnotationVisitor*)valueWithPrinter:(id)arg0;
+ (TraceAnnotationVisitor*)valueWithAnnotationVisitor:(id)arg0 withPrinter:(id)arg1;
- (void)visitWithString:(NSString*)arg0 withObject:(id)arg1;
- (void)visitEnumWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (id)visitAnnotationWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (id)visitArrayWithString:(NSString*)arg0;
- (void)visitEnd;

@end