package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_analysis_Frame")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Frame extends NSObject {	
	
	public org.objectweb.asm.tree.analysis.Frame original;	
	
	protected Frame(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withInt:")	
	public Frame value(int arg0, int arg1) {		
		Frame self = (Frame) Frame.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.Frame(arg0, arg1);		
		return self;		
	}	
	
	@Selector("valueWithFrame:")	
	public Frame value(org.objectweb.asm.tree.analysis.Frame arg0) {		
		Frame self = (Frame) Frame.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.Frame(arg0);		
		return self;		
	}	
	
	@Selector("initWithFrame:")	
	public Frame init(org.objectweb.asm.tree.analysis.Frame arg0) {
		Frame ret = (Frame) Frame.alloc().init();
		ret.original = original.init(arg0);		
		return ret;		
	}	
	
	@Selector("setReturnWithValue:")	
	public void setReturn(org.objectweb.asm.tree.analysis.Value arg0) {		
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
	public Object getLocal(int arg0) throws IndexOutOfBoundsException {
		return original.getLocal(arg0);		
	}	
	
	@Selector("setLocalWithInt:withValue:")	
	public void setLocal(int arg0, org.objectweb.asm.tree.analysis.Value arg1) throws IndexOutOfBoundsException {
		original.setLocal(arg0, arg1);		
	}	
	
	@Selector("getStackSize")	
	public int getStackSize() {		
		return original.getStackSize();		
	}	
	
	@Selector("getStackWithInt:")	
	public Object getStack(int arg0) throws IndexOutOfBoundsException {
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
	public void push(org.objectweb.asm.tree.analysis.Value arg0) throws IndexOutOfBoundsException {
		original.push(arg0);		
	}	
	
	@Selector("mergeWithFrame:withBoolean:")	
	public boolean merge(org.objectweb.asm.tree.analysis.Frame arg0, boolean[] arg1) {		
		return original.merge(arg0, arg1);		
	}	
	
	@Selector("toString")	
	public String toString() {
		return original.toString();		
	}	
}
