package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_util_TraceAnnotationVisitor")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TraceAnnotationVisitor extends NSObject {	
	
	public org.objectweb.asm.util.TraceAnnotationVisitor original;	
	
	protected TraceAnnotationVisitor(Pointer peer) {		
		super(peer);		
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
}
