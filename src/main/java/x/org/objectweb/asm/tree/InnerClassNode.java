package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBInnerClassNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class InnerClassNode extends NSObject {	
	
	public org.objectweb.asm.tree.InnerClassNode original;	
	
	protected InnerClassNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native InnerClassNode alloc();	
	
	@Selector("valueWithString:withString:withString:withInt:")	
	public InnerClassNode valueWithStringwithStringwithStringwithInt(String arg0, String arg1, String arg2, int arg3) {
		InnerClassNode self = (InnerClassNode) InnerClassNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.InnerClassNode(arg0, arg1, arg2, arg3);		
		return self;		
	}	
	
	@Selector("acceptWithClassVisitor:")	
	public void acceptWithClassVisitor(Object arg0) {
		original.accept((org.objectweb.asm.ClassVisitor) arg0);		
	}	
}
