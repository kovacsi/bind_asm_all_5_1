package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_AnnotationNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class AnnotationNode extends NSObject {	
	
	public org.objectweb.asm.tree.AnnotationNode original;	
	
	protected AnnotationNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithString:")	
	public AnnotationNode value(String arg0) {
		AnnotationNode self = (AnnotationNode) AnnotationNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.AnnotationNode(arg0);		
		return self;		
	}	
	
	@Selector("valueWithInt:withString:")	
	public AnnotationNode value(int arg0, String arg1) {
		AnnotationNode self = (AnnotationNode) AnnotationNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.AnnotationNode(arg0, arg1);		
		return self;		
	}	
	
	@Selector("visitWithString:withObject:")	
	public void visit(String arg0, Object arg1) {
		original.visit(arg0, arg1);		
	}	
	
	@Selector("visitEnumWithString:withString:withString:")	
	public void visitEnum(String arg0, String arg1, String arg2) {
		original.visitEnum(arg0, arg1, arg2);		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
	
	@Selector("checkWithInt:")	
	public void check(int arg0) {		
		original.check(arg0);		
	}	
}
