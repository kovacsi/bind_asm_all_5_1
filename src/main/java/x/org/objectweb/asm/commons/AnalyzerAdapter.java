package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_commons_AnalyzerAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class AnalyzerAdapter extends NSObject {	
	
	public org.objectweb.asm.commons.AnalyzerAdapter original;	
	
	protected AnalyzerAdapter(Pointer peer) {		
		super(peer);		
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
	
	@Selector("visitMaxsWithInt:withInt:")	
	public void visitMaxs(int arg0, int arg1) {		
		original.visitMaxs(arg0, arg1);		
	}	
}
