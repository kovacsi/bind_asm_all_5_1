#import <Foundation/Foundation.h>
#import "TypePath.h"

@interface FieldRemapper : NSObject

+ (FieldRemapper*)valueWithFieldVisitor:(id)arg0 withRemapper:(id)arg1;
- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;

@end