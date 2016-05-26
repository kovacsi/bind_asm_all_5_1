package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_ClassRemapper")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ClassRemapper extends NSObject {

	private org.objectweb.asm.commons.ClassRemapper original;

	protected ClassRemapper(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithClassVisitorWithRemapper::")
	public ClassRemapper valueWithClassVisitorWithRemapper(org.objectweb.asm.ClassVisitor arg0, org.objectweb.asm.commons.Remapper arg1) {
		ClassRemapper self = (ClassRemapper) ClassRemapper.alloc().init();
		self.original = new org.objectweb.asm.commons.ClassRemapper(arg0, arg1);
		return self;
	}

	@Selector("visitWithIntWithIntWithStringWithStringWithStringWithString::::::")
	public void visitWithIntWithIntWithStringWithStringWithStringWithString(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		original.visit(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Selector("visitAnnotationWithStringWithBoolean::")
	public org.objectweb.asm.AnnotationVisitor visitAnnotationWithStringWithBoolean(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);
	}

	@Selector("visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean::::")
	public org.objectweb.asm.AnnotationVisitor visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitFieldWithIntWithStringWithStringWithStringWithObject:::::")
	public org.objectweb.asm.FieldVisitor visitFieldWithIntWithStringWithStringWithStringWithObject(int arg0, String arg1, String arg2, String arg3, Object arg4) {
		return original.visitField(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitMethodWithIntWithStringWithStringWithStringWithString:::::")
	public org.objectweb.asm.MethodVisitor visitMethodWithIntWithStringWithStringWithStringWithString(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
		return original.visitMethod(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitInnerClassWithStringWithStringWithStringWithInt::::")
	public void visitInnerClassWithStringWithStringWithStringWithInt(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);
	}

	@Selector("visitOuterClassWithStringWithStringWithString:::")
	public void visitOuterClassWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.visitOuterClass(arg0, arg1, arg2);
	}

}
