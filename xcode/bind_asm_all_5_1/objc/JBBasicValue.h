#import <Foundation/Foundation.h>
#import "JBType.h"


@interface JBBasicValue : NSObject

+ (JBBasicValue*)valueWithType:(JBType*)arg0;
- (JBType*)getType;
- (int)getSize;
- (bool)isReference;
- (bool)equalsWithObject:(id)arg0;
- (int)hashCode;
- (NSString*)toString;

@end
