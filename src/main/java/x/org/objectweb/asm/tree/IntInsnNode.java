package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_IntInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class IntInsnNode extends NSObject {	
	
	public org.objectweb.asm.tree.IntInsnNode original;	
	
	protected IntInsnNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withInt:")	
	public IntInsnNode value(int arg0, int arg1) {		
		IntInsnNode self = (IntInsnNode) IntInsnNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.IntInsnNode(arg0, arg1);		
		return self;		
	}	
	
	@Selector("setOpcodeWithInt:")	
	public void setOpcode(int arg0) {		
		original.setOpcode(arg0);		
	}	
	
	@Selector("getType")	
	public int getType() {		
		return original.getType();		
	}	
}
