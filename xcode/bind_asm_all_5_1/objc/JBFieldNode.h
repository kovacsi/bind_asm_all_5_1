#import <Foundation/Foundation.h>
#import "JBTypePath.h"
#import "JBAttribute.h"


@interface JBFieldNode : NSObject

+ (JBFieldNode*)valueWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withObject:(id)arg4;
+ (JBFieldNode*)valueWithInt:(int)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withObject:(id)arg5;
- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitAttributeWithAttribute:(JBAttribute*)arg0;
- (void)visitEnd;
- (void)checkWithInt:(int)arg0;
- (void)acceptWithClassVisitor:(id)arg0;

@end
