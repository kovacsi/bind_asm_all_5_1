#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_InsnList : NSObject
- (int) size;
- (id) getFirst;
- (id) getLast;
- (id) getWithInt:(int) arg0;
- (bool) containsWithAbstractInsnNode:(id) arg0;
- (int) indexOfWithAbstractInsnNode:(id) arg0;
- (void) acceptWithMethodVisitor:(id) arg0;
- (id) iterator;
- (id) iteratorWithInt:(int) arg0;
- (id) toArray;
- (void) setWithAbstractInsnNodeWithAbstractInsnNode:(id) arg0 :(id) arg1;
- (void) addWithAbstractInsnNode:(id) arg0;
- (void) addWithInsnList:(id) arg0;
- (void) insertWithAbstractInsnNode:(id) arg0;
- (void) insertWithInsnList:(id) arg0;
- (void) insertWithAbstractInsnNodeWithAbstractInsnNode:(id) arg0 :(id) arg1;
- (void) insertWithAbstractInsnNodeWithInsnList:(id) arg0 :(id) arg1;
- (void) insertBeforeWithAbstractInsnNodeWithAbstractInsnNode:(id) arg0 :(id) arg1;
- (void) insertBeforeWithAbstractInsnNodeWithInsnList:(id) arg0 :(id) arg1;
- (void) removeWithAbstractInsnNode:(id) arg0;
- (void) clear;
- (void) resetLabels;
@end
