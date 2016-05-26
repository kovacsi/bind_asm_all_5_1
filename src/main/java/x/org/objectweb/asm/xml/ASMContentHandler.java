package x.org.objectweb.asm.xml;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_xml_ASMContentHandler")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ASMContentHandler extends NSObject {

	private org.objectweb.asm.xml.ASMContentHandler original;

	protected ASMContentHandler(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithClassVisitor:")
	public ASMContentHandler valueWithClassVisitor(org.objectweb.asm.ClassVisitor arg0) {
		ASMContentHandler self = (ASMContentHandler) ASMContentHandler.alloc().init();
		self.original = new org.objectweb.asm.xml.ASMContentHandler(arg0);
		return self;
	}

	@Selector("startElementWithStringWithStringWithStringWithAttributes::::")
	public void startElementWithStringWithStringWithStringWithAttributes(String arg0, String arg1, String arg2, org.xml.sax.Attributes arg3) throws org.xml.sax.SAXException {
		original.startElement(arg0, arg1, arg2, arg3);
	}

	@Selector("endElementWithStringWithStringWithString:::")
	public void endElementWithStringWithStringWithString(String arg0, String arg1, String arg2) throws org.xml.sax.SAXException {
		original.endElement(arg0, arg1, arg2);
	}

}
