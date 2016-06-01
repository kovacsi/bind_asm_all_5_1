#import <Foundation/Foundation.h>

#define ARRAY_ELEMENT 0
#define INNER_TYPE 1
#define WILDCARD_BOUND 2
#define TYPE_ARGUMENT 3

@interface JBTypePath : NSObject

- (int)getLength;
- (int)getStepWithInt:(int)arg0;
- (int)getStepArgumentWithInt:(int)arg0;
+ (JBTypePath*)fromStringWithString:(NSString*)arg0;
- (NSString*)toString;

@end
