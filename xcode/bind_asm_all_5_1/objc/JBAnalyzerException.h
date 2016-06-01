#import <Foundation/Foundation.h>


@interface JBAnalyzerException : NSObject

+ (JBAnalyzerException*)valueWithAbstractInsnNode:(id)arg0 withString:(NSString*)arg1;
+ (JBAnalyzerException*)valueWithAbstractInsnNode:(id)arg0 withString:(NSString*)arg1 withThrowable:(id)arg2;
+ (JBAnalyzerException*)valueWithAbstractInsnNode:(id)arg0 withString:(NSString*)arg1 withObject:(id)arg2 withValue:(id)arg3;

@end
