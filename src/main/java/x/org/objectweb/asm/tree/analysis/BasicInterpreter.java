package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBBasicInterpreter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class BasicInterpreter extends NSObject {	
	
	public org.objectweb.asm.tree.analysis.BasicInterpreter original;	
	
	protected BasicInterpreter(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native BasicInterpreter alloc();	
	
	@Selector("value")	
	public BasicInterpreter value() {		
		BasicInterpreter self = (BasicInterpreter) BasicInterpreter.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.BasicInterpreter();		
		return self;		
	}	
	
	@Selector("copyOperationWithAbstractInsnNode:withBasicValue:")	
	public BasicValue copyOperationWithAbstractInsnNodewithBasicValue(Object arg0, BasicValue arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		BasicValue ret = (BasicValue) BasicValue.alloc().init();
		ret.original = original.copyOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1.original);		
		return ret;		
	}	
	
	@Selector("unaryOperationWithAbstractInsnNode:withBasicValue:")	
	public BasicValue unaryOperationWithAbstractInsnNodewithBasicValue(Object arg0, BasicValue arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		BasicValue ret = (BasicValue) BasicValue.alloc().init();
		ret.original = original.unaryOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1.original);		
		return ret;		
	}	
	
	@Selector("binaryOperationWithAbstractInsnNode:withBasicValue:withBasicValue:")	
	public BasicValue binaryOperationWithAbstractInsnNodewithBasicValuewithBasicValue(Object arg0, BasicValue arg1, BasicValue arg2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		BasicValue ret = (BasicValue) BasicValue.alloc().init();
		ret.original = original.binaryOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1.original, arg2.original);		
		return ret;		
	}	
	
	@Selector("ternaryOperationWithAbstractInsnNode:withBasicValue:withBasicValue:withBasicValue:")	
	public BasicValue ternaryOperationWithAbstractInsnNodewithBasicValuewithBasicValuewithBasicValue(Object arg0, BasicValue arg1, BasicValue arg2, BasicValue arg3) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		BasicValue ret = (BasicValue) BasicValue.alloc().init();
		ret.original = original.ternaryOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1.original, arg2.original, arg3.original);		
		return ret;		
	}	
	
	@Selector("returnOperationWithAbstractInsnNode:withBasicValue:withBasicValue:")	
	public void returnOperationWithAbstractInsnNodewithBasicValuewithBasicValue(Object arg0, BasicValue arg1, BasicValue arg2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		original.returnOperation((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1.original, arg2.original);		
	}	
	
	@Selector("mergeWithBasicValue:withBasicValue:")	
	public BasicValue mergeWithBasicValuewithBasicValue(BasicValue arg0, BasicValue arg1) {
		BasicValue ret = (BasicValue) BasicValue.alloc().init();
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
