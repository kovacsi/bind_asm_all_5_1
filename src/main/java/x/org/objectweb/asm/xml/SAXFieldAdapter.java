package x.org.objectweb.asm.xml;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_xml_SAXFieldAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SAXFieldAdapter extends NSObject {

	private org.objectweb.asm.xml.SAXFieldAdapter original;

	protected SAXFieldAdapter(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithIdWithId::")
	public SAXFieldAdapter valueWithIdWithId(org.objectweb.asm.xml.SAXAdapter arg0, org.xml.sax.Attributes arg1) {
		SAXFieldAdapter self = (SAXFieldAdapter) SAXFieldAdapter.alloc().init();
		self.original = new org.objectweb.asm.xml.SAXFieldAdapter(arg0, arg1);
		return self;
	}

	@Selector("visitAnnotationWithStringWithBool::")
	public org.objectweb.asm.AnnotationVisitor visitAnnotationWithStringWithBool(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);
	}

	@Selector("visitTypeAnnotationWithIntWithIdWithStringWithBool::::")
	public org.objectweb.asm.AnnotationVisitor visitTypeAnnotationWithIntWithIdWithStringWithBool(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitEnd")
	public void visitEnd() {
		original.visitEnd();
	}

}
