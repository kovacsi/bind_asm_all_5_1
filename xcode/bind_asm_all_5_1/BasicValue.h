#import <Foundation/Foundation.h>
#import "Type.h"

@interface BasicValue : NSObject

+ (BasicValue*)valueWithType:(Type*)arg0;
- (Type*)getType;
- (int)getSize;
- (bool)isReference;
- (bool)equalsWithObject:(id)arg0;
- (int)hashCode;
- (NSString*)toString;

@end