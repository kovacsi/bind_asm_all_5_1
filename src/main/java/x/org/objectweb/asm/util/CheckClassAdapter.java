package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_util_CheckClassAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class CheckClassAdapter extends NSObject {

	private org.objectweb.asm.util.CheckClassAdapter original;

	protected CheckClassAdapter(Pointer peer) {
		super(peer);
	}

	@Selector("mainWithId:")
	public static void mainWithId(String[] arg0) throws Exception {
		org.objectweb.asm.util.CheckClassAdapter.main(arg0);
	}

	@Selector("verifyWithIdWithIdWithBoolWithId::::")
	public static void verifyWithIdWithIdWithBoolWithId(org.objectweb.asm.ClassReader arg0, ClassLoader arg1, boolean arg2, java.io.PrintWriter arg3) {
		org.objectweb.asm.util.CheckClassAdapter.verify(arg0, arg1, arg2, arg3);
	}

	@Selector("verifyWithIdWithBoolWithId:::")
	public static void verifyWithIdWithBoolWithId(org.objectweb.asm.ClassReader arg0, boolean arg1, java.io.PrintWriter arg2) {
		org.objectweb.asm.util.CheckClassAdapter.verify(arg0, arg1, arg2);
	}

	@Selector("valueWithId:")
	public CheckClassAdapter valueWithId(org.objectweb.asm.ClassVisitor arg0) {
		CheckClassAdapter self = (CheckClassAdapter) CheckClassAdapter.alloc().init();
		self.original = new org.objectweb.asm.util.CheckClassAdapter(arg0);
		return self;
	}

	@Selector("valueWithIdWithBool::")
	public CheckClassAdapter valueWithIdWithBool(org.objectweb.asm.ClassVisitor arg0, boolean arg1) {
		CheckClassAdapter self = (CheckClassAdapter) CheckClassAdapter.alloc().init();
		self.original = new org.objectweb.asm.util.CheckClassAdapter(arg0, arg1);
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
