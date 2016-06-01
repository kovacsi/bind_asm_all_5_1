#import <Foundation/Foundation.h>
#import "JBMethodNode.h"


@interface JBAnalyzer : NSObject

+ (JBAnalyzer*)valueWithInterpreter:(id)arg0;
- (id)analyzeWithString:(NSString*)arg0 withMethodNode:(JBMethodNode*)arg1;
- (id)getFrames;
- (id)getHandlersWithInt:(int)arg0;

@end
