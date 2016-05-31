package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_Label")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Label extends NSObject {	
	
	public org.objectweb.asm.Label original;	
	
	protected Label(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("value")	
	public Label value() {		
		Label self = (Label) Label.alloc().init();		
		self.original = new org.objectweb.asm.Label();		
		return self;		
	}	
	
	@Selector("getOffset")	
	public int getOffset() {		
		return original.getOffset();		
	}	
	
	@Selector("toString")	
	public String toString() {
		return original.toString();		
	}	
}
