package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_LocalVariableNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class LocalVariableNode extends NSObject {	
	
	public org.objectweb.asm.tree.LocalVariableNode original;	
	
	protected LocalVariableNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithString:withString:withString:withLabelNode:withLabelNode:withInt:")	
	public LocalVariableNode value(String arg0, String arg1, String arg2, org.objectweb.asm.tree.LabelNode arg3, org.objectweb.asm.tree.LabelNode arg4, int arg5) {
		LocalVariableNode self = (LocalVariableNode) LocalVariableNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.LocalVariableNode(arg0, arg1, arg2, arg3, arg4, arg5);		
		return self;		
	}	
}
