package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBStaticInitMerger")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class StaticInitMerger extends NSObject {	
	
	public org.objectweb.asm.commons.StaticInitMerger original;	
	
	protected StaticInitMerger(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native StaticInitMerger alloc();	
	
	@Selector("valueWithString:withClassVisitor:")	
	public StaticInitMerger valueWithStringwithClassVisitor(String arg0, Object arg1) {
		StaticInitMerger self = (StaticInitMerger) StaticInitMerger.alloc().init();		
		self.original = new org.objectweb.asm.commons.StaticInitMerger(arg0, (org.objectweb.asm.ClassVisitor) arg1);		
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
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
}
