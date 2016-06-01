package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBSimpleRemapper")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SimpleRemapper extends NSObject {	
	
	public org.objectweb.asm.commons.SimpleRemapper original;	
	
	protected SimpleRemapper(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native SimpleRemapper alloc();	
	
	@Selector("valueWithMap:")	
	public SimpleRemapper valueWithMap(java.util.Map arg0) {		
		SimpleRemapper self = (SimpleRemapper) SimpleRemapper.alloc().init();		
		self.original = new org.objectweb.asm.commons.SimpleRemapper(arg0);		
		return self;		
	}	
	
	@Selector("valueWithString:withString:")	
	public SimpleRemapper valueWithStringwithString(String arg0, String arg1) {
		SimpleRemapper self = (SimpleRemapper) SimpleRemapper.alloc().init();		
		self.original = new org.objectweb.asm.commons.SimpleRemapper(arg0, arg1);		
		return self;		
	}	
	
	@Selector("mapMethodNameWithString:withString:withString:")	
	public String mapMethodNameWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		return original.mapMethodName(arg0, arg1, arg2);		
	}	
	
	@Selector("mapInvokeDynamicMethodNameWithString:withString:")	
	public String mapInvokeDynamicMethodNameWithStringwithString(String arg0, String arg1) {
		return original.mapInvokeDynamicMethodName(arg0, arg1);		
	}	
	
	@Selector("mapFieldNameWithString:withString:withString:")	
	public String mapFieldNameWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		return original.mapFieldName(arg0, arg1, arg2);		
	}	
	
	@Selector("mapWithString:")	
	public String mapWithString(String arg0) {
		return original.map(arg0);		
	}	
}
