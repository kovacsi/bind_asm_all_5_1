#import <Foundation/Foundation.h>
#import "TypePath.h"

@interface TypeAnnotationNode : NSObject

+ (TypeAnnotationNode*)valueWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withString:(NSString*)arg2;
+ (TypeAnnotationNode*)valueWithInt:(int)arg0 withInt:(int)arg1 withTypePath:(TypePath*)arg2 withString:(NSString*)arg3;

@end