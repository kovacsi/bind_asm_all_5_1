package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_ClassWriter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ClassWriter extends NSObject {

	private org.objectweb.asm.ClassWriter original;

	protected ClassWriter(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithInt:")
	public ClassWriter valueWithInt(int arg0) {
		ClassWriter self = (ClassWriter) ClassWriter.alloc().init();
		self.original = new org.objectweb.asm.ClassWriter(arg0);
		return self;
	}

	@Selector("valueWithIdWithInt::")
	public ClassWriter valueWithIdWithInt(org.objectweb.asm.ClassReader arg0, int arg1) {
		ClassWriter self = (ClassWriter) ClassWriter.alloc().init();
		self.original = new org.objectweb.asm.ClassWriter(arg0, arg1);
		return self;
	}

	@Selector("visitWithIntWithIntWithStringWithStringWithStringWithId::::::")
	public void visitWithIntWithIntWithStringWithStringWithStringWithId(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		original.visit(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Selector("visitSourceWithStringWithString::")
	public void visitSourceWithStringWithString(String arg0, String arg1) {
		original.visitSource(arg0, arg1);
	}

	@Selector("visitOuterClassWithStringWithStringWithString:::")
	public void visitOuterClassWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.visitOuterClass(arg0, arg1, arg2);
	}

	@Selector("visitAnnotationWithStringWithBool::")
	public org.objectweb.asm.AnnotationVisitor visitAnnotationWithStringWithBool(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);
	}

	@Selector("visitTypeAnnotationWithIntWithIdWithStringWithBool::::")
	public org.objectweb.asm.AnnotationVisitor visitTypeAnnotationWithIntWithIdWithStringWithBool(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitAttributeWithId:")
	public void visitAttributeWithId(org.objectweb.asm.Attribute arg0) {
		original.visitAttribute(arg0);
	}

	@Selector("visitInnerClassWithStringWithStringWithStringWithInt::::")
	public void visitInnerClassWithStringWithStringWithStringWithInt(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);
	}

	@Selector("visitFieldWithIntWithStringWithStringWithStringWithObject:::::")
	public org.objectweb.asm.FieldVisitor visitFieldWithIntWithStringWithStringWithStringWithObject(int arg0, String arg1, String arg2, String arg3, Object arg4) {
		return original.visitField(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitMethodWithIntWithStringWithStringWithStringWithId:::::")
	public org.objectweb.asm.MethodVisitor visitMethodWithIntWithStringWithStringWithStringWithId(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
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

	@Selector("newHandleWithIntWithStringWithStringWithString::::")
	public int newHandleWithIntWithStringWithStringWithString(int arg0, String arg1, String arg2, String arg3) {
		return original.newHandle(arg0, arg1, arg2, arg3);
	}

	@Selector("newHandleWithIntWithStringWithStringWithStringWithBool:::::")
	public int newHandleWithIntWithStringWithStringWithStringWithBool(int arg0, String arg1, String arg2, String arg3, boolean arg4) {
		return original.newHandle(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("newInvokeDynamicWithStringWithStringWithIdWithId::::")
	public int newInvokeDynamicWithStringWithStringWithIdWithId(String arg0, String arg1, org.objectweb.asm.Handle arg2, Object[] arg3) {
		return original.newInvokeDynamic(arg0, arg1, arg2, arg3);
	}

	@Selector("newFieldWithStringWithStringWithString:::")
	public int newFieldWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		return original.newField(arg0, arg1, arg2);
	}

	@Selector("newMethodWithStringWithStringWithStringWithBool::::")
	public int newMethodWithStringWithStringWithStringWithBool(String arg0, String arg1, String arg2, boolean arg3) {
		return original.newMethod(arg0, arg1, arg2, arg3);
	}

	@Selector("newNameTypeWithStringWithString::")
	public int newNameTypeWithStringWithString(String arg0, String arg1) {
		return original.newNameType(arg0, arg1);
	}

}
