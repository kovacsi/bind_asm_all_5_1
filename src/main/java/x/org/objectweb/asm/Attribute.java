package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBAttribute")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Attribute extends NSObject {	
	
	public org.objectweb.asm.Attribute original;	
	
	protected Attribute(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native Attribute alloc();	
	
	@Selector("isUnknown")	
	public boolean isUnknown() {		
		return original.isUnknown();		
	}	
	
	@Selector("isCodeAttribute")	
	public boolean isCodeAttribute() {		
		return original.isCodeAttribute();		
	}	
}
