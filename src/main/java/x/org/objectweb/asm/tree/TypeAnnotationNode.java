package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_TypeAnnotationNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TypeAnnotationNode extends NSObject {	
	
	public org.objectweb.asm.tree.TypeAnnotationNode original;	
	
	protected TypeAnnotationNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withTypePath:withString:")	
	public TypeAnnotationNode value(int arg0, org.objectweb.asm.TypePath arg1, String arg2) {
		TypeAnnotationNode self = (TypeAnnotationNode) TypeAnnotationNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.TypeAnnotationNode(arg0, arg1, arg2);		
		return self;		
	}	
	
	@Selector("valueWithInt:withInt:withTypePath:withString:")	
	public TypeAnnotationNode value(int arg0, int arg1, org.objectweb.asm.TypePath arg2, String arg3) {
		TypeAnnotationNode self = (TypeAnnotationNode) TypeAnnotationNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.TypeAnnotationNode(arg0, arg1, arg2, arg3);		
		return self;		
	}	
}
