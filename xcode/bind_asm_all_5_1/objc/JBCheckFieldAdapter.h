#import <Foundation/Foundation.h>
#import "JBTypePath.h"
#import "JBAttribute.h"


@interface JBCheckFieldAdapter : NSObject

+ (JBCheckFieldAdapter*)valueWithFieldVisitor:(id)arg0;
- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitAttributeWithAttribute:(JBAttribute*)arg0;
- (void)visitEnd;

@end
