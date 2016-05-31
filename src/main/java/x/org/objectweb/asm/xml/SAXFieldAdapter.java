package x.org.objectweb.asm.xml;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_xml_SAXFieldAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SAXFieldAdapter extends NSObject {	
	
	public org.objectweb.asm.xml.SAXFieldAdapter original;	
	
	protected SAXFieldAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithSAXAdapter:withAttributes:")	
	public SAXFieldAdapter value(org.objectweb.asm.xml.SAXAdapter arg0, org.xml.sax.Attributes arg1) {		
		SAXFieldAdapter self = (SAXFieldAdapter) SAXFieldAdapter.alloc().init();		
		self.original = new org.objectweb.asm.xml.SAXFieldAdapter(arg0, arg1);		
		return self;		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
}
