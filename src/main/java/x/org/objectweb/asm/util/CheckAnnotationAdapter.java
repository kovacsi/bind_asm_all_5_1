package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_util_CheckAnnotationAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class CheckAnnotationAdapter extends NSObject {

	private org.objectweb.asm.util.CheckAnnotationAdapter original;

	protected CheckAnnotationAdapter(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithId:")
	public CheckAnnotationAdapter valueWithId(org.objectweb.asm.AnnotationVisitor arg0) {
		CheckAnnotationAdapter self = (CheckAnnotationAdapter) CheckAnnotationAdapter.alloc().init();
		self.original = new org.objectweb.asm.util.CheckAnnotationAdapter(arg0);
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
