package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_commons_Method")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Method extends NSObject {	
	
	public org.objectweb.asm.commons.Method original;	
	
	protected Method(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithString:withString:")	
	public Method value(String arg0, String arg1) {
		Method self = (Method) Method.alloc().init();		
		self.original = new org.objectweb.asm.commons.Method(arg0, arg1);		
		return self;		
	}	
	
	@Selector("valueWithString:withType:withType:")	
	public Method value(String arg0, org.objectweb.asm.Type arg1, org.objectweb.asm.Type[] arg2) {
		Method self = (Method) Method.alloc().init();		
		self.original = new org.objectweb.asm.commons.Method(arg0, arg1, arg2);		
		return self;		
	}	
	
	@Selector("getMethodWithMethod:")	
	public static Method getMethod(java.lang.reflect.Method arg0) {
		Method ret = (Method) Method.alloc().init();
		ret.original = org.objectweb.asm.commons.Method.getMethod(arg0);		
		return ret;		
	}	
	
	@Selector("getMethodWithConstructor:")	
	public static Method getMethod(java.lang.reflect.Constructor arg0) {
		Method ret = (Method) Method.alloc().init();
		ret.original = org.objectweb.asm.commons.Method.getMethod(arg0);		
		return ret;		
	}	
	
	@Selector("getMethodWithString:")	
	public static Method getMethod(String arg0) throws IllegalArgumentException {
		Method ret = (Method) Method.alloc().init();
		ret.original = org.objectweb.asm.commons.Method.getMethod(arg0);		
		return ret;		
	}	
	
	@Selector("getMethodWithString:withBoolean:")	
	public static Method getMethod(String arg0, boolean arg1) throws IllegalArgumentException {
		Method ret = (Method) Method.alloc().init();
		ret.original = org.objectweb.asm.commons.Method.getMethod(arg0, arg1);		
		return ret;		
	}	
	
	@Selector("getName")	
	public String getName() {
		return original.getName();		
	}	
	
	@Selector("getDescriptor")	
	public String getDescriptor() {
		return original.getDescriptor();		
	}	
	
	@Selector("getReturnType")	
	public x.org.objectweb.asm.Type getReturnType() {		
		x.org.objectweb.asm.Type ret = (x.org.objectweb.asm.Type) x.org.objectweb.asm.Type.alloc().init();		
		ret.original = original.getReturnType();		
		return ret;		
	}	
	
	@Selector("getArgumentTypes")	
	public org.objectweb.asm.Type[] getArgumentTypes() {		
		return original.getArgumentTypes();		
	}	
	
	@Selector("toString")	
	public String toString() {
		return original.toString();		
	}	
	
	@Selector("equalsWithObject:")	
	public boolean equals(Object arg0) {
		return original.equals(arg0);		
	}	
	
	@Selector("hashCode")	
	public int hashCode() {		
		return original.hashCode();		
	}	
}
