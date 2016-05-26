package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_CodeSizeEvaluator")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class CodeSizeEvaluator extends NSObject {

	private org.objectweb.asm.commons.CodeSizeEvaluator original;

	protected CodeSizeEvaluator(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithMethodVisitor:")
	public CodeSizeEvaluator valueWithMethodVisitor(org.objectweb.asm.MethodVisitor arg0) {
		CodeSizeEvaluator self = (CodeSizeEvaluator) CodeSizeEvaluator.alloc().init();
		self.original = new org.objectweb.asm.commons.CodeSizeEvaluator(arg0);
		return self;
	}

	@Selector("getMinSize")
	public int getMinSize() {
		return original.getMinSize();
	}

	@Selector("getMaxSize")
	public int getMaxSize() {
		return original.getMaxSize();
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

}
