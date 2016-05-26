package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_util_ASMifier")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ASMifier extends NSObject {

	private org.objectweb.asm.util.ASMifier original;

	protected ASMifier(Pointer peer) {
		super(peer);
	}

	@Selector("mainWithString:")
	public static void mainWithString(String[] arg0) throws Exception {
		org.objectweb.asm.util.ASMifier.main(arg0);
	}

	@Selector("visitWithIntWithIntWithStringWithStringWithStringWithString::::::")
	public void visitWithIntWithIntWithStringWithStringWithStringWithString(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		original.visit(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Selector("visitSourceWithStringWithString::")
	public void visitSourceWithStringWithString(String arg0, String arg1) {
		original.visitSource(arg0, arg1);
	}

	@Selector("visitOuterClassWithStringWithStringWithString:::")
	public void visitOuterClassWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.visitOuterClass(arg0, arg1, arg2);
	}

	@Selector("visitClassAnnotationWithStringWithBoolean::")
	public org.objectweb.asm.util.ASMifier visitClassAnnotationWithStringWithBoolean(String arg0, boolean arg1) {
		return original.visitClassAnnotation(arg0, arg1);
	}

	@Selector("visitClassTypeAnnotationWithIntWithTypePathWithStringWithBoolean::::")
	public org.objectweb.asm.util.ASMifier visitClassTypeAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitClassTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitClassAttributeWithAttribute:")
	public void visitClassAttributeWithAttribute(org.objectweb.asm.Attribute arg0) {
		original.visitClassAttribute(arg0);
	}

	@Selector("visitInnerClassWithStringWithStringWithStringWithInt::::")
	public void visitInnerClassWithStringWithStringWithStringWithInt(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);
	}

	@Selector("visitFieldWithIntWithStringWithStringWithStringWithObject:::::")
	public org.objectweb.asm.util.ASMifier visitFieldWithIntWithStringWithStringWithStringWithObject(int arg0, String arg1, String arg2, String arg3, Object arg4) {
		return original.visitField(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitMethodWithIntWithStringWithStringWithStringWithString:::::")
	public org.objectweb.asm.util.ASMifier visitMethodWithIntWithStringWithStringWithStringWithString(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
		return original.visitMethod(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitClassEnd")
	public void visitClassEnd() {
		original.visitClassEnd();
	}

	@Selector("visitWithStringWithObject::")
	public void visitWithStringWithObject(String arg0, Object arg1) {
		original.visit(arg0, arg1);
	}

	@Selector("visitEnumWithStringWithStringWithString:::")
	public void visitEnumWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.visitEnum(arg0, arg1, arg2);
	}

	@Selector("visitAnnotationWithStringWithString::")
	public org.objectweb.asm.util.ASMifier visitAnnotationWithStringWithString(String arg0, String arg1) {
		return original.visitAnnotation(arg0, arg1);
	}

	@Selector("visitArrayWithString:")
	public org.objectweb.asm.util.ASMifier visitArrayWithString(String arg0) {
		return original.visitArray(arg0);
	}

	@Selector("visitAnnotationEnd")
	public void visitAnnotationEnd() {
		original.visitAnnotationEnd();
	}

	@Selector("visitFieldAnnotationWithStringWithBoolean::")
	public org.objectweb.asm.util.ASMifier visitFieldAnnotationWithStringWithBoolean(String arg0, boolean arg1) {
		return original.visitFieldAnnotation(arg0, arg1);
	}

	@Selector("visitFieldTypeAnnotationWithIntWithTypePathWithStringWithBoolean::::")
	public org.objectweb.asm.util.ASMifier visitFieldTypeAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitFieldTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitFieldAttributeWithAttribute:")
	public void visitFieldAttributeWithAttribute(org.objectweb.asm.Attribute arg0) {
		original.visitFieldAttribute(arg0);
	}

	@Selector("visitFieldEnd")
	public void visitFieldEnd() {
		original.visitFieldEnd();
	}

	@Selector("visitParameterWithStringWithInt::")
	public void visitParameterWithStringWithInt(String arg0, int arg1) {
		original.visitParameter(arg0, arg1);
	}

	@Selector("visitAnnotationDefault")
	public org.objectweb.asm.util.ASMifier visitAnnotationDefault() {
		return original.visitAnnotationDefault();
	}

	@Selector("visitMethodAnnotationWithStringWithBoolean::")
	public org.objectweb.asm.util.ASMifier visitMethodAnnotationWithStringWithBoolean(String arg0, boolean arg1) {
		return original.visitMethodAnnotation(arg0, arg1);
	}

	@Selector("visitMethodTypeAnnotationWithIntWithTypePathWithStringWithBoolean::::")
	public org.objectweb.asm.util.ASMifier visitMethodTypeAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitMethodTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitParameterAnnotationWithIntWithStringWithBoolean:::")
	public org.objectweb.asm.util.ASMifier visitParameterAnnotationWithIntWithStringWithBoolean(int arg0, String arg1, boolean arg2) {
		return original.visitParameterAnnotation(arg0, arg1, arg2);
	}

	@Selector("visitMethodAttributeWithAttribute:")
	public void visitMethodAttributeWithAttribute(org.objectweb.asm.Attribute arg0) {
		original.visitMethodAttribute(arg0);
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
	public org.objectweb.asm.util.ASMifier visitInsnAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitInsnAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitTryCatchBlockWithLabelWithLabelWithLabelWithString::::")
	public void visitTryCatchBlockWithLabelWithLabelWithLabelWithString(org.objectweb.asm.Label arg0, org.objectweb.asm.Label arg1, org.objectweb.asm.Label arg2, String arg3) {
		original.visitTryCatchBlock(arg0, arg1, arg2, arg3);
	}

	@Selector("visitTryCatchAnnotationWithIntWithTypePathWithStringWithBoolean::::")
	public org.objectweb.asm.util.ASMifier visitTryCatchAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTryCatchAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitLocalVariableWithStringWithStringWithStringWithLabelWithLabelWithInt::::::")
	public void visitLocalVariableWithStringWithStringWithStringWithLabelWithLabelWithInt(String arg0, String arg1, String arg2, org.objectweb.asm.Label arg3, org.objectweb.asm.Label arg4, int arg5) {
		original.visitLocalVariable(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Selector("visitLocalVariableAnnotationWithIntWithTypePathWithLabelWithLabelWithIntWithStringWithBoolean:::::::")
	public org.objectweb.asm.util.Printer visitLocalVariableAnnotationWithIntWithTypePathWithLabelWithLabelWithIntWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, org.objectweb.asm.Label[] arg2, org.objectweb.asm.Label[] arg3, int[] arg4, String arg5, boolean arg6) {
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

	@Selector("visitMethodEnd")
	public void visitMethodEnd() {
		original.visitMethodEnd();
	}

	@Selector("visitAnnotationWithStringWithBoolean::")
	public org.objectweb.asm.util.ASMifier visitAnnotationWithStringWithBoolean(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);
	}

	@Selector("visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean::::")
	public org.objectweb.asm.util.ASMifier visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitTypeAnnotationWithStringWithIntWithTypePathWithStringWithBoolean:::::")
	public org.objectweb.asm.util.ASMifier visitTypeAnnotationWithStringWithIntWithTypePathWithStringWithBoolean(String arg0, int arg1, org.objectweb.asm.TypePath arg2, String arg3, boolean arg4) {
		return original.visitTypeAnnotation(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitAttributeWithAttribute:")
	public void visitAttributeWithAttribute(org.objectweb.asm.Attribute arg0) {
		original.visitAttribute(arg0);
	}

}
