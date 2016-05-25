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

	@Selector("mainWithId:")
	public static void mainWithId(String[] arg0) throws Exception {
		org.objectweb.asm.util.ASMifier.main(arg0);
	}

	@Selector("visitWithIntWithIntWithStringWithStringWithStringWithId::::::")
	public void visitWithIntWithIntWithStringWithStringWithStringWithId(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
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

	@Selector("visitClassAttributeWithId:")
	public void visitClassAttributeWithId(org.objectweb.asm.Attribute arg0) {
		original.visitClassAttribute(arg0);
	}

	@Selector("visitInnerClassWithStringWithStringWithStringWithInt::::")
	public void visitInnerClassWithStringWithStringWithStringWithInt(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);
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

	@Selector("visitAnnotationEnd")
	public void visitAnnotationEnd() {
		original.visitAnnotationEnd();
	}

	@Selector("visitFieldAttributeWithId:")
	public void visitFieldAttributeWithId(org.objectweb.asm.Attribute arg0) {
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

	@Selector("visitMethodAttributeWithId:")
	public void visitMethodAttributeWithId(org.objectweb.asm.Attribute arg0) {
		original.visitMethodAttribute(arg0);
	}

	@Selector("visitCode")
	public void visitCode() {
		original.visitCode();
	}

	@Selector("visitFrameWithIntWithIntWithIdWithIntWithId:::::")
	public void visitFrameWithIntWithIntWithIdWithIntWithId(int arg0, int arg1, Object[] arg2, int arg3, Object[] arg4) {
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

	@Selector("visitMethodInsnWithIntWithStringWithStringWithStringWithBool:::::")
	public void visitMethodInsnWithIntWithStringWithStringWithStringWithBool(int arg0, String arg1, String arg2, String arg3, boolean arg4) {
		original.visitMethodInsn(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitInvokeDynamicInsnWithStringWithStringWithIdWithId::::")
	public void visitInvokeDynamicInsnWithStringWithStringWithIdWithId(String arg0, String arg1, org.objectweb.asm.Handle arg2, Object[] arg3) {
		original.visitInvokeDynamicInsn(arg0, arg1, arg2, arg3);
	}

	@Selector("visitJumpInsnWithIntWithId::")
	public void visitJumpInsnWithIntWithId(int arg0, org.objectweb.asm.Label arg1) {
		original.visitJumpInsn(arg0, arg1);
	}

	@Selector("visitLabelWithId:")
	public void visitLabelWithId(org.objectweb.asm.Label arg0) {
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

	@Selector("visitTableSwitchInsnWithIntWithIntWithIdWithId::::")
	public void visitTableSwitchInsnWithIntWithIntWithIdWithId(int arg0, int arg1, org.objectweb.asm.Label arg2, org.objectweb.asm.Label[] arg3) {
		original.visitTableSwitchInsn(arg0, arg1, arg2, arg3);
	}

	@Selector("visitLookupSwitchInsnWithIdWithIdWithId:::")
	public void visitLookupSwitchInsnWithIdWithIdWithId(org.objectweb.asm.Label arg0, int[] arg1, org.objectweb.asm.Label[] arg2) {
		original.visitLookupSwitchInsn(arg0, arg1, arg2);
	}

	@Selector("visitMultiANewArrayInsnWithStringWithInt::")
	public void visitMultiANewArrayInsnWithStringWithInt(String arg0, int arg1) {
		original.visitMultiANewArrayInsn(arg0, arg1);
	}

	@Selector("visitTryCatchBlockWithIdWithIdWithIdWithString::::")
	public void visitTryCatchBlockWithIdWithIdWithIdWithString(org.objectweb.asm.Label arg0, org.objectweb.asm.Label arg1, org.objectweb.asm.Label arg2, String arg3) {
		original.visitTryCatchBlock(arg0, arg1, arg2, arg3);
	}

	@Selector("visitLocalVariableWithStringWithStringWithStringWithIdWithIdWithInt::::::")
	public void visitLocalVariableWithStringWithStringWithStringWithIdWithIdWithInt(String arg0, String arg1, String arg2, org.objectweb.asm.Label arg3, org.objectweb.asm.Label arg4, int arg5) {
		original.visitLocalVariable(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Selector("visitLocalVariableAnnotationWithIntWithIdWithIdWithIdWithIdWithStringWithBool:::::::")
	public org.objectweb.asm.util.Printer visitLocalVariableAnnotationWithIntWithIdWithIdWithIdWithIdWithStringWithBool(int arg0, org.objectweb.asm.TypePath arg1, org.objectweb.asm.Label[] arg2, org.objectweb.asm.Label[] arg3, int[] arg4, String arg5, boolean arg6) {
		return original.visitLocalVariableAnnotation(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Selector("visitLineNumberWithIntWithId::")
	public void visitLineNumberWithIntWithId(int arg0, org.objectweb.asm.Label arg1) {
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

	@Selector("visitAnnotationWithStringWithBool::")
	public org.objectweb.asm.util.ASMifier visitAnnotationWithStringWithBool(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);
	}

	@Selector("visitTypeAnnotationWithIntWithIdWithStringWithBool::::")
	public org.objectweb.asm.util.ASMifier visitTypeAnnotationWithIntWithIdWithStringWithBool(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitTypeAnnotationWithStringWithIntWithIdWithStringWithBool:::::")
	public org.objectweb.asm.util.ASMifier visitTypeAnnotationWithStringWithIntWithIdWithStringWithBool(String arg0, int arg1, org.objectweb.asm.TypePath arg2, String arg3, boolean arg4) {
		return original.visitTypeAnnotation(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitAttributeWithId:")
	public void visitAttributeWithId(org.objectweb.asm.Attribute arg0) {
		original.visitAttribute(arg0);
	}

	@Selector("visitTryCatchAnnotationWithIntWithIdWithStringWithBool::::")
	public org.objectweb.asm.util.Printer visitTryCatchAnnotationWithIntWithIdWithStringWithBool(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTryCatchAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitInsnAnnotationWithIntWithIdWithStringWithBool::::")
	public org.objectweb.asm.util.Printer visitInsnAnnotationWithIntWithIdWithStringWithBool(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitInsnAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitParameterAnnotationWithIntWithStringWithBool:::")
	public org.objectweb.asm.util.Printer visitParameterAnnotationWithIntWithStringWithBool(int arg0, String arg1, boolean arg2) {
		return original.visitParameterAnnotation(arg0, arg1, arg2);
	}

	@Selector("visitMethodTypeAnnotationWithIntWithIdWithStringWithBool::::")
	public org.objectweb.asm.util.Printer visitMethodTypeAnnotationWithIntWithIdWithStringWithBool(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitMethodTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitMethodAnnotationWithStringWithBool::")
	public org.objectweb.asm.util.Printer visitMethodAnnotationWithStringWithBool(String arg0, boolean arg1) {
		return original.visitMethodAnnotation(arg0, arg1);
	}

	@Selector("visitAnnotationDefault")
	public org.objectweb.asm.util.Printer visitAnnotationDefault() {
		return original.visitAnnotationDefault();
	}

	@Selector("visitFieldTypeAnnotationWithIntWithIdWithStringWithBool::::")
	public org.objectweb.asm.util.Printer visitFieldTypeAnnotationWithIntWithIdWithStringWithBool(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitFieldTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitFieldAnnotationWithStringWithBool::")
	public org.objectweb.asm.util.Printer visitFieldAnnotationWithStringWithBool(String arg0, boolean arg1) {
		return original.visitFieldAnnotation(arg0, arg1);
	}

	@Selector("visitArrayWithString:")
	public org.objectweb.asm.util.Printer visitArrayWithString(String arg0) {
		return original.visitArray(arg0);
	}

	@Selector("visitAnnotationWithStringWithString::")
	public org.objectweb.asm.util.Printer visitAnnotationWithStringWithString(String arg0, String arg1) {
		return original.visitAnnotation(arg0, arg1);
	}

	@Selector("visitMethodWithIntWithStringWithStringWithStringWithId:::::")
	public org.objectweb.asm.util.Printer visitMethodWithIntWithStringWithStringWithStringWithId(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
		return original.visitMethod(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitFieldWithIntWithStringWithStringWithStringWithObject:::::")
	public org.objectweb.asm.util.Printer visitFieldWithIntWithStringWithStringWithStringWithObject(int arg0, String arg1, String arg2, String arg3, Object arg4) {
		return original.visitField(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitClassTypeAnnotationWithIntWithIdWithStringWithBool::::")
	public org.objectweb.asm.util.Printer visitClassTypeAnnotationWithIntWithIdWithStringWithBool(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitClassTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitClassAnnotationWithStringWithBool::")
	public org.objectweb.asm.util.Printer visitClassAnnotationWithStringWithBool(String arg0, boolean arg1) {
		return original.visitClassAnnotation(arg0, arg1);
	}

}
