#import <Foundation/Foundation.h>
#import "TypePath.h"

@interface LocalVariableAnnotationNode : NSObject

+ (LocalVariableAnnotationNode*)valueWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withLabelNode:(id)arg2 withLabelNode:(id)arg3 withInt:(id)arg4 withString:(NSString*)arg5;
+ (LocalVariableAnnotationNode*)valueWithInt:(int)arg0 withInt:(int)arg1 withTypePath:(TypePath*)arg2 withLabelNode:(id)arg3 withLabelNode:(id)arg4 withInt:(id)arg5 withString:(NSString*)arg6;
- (void)acceptWithMethodVisitor:(id)arg0 withBoolean:(bool)arg1;

@end