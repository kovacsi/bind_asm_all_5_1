#import <Foundation/Foundation.h>
#import "TypePath.h"
#import "Attribute.h"

@interface CheckFieldAdapter : NSObject

+ (CheckFieldAdapter*)valueWithFieldVisitor:(id)arg0;
- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitAttributeWithAttribute:(Attribute*)arg0;
- (void)visitEnd;

@end