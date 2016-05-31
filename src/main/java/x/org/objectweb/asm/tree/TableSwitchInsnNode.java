package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_TableSwitchInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TableSwitchInsnNode extends NSObject {	
	
	public org.objectweb.asm.tree.TableSwitchInsnNode original;	
	
	protected TableSwitchInsnNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withInt:withLabelNode:withLabelNode:")	
	public TableSwitchInsnNode value(int arg0, int arg1, org.objectweb.asm.tree.LabelNode arg2, org.objectweb.asm.tree.LabelNode[] arg3) {		
		TableSwitchInsnNode self = (TableSwitchInsnNode) TableSwitchInsnNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.TableSwitchInsnNode(arg0, arg1, arg2, arg3);		
		return self;		
	}	
	
	@Selector("getType")	
	public int getType() {		
		return original.getType();		
	}	
}
