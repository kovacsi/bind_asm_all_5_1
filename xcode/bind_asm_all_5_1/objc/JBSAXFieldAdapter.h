#import <Foundation/Foundation.h>
#import "JBSAXAdapter.h"
#import "JBTypePath.h"


@interface JBSAXFieldAdapter : NSObject

+ (JBSAXFieldAdapter*)valueWithSAXAdapter:(JBSAXAdapter*)arg0 withAttributes:(id)arg1;
- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitEnd;

@end
