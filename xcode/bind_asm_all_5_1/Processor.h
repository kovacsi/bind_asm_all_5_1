#import <Foundation/Foundation.h>

#define BYTECODE 1
#define MULTI_XML 2
#define SINGLE_XML 3
@interface Processor : NSObject

+ (Processor*)valueWithInt:(int)arg0 withInt:(int)arg1 withInputStream:(id)arg2 withOutputStream:(id)arg3 withSource:(id)arg4;
- (int)process;
+ (void)mainWithString:(id)arg0;

@end