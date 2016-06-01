#import <Foundation/Foundation.h>
#import "SAXAdapter.h"
#import "TypePath.h"

@interface SAXAnnotationAdapter : NSObject

+ (SAXAnnotationAdapter*)valueWithSAXAdapter:(SAXAdapter*)arg0 withString:(NSString*)arg1 withInt:(int)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4;
+ (SAXAnnotationAdapter*)valueWithSAXAdapter:(SAXAdapter*)arg0 withString:(NSString*)arg1 withInt:(int)arg2 withInt:(int)arg3 withString:(NSString*)arg4;
+ (SAXAnnotationAdapter*)valueWithSAXAdapter:(SAXAdapter*)arg0 withString:(NSString*)arg1 withInt:(int)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withInt:(int)arg5 withTypePath:(TypePath*)arg6;
+ (SAXAnnotationAdapter*)valueWithSAXAdapter:(SAXAdapter*)arg0 withString:(NSString*)arg1 withInt:(int)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withInt:(int)arg5 withTypePath:(TypePath*)arg6 withString:(id)arg7 withString:(id)arg8 withInt:(id)arg9;
- (void)visitWithString:(NSString*)arg0 withObject:(id)arg1;
- (void)visitEnumWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;
- (id)visitAnnotationWithString:(NSString*)arg0 withString:(NSString*)arg1;
- (id)visitArrayWithString:(NSString*)arg0;
- (void)visitEnd;

@end