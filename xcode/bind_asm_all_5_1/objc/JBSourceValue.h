#import <Foundation/Foundation.h>


@interface JBSourceValue : NSObject

+ (JBSourceValue*)valueWithInt:(int)arg0;
+ (JBSourceValue*)valueWithInt:(int)arg0 withAbstractInsnNode:(id)arg1;
+ (JBSourceValue*)valueWithInt:(int)arg0 withSet:(id)arg1;
- (int)getSize;
- (bool)equalsWithObject:(id)arg0;
- (int)hashCode;

@end
