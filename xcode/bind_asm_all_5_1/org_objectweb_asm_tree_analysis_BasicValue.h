#import <Foundation/Foundation.h>
#import "org_objectweb_asm_Type.h"

@interface org_objectweb_asm_tree_analysis_BasicValue : NSObject

+ (org_objectweb_asm_tree_analysis_BasicValue*)valueWithType:(org_objectweb_asm_Type*)arg0;
- (org_objectweb_asm_Type*)getType;
- (int)getSize;
- (bool)isReference;
- (bool)equalsWithObject:(id)arg0;
- (int)hashCode;
- (NSString*)toString;

@end