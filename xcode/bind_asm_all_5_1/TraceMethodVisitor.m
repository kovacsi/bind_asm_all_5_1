#import "TraceMethodVisitor.h"

@implementation TraceMethodVisitor

+ (TraceMethodVisitor*)valueWithPrinter:(id)arg0 {
	return nil;
}

+ (TraceMethodVisitor*)valueWithMethodVisitor:(id)arg0 withPrinter:(id)arg1 {
	return nil;
}

- (void)visitParameterWithString:(NSString*)arg0 withInt:(int)arg1 {

}

- (id)visitAnnotationWithString:(NSString*)arg0 withBoolean:(bool)arg1 {
	return nil;
}

- (id)visitTypeAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3 {
	return nil;
}

- (void)visitAttributeWithAttribute:(Attribute*)arg0 {

}

- (id)visitAnnotationDefault {
	return nil;
}

- (id)visitParameterAnnotationWithInt:(int)arg0 withString:(NSString*)arg1 withBoolean:(bool)arg2 {
	return nil;
}

- (void)visitCode {

}

- (void)visitFrameWithInt:(int)arg0 withInt:(int)arg1 withObject:(id)arg2 withInt:(int)arg3 withObject:(id)arg4 {

}

- (void)visitInsnWithInt:(int)arg0 {

}

- (void)visitIntInsnWithInt:(int)arg0 withInt:(int)arg1 {

}

- (void)visitVarInsnWithInt:(int)arg0 withInt:(int)arg1 {

}

- (void)visitTypeInsnWithInt:(int)arg0 withString:(NSString*)arg1 {

}

- (void)visitFieldInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 {

}

- (void)visitMethodInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 {

}

- (void)visitMethodInsnWithInt:(int)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withString:(NSString*)arg3 withBoolean:(bool)arg4 {

}

- (void)visitInvokeDynamicInsnWithString:(NSString*)arg0 withString:(NSString*)arg1 withHandle:(org_objectweb_asm_Handle*)arg2 withObject:(id)arg3 {

}

- (void)visitJumpInsnWithInt:(int)arg0 withLabel:(Label*)arg1 {

}

- (void)visitLabelWithLabel:(Label*)arg0 {

}

- (void)visitLdcInsnWithObject:(id)arg0 {

}

- (void)visitIincInsnWithInt:(int)arg0 withInt:(int)arg1 {

}

- (void)visitTableSwitchInsnWithInt:(int)arg0 withInt:(int)arg1 withLabel:(Label*)arg2 withLabel:(id)arg3 {

}

- (void)visitLookupSwitchInsnWithLabel:(Label*)arg0 withInt:(id)arg1 withLabel:(id)arg2 {

}

- (void)visitMultiANewArrayInsnWithString:(NSString*)arg0 withInt:(int)arg1 {

}

- (id)visitInsnAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3 {
	return nil;
}

- (void)visitTryCatchBlockWithLabel:(Label*)arg0 withLabel:(Label*)arg1 withLabel:(Label*)arg2 withString:(NSString*)arg3 {

}

- (id)visitTryCatchAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withString:(NSString*)arg2 withBoolean:(bool)arg3 {
	return nil;
}

- (void)visitLocalVariableWithString:(NSString*)arg0 withString:(NSString*)arg1 withString:(NSString*)arg2 withLabel:(Label*)arg3 withLabel:(Label*)arg4 withInt:(int)arg5 {

}

- (id)visitLocalVariableAnnotationWithInt:(int)arg0 withTypePath:(TypePath*)arg1 withLabel:(id)arg2 withLabel:(id)arg3 withInt:(id)arg4 withString:(NSString*)arg5 withBoolean:(bool)arg6 {
	return nil;
}

- (void)visitLineNumberWithInt:(int)arg0 withLabel:(Label*)arg1 {

}

- (void)visitMaxsWithInt:(int)arg0 withInt:(int)arg1 {

}

- (void)visitEnd {

}

@end
