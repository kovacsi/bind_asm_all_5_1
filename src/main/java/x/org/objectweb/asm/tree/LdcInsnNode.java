package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBLdcInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class LdcInsnNode extends NSObject {	
	
	public org.objectweb.asm.tree.LdcInsnNode original;	
	
	protected LdcInsnNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native LdcInsnNode alloc();	
	
	@Selector("valueWithObject:")	
	public LdcInsnNode valueWithObject(Object arg0) {
		LdcInsnNode self = (LdcInsnNode) LdcInsnNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.LdcInsnNode(arg0);		
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
