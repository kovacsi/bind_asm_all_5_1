package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBAnnotationRemapper")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class AnnotationRemapper extends NSObject {	
	
	public org.objectweb.asm.commons.AnnotationRemapper original;	
	
	protected AnnotationRemapper(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native AnnotationRemapper alloc();	
	
	@Selector("valueWithAnnotationVisitor:withRemapper:")	
	public AnnotationRemapper valueWithAnnotationVisitorwithRemapper(Object arg0, Object arg1) {
		AnnotationRemapper self = (AnnotationRemapper) AnnotationRemapper.alloc().init();		
		self.original = new org.objectweb.asm.commons.AnnotationRemapper((org.objectweb.asm.AnnotationVisitor) arg0, (org.objectweb.asm.commons.Remapper) arg1);		
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
}
