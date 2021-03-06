package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class InsnNode extends NSObject {	
	
	public org.objectweb.asm.tree.InsnNode original;	
	
	protected InsnNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native InsnNode alloc();	
	
	@Selector("valueWithInt:")	
	public InsnNode valueWithInt(int arg0) {		
		InsnNode self = (InsnNode) InsnNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.InsnNode(arg0);		
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
