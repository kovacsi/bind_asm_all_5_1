package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("TraceFieldVisitor")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TraceFieldVisitor extends NSObject {	
	
	public org.objectweb.asm.util.TraceFieldVisitor original;	
	
	protected TraceFieldVisitor(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithPrinter:")	
	public TraceFieldVisitor valueWithPrinter(Object arg0) {
		TraceFieldVisitor self = (TraceFieldVisitor) TraceFieldVisitor.alloc().init();		
		self.original = new org.objectweb.asm.util.TraceFieldVisitor((org.objectweb.asm.util.Printer) arg0);		
		return self;		
	}	
	
	@Selector("valueWithFieldVisitor:withPrinter:")	
	public TraceFieldVisitor valueWithFieldVisitorwithPrinter(Object arg0, Object arg1) {
		TraceFieldVisitor self = (TraceFieldVisitor) TraceFieldVisitor.alloc().init();		
		self.original = new org.objectweb.asm.util.TraceFieldVisitor((org.objectweb.asm.FieldVisitor) arg0, (org.objectweb.asm.util.Printer) arg1);		
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
}
