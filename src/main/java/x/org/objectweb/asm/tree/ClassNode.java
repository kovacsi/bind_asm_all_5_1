package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("ClassNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ClassNode extends NSObject {	
	
	public org.objectweb.asm.tree.ClassNode original;	
	
	protected ClassNode(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("value")	
	public ClassNode value() {		
		ClassNode self = (ClassNode) ClassNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.ClassNode();		
		return self;		
	}	
	
	@Selector("valueWithInt:")	
	public ClassNode valueWithInt(int arg0) {		
		ClassNode self = (ClassNode) ClassNode.alloc().init();		
		self.original = new org.objectweb.asm.tree.ClassNode(arg0);		
		return self;		
	}	
	
	@Selector("visitWithInt:withInt:withString:withString:withString:withString:")	
	public void visitWithIntwithIntwithStringwithStringwithStringwithString(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		original.visit(arg0, arg1, arg2, arg3, arg4, arg5);		
	}	
	
	@Selector("visitSourceWithString:withString:")	
	public void visitSourceWithStringwithString(String arg0, String arg1) {
		original.visitSource(arg0, arg1);		
	}	
	
	@Selector("visitOuterClassWithString:withString:withString:")	
	public void visitOuterClassWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.visitOuterClass(arg0, arg1, arg2);		
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
	
	@Selector("visitInnerClassWithString:withString:withString:withInt:")	
	public void visitInnerClassWithStringwithStringwithStringwithInt(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitFieldWithInt:withString:withString:withString:withObject:")	
	public Object visitFieldWithIntwithStringwithStringwithStringwithObject(int arg0, String arg1, String arg2, String arg3, Object arg4) {
		return original.visitField(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitMethodWithInt:withString:withString:withString:withString:")	
	public Object visitMethodWithIntwithStringwithStringwithStringwithString(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
		return original.visitMethod(arg0, arg1, arg2, arg3, arg4);		
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
