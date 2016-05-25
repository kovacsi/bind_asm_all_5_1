#import <Foundation/Foundation.h>

@interface x_org_objectweb_asm_tree_InsnList : NSObject
- (int) size;
- (id) getFirst;
- (id) getLast;
- (id) getWithInt:(int) arg0;
- (bool) containsWithId:(id) arg0;
- (int) indexOfWithId:(id) arg0;
- (id) iterator;
- (id) iteratorWithInt:(int) arg0;
- (id) toArray;
- (void) setWithIdWithId:(id) arg0 :(id) arg1;
- (void) insertWithId:(id) arg0;
- (void) insertWithIdWithId:(id) arg0 :(id) arg1;
- (void) insertBeforeWithIdWithId:(id) arg0 :(id) arg1;
- (void) removeWithId:(id) arg0;
- (void) clear;
- (void) resetLabels;
@end
