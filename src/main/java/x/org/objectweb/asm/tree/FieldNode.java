package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("FieldNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class FieldNode extends NSObject {	
	
	public org.objectweb.asm.tree.FieldNode original;	
	
	protected FieldNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withString:withString:withString:withObject:")	
	public FieldNode valueWithIntwithStringwithStringwithStringwithObject(int arg0, String arg1, String arg2, String arg3, Object arg4) {
		FieldNode self = (FieldNode) FieldNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.FieldNode(arg0, arg1, arg2, arg3, arg4);		
		return self;		
	}	
	
	@Selector("valueWithInt:withInt:withString:withString:withString:withObject:")	
	public FieldNode valueWithIntwithIntwithStringwithStringwithStringwithObject(int arg0, int arg1, String arg2, String arg3, String arg4, Object arg5) {
		FieldNode self = (FieldNode) FieldNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.FieldNode(arg0, arg1, arg2, arg3, arg4, arg5);		
		return self;		
	}	
	
	@Selector("visitAnnotationWithString:withBoolean:")	
	public Object visitAnnotationWithStringwithBoolean(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);		
	}	
	
	@Selector("visitTypeAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Object visitTypeAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1.original, arg2, arg3);		
	}	
	
	@Selector("visitAttributeWithAttribute:")	
	public void visitAttributeWithAttribute(x.org.objectweb.asm.Attribute arg0) {		
		original.visitAttribute(arg0.original);		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
	
	@Selector("checkWithInt:")	
	public void checkWithInt(int arg0) {		
		original.check(arg0);		
	}	
	
	@Selector("acceptWithClassVisitor:")	
	public void acceptWithClassVisitor(Object arg0) {
		original.accept((org.objectweb.asm.ClassVisitor) arg0);		
	}	
}
