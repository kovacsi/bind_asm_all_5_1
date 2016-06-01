#import <Foundation/Foundation.h>


@interface JBAnnotationNode : NSObject

+ (JBAnnotationNode*)valueWithString:(NSString*)arg0;
+ (JBAnnotationNode*)valueWithInt:(int)arg0 withString:(NSString*)arg1;
- (void)visitWithString:(NSString*)arg0 withObject:(id)arg1;
- (void)visitEnumWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (id)visitAnnotationWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (id)visitArrayWithString:(NSString*)arg0;
- (void)visitEnd;
- (void)checkWithInt:(int)arg0;
- (void)acceptWithAnnotationVisitor:(id)arg0;

@end
