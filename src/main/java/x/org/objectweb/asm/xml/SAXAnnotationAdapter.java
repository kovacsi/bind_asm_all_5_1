package x.org.objectweb.asm.xml;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_xml_SAXAnnotationAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SAXAnnotationAdapter extends NSObject {

	private org.objectweb.asm.xml.SAXAnnotationAdapter original;

	protected SAXAnnotationAdapter(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithSAXAdapterWithStringWithIntWithStringWithString:::::")
	public SAXAnnotationAdapter valueWithSAXAdapterWithStringWithIntWithStringWithString(org.objectweb.asm.xml.SAXAdapter arg0, String arg1, int arg2, String arg3, String arg4) {
		SAXAnnotationAdapter self = (SAXAnnotationAdapter) SAXAnnotationAdapter.alloc().init();
		self.original = new org.objectweb.asm.xml.SAXAnnotationAdapter(arg0, arg1, arg2, arg3, arg4);
		return self;
	}

	@Selector("valueWithSAXAdapterWithStringWithIntWithIntWithString:::::")
	public SAXAnnotationAdapter valueWithSAXAdapterWithStringWithIntWithIntWithString(org.objectweb.asm.xml.SAXAdapter arg0, String arg1, int arg2, int arg3, String arg4) {
		SAXAnnotationAdapter self = (SAXAnnotationAdapter) SAXAnnotationAdapter.alloc().init();
		self.original = new org.objectweb.asm.xml.SAXAnnotationAdapter(arg0, arg1, arg2, arg3, arg4);
		return self;
	}

	@Selector("valueWithSAXAdapterWithStringWithIntWithStringWithStringWithIntWithTypePath:::::::")
	public SAXAnnotationAdapter valueWithSAXAdapterWithStringWithIntWithStringWithStringWithIntWithTypePath(org.objectweb.asm.xml.SAXAdapter arg0, String arg1, int arg2, String arg3, String arg4, int arg5, org.objectweb.asm.TypePath arg6) {
		SAXAnnotationAdapter self = (SAXAnnotationAdapter) SAXAnnotationAdapter.alloc().init();
		self.original = new org.objectweb.asm.xml.SAXAnnotationAdapter(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		return self;
	}

	@Selector("valueWithSAXAdapterWithStringWithIntWithStringWithStringWithIntWithTypePathWithStringWithStringWithInt::::::::::")
	public SAXAnnotationAdapter valueWithSAXAdapterWithStringWithIntWithStringWithStringWithIntWithTypePathWithStringWithStringWithInt(org.objectweb.asm.xml.SAXAdapter arg0, String arg1, int arg2, String arg3, String arg4, int arg5, org.objectweb.asm.TypePath arg6, String[] arg7, String[] arg8, int[] arg9) {
		SAXAnnotationAdapter self = (SAXAnnotationAdapter) SAXAnnotationAdapter.alloc().init();
		self.original = new org.objectweb.asm.xml.SAXAnnotationAdapter(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
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
