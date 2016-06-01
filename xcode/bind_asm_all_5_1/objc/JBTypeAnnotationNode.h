#import <Foundation/Foundation.h>
#import "JBTypePath.h"


@interface JBTypeAnnotationNode : NSObject

+ (JBTypeAnnotationNode*)valueWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2;
+ (JBTypeAnnotationNode*)valueWithInt:(int)arg0 withInt:(int)arg1 withTypePath:(JBTypePath*)arg2 withString:(NSString*)arg3;

@end
