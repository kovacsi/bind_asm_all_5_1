#import <Foundation/Foundation.h>

@interface StaticInitMerger : NSObject

+ (StaticInitMerger*)valueWithString:(NSString*)arg0 withClassVisitor:(id)arg1;
- (void)visitWithInt:(int)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withString:(id)arg5;
- (id)visitMethodWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(id)arg4;
- (void)visitEnd;

@end