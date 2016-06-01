#import <Foundation/Foundation.h>
#import "TypePath.h"

@interface RemappingClassAdapter : NSObject

+ (RemappingClassAdapter*)valueWithClassVisitor:(id)arg0 withRemapper:(id)arg1;
- (void)visitWithInt:(int)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withString:(id)arg5;
- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3;
- (id)visitFieldWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withObject:(id)arg4;
- (id)visitMethodWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(id)arg4;
- (void)visitInnerClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withInt:(int)arg3;
- (void)visitOuterClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2;

@end