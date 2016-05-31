package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_ClassWriter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ClassWriter extends NSObject {	
	
	public org.objectweb.asm.ClassWriter original;	
	
	protected ClassWriter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:")	
	public ClassWriter value(int arg0) {		
		ClassWriter self = (ClassWriter) ClassWriter.alloc().init();		
		self.original = new org.objectweb.asm.ClassWriter(arg0);		
		return self;		
	}	
	
	@Selector("valueWithClassReader:withInt:")	
	public ClassWriter value(org.objectweb.asm.ClassReader arg0, int arg1) {		
		ClassWriter self = (ClassWriter) ClassWriter.alloc().init();		
		self.original = new org.objectweb.asm.ClassWriter(arg0, arg1);		
		return self;		
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
	
	@Selector("visitAttributeWithAttribute:")	
	public void visitAttribute(org.objectweb.asm.Attribute arg0) {		
		original.visitAttribute(arg0);		
	}	
	
	@Selector("visitInnerClassWithString:withString:withString:withInt:")	
	public void visitInnerClass(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
	
	@Selector("toByteArray")	
	public byte[] toByteArray() {		
		return original.toByteArray();		
	}	
	
	@Selector("newConstWithObject:")	
	public int newConst(Object arg0) {
		return original.newConst(arg0);		
	}	
	
	@Selector("newUTF8WithString:")	
	public int newUTF8(String arg0) {
		return original.newUTF8(arg0);		
	}	
	
	@Selector("newClassWithString:")	
	public int newClass(String arg0) {
		return original.newClass(arg0);		
	}	
	
	@Selector("newMethodTypeWithString:")	
	public int newMethodType(String arg0) {
		return original.newMethodType(arg0);		
	}	
	
	@Selector("newHandleWithInt:withString:withString:withString:")	
	public int newHandle(int arg0, String arg1, String arg2, String arg3) {
		return original.newHandle(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("newHandleWithInt:withString:withString:withString:withBoolean:")	
	public int newHandle(int arg0, String arg1, String arg2, String arg3, boolean arg4) {
		return original.newHandle(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("newInvokeDynamicWithString:withString:withHandle:withObject:")	
	public int newInvokeDynamic(String arg0, String arg1, org.objectweb.asm.Handle arg2, Object[] arg3) {
		return original.newInvokeDynamic(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("newFieldWithString:withString:withString:")	
	public int newField(String arg0, String arg1, String arg2) {
		return original.newField(arg0, arg1, arg2);		
	}	
	
	@Selector("newMethodWithString:withString:withString:withBoolean:")	
	public int newMethod(String arg0, String arg1, String arg2, boolean arg3) {
		return original.newMethod(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("newNameTypeWithString:withString:")	
	public int newNameType(String arg0, String arg1) {
		return original.newNameType(arg0, arg1);		
	}	
}
