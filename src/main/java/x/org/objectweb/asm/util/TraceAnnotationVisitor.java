package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_util_TraceAnnotationVisitor")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TraceAnnotationVisitor extends NSObject {

	private org.objectweb.asm.util.TraceAnnotationVisitor original;

	protected TraceAnnotationVisitor(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithId:")
	public TraceAnnotationVisitor valueWithId(org.objectweb.asm.util.Printer arg0) {
		TraceAnnotationVisitor self = (TraceAnnotationVisitor) TraceAnnotationVisitor.alloc().init();
		self.original = new org.objectweb.asm.util.TraceAnnotationVisitor(arg0);
		return self;
	}

	@Selector("valueWithIdWithId::")
	public TraceAnnotationVisitor valueWithIdWithId(org.objectweb.asm.AnnotationVisitor arg0, org.objectweb.asm.util.Printer arg1) {
		TraceAnnotationVisitor self = (TraceAnnotationVisitor) TraceAnnotationVisitor.alloc().init();
		self.original = new org.objectweb.asm.util.TraceAnnotationVisitor(arg0, arg1);
		return self;
	}

	@Selector("visitWithStringWithObject::")
	public void visitWithStringWithObject(String arg0, Object arg1) {
		original.visit(arg0, arg1);
	}

	@Selector("visitEnumWithStringWithStringWithString:::")
	public void visitEnumWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.visitEnum(arg0, arg1, arg2);
	}

	@Selector("visitAnnotationWithStringWithString::")
	public org.objectweb.asm.AnnotationVisitor visitAnnotationWithStringWithString(String arg0, String arg1) {
		return original.visitAnnotation(arg0, arg1);
	}

	@Selector("visitArrayWithString:")
	public org.objectweb.asm.AnnotationVisitor visitArrayWithString(String arg0) {
		return original.visitArray(arg0);
	}

	@Selector("visitEnd")
	public void visitEnd() {
		original.visitEnd();
	}

}
