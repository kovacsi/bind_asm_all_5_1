package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_util_CheckMethodAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class CheckMethodAdapter extends NSObject {

	private org.objectweb.asm.util.CheckMethodAdapter original;

	protected CheckMethodAdapter(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithMethodVisitor:")
	public CheckMethodAdapter valueWithMethodVisitor(org.objectweb.asm.MethodVisitor arg0) {
		CheckMethodAdapter self = (CheckMethodAdapter) CheckMethodAdapter.alloc().init();
		self.original = new org.objectweb.asm.util.CheckMethodAdapter(arg0);
		return self;
	}

	@Selector("valueWithMethodVisitorWithMap::")
	public CheckMethodAdapter valueWithMethodVisitorWithMap(org.objectweb.asm.MethodVisitor arg0, java.util.Map arg1) {
		CheckMethodAdapter self = (CheckMethodAdapter) CheckMethodAdapter.alloc().init();
		self.original = new org.objectweb.asm.util.CheckMethodAdapter(arg0, arg1);
		return self;
	}

	@Selector("valueWithIntWithStringWithStringWithMethodVisitorWithMap:::::")
	public CheckMethodAdapter valueWithIntWithStringWithStringWithMethodVisitorWithMap(int arg0, String arg1, String arg2, org.objectweb.asm.MethodVisitor arg3, java.util.Map arg4) {
		CheckMethodAdapter self = (CheckMethodAdapter) CheckMethodAdapter.alloc().init();
		self.original = new org.objectweb.asm.util.CheckMethodAdapter(arg0, arg1, arg2, arg3, arg4);
		return self;
	}

	@Selector("visitParameterWithStringWithInt::")
	public void visitParameterWithStringWithInt(String arg0, int arg1) {
		original.visitParameter(arg0, arg1);
	}

	@Selector("visitAnnotationWithStringWithBoolean::")
	public org.objectweb.asm.AnnotationVisitor visitAnnotationWithStringWithBoolean(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);
	}

	@Selector("visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean::::")
	public org.objectweb.asm.AnnotationVisitor visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitAnnotationDefault")
	public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
		return original.visitAnnotationDefault();
	}

	@Selector("visitParameterAnnotationWithIntWithStringWithBoolean:::")
	public org.objectweb.asm.AnnotationVisitor visitParameterAnnotationWithIntWithStringWithBoolean(int arg0, String arg1, boolean arg2) {
		return original.visitParameterAnnotation(arg0, arg1, arg2);
	}

	@Selector("visitAttributeWithAttribute:")
	public void visitAttributeWithAttribute(org.objectweb.asm.Attribute arg0) {
		original.visitAttribute(arg0);
	}

	@Selector("visitCode")
	public void visitCode() {
		original.visitCode();
	}

	@Selector("visitFrameWithIntWithIntWithObjectWithIntWithObject:::::")
	public void visitFrameWithIntWithIntWithObjectWithIntWithObject(int arg0, int arg1, Object[] arg2, int arg3, Object[] arg4) {
		original.visitFrame(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitInsnWithInt:")
	public void visitInsnWithInt(int arg0) {
		original.visitInsn(arg0);
	}

	@Selector("visitIntInsnWithIntWithInt::")
	public void visitIntInsnWithIntWithInt(int arg0, int arg1) {
		original.visitIntInsn(arg0, arg1);
	}

	@Selector("visitVarInsnWithIntWithInt::")
	public void visitVarInsnWithIntWithInt(int arg0, int arg1) {
		original.visitVarInsn(arg0, arg1);
	}

	@Selector("visitTypeInsnWithIntWithString::")
	public void visitTypeInsnWithIntWithString(int arg0, String arg1) {
		original.visitTypeInsn(arg0, arg1);
	}

	@Selector("visitFieldInsnWithIntWithStringWithStringWithString::::")
	public void visitFieldInsnWithIntWithStringWithStringWithString(int arg0, String arg1, String arg2, String arg3) {
		original.visitFieldInsn(arg0, arg1, arg2, arg3);
	}

	@Selector("visitMethodInsnWithIntWithStringWithStringWithString::::")
	public void visitMethodInsnWithIntWithStringWithStringWithString(int arg0, String arg1, String arg2, String arg3) {
		original.visitMethodInsn(arg0, arg1, arg2, arg3);
	}

	@Selector("visitMethodInsnWithIntWithStringWithStringWithStringWithBoolean:::::")
	public void visitMethodInsnWithIntWithStringWithStringWithStringWithBoolean(int arg0, String arg1, String arg2, String arg3, boolean arg4) {
		original.visitMethodInsn(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitInvokeDynamicInsnWithStringWithStringWithHandleWithObject::::")
	public void visitInvokeDynamicInsnWithStringWithStringWithHandleWithObject(String arg0, String arg1, org.objectweb.asm.Handle arg2, Object[] arg3) {
		original.visitInvokeDynamicInsn(arg0, arg1, arg2, arg3);
	}

	@Selector("visitJumpInsnWithIntWithLabel::")
	public void visitJumpInsnWithIntWithLabel(int arg0, org.objectweb.asm.Label arg1) {
		original.visitJumpInsn(arg0, arg1);
	}

	@Selector("visitLabelWithLabel:")
	public void visitLabelWithLabel(org.objectweb.asm.Label arg0) {
		original.visitLabel(arg0);
	}

	@Selector("visitLdcInsnWithObject:")
	public void visitLdcInsnWithObject(Object arg0) {
		original.visitLdcInsn(arg0);
	}

	@Selector("visitIincInsnWithIntWithInt::")
	public void visitIincInsnWithIntWithInt(int arg0, int arg1) {
		original.visitIincInsn(arg0, arg1);
	}

	@Selector("visitTableSwitchInsnWithIntWithIntWithLabelWithLabel::::")
	public void visitTableSwitchInsnWithIntWithIntWithLabelWithLabel(int arg0, int arg1, org.objectweb.asm.Label arg2, org.objectweb.asm.Label[] arg3) {
		original.visitTableSwitchInsn(arg0, arg1, arg2, arg3);
	}

	@Selector("visitLookupSwitchInsnWithLabelWithIntWithLabel:::")
	public void visitLookupSwitchInsnWithLabelWithIntWithLabel(org.objectweb.asm.Label arg0, int[] arg1, org.objectweb.asm.Label[] arg2) {
		original.visitLookupSwitchInsn(arg0, arg1, arg2);
	}

	@Selector("visitMultiANewArrayInsnWithStringWithInt::")
	public void visitMultiANewArrayInsnWithStringWithInt(String arg0, int arg1) {
		original.visitMultiANewArrayInsn(arg0, arg1);
	}

	@Selector("visitInsnAnnotationWithIntWithTypePathWithStringWithBoolean::::")
	public org.objectweb.asm.AnnotationVisitor visitInsnAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitInsnAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitTryCatchBlockWithLabelWithLabelWithLabelWithString::::")
	public void visitTryCatchBlockWithLabelWithLabelWithLabelWithString(org.objectweb.asm.Label arg0, org.objectweb.asm.Label arg1, org.objectweb.asm.Label arg2, String arg3) {
		original.visitTryCatchBlock(arg0, arg1, arg2, arg3);
	}

	@Selector("visitTryCatchAnnotationWithIntWithTypePathWithStringWithBoolean::::")
	public org.objectweb.asm.AnnotationVisitor visitTryCatchAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTryCatchAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitLocalVariableWithStringWithStringWithStringWithLabelWithLabelWithInt::::::")
	public void visitLocalVariableWithStringWithStringWithStringWithLabelWithLabelWithInt(String arg0, String arg1, String arg2, org.objectweb.asm.Label arg3, org.objectweb.asm.Label arg4, int arg5) {
		original.visitLocalVariable(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Selector("visitLocalVariableAnnotationWithIntWithTypePathWithLabelWithLabelWithIntWithStringWithBoolean:::::::")
	public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotationWithIntWithTypePathWithLabelWithLabelWithIntWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, org.objectweb.asm.Label[] arg2, org.objectweb.asm.Label[] arg3, int[] arg4, String arg5, boolean arg6) {
		return original.visitLocalVariableAnnotation(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Selector("visitLineNumberWithIntWithLabel::")
	public void visitLineNumberWithIntWithLabel(int arg0, org.objectweb.asm.Label arg1) {
		original.visitLineNumber(arg0, arg1);
	}

	@Selector("visitMaxsWithIntWithInt::")
	public void visitMaxsWithIntWithInt(int arg0, int arg1) {
		original.visitMaxs(arg0, arg1);
	}

	@Selector("visitEnd")
	public void visitEnd() {
		original.visitEnd();
	}

}
