#import <Foundation/Foundation.h>
#import "JBType.h"


@interface JBMethod : NSObject

+ (JBMethod*)valueWithString:(NSString*)arg0 withString:(NSString*)arg1;
+ (JBMethod*)valueWithString:(NSString*)arg0 withType:(JBType*)arg1 withType:(id)arg2;
+ (JBMethod*)getMethodWithMethod:(id)arg0;
+ (JBMethod*)getMethodWithConstructor:(id)arg0;
+ (JBMethod*)getMethodWithString:(NSString*)arg0;
+ (JBMethod*)getMethodWithString:(NSString*)arg0 withBoolean:(bool)arg1;
- (NSString*)getName;
- (NSString*)getDescriptor;
- (JBType*)getReturnType;
- (id)getArgumentTypes;
- (NSString*)toString;
- (bool)equalsWithObject:(id)arg0;
- (int)hashCode;

@end
