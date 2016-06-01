#import <Foundation/Foundation.h>
#import "JBTypePath.h"


@interface JBFieldRemapper : NSObject

+ (JBFieldRemapper*)valueWithFieldVisitor:(id)arg0 withRemapper:(id)arg1;
- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;

@end
