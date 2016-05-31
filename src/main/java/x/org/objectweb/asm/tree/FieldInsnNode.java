package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_FieldInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class FieldInsnNode extends NSObject {	
	
	public org.objectweb.asm.tree.FieldInsnNode original;	
	
	protected FieldInsnNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withString:withString:withString:")	
	public FieldInsnNode value(int arg0, String arg1, String arg2, String arg3) {
		FieldInsnNode self = (FieldInsnNode) FieldInsnNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.FieldInsnNode(arg0, arg1, arg2, arg3);		
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
