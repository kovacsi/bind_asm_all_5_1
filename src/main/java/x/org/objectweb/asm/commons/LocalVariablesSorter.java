package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_commons_LocalVariablesSorter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class LocalVariablesSorter extends NSObject {	
	
	public org.objectweb.asm.commons.LocalVariablesSorter original;	
	
	protected LocalVariablesSorter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("visitVarInsnWithInt:withInt:")	
	public void visitVarInsn(int arg0, int arg1) {		
		original.visitVarInsn(arg0, arg1);		
	}	
	
	@Selector("visitIincInsnWithInt:withInt:")	
	public void visitIincInsn(int arg0, int arg1) {		
		original.visitIincInsn(arg0, arg1);		
	}	
	
	@Selector("visitMaxsWithInt:withInt:")	
	public void visitMaxs(int arg0, int arg1) {		
		original.visitMaxs(arg0, arg1);		
	}	
	
	@Selector("visitLocalVariableWithString:withString:withString:withLabel:withLabel:withInt:")	
	public void visitLocalVariable(String arg0, String arg1, String arg2, org.objectweb.asm.Label arg3, org.objectweb.asm.Label arg4, int arg5) {
		original.visitLocalVariable(arg0, arg1, arg2, arg3, arg4, arg5);		
	}	
	
	@Selector("visitFrameWithInt:withInt:withObject:withInt:withObject:")	
	public void visitFrame(int arg0, int arg1, Object[] arg2, int arg3, Object[] arg4) {
		original.visitFrame(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("newLocalWithType:")	
	public int newLocal(org.objectweb.asm.Type arg0) {		
		return original.newLocal(arg0);		
	}	
}
