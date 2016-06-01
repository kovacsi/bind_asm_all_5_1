package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("Handle")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Handle extends NSObject {	
	
	public org.objectweb.asm.Handle original;	
	
	protected Handle(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:withString:withString:withString:")	
	public Handle valueWithIntwithStringwithStringwithString(int arg0, String arg1, String arg2, String arg3) {
		Handle self = (Handle) Handle.alloc().init();		
		self.original = new org.objectweb.asm.Handle(arg0, arg1, arg2, arg3);		
		return self;		
	}	
	
	@Selector("valueWithInt:withString:withString:withString:withBoolean:")	
	public Handle valueWithIntwithStringwithStringwithStringwithBoolean(int arg0, String arg1, String arg2, String arg3, boolean arg4) {
		Handle self = (Handle) Handle.alloc().init();		
		self.original = new org.objectweb.asm.Handle(arg0, arg1, arg2, arg3, arg4);		
		return self;		
	}	
	
	@Selector("getTag")	
	public int getTag() {		
		return original.getTag();		
	}	
	
	@Selector("getOwner")	
	public String getOwner() {
		return original.getOwner();		
	}	
	
	@Selector("getName")	
	public String getName() {
		return original.getName();		
	}	
	
	@Selector("getDesc")	
	public String getDesc() {
		return original.getDesc();		
	}	
	
	@Selector("isInterface")	
	public boolean isInterface() {		
		return original.isInterface();		
	}	
	
	@Selector("equalsWithObject:")	
	public boolean equalsWithObject(Object arg0) {
		return original.equals(arg0);		
	}	
	
	@Selector("hashCode")	
	public int hashCode() {		
		return original.hashCode();		
	}	
	
	@Selector("toString")	
	public String toString() {
		return original.toString();		
	}	
}
