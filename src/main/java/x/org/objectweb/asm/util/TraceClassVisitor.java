package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_util_TraceClassVisitor")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TraceClassVisitor extends NSObject {

	private org.objectweb.asm.util.TraceClassVisitor original;

	protected TraceClassVisitor(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithId:")
	public TraceClassVisitor valueWithId(java.io.PrintWriter arg0) {
		TraceClassVisitor self = (TraceClassVisitor) TraceClassVisitor.alloc().init();
		self.original = new org.objectweb.asm.util.TraceClassVisitor(arg0);
		return self;
	}

	@Selector("valueWithIdWithId::")
	public TraceClassVisitor valueWithIdWithId(org.objectweb.asm.ClassVisitor arg0, java.io.PrintWriter arg1) {
		TraceClassVisitor self = (TraceClassVisitor) TraceClassVisitor.alloc().init();
		self.original = new org.objectweb.asm.util.TraceClassVisitor(arg0, arg1);
		return self;
	}

	@Selector("valueWithIdWithIdWithId:::")
	public TraceClassVisitor valueWithIdWithIdWithId(org.objectweb.asm.ClassVisitor arg0, org.objectweb.asm.util.Printer arg1, java.io.PrintWriter arg2) {
		TraceClassVisitor self = (TraceClassVisitor) TraceClassVisitor.alloc().init();
		self.original = new org.objectweb.asm.util.TraceClassVisitor(arg0, arg1, arg2);
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

}