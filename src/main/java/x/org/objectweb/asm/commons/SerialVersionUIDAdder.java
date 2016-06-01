package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBSerialVersionUIDAdder")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SerialVersionUIDAdder extends NSObject {	
	
	public org.objectweb.asm.commons.SerialVersionUIDAdder original;	
	
	protected SerialVersionUIDAdder(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native SerialVersionUIDAdder alloc();	
	
	@Selector("valueWithClassVisitor:")	
	public SerialVersionUIDAdder valueWithClassVisitor(Object arg0) {
		SerialVersionUIDAdder self = (SerialVersionUIDAdder) SerialVersionUIDAdder.alloc().init();		
		self.original = new org.objectweb.asm.commons.SerialVersionUIDAdder((org.objectweb.asm.ClassVisitor) arg0);		
		return self;		
	}	
	
	@Selector("visitWithInt:withInt:withString:withString:withString:withString:")	
	public void visitWithIntwithIntwithStringwithStringwithStringwithString(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		original.visit(arg0, arg1, arg2, arg3, arg4, arg5);		
	}	
	
	@Selector("visitMethodWithInt:withString:withString:withString:withString:")	
	public Object visitMethodWithIntwithStringwithStringwithStringwithString(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
		return original.visitMethod(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitFieldWithInt:withString:withString:withString:withObject:")	
	public Object visitFieldWithIntwithStringwithStringwithStringwithObject(int arg0, String arg1, String arg2, String arg3, Object arg4) {
		return original.visitField(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitInnerClassWithString:withString:withString:withInt:")	
	public void visitInnerClassWithStringwithStringwithStringwithInt(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
	
	@Selector("hasSVUID")	
	public boolean hasSVUID() {		
		return original.hasSVUID();		
	}	
}
