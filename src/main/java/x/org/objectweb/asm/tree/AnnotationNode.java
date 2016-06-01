package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("AnnotationNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class AnnotationNode extends NSObject {	
	
	public org.objectweb.asm.tree.AnnotationNode original;	
	
	protected AnnotationNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithString:")	
	public AnnotationNode valueWithString(String arg0) {
		AnnotationNode self = (AnnotationNode) AnnotationNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.AnnotationNode(arg0);		
		return self;		
	}	
	
	@Selector("valueWithInt:withString:")	
	public AnnotationNode valueWithIntwithString(int arg0, String arg1) {
		AnnotationNode self = (AnnotationNode) AnnotationNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.AnnotationNode(arg0, arg1);		
		return self;		
	}	
	
	@Selector("visitWithString:withObject:")	
	public void visitWithStringwithObject(String arg0, Object arg1) {
		original.visit(arg0, arg1);		
	}	
	
	@Selector("visitEnumWithString:withString:withString:")	
	public void visitEnumWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.visitEnum(arg0, arg1, arg2);		
	}	
	
	@Selector("visitAnnotationWithString:withString:")	
	public Object visitAnnotationWithStringwithString(String arg0, String arg1) {
		return original.visitAnnotation(arg0, arg1);		
	}	
	
	@Selector("visitArrayWithString:")	
	public Object visitArrayWithString(String arg0) {
		return original.visitArray(arg0);		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
	
	@Selector("checkWithInt:")	
	public void checkWithInt(int arg0) {		
		original.check(arg0);		
	}	
	
	@Selector("acceptWithAnnotationVisitor:")	
	public void acceptWithAnnotationVisitor(Object arg0) {
		original.accept((org.objectweb.asm.AnnotationVisitor) arg0);		
	}	
}
