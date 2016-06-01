#import <Foundation/Foundation.h>

@interface TypePath : NSObject

- (int)getLength;
- (int)getStepWithInt:(int)arg0;
- (int)getStepArgumentWithInt:(int)arg0;
+ (TypePath*)fromStringWithString:(NSString*)arg0;
- (NSString*)toString;

@end