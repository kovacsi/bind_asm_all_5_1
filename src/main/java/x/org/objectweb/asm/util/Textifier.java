package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_util_Textifier")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Textifier extends NSObject {	
	
	public org.objectweb.asm.util.Textifier original;	
	
	protected Textifier(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("value")	
	public Textifier value() {		
		Textifier self = (Textifier) Textifier.alloc().init();		
		self.original = new org.objectweb.asm.util.Textifier();		
		return self;		
	}	
	
	@Selector("mainWithString:")	
	public static void main(String[] arg0) throws Exception {
		org.objectweb.asm.util.Textifier.main(arg0);		
	}	
	
	@Selector("visitWithInt:withInt:withString:withString:withString:withString:")	
	public void visit(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		original.visit(arg0, arg1, arg2, arg3, arg4, arg5);		
	}	
	
	@Selector("visitSourceWithString:withString:")	
	public void visitSource(String arg0, String arg1) {
		original.visitSource(arg0, arg1);		
	}	
	
	@Selector("visitOuterClassWithString:withString:withString:")	
	public void visitOuterClass(String arg0, String arg1, String arg2) {
		original.visitOuterClass(arg0, arg1, arg2);		
	}	
	
	@Selector("visitClassAnnotationWithString:withBoolean:")	
	public Textifier visitClassAnnotation(String arg0, boolean arg1) {
		Textifier ret = (Textifier) Textifier.alloc().init();
		ret.original = original.visitClassAnnotation(arg0, arg1);		
		return ret;		
	}	
	
	@Selector("visitClassAttributeWithAttribute:")	
	public void visitClassAttribute(org.objectweb.asm.Attribute arg0) {		
		original.visitClassAttribute(arg0);		
	}	
	
	@Selector("visitInnerClassWithString:withString:withString:withInt:")	
	public void visitInnerClass(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitFieldWithInt:withString:withString:withString:withObject:")	
	public Textifier visitField(int arg0, String arg1, String arg2, String arg3, Object arg4) {
		Textifier ret = (Textifier) Textifier.alloc().init();
		ret.original = original.visitField(arg0, arg1, arg2, arg3, arg4);		
		return ret;		
	}	
	
	@Selector("visitMethodWithInt:withString:withString:withString:withString:")	
	public Textifier visitMethod(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
		Textifier ret = (Textifier) Textifier.alloc().init();
		ret.original = original.visitMethod(arg0, arg1, arg2, arg3, arg4);		
		return ret;		
	}	
	
	@Selector("visitClassEnd")	
	public void visitClassEnd() {		
		original.visitClassEnd();		
	}	
	
	@Selector("visitWithString:withObject:")	
	public void visit(String arg0, Object arg1) {
		original.visit(arg0, arg1);		
	}	
	
	@Selector("visitEnumWithString:withString:withString:")	
	public void visitEnum(String arg0, String arg1, String arg2) {
		original.visitEnum(arg0, arg1, arg2);		
	}	
	
	@Selector("visitAnnotationWithString:withString:")	
	public Textifier visitAnnotation(String arg0, String arg1) {
		Textifier ret = (Textifier) Textifier.alloc().init();
		ret.original = original.visitAnnotation(arg0, arg1);		
		return ret;		
	}	
	
	@Selector("visitArrayWithString:")	
	public Textifier visitArray(String arg0) {
		Textifier ret = (Textifier) Textifier.alloc().init();
		ret.original = original.visitArray(arg0);		
		return ret;		
	}	
	
	@Selector("visitAnnotationEnd")	
	public void visitAnnotationEnd() {		
		original.visitAnnotationEnd();		
	}	
	
	@Selector("visitFieldAnnotationWithString:withBoolean:")	
	public Textifier visitFieldAnnotation(String arg0, boolean arg1) {
		Textifier ret = (Textifier) Textifier.alloc().init();
		ret.original = original.visitFieldAnnotation(arg0, arg1);		
		return ret;		
	}	
	
	@Selector("visitFieldAttributeWithAttribute:")	
	public void visitFieldAttribute(org.objectweb.asm.Attribute arg0) {		
		original.visitFieldAttribute(arg0);		
	}	
	
	@Selector("visitFieldEnd")	
	public void visitFieldEnd() {		
		original.visitFieldEnd();		
	}	
	
	@Selector("visitParameterWithString:withInt:")	
	public void visitParameter(String arg0, int arg1) {
		original.visitParameter(arg0, arg1);		
	}	
	
	@Selector("visitAnnotationDefault")	
	public Textifier visitAnnotationDefault() {
		Textifier ret = (Textifier) Textifier.alloc().init();
		ret.original = original.visitAnnotationDefault();		
		return ret;		
	}	
	
	@Selector("visitMethodAnnotationWithString:withBoolean:")	
	public Textifier visitMethodAnnotation(String arg0, boolean arg1) {
		Textifier ret = (Textifier) Textifier.alloc().init();
		ret.original = original.visitMethodAnnotation(arg0, arg1);		
		return ret;		
	}	
	
	@Selector("visitParameterAnnotationWithInt:withString:withBoolean:")	
	public Textifier visitParameterAnnotation(int arg0, String arg1, boolean arg2) {
		Textifier ret = (Textifier) Textifier.alloc().init();
		ret.original = original.visitParameterAnnotation(arg0, arg1, arg2);		
		return ret;		
	}	
	
	@Selector("visitMethodAttributeWithAttribute:")	
	public void visitMethodAttribute(org.objectweb.asm.Attribute arg0) {		
		original.visitMethodAttribute(arg0);		
	}	
	
	@Selector("visitCode")	
	public void visitCode() {		
		original.visitCode();		
	}	
	
	@Selector("visitFrameWithInt:withInt:withObject:withInt:withObject:")	
	public void visitFrame(int arg0, int arg1, Object[] arg2, int arg3, Object[] arg4) {
		original.visitFrame(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitInsnWithInt:")	
	public void visitInsn(int arg0) {		
		original.visitInsn(arg0);		
	}	
	
	@Selector("visitIntInsnWithInt:withInt:")	
	public void visitIntInsn(int arg0, int arg1) {		
		original.visitIntInsn(arg0, arg1);		
	}	
	
	@Selector("visitVarInsnWithInt:withInt:")	
	public void visitVarInsn(int arg0, int arg1) {		
		original.visitVarInsn(arg0, arg1);		
	}	
	
	@Selector("visitTypeInsnWithInt:withString:")	
	public void visitTypeInsn(int arg0, String arg1) {
		original.visitTypeInsn(arg0, arg1);		
	}	
	
	@Selector("visitFieldInsnWithInt:withString:withString:withString:")	
	public void visitFieldInsn(int arg0, String arg1, String arg2, String arg3) {
		original.visitFieldInsn(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitMethodInsnWithInt:withString:withString:withString:")	
	public void visitMethodInsn(int arg0, String arg1, String arg2, String arg3) {
		original.visitMethodInsn(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitMethodInsnWithInt:withString:withString:withString:withBoolean:")	
	public void visitMethodInsn(int arg0, String arg1, String arg2, String arg3, boolean arg4) {
		original.visitMethodInsn(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitInvokeDynamicInsnWithString:withString:withHandle:withObject:")	
	public void visitInvokeDynamicInsn(String arg0, String arg1, org.objectweb.asm.Handle arg2, Object[] arg3) {
		original.visitInvokeDynamicInsn(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitJumpInsnWithInt:withLabel:")	
	public void visitJumpInsn(int arg0, org.objectweb.asm.Label arg1) {		
		original.visitJumpInsn(arg0, arg1);		
	}	
	
	@Selector("visitLabelWithLabel:")	
	public void visitLabel(org.objectweb.asm.Label arg0) {		
		original.visitLabel(arg0);		
	}	
	
	@Selector("visitLdcInsnWithObject:")	
	public void visitLdcInsn(Object arg0) {
		original.visitLdcInsn(arg0);		
	}	
	
	@Selector("visitIincInsnWithInt:withInt:")	
	public void visitIincInsn(int arg0, int arg1) {		
		original.visitIincInsn(arg0, arg1);		
	}	
	
	@Selector("visitTableSwitchInsnWithInt:withInt:withLabel:withLabel:")	
	public void visitTableSwitchInsn(int arg0, int arg1, org.objectweb.asm.Label arg2, org.objectweb.asm.Label[] arg3) {		
		original.visitTableSwitchInsn(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitLookupSwitchInsnWithLabel:withInt:withLabel:")	
	public void visitLookupSwitchInsn(org.objectweb.asm.Label arg0, int[] arg1, org.objectweb.asm.Label[] arg2) {		
		original.visitLookupSwitchInsn(arg0, arg1, arg2);		
	}	
	
	@Selector("visitMultiANewArrayInsnWithString:withInt:")	
	public void visitMultiANewArrayInsn(String arg0, int arg1) {
		original.visitMultiANewArrayInsn(arg0, arg1);		
	}	
	
	@Selector("visitTryCatchBlockWithLabel:withLabel:withLabel:withString:")	
	public void visitTryCatchBlock(org.objectweb.asm.Label arg0, org.objectweb.asm.Label arg1, org.objectweb.asm.Label arg2, String arg3) {
		original.visitTryCatchBlock(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitLocalVariableWithString:withString:withString:withLabel:withLabel:withInt:")	
	public void visitLocalVariable(String arg0, String arg1, String arg2, org.objectweb.asm.Label arg3, org.objectweb.asm.Label arg4, int arg5) {
		original.visitLocalVariable(arg0, arg1, arg2, arg3, arg4, arg5);		
	}	
	
	@Selector("visitLineNumberWithInt:withLabel:")	
	public void visitLineNumber(int arg0, org.objectweb.asm.Label arg1) {		
		original.visitLineNumber(arg0, arg1);		
	}	
	
	@Selector("visitMaxsWithInt:withInt:")	
	public void visitMaxs(int arg0, int arg1) {		
		original.visitMaxs(arg0, arg1);		
	}	
	
	@Selector("visitMethodEnd")	
	public void visitMethodEnd() {		
		original.visitMethodEnd();		
	}	
	
	@Selector("visitAnnotationWithString:withBoolean:")	
	public Textifier visitAnnotation(String arg0, boolean arg1) {
		Textifier ret = (Textifier) Textifier.alloc().init();
		ret.original = original.visitAnnotation(arg0, arg1);		
		return ret;		
	}	
	
	@Selector("visitTypeAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Textifier visitTypeAnnotation(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		Textifier ret = (Textifier) Textifier.alloc().init();
		ret.original = original.visitTypeAnnotation(arg0, arg1, arg2, arg3);		
		return ret;		
	}	
	
	@Selector("visitAttributeWithAttribute:")	
	public void visitAttribute(org.objectweb.asm.Attribute arg0) {		
		original.visitAttribute(arg0);		
	}	
}
