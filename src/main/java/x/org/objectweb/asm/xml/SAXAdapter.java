package x.org.objectweb.asm.xml;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBSAXAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SAXAdapter extends NSObject {	
	
	public org.objectweb.asm.xml.SAXAdapter original;	
	
	protected SAXAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native SAXAdapter alloc();	
}
