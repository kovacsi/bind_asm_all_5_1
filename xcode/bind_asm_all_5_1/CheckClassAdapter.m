#import "CheckClassAdapter.h"

@implementation CheckClassAdapter

+ (void)mainWithString:(id)arg0 {

}

+ (void)verifyWithClassReader:(ClassReader*)arg0 withClassLoader:(id)arg1 withBoolean:(bool)arg2 withPrintWriter:(id)arg3 {

}

+ (void)verifyWithClassReader:(ClassReader*)arg0 withBoolean:(bool)arg1 withPrintWriter:(id)arg2 {

}

+ (CheckClassAdapter*)valueWithClassVisitor:(id)arg0 {
	return nil;
}

+ (CheckClassAdapter*)valueWithClassVisitor:(id)arg0 withBoolean:(bool)arg1 {
	return nil;
}

- (void)visitWithInt:(int)arg0 withInt:(int)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(NSString*)arg4 withString:(id)arg5 {

}

- (void)visitSourceWithString:(NSString*)arg0 withString:(NSString*)arg1 {

}

- (void)visitOuterClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 {

}

- (void)visitInnerClassWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withInt:(int)arg3 {

}

- (id)visitFieldWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withObject:(id)arg4 {
	return nil;
}

- (id)visitMethodWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withString:(id)arg4 {
	return nil;
}

- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1 {
	return nil;
}

- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3 {
	return nil;
}

- (void)visitAttributeWithAttribute:(Attribute*)arg0 {

}

- (void)visitEnd {

}

+ (void)checkClassSignatureWithString:(NSString*)arg0 {

}

+ (void)checkMethodSignatureWithString:(NSString*)arg0 {

}

+ (void)checkFieldSignatureWithString:(NSString*)arg0 {

}

@end