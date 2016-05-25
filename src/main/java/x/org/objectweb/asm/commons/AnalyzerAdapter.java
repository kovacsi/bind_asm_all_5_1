package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_AnalyzerAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class AnalyzerAdapter extends NSObject {

	private org.objectweb.asm.commons.AnalyzerAdapter original;

	protected AnalyzerAdapter(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithStringWithIntWithStringWithStringWithId:::::")
	public AnalyzerAdapter valueWithStringWithIntWithStringWithStringWithId(String arg0, int arg1, String arg2, String arg3, org.objectweb.asm.MethodVisitor arg4) {
		AnalyzerAdapter self = (AnalyzerAdapter) AnalyzerAdapter.alloc().init();
		self.original = new org.objectweb.asm.commons.AnalyzerAdapter(arg0, arg1, arg2, arg3, arg4);
		return self;
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

	@Selector("visitMaxsWithIntWithInt::")
	public void visitMaxsWithIntWithInt(int arg0, int arg1) {
		original.visitMaxs(arg0, arg1);
	}

}
