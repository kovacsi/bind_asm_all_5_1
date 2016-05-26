#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_analysis_Analyzer : NSObject
+ (x_org_objectweb_asm_tree_analysis_Analyzer*) valueWithInterpreter:(id) arg0;
- (id) analyzeWithStringWithMethodNode:(NSString*) arg0 :(id) arg1;
- (id) getFrames;
- (id) getHandlersWithInt:(int) arg0;
@end
