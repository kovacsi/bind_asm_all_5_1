#import <Foundation/Foundation.h>

@interface org_objectweb_asm_tree_InsnList : NSObject

+ (org_objectweb_asm_tree_InsnList*)value;
- (int)size;
- (id)iterator;
- (id)iteratorWithInt:(int)arg0;
- (id)toArray;
- (void)addWithInsnList:(org_objectweb_asm_tree_InsnList*)arg0;
- (void)insertWithInsnList:(org_objectweb_asm_tree_InsnList*)arg0;
- (void)clear;
- (void)resetLabels;

@end