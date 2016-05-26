package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_util_TraceFieldVisitor")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TraceFieldVisitor extends NSObject {

	private org.objectweb.asm.util.TraceFieldVisitor original;

	protected TraceFieldVisitor(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithPrinter:")
	public TraceFieldVisitor valueWithPrinter(org.objectweb.asm.util.Printer arg0) {
		TraceFieldVisitor self = (TraceFieldVisitor) TraceFieldVisitor.alloc().init();
		self.original = new org.objectweb.asm.util.TraceFieldVisitor(arg0);
		return self;
	}

	@Selector("valueWithFieldVisitorWithPrinter::")
	public TraceFieldVisitor valueWithFieldVisitorWithPrinter(org.objectweb.asm.FieldVisitor arg0, org.objectweb.asm.util.Printer arg1) {
		TraceFieldVisitor self = (TraceFieldVisitor) TraceFieldVisitor.alloc().init();
		self.original = new org.objectweb.asm.util.TraceFieldVisitor(arg0, arg1);
		return self;
	}

	@Selector("visitAnnotationWithStringWithBoolean::")
	public org.objectweb.asm.AnnotationVisitor visitAnnotationWithStringWithBoolean(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);
	}

	@Selector("visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean::::")
	public org.objectweb.asm.AnnotationVisitor visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitAttributeWithAttribute:")
	public void visitAttributeWithAttribute(org.objectweb.asm.Attribute arg0) {
		original.visitAttribute(arg0);
	}

	@Selector("visitEnd")
	public void visitEnd() {
		original.visitEnd();
	}

}
