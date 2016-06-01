#import <Foundation/Foundation.h>

@interface InsnList : NSObject

+ (InsnList*)value;
- (int)size;
- (id)getFirst;
- (id)getLast;
- (id)getWithInt:(int)arg0;
- (bool)containsWithAbstractInsnNode:(id)arg0;
- (int)indexOfWithAbstractInsnNode:(id)arg0;
- (void)acceptWithMethodVisitor:(id)arg0;
- (id)iterator;
- (id)iteratorWithInt:(int)arg0;
- (id)toArray;
- (void)setWithAbstractInsnNode:(id)arg0 withAbstractInsnNode:(id)arg1;
- (void)addWithAbstractInsnNode:(id)arg0;
- (void)addWithInsnList:(InsnList*)arg0;
- (void)insertWithAbstractInsnNode:(id)arg0;
- (void)insertWithInsnList:(InsnList*)arg0;
- (void)insertWithAbstractInsnNode:(id)arg0 withAbstractInsnNode:(id)arg1;
- (void)insertWithAbstractInsnNode:(id)arg0 withInsnList:(InsnList*)arg1;
- (void)insertBeforeWithAbstractInsnNode:(id)arg0 withAbstractInsnNode:(id)arg1;
- (void)insertBeforeWithAbstractInsnNode:(id)arg0 withInsnList:(InsnList*)arg1;
- (void)removeWithAbstractInsnNode:(id)arg0;
- (void)clear;
- (void)resetLabels;

@end