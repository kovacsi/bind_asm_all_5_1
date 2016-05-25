package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_InstructionAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class InstructionAdapter extends NSObject {

	private org.objectweb.asm.commons.InstructionAdapter original;

	protected InstructionAdapter(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithId:")
	public InstructionAdapter valueWithId(org.objectweb.asm.MethodVisitor arg0) {
		InstructionAdapter self = (InstructionAdapter) InstructionAdapter.alloc().init();
		self.original = new org.objectweb.asm.commons.InstructionAdapter(arg0);
		return self;
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

	@Selector("nop")
	public void nop() {
		original.nop();
	}

	@Selector("aconstWithObject:")
	public void aconstWithObject(Object arg0) {
		original.aconst(arg0);
	}

	@Selector("iconstWithInt:")
	public void iconstWithInt(int arg0) {
		original.iconst(arg0);
	}

	@Selector("lconstWithLong:")
	public void lconstWithLong(long arg0) {
		original.lconst(arg0);
	}

	@Selector("fconstWithFloat:")
	public void fconstWithFloat(float arg0) {
		original.fconst(arg0);
	}

	@Selector("dconstWithDouble:")
	public void dconstWithDouble(double arg0) {
		original.dconst(arg0);
	}

	@Selector("tconstWithId:")
	public void tconstWithId(org.objectweb.asm.Type arg0) {
		original.tconst(arg0);
	}

	@Selector("hconstWithId:")
	public void hconstWithId(org.objectweb.asm.Handle arg0) {
		original.hconst(arg0);
	}

	@Selector("loadWithIntWithId::")
	public void loadWithIntWithId(int arg0, org.objectweb.asm.Type arg1) {
		original.load(arg0, arg1);
	}

	@Selector("aloadWithId:")
	public void aloadWithId(org.objectweb.asm.Type arg0) {
		original.aload(arg0);
	}

	@Selector("storeWithIntWithId::")
	public void storeWithIntWithId(int arg0, org.objectweb.asm.Type arg1) {
		original.store(arg0, arg1);
	}

	@Selector("astoreWithId:")
	public void astoreWithId(org.objectweb.asm.Type arg0) {
		original.astore(arg0);
	}

	@Selector("pop")
	public void pop() {
		original.pop();
	}

	@Selector("pop2")
	public void pop2() {
		original.pop2();
	}

	@Selector("dup")
	public void dup() {
		original.dup();
	}

	@Selector("dup2")
	public void dup2() {
		original.dup2();
	}

	@Selector("dupX1")
	public void dupX1() {
		original.dupX1();
	}

	@Selector("dupX2")
	public void dupX2() {
		original.dupX2();
	}

	@Selector("dup2X1")
	public void dup2X1() {
		original.dup2X1();
	}

	@Selector("dup2X2")
	public void dup2X2() {
		original.dup2X2();
	}

	@Selector("swap")
	public void swap() {
		original.swap();
	}

	@Selector("addWithId:")
	public void addWithId(org.objectweb.asm.Type arg0) {
		original.add(arg0);
	}

	@Selector("subWithId:")
	public void subWithId(org.objectweb.asm.Type arg0) {
		original.sub(arg0);
	}

	@Selector("mulWithId:")
	public void mulWithId(org.objectweb.asm.Type arg0) {
		original.mul(arg0);
	}

	@Selector("divWithId:")
	public void divWithId(org.objectweb.asm.Type arg0) {
		original.div(arg0);
	}

	@Selector("remWithId:")
	public void remWithId(org.objectweb.asm.Type arg0) {
		original.rem(arg0);
	}

	@Selector("negWithId:")
	public void negWithId(org.objectweb.asm.Type arg0) {
		original.neg(arg0);
	}

	@Selector("shlWithId:")
	public void shlWithId(org.objectweb.asm.Type arg0) {
		original.shl(arg0);
	}

	@Selector("shrWithId:")
	public void shrWithId(org.objectweb.asm.Type arg0) {
		original.shr(arg0);
	}

	@Selector("ushrWithId:")
	public void ushrWithId(org.objectweb.asm.Type arg0) {
		original.ushr(arg0);
	}

	@Selector("andWithId:")
	public void andWithId(org.objectweb.asm.Type arg0) {
		original.and(arg0);
	}

	@Selector("orWithId:")
	public void orWithId(org.objectweb.asm.Type arg0) {
		original.or(arg0);
	}

	@Selector("xorWithId:")
	public void xorWithId(org.objectweb.asm.Type arg0) {
		original.xor(arg0);
	}

	@Selector("iincWithIntWithInt::")
	public void iincWithIntWithInt(int arg0, int arg1) {
		original.iinc(arg0, arg1);
	}

	@Selector("castWithIdWithId::")
	public void castWithIdWithId(org.objectweb.asm.Type arg0, org.objectweb.asm.Type arg1) {
		original.cast(arg0, arg1);
	}

	@Selector("lcmp")
	public void lcmp() {
		original.lcmp();
	}

	@Selector("cmplWithId:")
	public void cmplWithId(org.objectweb.asm.Type arg0) {
		original.cmpl(arg0);
	}

	@Selector("cmpgWithId:")
	public void cmpgWithId(org.objectweb.asm.Type arg0) {
		original.cmpg(arg0);
	}

	@Selector("ifeqWithId:")
	public void ifeqWithId(org.objectweb.asm.Label arg0) {
		original.ifeq(arg0);
	}

	@Selector("ifneWithId:")
	public void ifneWithId(org.objectweb.asm.Label arg0) {
		original.ifne(arg0);
	}

	@Selector("ifltWithId:")
	public void ifltWithId(org.objectweb.asm.Label arg0) {
		original.iflt(arg0);
	}

	@Selector("ifgeWithId:")
	public void ifgeWithId(org.objectweb.asm.Label arg0) {
		original.ifge(arg0);
	}

	@Selector("ifgtWithId:")
	public void ifgtWithId(org.objectweb.asm.Label arg0) {
		original.ifgt(arg0);
	}

	@Selector("ifleWithId:")
	public void ifleWithId(org.objectweb.asm.Label arg0) {
		original.ifle(arg0);
	}

	@Selector("ificmpeqWithId:")
	public void ificmpeqWithId(org.objectweb.asm.Label arg0) {
		original.ificmpeq(arg0);
	}

	@Selector("ificmpneWithId:")
	public void ificmpneWithId(org.objectweb.asm.Label arg0) {
		original.ificmpne(arg0);
	}

	@Selector("ificmpltWithId:")
	public void ificmpltWithId(org.objectweb.asm.Label arg0) {
		original.ificmplt(arg0);
	}

	@Selector("ificmpgeWithId:")
	public void ificmpgeWithId(org.objectweb.asm.Label arg0) {
		original.ificmpge(arg0);
	}

	@Selector("ificmpgtWithId:")
	public void ificmpgtWithId(org.objectweb.asm.Label arg0) {
		original.ificmpgt(arg0);
	}

	@Selector("ificmpleWithId:")
	public void ificmpleWithId(org.objectweb.asm.Label arg0) {
		original.ificmple(arg0);
	}

	@Selector("ifacmpeqWithId:")
	public void ifacmpeqWithId(org.objectweb.asm.Label arg0) {
		original.ifacmpeq(arg0);
	}

	@Selector("ifacmpneWithId:")
	public void ifacmpneWithId(org.objectweb.asm.Label arg0) {
		original.ifacmpne(arg0);
	}

	@Selector("goToWithId:")
	public void goToWithId(org.objectweb.asm.Label arg0) {
		original.goTo(arg0);
	}

	@Selector("jsrWithId:")
	public void jsrWithId(org.objectweb.asm.Label arg0) {
		original.jsr(arg0);
	}

	@Selector("retWithInt:")
	public void retWithInt(int arg0) {
		original.ret(arg0);
	}

	@Selector("tableswitchWithIntWithIntWithIdWithId::::")
	public void tableswitchWithIntWithIntWithIdWithId(int arg0, int arg1, org.objectweb.asm.Label arg2, org.objectweb.asm.Label[] arg3) {
		original.tableswitch(arg0, arg1, arg2, arg3);
	}

	@Selector("lookupswitchWithIdWithIdWithId:::")
	public void lookupswitchWithIdWithIdWithId(org.objectweb.asm.Label arg0, int[] arg1, org.objectweb.asm.Label[] arg2) {
		original.lookupswitch(arg0, arg1, arg2);
	}

	@Selector("areturnWithId:")
	public void areturnWithId(org.objectweb.asm.Type arg0) {
		original.areturn(arg0);
	}

	@Selector("getstaticWithStringWithStringWithString:::")
	public void getstaticWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.getstatic(arg0, arg1, arg2);
	}

	@Selector("putstaticWithStringWithStringWithString:::")
	public void putstaticWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.putstatic(arg0, arg1, arg2);
	}

	@Selector("getfieldWithStringWithStringWithString:::")
	public void getfieldWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.getfield(arg0, arg1, arg2);
	}

	@Selector("putfieldWithStringWithStringWithString:::")
	public void putfieldWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.putfield(arg0, arg1, arg2);
	}

	@Selector("invokevirtualWithStringWithStringWithString:::")
	public void invokevirtualWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.invokevirtual(arg0, arg1, arg2);
	}

	@Selector("invokevirtualWithStringWithStringWithStringWithBool::::")
	public void invokevirtualWithStringWithStringWithStringWithBool(String arg0, String arg1, String arg2, boolean arg3) {
		original.invokevirtual(arg0, arg1, arg2, arg3);
	}

	@Selector("invokespecialWithStringWithStringWithString:::")
	public void invokespecialWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.invokespecial(arg0, arg1, arg2);
	}

	@Selector("invokespecialWithStringWithStringWithStringWithBool::::")
	public void invokespecialWithStringWithStringWithStringWithBool(String arg0, String arg1, String arg2, boolean arg3) {
		original.invokespecial(arg0, arg1, arg2, arg3);
	}

	@Selector("invokestaticWithStringWithStringWithString:::")
	public void invokestaticWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.invokestatic(arg0, arg1, arg2);
	}

	@Selector("invokestaticWithStringWithStringWithStringWithBool::::")
	public void invokestaticWithStringWithStringWithStringWithBool(String arg0, String arg1, String arg2, boolean arg3) {
		original.invokestatic(arg0, arg1, arg2, arg3);
	}

	@Selector("invokeinterfaceWithStringWithStringWithString:::")
	public void invokeinterfaceWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.invokeinterface(arg0, arg1, arg2);
	}

	@Selector("invokedynamicWithStringWithStringWithIdWithId::::")
	public void invokedynamicWithStringWithStringWithIdWithId(String arg0, String arg1, org.objectweb.asm.Handle arg2, Object[] arg3) {
		original.invokedynamic(arg0, arg1, arg2, arg3);
	}

	@Selector("anewWithId:")
	public void anewWithId(org.objectweb.asm.Type arg0) {
		original.anew(arg0);
	}

	@Selector("newarrayWithId:")
	public void newarrayWithId(org.objectweb.asm.Type arg0) {
		original.newarray(arg0);
	}

	@Selector("arraylength")
	public void arraylength() {
		original.arraylength();
	}

	@Selector("athrow")
	public void athrow() {
		original.athrow();
	}

	@Selector("checkcastWithId:")
	public void checkcastWithId(org.objectweb.asm.Type arg0) {
		original.checkcast(arg0);
	}

	@Selector("instanceOfWithId:")
	public void instanceOfWithId(org.objectweb.asm.Type arg0) {
		original.instanceOf(arg0);
	}

	@Selector("monitorenter")
	public void monitorenter() {
		original.monitorenter();
	}

	@Selector("monitorexit")
	public void monitorexit() {
		original.monitorexit();
	}

	@Selector("multianewarrayWithStringWithInt::")
	public void multianewarrayWithStringWithInt(String arg0, int arg1) {
		original.multianewarray(arg0, arg1);
	}

	@Selector("ifnullWithId:")
	public void ifnullWithId(org.objectweb.asm.Label arg0) {
		original.ifnull(arg0);
	}

	@Selector("ifnonnullWithId:")
	public void ifnonnullWithId(org.objectweb.asm.Label arg0) {
		original.ifnonnull(arg0);
	}

	@Selector("markWithId:")
	public void markWithId(org.objectweb.asm.Label arg0) {
		original.mark(arg0);
	}

}
