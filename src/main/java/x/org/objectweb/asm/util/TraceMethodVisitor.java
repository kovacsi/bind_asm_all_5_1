package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("TraceMethodVisitor")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TraceMethodVisitor extends NSObject {	
	
	public org.objectweb.asm.util.TraceMethodVisitor original;	
	
	protected TraceMethodVisitor(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithPrinter:")	
	public TraceMethodVisitor valueWithPrinter(Object arg0) {
		TraceMethodVisitor self = (TraceMethodVisitor) TraceMethodVisitor.alloc().init();		
		self.original = new org.objectweb.asm.util.TraceMethodVisitor((org.objectweb.asm.util.Printer) arg0);		
		return self;		
	}	
	
	@Selector("valueWithMethodVisitor:withPrinter:")	
	public TraceMethodVisitor valueWithMethodVisitorwithPrinter(Object arg0, Object arg1) {
		TraceMethodVisitor self = (TraceMethodVisitor) TraceMethodVisitor.alloc().init();		
		self.original = new org.objectweb.asm.util.TraceMethodVisitor((org.objectweb.asm.MethodVisitor) arg0, (org.objectweb.asm.util.Printer) arg1);		
		return self;		
	}	
	
	@Selector("visitParameterWithString:withInt:")	
	public void visitParameterWithStringwithInt(String arg0, int arg1) {
		original.visitParameter(arg0, arg1);		
	}	
	
	@Selector("visitAnnotationWithString:withBoolean:")	
	public Object visitAnnotationWithStringwithBoolean(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);		
	}	
	
	@Selector("visitTypeAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Object visitTypeAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1.original, arg2, arg3);		
	}	
	
	@Selector("visitAttributeWithAttribute:")	
	public void visitAttributeWithAttribute(x.org.objectweb.asm.Attribute arg0) {		
		original.visitAttribute(arg0.original);		
	}	
	
	@Selector("visitAnnotationDefault")	
	public Object visitAnnotationDefault() {
		return original.visitAnnotationDefault();		
	}	
	
	@Selector("visitParameterAnnotationWithInt:withString:withBoolean:")	
	public Object visitParameterAnnotationWithIntwithStringwithBoolean(int arg0, String arg1, boolean arg2) {
		return original.visitParameterAnnotation(arg0, arg1, arg2);		
	}	
	
	@Selector("visitCode")	
	public void visitCode() {		
		original.visitCode();		
	}	
	
	@Selector("visitFrameWithInt:withInt:withObject:withInt:withObject:")	
	public void visitFrameWithIntwithIntwithObjectwithIntwithObject(int arg0, int arg1, Object[] arg2, int arg3, Object[] arg4) {
		original.visitFrame(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitInsnWithInt:")	
	public void visitInsnWithInt(int arg0) {		
		original.visitInsn(arg0);		
	}	
	
	@Selector("visitIntInsnWithInt:withInt:")	
	public void visitIntInsnWithIntwithInt(int arg0, int arg1) {		
		original.visitIntInsn(arg0, arg1);		
	}	
	
	@Selector("visitVarInsnWithInt:withInt:")	
	public void visitVarInsnWithIntwithInt(int arg0, int arg1) {		
		original.visitVarInsn(arg0, arg1);		
	}	
	
	@Selector("visitTypeInsnWithInt:withString:")	
	public void visitTypeInsnWithIntwithString(int arg0, String arg1) {
		original.visitTypeInsn(arg0, arg1);		
	}	
	
	@Selector("visitFieldInsnWithInt:withString:withString:withString:")	
	public void visitFieldInsnWithIntwithStringwithStringwithString(int arg0, String arg1, String arg2, String arg3) {
		original.visitFieldInsn(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitMethodInsnWithInt:withString:withString:withString:")	
	public void visitMethodInsnWithIntwithStringwithStringwithString(int arg0, String arg1, String arg2, String arg3) {
		original.visitMethodInsn(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitMethodInsnWithInt:withString:withString:withString:withBoolean:")	
	public void visitMethodInsnWithIntwithStringwithStringwithStringwithBoolean(int arg0, String arg1, String arg2, String arg3, boolean arg4) {
		original.visitMethodInsn(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitInvokeDynamicInsnWithString:withString:withHandle:withObject:")	
	public void visitInvokeDynamicInsnWithStringwithStringwithHandlewithObject(String arg0, String arg1, x.org.objectweb.asm.Handle arg2, Object[] arg3) {
		original.visitInvokeDynamicInsn(arg0, arg1, arg2.original, arg3);		
	}	
	
	@Selector("visitJumpInsnWithInt:withLabel:")	
	public void visitJumpInsnWithIntwithLabel(int arg0, x.org.objectweb.asm.Label arg1) {		
		original.visitJumpInsn(arg0, arg1.original);		
	}	
	
	@Selector("visitLabelWithLabel:")	
	public void visitLabelWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.visitLabel(arg0.original);		
	}	
	
	@Selector("visitLdcInsnWithObject:")	
	public void visitLdcInsnWithObject(Object arg0) {
		original.visitLdcInsn(arg0);		
	}	
	
	@Selector("visitIincInsnWithInt:withInt:")	
	public void visitIincInsnWithIntwithInt(int arg0, int arg1) {		
		original.visitIincInsn(arg0, arg1);		
	}	
	
	@Selector("visitTableSwitchInsnWithInt:withInt:withLabel:withLabel:")	
	public void visitTableSwitchInsnWithIntwithIntwithLabelwithLabel(int arg0, int arg1, x.org.objectweb.asm.Label arg2, org.objectweb.asm.Label[] arg3) {		
		original.visitTableSwitchInsn(arg0, arg1, arg2.original, arg3);		
	}	
	
	@Selector("visitLookupSwitchInsnWithLabel:withInt:withLabel:")	
	public void visitLookupSwitchInsnWithLabelwithIntwithLabel(x.org.objectweb.asm.Label arg0, int[] arg1, org.objectweb.asm.Label[] arg2) {		
		original.visitLookupSwitchInsn(arg0.original, arg1, arg2);		
	}	
	
	@Selector("visitMultiANewArrayInsnWithString:withInt:")	
	public void visitMultiANewArrayInsnWithStringwithInt(String arg0, int arg1) {
		original.visitMultiANewArrayInsn(arg0, arg1);		
	}	
	
	@Selector("visitInsnAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Object visitInsnAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitInsnAnnotation(arg0, arg1.original, arg2, arg3);		
	}	
	
	@Selector("visitTryCatchBlockWithLabel:withLabel:withLabel:withString:")	
	public void visitTryCatchBlockWithLabelwithLabelwithLabelwithString(x.org.objectweb.asm.Label arg0, x.org.objectweb.asm.Label arg1, x.org.objectweb.asm.Label arg2, String arg3) {
		original.visitTryCatchBlock(arg0.original, arg1.original, arg2.original, arg3);		
	}	
	
	@Selector("visitTryCatchAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Object visitTryCatchAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTryCatchAnnotation(arg0, arg1.original, arg2, arg3);		
	}	
	
	@Selector("visitLocalVariableWithString:withString:withString:withLabel:withLabel:withInt:")	
	public void visitLocalVariableWithStringwithStringwithStringwithLabelwithLabelwithInt(String arg0, String arg1, String arg2, x.org.objectweb.asm.Label arg3, x.org.objectweb.asm.Label arg4, int arg5) {
		original.visitLocalVariable(arg0, arg1, arg2, arg3.original, arg4.original, arg5);		
	}	
	
	@Selector("visitLocalVariableAnnotationWithInt:withTypePath:withLabel:withLabel:withInt:withString:withBoolean:")	
	public Object visitLocalVariableAnnotationWithIntwithTypePathwithLabelwithLabelwithIntwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, org.objectweb.asm.Label[] arg2, org.objectweb.asm.Label[] arg3, int[] arg4, String arg5, boolean arg6) {
		return original.visitLocalVariableAnnotation(arg0, arg1.original, arg2, arg3, arg4, arg5, arg6);		
	}	
	
	@Selector("visitLineNumberWithInt:withLabel:")	
	public void visitLineNumberWithIntwithLabel(int arg0, x.org.objectweb.asm.Label arg1) {		
		original.visitLineNumber(arg0, arg1.original);		
	}	
	
	@Selector("visitMaxsWithInt:withInt:")	
	public void visitMaxsWithIntwithInt(int arg0, int arg1) {		
		original.visitMaxs(arg0, arg1);		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
}
