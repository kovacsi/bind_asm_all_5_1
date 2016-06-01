package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("TryCatchBlockSorter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TryCatchBlockSorter extends NSObject {	
	
	public org.objectweb.asm.commons.TryCatchBlockSorter original;	
	
	protected TryCatchBlockSorter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithMethodVisitor:withInt:withString:withString:withString:withString:")	
	public TryCatchBlockSorter valueWithMethodVisitorwithIntwithStringwithStringwithStringwithString(Object arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		TryCatchBlockSorter self = (TryCatchBlockSorter) TryCatchBlockSorter.alloc().init();		
		self.original = new org.objectweb.asm.commons.TryCatchBlockSorter((org.objectweb.asm.MethodVisitor) arg0, arg1, arg2, arg3, arg4, arg5);		
		return self;		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
}
