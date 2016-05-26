package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_RemappingAnnotationAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class RemappingAnnotationAdapter extends NSObject {

	private org.objectweb.asm.commons.RemappingAnnotationAdapter original;

	protected RemappingAnnotationAdapter(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithAnnotationVisitorWithRemapper::")
	public RemappingAnnotationAdapter valueWithAnnotationVisitorWithRemapper(org.objectweb.asm.AnnotationVisitor arg0, org.objectweb.asm.commons.Remapper arg1) {
		RemappingAnnotationAdapter self = (RemappingAnnotationAdapter) RemappingAnnotationAdapter.alloc().init();
		self.original = new org.objectweb.asm.commons.RemappingAnnotationAdapter(arg0, arg1);
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

}
