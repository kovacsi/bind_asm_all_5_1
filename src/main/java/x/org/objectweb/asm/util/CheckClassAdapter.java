package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBCheckClassAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class CheckClassAdapter extends NSObject {	
	
	public org.objectweb.asm.util.CheckClassAdapter original;	
	
	protected CheckClassAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native CheckClassAdapter alloc();	
	
	@Selector("mainWithString:")	
	public static void mainWithString(String[] arg0) throws Exception {
		org.objectweb.asm.util.CheckClassAdapter.main(arg0);		
	}	
	
	@Selector("verifyWithClassReader:withClassLoader:withBoolean:withPrintWriter:")	
	public static void verifyWithClassReaderwithClassLoaderwithBooleanwithPrintWriter(x.org.objectweb.asm.ClassReader arg0, ClassLoader arg1, boolean arg2, java.io.PrintWriter arg3) {
		org.objectweb.asm.util.CheckClassAdapter.verify(arg0.original, arg1, arg2, arg3);		
	}	
	
	@Selector("verifyWithClassReader:withBoolean:withPrintWriter:")	
	public static void verifyWithClassReaderwithBooleanwithPrintWriter(x.org.objectweb.asm.ClassReader arg0, boolean arg1, java.io.PrintWriter arg2) {		
		org.objectweb.asm.util.CheckClassAdapter.verify(arg0.original, arg1, arg2);		
	}	
	
	@Selector("valueWithClassVisitor:")	
	public CheckClassAdapter valueWithClassVisitor(Object arg0) {
		CheckClassAdapter self = (CheckClassAdapter) CheckClassAdapter.alloc().init();		
		self.original = new org.objectweb.asm.util.CheckClassAdapter((org.objectweb.asm.ClassVisitor) arg0);		
		return self;		
	}	
	
	@Selector("valueWithClassVisitor:withBoolean:")	
	public CheckClassAdapter valueWithClassVisitorwithBoolean(Object arg0, boolean arg1) {
		CheckClassAdapter self = (CheckClassAdapter) CheckClassAdapter.alloc().init();		
		self.original = new org.objectweb.asm.util.CheckClassAdapter((org.objectweb.asm.ClassVisitor) arg0, arg1);		
		return self;		
	}	
	
	@Selector("visitWithInt:withInt:withString:withString:withString:withString:")	
	public void visitWithIntwithIntwithStringwithStringwithStringwithString(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		original.visit(arg0, arg1, arg2, arg3, arg4, arg5);		
	}	
	
	@Selector("visitSourceWithString:withString:")	
	public void visitSourceWithStringwithString(String arg0, String arg1) {
		original.visitSource(arg0, arg1);		
	}	
	
	@Selector("visitOuterClassWithString:withString:withString:")	
	public void visitOuterClassWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.visitOuterClass(arg0, arg1, arg2);		
	}	
	
	@Selector("visitInnerClassWithString:withString:withString:withInt:")	
	public void visitInnerClassWithStringwithStringwithStringwithInt(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitFieldWithInt:withString:withString:withString:withObject:")	
	public Object visitFieldWithIntwithStringwithStringwithStringwithObject(int arg0, String arg1, String arg2, String arg3, Object arg4) {
		return original.visitField(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitMethodWithInt:withString:withString:withString:withString:")	
	public Object visitMethodWithIntwithStringwithStringwithStringwithString(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
		return original.visitMethod(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitAnnotationWithString:withBoolean:")	
	public Object visitAnnotationWithStringwithBoolean(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);		
	}	
	
	@Selector("visitTypeAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Object visitTypeAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1.original, arg2, arg3);		
	}	
	
	@Selector("visitAttributeWithAttribute:")	
	public void visitAttributeWithAttribute(x.org.objectweb.asm.Attribute arg0) {		
		original.visitAttribute(arg0.original);		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
	
	@Selector("checkClassSignatureWithString:")	
	public static void checkClassSignatureWithString(String arg0) {
		org.objectweb.asm.util.CheckClassAdapter.checkClassSignature(arg0);		
	}	
	
	@Selector("checkMethodSignatureWithString:")	
	public static void checkMethodSignatureWithString(String arg0) {
		org.objectweb.asm.util.CheckClassAdapter.checkMethodSignature(arg0);		
	}	
	
	@Selector("checkFieldSignatureWithString:")	
	public static void checkFieldSignatureWithString(String arg0) {
		org.objectweb.asm.util.CheckClassAdapter.checkFieldSignature(arg0);		
	}	
}
