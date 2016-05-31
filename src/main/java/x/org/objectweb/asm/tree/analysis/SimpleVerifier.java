package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_analysis_SimpleVerifier")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SimpleVerifier extends NSObject {	
	
	public org.objectweb.asm.tree.analysis.SimpleVerifier original;	
	
	protected SimpleVerifier(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("value")	
	public SimpleVerifier value() {		
		SimpleVerifier self = (SimpleVerifier) SimpleVerifier.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.SimpleVerifier();		
		return self;		
	}	
	
	@Selector("valueWithType:withType:withBoolean:")	
	public SimpleVerifier value(org.objectweb.asm.Type arg0, org.objectweb.asm.Type arg1, boolean arg2) {		
		SimpleVerifier self = (SimpleVerifier) SimpleVerifier.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.SimpleVerifier(arg0, arg1, arg2);		
		return self;		
	}	
	
	@Selector("valueWithType:withType:withList:withBoolean:")	
	public SimpleVerifier value(org.objectweb.asm.Type arg0, org.objectweb.asm.Type arg1, java.util.List arg2, boolean arg3) {		
		SimpleVerifier self = (SimpleVerifier) SimpleVerifier.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.SimpleVerifier(arg0, arg1, arg2, arg3);		
		return self;		
	}	
	
	@Selector("setClassLoaderWithClassLoader:")	
	public void setClassLoader(ClassLoader arg0) {
		original.setClassLoader(arg0);		
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
