package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_util_CheckFieldAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class CheckFieldAdapter extends NSObject {	
	
	public org.objectweb.asm.util.CheckFieldAdapter original;	
	
	protected CheckFieldAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("visitAttributeWithAttribute:")	
	public void visitAttribute(org.objectweb.asm.Attribute arg0) {		
		original.visitAttribute(arg0);		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
}
