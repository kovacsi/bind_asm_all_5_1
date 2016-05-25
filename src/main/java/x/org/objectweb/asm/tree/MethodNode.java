package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_MethodNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class MethodNode extends NSObject {

	private org.objectweb.asm.tree.MethodNode original;

	protected MethodNode(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithInt:")
	public MethodNode valueWithInt(int arg0) {
		MethodNode self = (MethodNode) MethodNode.alloc().init();
		self.original = new org.objectweb.asm.tree.MethodNode(arg0);
		return self;
	}

	@Selector("valueWithIntWithStringWithStringWithStringWithId:::::")
	public MethodNode valueWithIntWithStringWithStringWithStringWithId(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
		MethodNode self = (MethodNode) MethodNode.alloc().init();
		self.original = new org.objectweb.asm.tree.MethodNode(arg0, arg1, arg2, arg3, arg4);
		return self;
	}

	@Selector("valueWithIntWithIntWithStringWithStringWithStringWithId::::::")
	public MethodNode valueWithIntWithIntWithStringWithStringWithStringWithId(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		MethodNode self = (MethodNode) MethodNode.alloc().init();
		self.original = new org.objectweb.asm.tree.MethodNode(arg0, arg1, arg2, arg3, arg4, arg5);
		return self;
	}

	@Selector("visitParameterWithStringWithInt::")
	public void visitParameterWithStringWithInt(String arg0, int arg1) {
		original.visitParameter(arg0, arg1);
	}

	@Selector("visitAnnotationDefault")
	public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
		return original.visitAnnotationDefault();
	}

	@Selector("visitAnnotationWithStringWithBool::")
	public org.objectweb.asm.AnnotationVisitor visitAnnotationWithStringWithBool(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);
	}

	@Selector("visitTypeAnnotationWithIntWithIdWithStringWithBool::::")
	public org.objectweb.asm.AnnotationVisitor visitTypeAnnotationWithIntWithIdWithStringWithBool(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitParameterAnnotationWithIntWithStringWithBool:::")
	public org.objectweb.asm.AnnotationVisitor visitParameterAnnotationWithIntWithStringWithBool(int arg0, String arg1, boolean arg2) {
		return original.visitParameterAnnotation(arg0, arg1, arg2);
	}

	@Selector("visitAttributeWithId:")
	public void visitAttributeWithId(org.objectweb.asm.Attribute arg0) {
		original.visitAttribute(arg0);
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

	@Selector("visitInsnAnnotationWithIntWithIdWithStringWithBool::::")
	public org.objectweb.asm.AnnotationVisitor visitInsnAnnotationWithIntWithIdWithStringWithBool(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitInsnAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitTryCatchBlockWithIdWithIdWithIdWithString::::")
	public void visitTryCatchBlockWithIdWithIdWithIdWithString(org.objectweb.asm.Label arg0, org.objectweb.asm.Label arg1, org.objectweb.asm.Label arg2, String arg3) {
		original.visitTryCatchBlock(arg0, arg1, arg2, arg3);
	}

	@Selector("visitTryCatchAnnotationWithIntWithIdWithStringWithBool::::")
	public org.objectweb.asm.AnnotationVisitor visitTryCatchAnnotationWithIntWithIdWithStringWithBool(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTryCatchAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitLocalVariableWithStringWithStringWithStringWithIdWithIdWithInt::::::")
	public void visitLocalVariableWithStringWithStringWithStringWithIdWithIdWithInt(String arg0, String arg1, String arg2, org.objectweb.asm.Label arg3, org.objectweb.asm.Label arg4, int arg5) {
		original.visitLocalVariable(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Selector("visitLocalVariableAnnotationWithIntWithIdWithIdWithIdWithIdWithStringWithBool:::::::")
	public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotationWithIntWithIdWithIdWithIdWithIdWithStringWithBool(int arg0, org.objectweb.asm.TypePath arg1, org.objectweb.asm.Label[] arg2, org.objectweb.asm.Label[] arg3, int[] arg4, String arg5, boolean arg6) {
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

	@Selector("visitEnd")
	public void visitEnd() {
		original.visitEnd();
	}

	@Selector("checkWithInt:")
	public void checkWithInt(int arg0) {
		original.check(arg0);
	}

	@Selector("acceptWithId:")
	public void acceptWithId(org.objectweb.asm.ClassVisitor arg0) {
		original.accept(arg0);
	}

	@Selector("acceptWithId:")
	public void acceptWithId(org.objectweb.asm.MethodVisitor arg0) {
		original.accept(arg0);
	}

}
