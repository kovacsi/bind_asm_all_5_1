#import <Foundation/Foundation.h>
#import "org_objectweb_asm_Label.h"

@interface org_objectweb_asm_commons_JSRInlinerAdapter : NSObject

- (void)visitJumpInsnWithInt:(int)arg0 withLabel:(org_objectweb_asm_Label*)arg1;
- (void)visitEnd;

@end