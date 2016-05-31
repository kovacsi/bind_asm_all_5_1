#import <Foundation/Foundation.h>
#import "org_objectweb_asm_tree_MethodNode.h"

@interface org_objectweb_asm_tree_analysis_Analyzer : NSObject

- (id)analyzeWithString:(NSString*)arg0 withMethodNode:(org_objectweb_asm_tree_MethodNode*)arg1;
- (id)getFrames;
- (id)getHandlersWithInt:(int)arg0;

@end