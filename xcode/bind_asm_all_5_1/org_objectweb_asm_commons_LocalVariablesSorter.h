#import <Foundation/Foundation.h>
#import "org_objectweb_asm_Label.h"
#import "org_objectweb_asm_Type.h"

@interface org_objectweb_asm_commons_LocalVariablesSorter : NSObject

- (void)visitVarInsnWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitIincInsnWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitMaxsWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitLocalVariableWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withLabel:(org_objectweb_asm_Label*)arg3 withLabel:(org_objectweb_asm_Label*)arg4 withInt:(int)arg5;
- (void)visitFrameWithInt:(int)arg0 withInt:(int)arg1 withObject:(id)arg2 withInt:(int)arg3 withObject:(id)arg4;
- (int)newLocalWithType:(org_objectweb_asm_Type*)arg0;

@end