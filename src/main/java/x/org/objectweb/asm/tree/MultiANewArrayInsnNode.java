package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_MultiANewArrayInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class MultiANewArrayInsnNode extends NSObject {	
	
	public org.objectweb.asm.tree.MultiANewArrayInsnNode original;	
	
	protected MultiANewArrayInsnNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithString:withInt:")	
	public MultiANewArrayInsnNode value(String arg0, int arg1) {
		MultiANewArrayInsnNode self = (MultiANewArrayInsnNode) MultiANewArrayInsnNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.MultiANewArrayInsnNode(arg0, arg1);		
		return self;		
	}	
	
	@Selector("getType")	
	public int getType() {		
		return original.getType();		
	}	
}
