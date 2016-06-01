package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBLocalVariablesSorter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class LocalVariablesSorter extends NSObject {	
	
	public org.objectweb.asm.commons.LocalVariablesSorter original;	
	
	protected LocalVariablesSorter(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native LocalVariablesSorter alloc();	
	
	@Selector("valueWithInt:withString:withMethodVisitor:")	
	public LocalVariablesSorter valueWithIntwithStringwithMethodVisitor(int arg0, String arg1, Object arg2) {
		LocalVariablesSorter self = (LocalVariablesSorter) LocalVariablesSorter.alloc().init();		
		self.original = new org.objectweb.asm.commons.LocalVariablesSorter(arg0, arg1, (org.objectweb.asm.MethodVisitor) arg2);		
		return self;		
	}	
	
	@Selector("visitVarInsnWithInt:withInt:")	
	public void visitVarInsnWithIntwithInt(int arg0, int arg1) {		
		original.visitVarInsn(arg0, arg1);		
	}	
	
	@Selector("visitIincInsnWithInt:withInt:")	
	public void visitIincInsnWithIntwithInt(int arg0, int arg1) {		
		original.visitIincInsn(arg0, arg1);		
	}	
	
	@Selector("visitMaxsWithInt:withInt:")	
	public void visitMaxsWithIntwithInt(int arg0, int arg1) {		
		original.visitMaxs(arg0, arg1);		
	}	
	
	@Selector("visitLocalVariableWithString:withString:withString:withLabel:withLabel:withInt:")	
	public void visitLocalVariableWithStringwithStringwithStringwithLabelwithLabelwithInt(String arg0, String arg1, String arg2, x.org.objectweb.asm.Label arg3, x.org.objectweb.asm.Label arg4, int arg5) {
		original.visitLocalVariable(arg0, arg1, arg2, arg3.original, arg4.original, arg5);		
	}	
	
	@Selector("visitLocalVariableAnnotationWithInt:withTypePath:withLabel:withLabel:withInt:withString:withBoolean:")	
	public Object visitLocalVariableAnnotationWithIntwithTypePathwithLabelwithLabelwithIntwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, org.objectweb.asm.Label[] arg2, org.objectweb.asm.Label[] arg3, int[] arg4, String arg5, boolean arg6) {
		return original.visitLocalVariableAnnotation(arg0, arg1.original, arg2, arg3, arg4, arg5, arg6);		
	}	
	
	@Selector("visitFrameWithInt:withInt:withObject:withInt:withObject:")	
	public void visitFrameWithIntwithIntwithObjectwithIntwithObject(int arg0, int arg1, Object[] arg2, int arg3, Object[] arg4) {
		original.visitFrame(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("newLocalWithType:")	
	public int newLocalWithType(x.org.objectweb.asm.Type arg0) {		
		return original.newLocal(arg0.original);		
	}	
}
