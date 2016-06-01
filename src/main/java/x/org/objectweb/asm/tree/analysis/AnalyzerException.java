package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBAnalyzerException")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class AnalyzerException extends NSObject {	
	
	public org.objectweb.asm.tree.analysis.AnalyzerException original;	
	
	protected AnalyzerException(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native AnalyzerException alloc();	
	
	@Selector("valueWithAbstractInsnNode:withString:")	
	public AnalyzerException valueWithAbstractInsnNodewithString(Object arg0, String arg1) {
		AnalyzerException self = (AnalyzerException) AnalyzerException.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.AnalyzerException((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1);		
		return self;		
	}	
	
	@Selector("valueWithAbstractInsnNode:withString:withThrowable:")	
	public AnalyzerException valueWithAbstractInsnNodewithStringwithThrowable(Object arg0, String arg1, Throwable arg2) {
		AnalyzerException self = (AnalyzerException) AnalyzerException.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.AnalyzerException((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1, arg2);		
		return self;		
	}	
	
	@Selector("valueWithAbstractInsnNode:withString:withObject:withValue:")	
	public AnalyzerException valueWithAbstractInsnNodewithStringwithObjectwithValue(Object arg0, String arg1, Object arg2, Object arg3) {
		AnalyzerException self = (AnalyzerException) AnalyzerException.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.AnalyzerException((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1, arg2, (org.objectweb.asm.tree.analysis.Value) arg3);		
		return self;		
	}	
}
