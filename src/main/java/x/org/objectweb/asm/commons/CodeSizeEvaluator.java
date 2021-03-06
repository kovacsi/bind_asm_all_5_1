package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBCodeSizeEvaluator")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class CodeSizeEvaluator extends NSObject {	
	
	public org.objectweb.asm.commons.CodeSizeEvaluator original;	
	
	protected CodeSizeEvaluator(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native CodeSizeEvaluator alloc();	
	
	@Selector("valueWithMethodVisitor:")	
	public CodeSizeEvaluator valueWithMethodVisitor(Object arg0) {
		CodeSizeEvaluator self = (CodeSizeEvaluator) CodeSizeEvaluator.alloc().init();		
		self.original = new org.objectweb.asm.commons.CodeSizeEvaluator((org.objectweb.asm.MethodVisitor) arg0);		
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
}
