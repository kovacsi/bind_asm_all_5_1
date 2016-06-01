package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBTryCatchBlockNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TryCatchBlockNode extends NSObject {	
	
	public org.objectweb.asm.tree.TryCatchBlockNode original;	
	
	protected TryCatchBlockNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native TryCatchBlockNode alloc();	
	
	@Selector("valueWithLabelNode:withLabelNode:withLabelNode:withString:")	
	public TryCatchBlockNode valueWithLabelNodewithLabelNodewithLabelNodewithString(LabelNode arg0, LabelNode arg1, LabelNode arg2, String arg3) {
		TryCatchBlockNode self = (TryCatchBlockNode) TryCatchBlockNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.TryCatchBlockNode(arg0.original, arg1.original, arg2.original, arg3);		
		return self;		
	}	
	
	@Selector("updateIndexWithInt:")	
	public void updateIndexWithInt(int arg0) {		
		original.updateIndex(arg0);		
	}	
	
	@Selector("acceptWithMethodVisitor:")	
	public void acceptWithMethodVisitor(Object arg0) {
		original.accept((org.objectweb.asm.MethodVisitor) arg0);		
	}	
}
