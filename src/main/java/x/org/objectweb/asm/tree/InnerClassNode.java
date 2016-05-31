package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_InnerClassNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class InnerClassNode extends NSObject {	
	
	public org.objectweb.asm.tree.InnerClassNode original;	
	
	protected InnerClassNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithString:withString:withString:withInt:")	
	public InnerClassNode value(String arg0, String arg1, String arg2, int arg3) {
		InnerClassNode self = (InnerClassNode) InnerClassNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.InnerClassNode(arg0, arg1, arg2, arg3);		
		return self;		
	}	
}
