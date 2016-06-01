package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBTypeAnnotationNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TypeAnnotationNode extends NSObject {	
	
	public org.objectweb.asm.tree.TypeAnnotationNode original;	
	
	protected TypeAnnotationNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native TypeAnnotationNode alloc();	
	
	@Selector("valueWithInt:withTypePath:withString:")	
	public TypeAnnotationNode valueWithIntwithTypePathwithString(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2) {
		TypeAnnotationNode self = (TypeAnnotationNode) TypeAnnotationNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.TypeAnnotationNode(arg0, arg1.original, arg2);		
		return self;		
	}	
	
	@Selector("valueWithInt:withInt:withTypePath:withString:")	
	public TypeAnnotationNode valueWithIntwithIntwithTypePathwithString(int arg0, int arg1, x.org.objectweb.asm.TypePath arg2, String arg3) {
		TypeAnnotationNode self = (TypeAnnotationNode) TypeAnnotationNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.TypeAnnotationNode(arg0, arg1, arg2.original, arg3);		
		return self;		
	}	
}
