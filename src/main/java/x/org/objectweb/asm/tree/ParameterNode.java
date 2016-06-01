package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBParameterNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ParameterNode extends NSObject {	
	
	public org.objectweb.asm.tree.ParameterNode original;	
	
	protected ParameterNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native ParameterNode alloc();	
	
	@Selector("valueWithString:withInt:")	
	public ParameterNode valueWithStringwithInt(String arg0, int arg1) {
		ParameterNode self = (ParameterNode) ParameterNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.ParameterNode(arg0, arg1);		
		return self;		
	}	
	
	@Selector("acceptWithMethodVisitor:")	
	public void acceptWithMethodVisitor(Object arg0) {
		original.accept((org.objectweb.asm.MethodVisitor) arg0);		
	}	
}
