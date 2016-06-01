package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("InstructionAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class InstructionAdapter extends NSObject {	
	
	public org.objectweb.asm.commons.InstructionAdapter original;	
	
	protected InstructionAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithMethodVisitor:")	
	public InstructionAdapter valueWithMethodVisitor(Object arg0) {
		InstructionAdapter self = (InstructionAdapter) InstructionAdapter.alloc().init();		
		self.original = new org.objectweb.asm.commons.InstructionAdapter((org.objectweb.asm.MethodVisitor) arg0);		
		return self;		
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
	
	@Selector("tconstWithType:")	
	public void tconstWithType(x.org.objectweb.asm.Type arg0) {		
		original.tconst(arg0.original);		
	}	
	
	@Selector("hconstWithHandle:")	
	public void hconstWithHandle(x.org.objectweb.asm.Handle arg0) {		
		original.hconst(arg0.original);		
	}	
	
	@Selector("loadWithInt:withType:")	
	public void loadWithIntwithType(int arg0, x.org.objectweb.asm.Type arg1) {		
		original.load(arg0, arg1.original);		
	}	
	
	@Selector("aloadWithType:")	
	public void aloadWithType(x.org.objectweb.asm.Type arg0) {		
		original.aload(arg0.original);		
	}	
	
	@Selector("storeWithInt:withType:")	
	public void storeWithIntwithType(int arg0, x.org.objectweb.asm.Type arg1) {		
		original.store(arg0, arg1.original);		
	}	
	
	@Selector("astoreWithType:")	
	public void astoreWithType(x.org.objectweb.asm.Type arg0) {		
		original.astore(arg0.original);		
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
	public void addWithType(x.org.objectweb.asm.Type arg0) {		
		original.add(arg0.original);		
	}	
	
	@Selector("subWithType:")	
	public void subWithType(x.org.objectweb.asm.Type arg0) {		
		original.sub(arg0.original);		
	}	
	
	@Selector("mulWithType:")	
	public void mulWithType(x.org.objectweb.asm.Type arg0) {		
		original.mul(arg0.original);		
	}	
	
	@Selector("divWithType:")	
	public void divWithType(x.org.objectweb.asm.Type arg0) {		
		original.div(arg0.original);		
	}	
	
	@Selector("remWithType:")	
	public void remWithType(x.org.objectweb.asm.Type arg0) {		
		original.rem(arg0.original);		
	}	
	
	@Selector("negWithType:")	
	public void negWithType(x.org.objectweb.asm.Type arg0) {		
		original.neg(arg0.original);		
	}	
	
	@Selector("shlWithType:")	
	public void shlWithType(x.org.objectweb.asm.Type arg0) {		
		original.shl(arg0.original);		
	}	
	
	@Selector("shrWithType:")	
	public void shrWithType(x.org.objectweb.asm.Type arg0) {		
		original.shr(arg0.original);		
	}	
	
	@Selector("ushrWithType:")	
	public void ushrWithType(x.org.objectweb.asm.Type arg0) {		
		original.ushr(arg0.original);		
	}	
	
	@Selector("andWithType:")	
	public void andWithType(x.org.objectweb.asm.Type arg0) {		
		original.and(arg0.original);		
	}	
	
	@Selector("orWithType:")	
	public void orWithType(x.org.objectweb.asm.Type arg0) {		
		original.or(arg0.original);		
	}	
	
	@Selector("xorWithType:")	
	public void xorWithType(x.org.objectweb.asm.Type arg0) {		
		original.xor(arg0.original);		
	}	
	
	@Selector("iincWithInt:withInt:")	
	public void iincWithIntwithInt(int arg0, int arg1) {		
		original.iinc(arg0, arg1);		
	}	
	
	@Selector("castWithType:withType:")	
	public void castWithTypewithType(x.org.objectweb.asm.Type arg0, x.org.objectweb.asm.Type arg1) {		
		original.cast(arg0.original, arg1.original);		
	}	
	
	@Selector("lcmp")	
	public void lcmp() {		
		original.lcmp();		
	}	
	
	@Selector("cmplWithType:")	
	public void cmplWithType(x.org.objectweb.asm.Type arg0) {		
		original.cmpl(arg0.original);		
	}	
	
	@Selector("cmpgWithType:")	
	public void cmpgWithType(x.org.objectweb.asm.Type arg0) {		
		original.cmpg(arg0.original);		
	}	
	
	@Selector("ifeqWithLabel:")	
	public void ifeqWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ifeq(arg0.original);		
	}	
	
	@Selector("ifneWithLabel:")	
	public void ifneWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ifne(arg0.original);		
	}	
	
	@Selector("ifltWithLabel:")	
	public void ifltWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.iflt(arg0.original);		
	}	
	
	@Selector("ifgeWithLabel:")	
	public void ifgeWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ifge(arg0.original);		
	}	
	
	@Selector("ifgtWithLabel:")	
	public void ifgtWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ifgt(arg0.original);		
	}	
	
	@Selector("ifleWithLabel:")	
	public void ifleWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ifle(arg0.original);		
	}	
	
	@Selector("ificmpeqWithLabel:")	
	public void ificmpeqWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ificmpeq(arg0.original);		
	}	
	
	@Selector("ificmpneWithLabel:")	
	public void ificmpneWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ificmpne(arg0.original);		
	}	
	
	@Selector("ificmpltWithLabel:")	
	public void ificmpltWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ificmplt(arg0.original);		
	}	
	
	@Selector("ificmpgeWithLabel:")	
	public void ificmpgeWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ificmpge(arg0.original);		
	}	
	
	@Selector("ificmpgtWithLabel:")	
	public void ificmpgtWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ificmpgt(arg0.original);		
	}	
	
	@Selector("ificmpleWithLabel:")	
	public void ificmpleWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ificmple(arg0.original);		
	}	
	
	@Selector("ifacmpeqWithLabel:")	
	public void ifacmpeqWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ifacmpeq(arg0.original);		
	}	
	
	@Selector("ifacmpneWithLabel:")	
	public void ifacmpneWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ifacmpne(arg0.original);		
	}	
	
	@Selector("goToWithLabel:")	
	public void goToWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.goTo(arg0.original);		
	}	
	
	@Selector("jsrWithLabel:")	
	public void jsrWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.jsr(arg0.original);		
	}	
	
	@Selector("retWithInt:")	
	public void retWithInt(int arg0) {		
		original.ret(arg0);		
	}	
	
	@Selector("tableswitchWithInt:withInt:withLabel:withLabel:")	
	public void tableswitchWithIntwithIntwithLabelwithLabel(int arg0, int arg1, x.org.objectweb.asm.Label arg2, org.objectweb.asm.Label[] arg3) {		
		original.tableswitch(arg0, arg1, arg2.original, arg3);		
	}	
	
	@Selector("lookupswitchWithLabel:withInt:withLabel:")	
	public void lookupswitchWithLabelwithIntwithLabel(x.org.objectweb.asm.Label arg0, int[] arg1, org.objectweb.asm.Label[] arg2) {		
		original.lookupswitch(arg0.original, arg1, arg2);		
	}	
	
	@Selector("areturnWithType:")	
	public void areturnWithType(x.org.objectweb.asm.Type arg0) {		
		original.areturn(arg0.original);		
	}	
	
	@Selector("getstaticWithString:withString:withString:")	
	public void getstaticWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.getstatic(arg0, arg1, arg2);		
	}	
	
	@Selector("putstaticWithString:withString:withString:")	
	public void putstaticWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.putstatic(arg0, arg1, arg2);		
	}	
	
	@Selector("getfieldWithString:withString:withString:")	
	public void getfieldWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.getfield(arg0, arg1, arg2);		
	}	
	
	@Selector("putfieldWithString:withString:withString:")	
	public void putfieldWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.putfield(arg0, arg1, arg2);		
	}	
	
	@Selector("invokevirtualWithString:withString:withString:")	
	public void invokevirtualWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.invokevirtual(arg0, arg1, arg2);		
	}	
	
	@Selector("invokevirtualWithString:withString:withString:withBoolean:")	
	public void invokevirtualWithStringwithStringwithStringwithBoolean(String arg0, String arg1, String arg2, boolean arg3) {
		original.invokevirtual(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("invokespecialWithString:withString:withString:")	
	public void invokespecialWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.invokespecial(arg0, arg1, arg2);		
	}	
	
	@Selector("invokespecialWithString:withString:withString:withBoolean:")	
	public void invokespecialWithStringwithStringwithStringwithBoolean(String arg0, String arg1, String arg2, boolean arg3) {
		original.invokespecial(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("invokestaticWithString:withString:withString:")	
	public void invokestaticWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.invokestatic(arg0, arg1, arg2);		
	}	
	
	@Selector("invokestaticWithString:withString:withString:withBoolean:")	
	public void invokestaticWithStringwithStringwithStringwithBoolean(String arg0, String arg1, String arg2, boolean arg3) {
		original.invokestatic(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("invokeinterfaceWithString:withString:withString:")	
	public void invokeinterfaceWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.invokeinterface(arg0, arg1, arg2);		
	}	
	
	@Selector("invokedynamicWithString:withString:withHandle:withObject:")	
	public void invokedynamicWithStringwithStringwithHandlewithObject(String arg0, String arg1, x.org.objectweb.asm.Handle arg2, Object[] arg3) {
		original.invokedynamic(arg0, arg1, arg2.original, arg3);		
	}	
	
	@Selector("anewWithType:")	
	public void anewWithType(x.org.objectweb.asm.Type arg0) {		
		original.anew(arg0.original);		
	}	
	
	@Selector("newarrayWithType:")	
	public void newarrayWithType(x.org.objectweb.asm.Type arg0) {		
		original.newarray(arg0.original);		
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
	public void checkcastWithType(x.org.objectweb.asm.Type arg0) {		
		original.checkcast(arg0.original);		
	}	
	
	@Selector("instanceOfWithType:")	
	public void instanceOfWithType(x.org.objectweb.asm.Type arg0) {		
		original.instanceOf(arg0.original);		
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
	public void multianewarrayWithStringwithInt(String arg0, int arg1) {
		original.multianewarray(arg0, arg1);		
	}	
	
	@Selector("ifnullWithLabel:")	
	public void ifnullWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ifnull(arg0.original);		
	}	
	
	@Selector("ifnonnullWithLabel:")	
	public void ifnonnullWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ifnonnull(arg0.original);		
	}	
	
	@Selector("markWithLabel:")	
	public void markWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.mark(arg0.original);		
	}	
}
