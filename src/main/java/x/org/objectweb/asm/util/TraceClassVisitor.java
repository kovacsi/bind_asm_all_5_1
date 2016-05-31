package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_util_TraceClassVisitor")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TraceClassVisitor extends NSObject {	
	
	public org.objectweb.asm.util.TraceClassVisitor original;	
	
	protected TraceClassVisitor(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithPrintWriter:")	
	public TraceClassVisitor value(java.io.PrintWriter arg0) {		
		TraceClassVisitor self = (TraceClassVisitor) TraceClassVisitor.alloc().init();		
		self.original = new org.objectweb.asm.util.TraceClassVisitor(arg0);		
		return self;		
	}	
	
	@Selector("visitWithInt:withInt:withString:withString:withString:withString:")	
	public void visit(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		original.visit(arg0, arg1, arg2, arg3, arg4, arg5);		
	}	
	
	@Selector("visitSourceWithString:withString:")	
	public void visitSource(String arg0, String arg1) {
		original.visitSource(arg0, arg1);		
	}	
	
	@Selector("visitOuterClassWithString:withString:withString:")	
	public void visitOuterClass(String arg0, String arg1, String arg2) {
		original.visitOuterClass(arg0, arg1, arg2);		
	}	
	
	@Selector("visitAttributeWithAttribute:")	
	public void visitAttribute(org.objectweb.asm.Attribute arg0) {		
		original.visitAttribute(arg0);		
	}	
	
	@Selector("visitInnerClassWithString:withString:withString:withInt:")	
	public void visitInnerClass(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
}
