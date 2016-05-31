package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_commons_InstructionAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class InstructionAdapter extends NSObject {	
	
	public org.objectweb.asm.commons.InstructionAdapter original;	
	
	protected InstructionAdapter(Pointer peer) {		
		super(peer);		
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
	
	@Selector("nop")	
	public void nop() {		
		original.nop();		
	}	
	
	@Selector("aconstWithObject:")	
	public void aconst(Object arg0) {
		original.aconst(arg0);		
	}	
	
	@Selector("iconstWithInt:")	
	public void iconst(int arg0) {		
		original.iconst(arg0);		
	}	
	
	@Selector("lconstWithLong:")	
	public void lconst(long arg0) {		
		original.lconst(arg0);		
	}	
	
	@Selector("fconstWithFloat:")	
	public void fconst(float arg0) {		
		original.fconst(arg0);		
	}	
	
	@Selector("dconstWithDouble:")	
	public void dconst(double arg0) {		
		original.dconst(arg0);		
	}	
	
	@Selector("tconstWithType:")	
	public void tconst(org.objectweb.asm.Type arg0) {		
		original.tconst(arg0);		
	}	
	
	@Selector("hconstWithHandle:")	
	public void hconst(org.objectweb.asm.Handle arg0) {		
		original.hconst(arg0);		
	}	
	
	@Selector("loadWithInt:withType:")	
	public void load(int arg0, org.objectweb.asm.Type arg1) {		
		original.load(arg0, arg1);		
	}	
	
	@Selector("aloadWithType:")	
	public void aload(org.objectweb.asm.Type arg0) {		
		original.aload(arg0);		
	}	
	
	@Selector("storeWithInt:withType:")	
	public void store(int arg0, org.objectweb.asm.Type arg1) {		
		original.store(arg0, arg1);		
	}	
	
	@Selector("astoreWithType:")	
	public void astore(org.objectweb.asm.Type arg0) {		
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
	
	@Selector("addWithType:")	
	public void add(org.objectweb.asm.Type arg0) {		
		original.add(arg0);		
	}	
	
	@Selector("subWithType:")	
	public void sub(org.objectweb.asm.Type arg0) {		
		original.sub(arg0);		
	}	
	
	@Selector("mulWithType:")	
	public void mul(org.objectweb.asm.Type arg0) {		
		original.mul(arg0);		
	}	
	
	@Selector("divWithType:")	
	public void div(org.objectweb.asm.Type arg0) {		
		original.div(arg0);		
	}	
	
	@Selector("remWithType:")	
	public void rem(org.objectweb.asm.Type arg0) {		
		original.rem(arg0);		
	}	
	
	@Selector("negWithType:")	
	public void neg(org.objectweb.asm.Type arg0) {		
		original.neg(arg0);		
	}	
	
	@Selector("shlWithType:")	
	public void shl(org.objectweb.asm.Type arg0) {		
		original.shl(arg0);		
	}	
	
	@Selector("shrWithType:")	
	public void shr(org.objectweb.asm.Type arg0) {		
		original.shr(arg0);		
	}	
	
	@Selector("ushrWithType:")	
	public void ushr(org.objectweb.asm.Type arg0) {		
		original.ushr(arg0);		
	}	
	
	@Selector("andWithType:")	
	public void and(org.objectweb.asm.Type arg0) {		
		original.and(arg0);		
	}	
	
	@Selector("orWithType:")	
	public void or(org.objectweb.asm.Type arg0) {		
		original.or(arg0);		
	}	
	
	@Selector("xorWithType:")	
	public void xor(org.objectweb.asm.Type arg0) {		
		original.xor(arg0);		
	}	
	
	@Selector("iincWithInt:withInt:")	
	public void iinc(int arg0, int arg1) {		
		original.iinc(arg0, arg1);		
	}	
	
	@Selector("castWithType:withType:")	
	public void cast(org.objectweb.asm.Type arg0, org.objectweb.asm.Type arg1) {		
		original.cast(arg0, arg1);		
	}	
	
	@Selector("lcmp")	
	public void lcmp() {		
		original.lcmp();		
	}	
	
	@Selector("cmplWithType:")	
	public void cmpl(org.objectweb.asm.Type arg0) {		
		original.cmpl(arg0);		
	}	
	
	@Selector("cmpgWithType:")	
	public void cmpg(org.objectweb.asm.Type arg0) {		
		original.cmpg(arg0);		
	}	
	
	@Selector("ifeqWithLabel:")	
	public void ifeq(org.objectweb.asm.Label arg0) {		
		original.ifeq(arg0);		
	}	
	
	@Selector("ifneWithLabel:")	
	public void ifne(org.objectweb.asm.Label arg0) {		
		original.ifne(arg0);		
	}	
	
	@Selector("ifltWithLabel:")	
	public void iflt(org.objectweb.asm.Label arg0) {		
		original.iflt(arg0);		
	}	
	
	@Selector("ifgeWithLabel:")	
	public void ifge(org.objectweb.asm.Label arg0) {		
		original.ifge(arg0);		
	}	
	
	@Selector("ifgtWithLabel:")	
	public void ifgt(org.objectweb.asm.Label arg0) {		
		original.ifgt(arg0);		
	}	
	
	@Selector("ifleWithLabel:")	
	public void ifle(org.objectweb.asm.Label arg0) {		
		original.ifle(arg0);		
	}	
	
	@Selector("ificmpeqWithLabel:")	
	public void ificmpeq(org.objectweb.asm.Label arg0) {		
		original.ificmpeq(arg0);		
	}	
	
	@Selector("ificmpneWithLabel:")	
	public void ificmpne(org.objectweb.asm.Label arg0) {		
		original.ificmpne(arg0);		
	}	
	
	@Selector("ificmpltWithLabel:")	
	public void ificmplt(org.objectweb.asm.Label arg0) {		
		original.ificmplt(arg0);		
	}	
	
	@Selector("ificmpgeWithLabel:")	
	public void ificmpge(org.objectweb.asm.Label arg0) {		
		original.ificmpge(arg0);		
	}	
	
	@Selector("ificmpgtWithLabel:")	
	public void ificmpgt(org.objectweb.asm.Label arg0) {		
		original.ificmpgt(arg0);		
	}	
	
	@Selector("ificmpleWithLabel:")	
	public void ificmple(org.objectweb.asm.Label arg0) {		
		original.ificmple(arg0);		
	}	
	
	@Selector("ifacmpeqWithLabel:")	
	public void ifacmpeq(org.objectweb.asm.Label arg0) {		
		original.ifacmpeq(arg0);		
	}	
	
	@Selector("ifacmpneWithLabel:")	
	public void ifacmpne(org.objectweb.asm.Label arg0) {		
		original.ifacmpne(arg0);		
	}	
	
	@Selector("goToWithLabel:")	
	public void goTo(org.objectweb.asm.Label arg0) {		
		original.goTo(arg0);		
	}	
	
	@Selector("jsrWithLabel:")	
	public void jsr(org.objectweb.asm.Label arg0) {		
		original.jsr(arg0);		
	}	
	
	@Selector("retWithInt:")	
	public void ret(int arg0) {		
		original.ret(arg0);		
	}	
	
	@Selector("tableswitchWithInt:withInt:withLabel:withLabel:")	
	public void tableswitch(int arg0, int arg1, org.objectweb.asm.Label arg2, org.objectweb.asm.Label[] arg3) {		
		original.tableswitch(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("lookupswitchWithLabel:withInt:withLabel:")	
	public void lookupswitch(org.objectweb.asm.Label arg0, int[] arg1, org.objectweb.asm.Label[] arg2) {		
		original.lookupswitch(arg0, arg1, arg2);		
	}	
	
	@Selector("areturnWithType:")	
	public void areturn(org.objectweb.asm.Type arg0) {		
		original.areturn(arg0);		
	}	
	
	@Selector("getstaticWithString:withString:withString:")	
	public void getstatic(String arg0, String arg1, String arg2) {
		original.getstatic(arg0, arg1, arg2);		
	}	
	
	@Selector("putstaticWithString:withString:withString:")	
	public void putstatic(String arg0, String arg1, String arg2) {
		original.putstatic(arg0, arg1, arg2);		
	}	
	
	@Selector("getfieldWithString:withString:withString:")	
	public void getfield(String arg0, String arg1, String arg2) {
		original.getfield(arg0, arg1, arg2);		
	}	
	
	@Selector("putfieldWithString:withString:withString:")	
	public void putfield(String arg0, String arg1, String arg2) {
		original.putfield(arg0, arg1, arg2);		
	}	
	
	@Selector("invokevirtualWithString:withString:withString:")	
	public void invokevirtual(String arg0, String arg1, String arg2) {
		original.invokevirtual(arg0, arg1, arg2);		
	}	
	
	@Selector("invokevirtualWithString:withString:withString:withBoolean:")	
	public void invokevirtual(String arg0, String arg1, String arg2, boolean arg3) {
		original.invokevirtual(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("invokespecialWithString:withString:withString:")	
	public void invokespecial(String arg0, String arg1, String arg2) {
		original.invokespecial(arg0, arg1, arg2);		
	}	
	
	@Selector("invokespecialWithString:withString:withString:withBoolean:")	
	public void invokespecial(String arg0, String arg1, String arg2, boolean arg3) {
		original.invokespecial(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("invokestaticWithString:withString:withString:")	
	public void invokestatic(String arg0, String arg1, String arg2) {
		original.invokestatic(arg0, arg1, arg2);		
	}	
	
	@Selector("invokestaticWithString:withString:withString:withBoolean:")	
	public void invokestatic(String arg0, String arg1, String arg2, boolean arg3) {
		original.invokestatic(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("invokeinterfaceWithString:withString:withString:")	
	public void invokeinterface(String arg0, String arg1, String arg2) {
		original.invokeinterface(arg0, arg1, arg2);		
	}	
	
	@Selector("invokedynamicWithString:withString:withHandle:withObject:")	
	public void invokedynamic(String arg0, String arg1, org.objectweb.asm.Handle arg2, Object[] arg3) {
		original.invokedynamic(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("anewWithType:")	
	public void anew(org.objectweb.asm.Type arg0) {		
		original.anew(arg0);		
	}	
	
	@Selector("newarrayWithType:")	
	public void newarray(org.objectweb.asm.Type arg0) {		
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
	
	@Selector("checkcastWithType:")	
	public void checkcast(org.objectweb.asm.Type arg0) {		
		original.checkcast(arg0);		
	}	
	
	@Selector("instanceOfWithType:")	
	public void instanceOf(org.objectweb.asm.Type arg0) {		
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
	
	@Selector("multianewarrayWithString:withInt:")	
	public void multianewarray(String arg0, int arg1) {
		original.multianewarray(arg0, arg1);		
	}	
	
	@Selector("ifnullWithLabel:")	
	public void ifnull(org.objectweb.asm.Label arg0) {		
		original.ifnull(arg0);		
	}	
	
	@Selector("ifnonnullWithLabel:")	
	public void ifnonnull(org.objectweb.asm.Label arg0) {		
		original.ifnonnull(arg0);		
	}	
	
	@Selector("markWithLabel:")	
	public void mark(org.objectweb.asm.Label arg0) {		
		original.mark(arg0);		
	}	
}
