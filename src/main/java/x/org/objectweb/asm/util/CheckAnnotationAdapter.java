package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBCheckAnnotationAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class CheckAnnotationAdapter extends NSObject {	
	
	public org.objectweb.asm.util.CheckAnnotationAdapter original;	
	
	protected CheckAnnotationAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native CheckAnnotationAdapter alloc();	
	
	@Selector("valueWithAnnotationVisitor:")	
	public CheckAnnotationAdapter valueWithAnnotationVisitor(Object arg0) {
		CheckAnnotationAdapter self = (CheckAnnotationAdapter) CheckAnnotationAdapter.alloc().init();		
		self.original = new org.objectweb.asm.util.CheckAnnotationAdapter((org.objectweb.asm.AnnotationVisitor) arg0);		
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
}
