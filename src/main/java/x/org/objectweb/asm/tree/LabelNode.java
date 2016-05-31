package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_LabelNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class LabelNode extends NSObject {	
	
	public org.objectweb.asm.tree.LabelNode original;	
	
	protected LabelNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("value")	
	public LabelNode value() {		
		LabelNode self = (LabelNode) LabelNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.LabelNode();		
		return self;		
	}	
	
	@Selector("valueWithLabel:")	
	public LabelNode value(org.objectweb.asm.Label arg0) {		
		LabelNode self = (LabelNode) LabelNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.LabelNode(arg0);		
		return self;		
	}	
	
	@Selector("getType")	
	public int getType() {		
		return original.getType();		
	}	
	
	@Selector("getLabel")	
	public x.org.objectweb.asm.Label getLabel() {		
		x.org.objectweb.asm.Label ret = (x.org.objectweb.asm.Label) x.org.objectweb.asm.Label.alloc().init();		
		ret.original = original.getLabel();		
		return ret;		
	}	
	
	@Selector("resetLabel")	
	public void resetLabel() {		
		original.resetLabel();		
	}	
}
