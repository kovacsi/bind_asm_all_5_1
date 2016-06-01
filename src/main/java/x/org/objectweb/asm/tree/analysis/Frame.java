package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("Frame")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Frame extends NSObject {	
	
	public org.objectweb.asm.tree.analysis.Frame original;	
	
	protected Frame(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withInt:")	
	public Frame valueWithIntwithInt(int arg0, int arg1) {		
		Frame self = (Frame) Frame.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.Frame(arg0, arg1);		
		return self;		
	}	
	
	@Selector("valueWithFrame:")	
	public Frame valueWithFrame(Frame arg0) {
		Frame self = (Frame) Frame.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.Frame(arg0.original);		
		return self;		
	}	
	
	@Selector("initWithFrame:")	
	public Frame initWithFrame(Frame arg0) {
		Frame ret = (Frame) Frame.alloc().init();
		ret.original = original.init(arg0.original);		
		return ret;		
	}	
	
	@Selector("setReturnWithValue:")	
	public void setReturnWithValue(Object arg0) {
		original.setReturn((org.objectweb.asm.tree.analysis.Value) arg0);		
	}	
	
	@Selector("getLocals")	
	public int getLocals() {		
		return original.getLocals();		
	}	
	
	@Selector("getMaxStackSize")	
	public int getMaxStackSize() {		
		return original.getMaxStackSize();		
	}	
	
	@Selector("getLocalWithInt:")	
	public Object getLocalWithInt(int arg0) throws IndexOutOfBoundsException {
		return original.getLocal(arg0);		
	}	
	
	@Selector("setLocalWithInt:withValue:")	
	public void setLocalWithIntwithValue(int arg0, Object arg1) throws IndexOutOfBoundsException {
		original.setLocal(arg0, (org.objectweb.asm.tree.analysis.Value) arg1);		
	}	
	
	@Selector("getStackSize")	
	public int getStackSize() {		
		return original.getStackSize();		
	}	
	
	@Selector("getStackWithInt:")	
	public Object getStackWithInt(int arg0) throws IndexOutOfBoundsException {
		return original.getStack(arg0);		
	}	
	
	@Selector("clearStack")	
	public void clearStack() {		
		original.clearStack();		
	}	
	
	@Selector("pop")	
	public Object pop() throws IndexOutOfBoundsException {
		return original.pop();		
	}	
	
	@Selector("pushWithValue:")	
	public void pushWithValue(Object arg0) throws IndexOutOfBoundsException {
		original.push((org.objectweb.asm.tree.analysis.Value) arg0);		
	}	
	
	@Selector("executeWithAbstractInsnNode:withInterpreter:")	
	public void executeWithAbstractInsnNodewithInterpreter(Object arg0, Object arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		original.execute((org.objectweb.asm.tree.AbstractInsnNode) arg0, (org.objectweb.asm.tree.analysis.Interpreter) arg1);		
	}	
	
	@Selector("mergeWithFrame:withInterpreter:")	
	public boolean mergeWithFramewithInterpreter(Frame arg0, Object arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.merge(arg0.original, (org.objectweb.asm.tree.analysis.Interpreter) arg1);		
	}	
	
	@Selector("mergeWithFrame:withBoolean:")	
	public boolean mergeWithFramewithBoolean(Frame arg0, boolean[] arg1) {
		return original.merge(arg0.original, arg1);		
	}	
	
	@Selector("toString")	
	public String toString() {
		return original.toString();		
	}	
}
