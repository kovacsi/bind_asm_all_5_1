package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_util_CheckFieldAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class CheckFieldAdapter extends NSObject {

	private org.objectweb.asm.util.CheckFieldAdapter original;

	protected CheckFieldAdapter(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithFieldVisitor:")
	public CheckFieldAdapter valueWithFieldVisitor(org.objectweb.asm.FieldVisitor arg0) {
		CheckFieldAdapter self = (CheckFieldAdapter) CheckFieldAdapter.alloc().init();
		self.original = new org.objectweb.asm.util.CheckFieldAdapter(arg0);
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
