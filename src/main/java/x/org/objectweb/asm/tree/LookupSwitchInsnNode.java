package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_LookupSwitchInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class LookupSwitchInsnNode extends NSObject {	
	
	public org.objectweb.asm.tree.LookupSwitchInsnNode original;	
	
	protected LookupSwitchInsnNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithLabelNode:withInt:withLabelNode:")	
	public LookupSwitchInsnNode value(org.objectweb.asm.tree.LabelNode arg0, int[] arg1, org.objectweb.asm.tree.LabelNode[] arg2) {		
		LookupSwitchInsnNode self = (LookupSwitchInsnNode) LookupSwitchInsnNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.LookupSwitchInsnNode(arg0, arg1, arg2);		
		return self;		
	}	
	
	@Selector("getType")	
	public int getType() {		
		return original.getType();		
	}	
}
