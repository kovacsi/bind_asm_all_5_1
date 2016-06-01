#import "JBClassWriter.h"

@implementation JBClassWriter

+ (JBClassWriter*)valueWithInt:(int)arg0 {
	return nil;
}

+ (JBClassWriter*)valueWithClassReader:(JBClassReader*)arg0 withInt:(int)arg1 {
	return nil;
}

- (void)visitWithInt:(int)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withString:(id)arg5 {

}

- (void)visitSourceWithString:(NSString*)arg0 withString:(NSString*)arg1 {

}

- (void)visitOuterClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 {

}

- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1 {
	return nil;
}

- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(JBTypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3 {
	return nil;
}

- (void)visitAttributeWithAttribute:(JBAttribute*)arg0 {

}

- (void)visitInnerClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withInt:(int)arg3 {

}

- (id)visitFieldWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withObject:(id)arg4 {
	return nil;
}

- (id)visitMethodWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(id)arg4 {
	return nil;
}

- (void)visitEnd {

}

- (id)toByteArray {
	return nil;
}

- (int)newConstWithObject:(id)arg0 {
	return 0;
}

- (int)newUTF8WithString:(NSString*)arg0 {
	return 0;
}

- (int)newClassWithString:(NSString*)arg0 {
	return 0;
}

- (int)newMethodTypeWithString:(NSString*)arg0 {
	return 0;
}

- (int)newHandleWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 {
	return 0;
}

- (int)newHandleWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4 {
	return 0;
}

- (int)newInvokeDynamicWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(JBHandle*)arg2 withObject:(id)arg3 {
	return 0;
}

- (int)newFieldWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 {
	return 0;
}

- (int)newMethodWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3 {
	return 0;
}

- (int)newNameTypeWithString:(NSString*)arg0 withString:(NSString*)arg1 {
	return 0;
}

@end
