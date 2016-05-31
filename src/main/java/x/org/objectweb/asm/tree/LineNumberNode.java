package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_LineNumberNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class LineNumberNode extends NSObject {	
	
	public org.objectweb.asm.tree.LineNumberNode original;	
	
	protected LineNumberNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withLabelNode:")	
	public LineNumberNode value(int arg0, org.objectweb.asm.tree.LabelNode arg1) {		
		LineNumberNode self = (LineNumberNode) LineNumberNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.LineNumberNode(arg0, arg1);		
		return self;		
	}	
	
	@Selector("getType")	
	public int getType() {		
		return original.getType();		
	}	
}
