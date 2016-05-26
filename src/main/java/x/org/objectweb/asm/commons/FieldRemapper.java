package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_FieldRemapper")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class FieldRemapper extends NSObject {

	private org.objectweb.asm.commons.FieldRemapper original;

	protected FieldRemapper(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithFieldVisitorWithRemapper::")
	public FieldRemapper valueWithFieldVisitorWithRemapper(org.objectweb.asm.FieldVisitor arg0, org.objectweb.asm.commons.Remapper arg1) {
		FieldRemapper self = (FieldRemapper) FieldRemapper.alloc().init();
		self.original = new org.objectweb.asm.commons.FieldRemapper(arg0, arg1);
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

}
