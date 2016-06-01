#import <Foundation/Foundation.h>
#import "SAXAdapter.h"
#import "TypePath.h"

@interface SAXFieldAdapter : NSObject

+ (SAXFieldAdapter*)valueWithSAXAdapter:(SAXAdapter*)arg0 withAttributes:(id)arg1;
- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (void)visitEnd;

@end