#import <Foundation/Foundation.h>

@interface SourceValue : NSObject

+ (SourceValue*)valueWithInt:(int)arg0;
+ (SourceValue*)valueWithInt:(int)arg0 withAbstractInsnNode:(id)arg1;
+ (SourceValue*)valueWithInt:(int)arg0 withSet:(id)arg1;
- (int)getSize;
- (bool)equalsWithObject:(id)arg0;
- (int)hashCode;

@end