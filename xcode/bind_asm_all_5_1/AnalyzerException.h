#import <Foundation/Foundation.h>

@interface AnalyzerException : NSObject

+ (AnalyzerException*)valueWithAbstractInsnNode:(id)arg0 withString:(NSString*)arg1;
+ (AnalyzerException*)valueWithAbstractInsnNode:(id)arg0 withString:(NSString*)arg1 withThrowable:(id)arg2;
+ (AnalyzerException*)valueWithAbstractInsnNode:(id)arg0 withString:(NSString*)arg1 withObject:(id)arg2 withValue:(id)arg3;

@end