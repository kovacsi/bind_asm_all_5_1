package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_TypeInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TypeInsnNode extends NSObject {	
	
	public org.objectweb.asm.tree.TypeInsnNode original;	
	
	protected TypeInsnNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withString:")	
	public TypeInsnNode value(int arg0, String arg1) {
		TypeInsnNode self = (TypeInsnNode) TypeInsnNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.TypeInsnNode(arg0, arg1);		
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
