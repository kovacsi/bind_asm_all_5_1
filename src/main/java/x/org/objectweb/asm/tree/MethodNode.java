package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_MethodNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class MethodNode extends NSObject {	
	
	public org.objectweb.asm.tree.MethodNode original;	
	
	protected MethodNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("value")	
	public MethodNode value() {		
		MethodNode self = (MethodNode) MethodNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.MethodNode();		
		return self;		
	}	
	
	@Selector("valueWithInt:")	
	public MethodNode value(int arg0) {		
		MethodNode self = (MethodNode) MethodNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.MethodNode(arg0);		
		return self;		
	}	
	
	@Selector("valueWithInt:withString:withString:withString:withString:")	
	public MethodNode value(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
		MethodNode self = (MethodNode) MethodNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.MethodNode(arg0, arg1, arg2, arg3, arg4);		
		return self;		
	}	
	
	@Selector("valueWithInt:withInt:withString:withString:withString:withString:")	
	public MethodNode value(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		MethodNode self = (MethodNode) MethodNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.MethodNode(arg0, arg1, arg2, arg3, arg4, arg5);		
		return self;		
	}	
	
	@Selector("visitParameterWithString:withInt:")	
	public void visitParameter(String arg0, int arg1) {
		original.visitParameter(arg0, arg1);		
	}	
	
	@Selector("visitAttributeWithAttribute:")	
	public void visitAttribute(org.objectweb.asm.Attribute arg0) {		
		original.visitAttribute(arg0);		
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
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
	
	@Selector("checkWithInt:")	
	public void check(int arg0) {		
		original.check(arg0);		
	}	
}
