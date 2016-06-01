package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("ClassWriter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ClassWriter extends NSObject {	
	
	public org.objectweb.asm.ClassWriter original;	
	
	protected ClassWriter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:")	
	public ClassWriter valueWithInt(int arg0) {		
		ClassWriter self = (ClassWriter) ClassWriter.alloc().init();		
		self.original = new org.objectweb.asm.ClassWriter(arg0);		
		return self;		
	}	
	
	@Selector("valueWithClassReader:withInt:")	
	public ClassWriter valueWithClassReaderwithInt(ClassReader arg0, int arg1) {
		ClassWriter self = (ClassWriter) ClassWriter.alloc().init();		
		self.original = new org.objectweb.asm.ClassWriter(arg0.original, arg1);		
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
	
	@Selector("visitAnnotationWithString:withBoolean:")	
	public Object visitAnnotationWithStringwithBoolean(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);		
	}	
	
	@Selector("visitTypeAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Object visitTypeAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1.original, arg2, arg3);		
	}	
	
	@Selector("visitAttributeWithAttribute:")	
	public void visitAttributeWithAttribute(Attribute arg0) {
		original.visitAttribute(arg0.original);		
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
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
	
	@Selector("toByteArray")	
	public byte[] toByteArray() {		
		return original.toByteArray();		
	}	
	
	@Selector("newConstWithObject:")	
	public int newConstWithObject(Object arg0) {
		return original.newConst(arg0);		
	}	
	
	@Selector("newUTF8WithString:")	
	public int newUTF8WithString(String arg0) {
		return original.newUTF8(arg0);		
	}	
	
	@Selector("newClassWithString:")	
	public int newClassWithString(String arg0) {
		return original.newClass(arg0);		
	}	
	
	@Selector("newMethodTypeWithString:")	
	public int newMethodTypeWithString(String arg0) {
		return original.newMethodType(arg0);		
	}	
	
	@Selector("newHandleWithInt:withString:withString:withString:")	
	public int newHandleWithIntwithStringwithStringwithString(int arg0, String arg1, String arg2, String arg3) {
		return original.newHandle(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("newHandleWithInt:withString:withString:withString:withBoolean:")	
	public int newHandleWithIntwithStringwithStringwithStringwithBoolean(int arg0, String arg1, String arg2, String arg3, boolean arg4) {
		return original.newHandle(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("newInvokeDynamicWithString:withString:withHandle:withObject:")	
	public int newInvokeDynamicWithStringwithStringwithHandlewithObject(String arg0, String arg1, Handle arg2, Object[] arg3) {
		return original.newInvokeDynamic(arg0, arg1, arg2.original, arg3);		
	}	
	
	@Selector("newFieldWithString:withString:withString:")	
	public int newFieldWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		return original.newField(arg0, arg1, arg2);		
	}	
	
	@Selector("newMethodWithString:withString:withString:withBoolean:")	
	public int newMethodWithStringwithStringwithStringwithBoolean(String arg0, String arg1, String arg2, boolean arg3) {
		return original.newMethod(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("newNameTypeWithString:withString:")	
	public int newNameTypeWithStringwithString(String arg0, String arg1) {
		return original.newNameType(arg0, arg1);		
	}	
}
