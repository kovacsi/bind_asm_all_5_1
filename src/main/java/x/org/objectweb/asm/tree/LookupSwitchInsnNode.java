package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBLookupSwitchInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class LookupSwitchInsnNode extends NSObject {	
	
	public org.objectweb.asm.tree.LookupSwitchInsnNode original;	
	
	protected LookupSwitchInsnNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native LookupSwitchInsnNode alloc();	
	
	@Selector("valueWithLabelNode:withInt:withLabelNode:")	
	public LookupSwitchInsnNode valueWithLabelNodewithIntwithLabelNode(LabelNode arg0, int[] arg1, org.objectweb.asm.tree.LabelNode[] arg2) {
		LookupSwitchInsnNode self = (LookupSwitchInsnNode) LookupSwitchInsnNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.LookupSwitchInsnNode(arg0.original, arg1, arg2);		
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
