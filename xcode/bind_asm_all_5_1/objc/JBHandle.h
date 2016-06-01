#import <Foundation/Foundation.h>


@interface JBHandle : NSObject

+ (JBHandle*)valueWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3;
+ (JBHandle*)valueWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4;
- (int)getTag;
- (NSString*)getOwner;
- (NSString*)getName;
- (NSString*)getDesc;
- (bool)isInterface;
- (bool)equalsWithObject:(id)arg0;
- (int)hashCode;
- (NSString*)toString;

@end
