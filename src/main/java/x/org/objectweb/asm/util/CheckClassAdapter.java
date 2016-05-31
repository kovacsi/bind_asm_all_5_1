package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_util_CheckClassAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class CheckClassAdapter extends NSObject {	
	
	public org.objectweb.asm.util.CheckClassAdapter original;	
	
	protected CheckClassAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("mainWithString:")	
	public static void main(String[] arg0) throws Exception {
		org.objectweb.asm.util.CheckClassAdapter.main(arg0);		
	}	
	
	@Selector("verifyWithClassReader:withClassLoader:withBoolean:withPrintWriter:")	
	public static void verify(org.objectweb.asm.ClassReader arg0, ClassLoader arg1, boolean arg2, java.io.PrintWriter arg3) {
		org.objectweb.asm.util.CheckClassAdapter.verify(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("verifyWithClassReader:withBoolean:withPrintWriter:")	
	public static void verify(org.objectweb.asm.ClassReader arg0, boolean arg1, java.io.PrintWriter arg2) {		
		org.objectweb.asm.util.CheckClassAdapter.verify(arg0, arg1, arg2);		
	}	
	
	@Selector("visitWithInt:withInt:withString:withString:withString:withString:")	
	public void visit(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		original.visit(arg0, arg1, arg2, arg3, arg4, arg5);		
	}	
	
	@Selector("visitSourceWithString:withString:")	
	public void visitSource(String arg0, String arg1) {
		original.visitSource(arg0, arg1);		
	}	
	
	@Selector("visitOuterClassWithString:withString:withString:")	
	public void visitOuterClass(String arg0, String arg1, String arg2) {
		original.visitOuterClass(arg0, arg1, arg2);		
	}	
	
	@Selector("visitInnerClassWithString:withString:withString:withInt:")	
	public void visitInnerClass(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitAttributeWithAttribute:")	
	public void visitAttribute(org.objectweb.asm.Attribute arg0) {		
		original.visitAttribute(arg0);		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
	
	@Selector("checkClassSignatureWithString:")	
	public static void checkClassSignature(String arg0) {
		org.objectweb.asm.util.CheckClassAdapter.checkClassSignature(arg0);		
	}	
	
	@Selector("checkMethodSignatureWithString:")	
	public static void checkMethodSignature(String arg0) {
		org.objectweb.asm.util.CheckClassAdapter.checkMethodSignature(arg0);		
	}	
	
	@Selector("checkFieldSignatureWithString:")	
	public static void checkFieldSignature(String arg0) {
		org.objectweb.asm.util.CheckClassAdapter.checkFieldSignature(arg0);		
	}	
}
