package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_analysis_BasicInterpreter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class BasicInterpreter extends NSObject {	
	
	public org.objectweb.asm.tree.analysis.BasicInterpreter original;	
	
	protected BasicInterpreter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("value")	
	public BasicInterpreter value() {		
		BasicInterpreter self = (BasicInterpreter) BasicInterpreter.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.BasicInterpreter();		
		return self;		
	}	
	
	@Selector("mergeWithBasicValue:withBasicValue:")	
	public BasicValue merge(org.objectweb.asm.tree.analysis.BasicValue arg0, org.objectweb.asm.tree.analysis.BasicValue arg1) {
		BasicValue ret = (BasicValue) BasicValue.alloc().init();
		ret.original = original.merge(arg0, arg1);		
		return ret;		
	}	
	
	@Selector("mergeWithValue:withValue:")	
	public Object merge(org.objectweb.asm.tree.analysis.Value arg0, org.objectweb.asm.tree.analysis.Value arg1) {
		return original.merge(arg0, arg1);		
	}	
	
	@Selector("newValueWithType:")	
	public Object newValue(org.objectweb.asm.Type arg0) {
		return original.newValue(arg0);		
	}	
}
