#import <Foundation/Foundation.h>
#import "JBLabel.h"
#import "JBTypePath.h"
#import "JBType.h"


@interface JBLocalVariablesSorter : NSObject

+ (JBLocalVariablesSorter*)valueWithInt:(int)arg0 withString:(NSString*)arg1 withMethodVisitor:(id)arg2;
- (void)visitVarInsnWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitIincInsnWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitMaxsWithInt:(int)arg0 withInt:(int)arg1;
- (void)visitLocalVariableWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withLabel:(JBLabel*)arg3 withLabel:(JBLabel*)arg4 withInt:(int)arg5;
- (id)visitLocalVariableAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withLabel:(id)arg2 withLabel:(id)arg3 withInt:(id)arg4 withString:(NSString*)arg5 withBoolean:(bool)arg6;
- (void)visitFrameWithInt:(int)arg0 withInt:(int)arg1 withObject:(id)arg2 withInt:(int)arg3 withObject:(id)arg4;
- (int)newLocalWithType:(JBType*)arg0;

@end
