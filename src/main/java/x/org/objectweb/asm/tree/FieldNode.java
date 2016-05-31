package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_FieldNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class FieldNode extends NSObject {	
	
	public org.objectweb.asm.tree.FieldNode original;	
	
	protected FieldNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withString:withString:withString:withObject:")	
	public FieldNode value(int arg0, String arg1, String arg2, String arg3, Object arg4) {
		FieldNode self = (FieldNode) FieldNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.FieldNode(arg0, arg1, arg2, arg3, arg4);		
		return self;		
	}	
	
	@Selector("valueWithInt:withInt:withString:withString:withString:withObject:")	
	public FieldNode value(int arg0, int arg1, String arg2, String arg3, String arg4, Object arg5) {
		FieldNode self = (FieldNode) FieldNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.FieldNode(arg0, arg1, arg2, arg3, arg4, arg5);		
		return self;		
	}	
	
	@Selector("visitAttributeWithAttribute:")	
	public void visitAttribute(org.objectweb.asm.Attribute arg0) {		
		original.visitAttribute(arg0);		
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
