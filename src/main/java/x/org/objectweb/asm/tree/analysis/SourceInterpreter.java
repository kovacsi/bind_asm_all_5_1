package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_analysis_SourceInterpreter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SourceInterpreter extends NSObject {	
	
	public org.objectweb.asm.tree.analysis.SourceInterpreter original;	
	
	protected SourceInterpreter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("value")	
	public SourceInterpreter value() {		
		SourceInterpreter self = (SourceInterpreter) SourceInterpreter.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.SourceInterpreter();		
		return self;		
	}	
	
	@Selector("mergeWithSourceValue:withSourceValue:")	
	public SourceValue merge(org.objectweb.asm.tree.analysis.SourceValue arg0, org.objectweb.asm.tree.analysis.SourceValue arg1) {
		SourceValue ret = (SourceValue) SourceValue.alloc().init();
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
