package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBSourceInterpreter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SourceInterpreter extends NSObject {	
	
	public org.objectweb.asm.tree.analysis.SourceInterpreter original;	
	
	protected SourceInterpreter(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native SourceInterpreter alloc();	
	
	@Selector("value")	
	public SourceInterpreter value() {		
		SourceInterpreter self = (SourceInterpreter) SourceInterpreter.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.SourceInterpreter();		
		return self;		
	}	
	
	@Selector("copyOperationWithAbstractInsnNode:withSourceValue:")	
	public SourceValue copyOperationWithAbstractInsnNodewithSourceValue(Object arg0, SourceValue arg1) {
		SourceValue ret = (SourceValue) SourceValue.alloc().init();
		ret.original = original.copyOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1.original);		
		return ret;		
	}	
	
	@Selector("unaryOperationWithAbstractInsnNode:withSourceValue:")	
	public SourceValue unaryOperationWithAbstractInsnNodewithSourceValue(Object arg0, SourceValue arg1) {
		SourceValue ret = (SourceValue) SourceValue.alloc().init();
		ret.original = original.unaryOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1.original);		
		return ret;		
	}	
	
	@Selector("binaryOperationWithAbstractInsnNode:withSourceValue:withSourceValue:")	
	public SourceValue binaryOperationWithAbstractInsnNodewithSourceValuewithSourceValue(Object arg0, SourceValue arg1, SourceValue arg2) {
		SourceValue ret = (SourceValue) SourceValue.alloc().init();
		ret.original = original.binaryOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1.original, arg2.original);		
		return ret;		
	}	
	
	@Selector("ternaryOperationWithAbstractInsnNode:withSourceValue:withSourceValue:withSourceValue:")	
	public SourceValue ternaryOperationWithAbstractInsnNodewithSourceValuewithSourceValuewithSourceValue(Object arg0, SourceValue arg1, SourceValue arg2, SourceValue arg3) {
		SourceValue ret = (SourceValue) SourceValue.alloc().init();
		ret.original = original.ternaryOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1.original, arg2.original, arg3.original);		
		return ret;		
	}	
	
	@Selector("returnOperationWithAbstractInsnNode:withSourceValue:withSourceValue:")	
	public void returnOperationWithAbstractInsnNodewithSourceValuewithSourceValue(Object arg0, SourceValue arg1, SourceValue arg2) {
		original.returnOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1.original, arg2.original);		
	}	
	
	@Selector("mergeWithSourceValue:withSourceValue:")	
	public SourceValue mergeWithSourceValuewithSourceValue(SourceValue arg0, SourceValue arg1) {
		SourceValue ret = (SourceValue) SourceValue.alloc().init();
		ret.original = original.merge(arg0.original, arg1.original);		
		return ret;		
	}	
	
	@Selector("mergeWithValue:withValue:")	
	public Object mergeWithValuewithValue(Object arg0, Object arg1) {
		return original.merge((org.objectweb.asm.tree.analysis.Value) arg0, (org.objectweb.asm.tree.analysis.Value) arg1);		
	}	
	
	@Selector("returnOperationWithAbstractInsnNode:withValue:withValue:")	
	public void returnOperationWithAbstractInsnNodewithValuewithValue(Object arg0, Object arg1, Object arg2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		original.returnOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, (org.objectweb.asm.tree.analysis.Value) arg1, (org.objectweb.asm.tree.analysis.Value) arg2);		
	}	
	
	@Selector("naryOperationWithAbstractInsnNode:withList:")	
	public Object naryOperationWithAbstractInsnNodewithList(Object arg0, java.util.List arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.naryOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1);		
	}	
	
	@Selector("ternaryOperationWithAbstractInsnNode:withValue:withValue:withValue:")	
	public Object ternaryOperationWithAbstractInsnNodewithValuewithValuewithValue(Object arg0, Object arg1, Object arg2, Object arg3) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.ternaryOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, (org.objectweb.asm.tree.analysis.Value) arg1, (org.objectweb.asm.tree.analysis.Value) arg2, (org.objectweb.asm.tree.analysis.Value) arg3);		
	}	
	
	@Selector("binaryOperationWithAbstractInsnNode:withValue:withValue:")	
	public Object binaryOperationWithAbstractInsnNodewithValuewithValue(Object arg0, Object arg1, Object arg2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.binaryOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, (org.objectweb.asm.tree.analysis.Value) arg1, (org.objectweb.asm.tree.analysis.Value) arg2);		
	}	
	
	@Selector("unaryOperationWithAbstractInsnNode:withValue:")	
	public Object unaryOperationWithAbstractInsnNodewithValue(Object arg0, Object arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.unaryOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, (org.objectweb.asm.tree.analysis.Value) arg1);		
	}	
	
	@Selector("copyOperationWithAbstractInsnNode:withValue:")	
	public Object copyOperationWithAbstractInsnNodewithValue(Object arg0, Object arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.copyOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, (org.objectweb.asm.tree.analysis.Value) arg1);		
	}	
	
	@Selector("newOperationWithAbstractInsnNode:")	
	public Object newOperationWithAbstractInsnNode(Object arg0) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.newOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0);		
	}	
	
	@Selector("newValueWithType:")	
	public Object newValueWithType(x.org.objectweb.asm.Type arg0) {
		return original.newValue(arg0.original);		
	}	
}
