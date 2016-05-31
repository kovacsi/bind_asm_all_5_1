package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_JumpInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class JumpInsnNode extends NSObject {	
	
	public org.objectweb.asm.tree.JumpInsnNode original;	
	
	protected JumpInsnNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withLabelNode:")	
	public JumpInsnNode value(int arg0, org.objectweb.asm.tree.LabelNode arg1) {		
		JumpInsnNode self = (JumpInsnNode) JumpInsnNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.JumpInsnNode(arg0, arg1);		
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
