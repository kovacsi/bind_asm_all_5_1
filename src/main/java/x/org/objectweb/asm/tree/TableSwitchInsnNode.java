package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("TableSwitchInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TableSwitchInsnNode extends NSObject {	
	
	public org.objectweb.asm.tree.TableSwitchInsnNode original;	
	
	protected TableSwitchInsnNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withInt:withLabelNode:withLabelNode:")	
	public TableSwitchInsnNode valueWithIntwithIntwithLabelNodewithLabelNode(int arg0, int arg1, LabelNode arg2, org.objectweb.asm.tree.LabelNode[] arg3) {
		TableSwitchInsnNode self = (TableSwitchInsnNode) TableSwitchInsnNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.TableSwitchInsnNode(arg0, arg1, arg2.original, arg3);		
		return self;		
	}	
	
	@Selector("getType")	
	public int getType() {		
		return original.getType();		
	}	
	
	@Selector("acceptWithMethodVisitor:")	
	public void acceptWithMethodVisitor(Object arg0) {
		original.accept((org.objectweb.asm.MethodVisitor) arg0);		
	}	
	
	@Selector("cloneWithMap:")	
	public Object cloneWithMap(java.util.Map arg0) {
		return original.clone(arg0);		
	}	
}
