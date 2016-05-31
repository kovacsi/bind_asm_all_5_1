package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_analysis_BasicVerifier")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class BasicVerifier extends NSObject {	
	
	public org.objectweb.asm.tree.analysis.BasicVerifier original;	
	
	protected BasicVerifier(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("value")	
	public BasicVerifier value() {		
		BasicVerifier self = (BasicVerifier) BasicVerifier.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.BasicVerifier();		
		return self;		
	}	
}
