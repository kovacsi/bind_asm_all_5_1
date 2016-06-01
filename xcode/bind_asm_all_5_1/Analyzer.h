#import <Foundation/Foundation.h>
#import "MethodNode.h"

@interface Analyzer : NSObject

+ (Analyzer*)valueWithInterpreter:(id)arg0;
- (id)analyzeWithString:(NSString*)arg0 withMethodNode:(MethodNode*)arg1;
- (id)getFrames;
- (id)getHandlersWithInt:(int)arg0;

@end