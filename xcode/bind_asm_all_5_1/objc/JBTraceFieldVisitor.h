#import <Foundation/Foundation.h>
#import "JBTypePath.h"
#import "JBAttribute.h"


@interface JBTraceFieldVisitor : NSObject

+ (JBTraceFieldVisitor*)valueWithPrinter:(id)arg0;
+ (JBTraceFieldVisitor*)valueWithFieldVisitor:(id)arg0 withPrinter:(id)arg1;
- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitAttributeWithAttribute:(JBAttribute*)arg0;
- (void)visitEnd;

@end
