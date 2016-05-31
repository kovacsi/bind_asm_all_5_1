#import <Foundation/Foundation.h>

@interface org_objectweb_asm_TypePath : NSObject

- (int)getLength;
- (int)getStepWithInt:(int)arg0;
- (int)getStepArgumentWithInt:(int)arg0;
+ (org_objectweb_asm_TypePath*)fromStringWithString:(NSString*)arg0;
- (NSString*)toString;

@end