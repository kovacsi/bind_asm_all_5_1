package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_analysis_Frame")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Frame extends NSObject {

	private org.objectweb.asm.tree.analysis.Frame original;

	protected Frame(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithIntWithInt::")
	public Frame valueWithIntWithInt(int arg0, int arg1) {
		Frame self = (Frame) Frame.alloc().init();
		self.original = new org.objectweb.asm.tree.analysis.Frame(arg0, arg1);
		return self;
	}

	@Selector("valueWithFrame:")
	public Frame valueWithFrame(org.objectweb.asm.tree.analysis.Frame arg0) {
		Frame self = (Frame) Frame.alloc().init();
		self.original = new org.objectweb.asm.tree.analysis.Frame(arg0);
		return self;
	}

	@Selector("initWithFrame:")
	public org.objectweb.asm.tree.analysis.Frame initWithFrame(org.objectweb.asm.tree.analysis.Frame arg0) {
		return original.init(arg0);
	}

	@Selector("setReturnWithValue:")
	public void setReturnWithValue(org.objectweb.asm.tree.analysis.Value arg0) {
		original.setReturn(arg0);
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
	public org.objectweb.asm.tree.analysis.Value getLocalWithInt(int arg0) throws IndexOutOfBoundsException {
		return original.getLocal(arg0);
	}

	@Selector("setLocalWithIntWithValue::")
	public void setLocalWithIntWithValue(int arg0, org.objectweb.asm.tree.analysis.Value arg1) throws IndexOutOfBoundsException {
		original.setLocal(arg0, arg1);
	}

	@Selector("getStackSize")
	public int getStackSize() {
		return original.getStackSize();
	}

	@Selector("getStackWithInt:")
	public org.objectweb.asm.tree.analysis.Value getStackWithInt(int arg0) throws IndexOutOfBoundsException {
		return original.getStack(arg0);
	}

	@Selector("clearStack")
	public void clearStack() {
		original.clearStack();
	}

	@Selector("pop")
	public org.objectweb.asm.tree.analysis.Value pop() throws IndexOutOfBoundsException {
		return original.pop();
	}

	@Selector("pushWithValue:")
	public void pushWithValue(org.objectweb.asm.tree.analysis.Value arg0) throws IndexOutOfBoundsException {
		original.push(arg0);
	}

	@Selector("executeWithAbstractInsnNodeWithInterpreter::")
	public void executeWithAbstractInsnNodeWithInterpreter(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.Interpreter arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		original.execute(arg0, arg1);
	}

	@Selector("mergeWithFrameWithInterpreter::")
	public boolean mergeWithFrameWithInterpreter(org.objectweb.asm.tree.analysis.Frame arg0, org.objectweb.asm.tree.analysis.Interpreter arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.merge(arg0, arg1);
	}

	@Selector("mergeWithFrameWithBoolean::")
	public boolean mergeWithFrameWithBoolean(org.objectweb.asm.tree.analysis.Frame arg0, boolean[] arg1) {
		return original.merge(arg0, arg1);
	}

	@Selector("toString")
	public String toString() {
		return original.toString();
	}

}
