package x.org.objectweb.asm.xml;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBASMContentHandler")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ASMContentHandler extends NSObject {	
	
	public org.objectweb.asm.xml.ASMContentHandler original;	
	
	protected ASMContentHandler(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native ASMContentHandler alloc();	
	
	@Selector("valueWithClassVisitor:")	
	public ASMContentHandler valueWithClassVisitor(Object arg0) {
		ASMContentHandler self = (ASMContentHandler) ASMContentHandler.alloc().init();		
		self.original = new org.objectweb.asm.xml.ASMContentHandler((org.objectweb.asm.ClassVisitor) arg0);		
		return self;		
	}	
	
	@Selector("startElementWithString:withString:withString:withAttributes:")	
	public void startElementWithStringwithStringwithStringwithAttributes(String arg0, String arg1, String arg2, org.xml.sax.Attributes arg3) throws org.xml.sax.SAXException {
		original.startElement(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("endElementWithString:withString:withString:")	
	public void endElementWithStringwithStringwithString(String arg0, String arg1, String arg2) throws org.xml.sax.SAXException {
		original.endElement(arg0, arg1, arg2);		
	}	
}
