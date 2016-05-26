package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_Method")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Method extends NSObject {

	private org.objectweb.asm.commons.Method original;

	protected Method(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithStringWithString::")
	public Method valueWithStringWithString(String arg0, String arg1) {
		Method self = (Method) Method.alloc().init();
		self.original = new org.objectweb.asm.commons.Method(arg0, arg1);
		return self;
	}

	@Selector("valueWithStringWithTypeWithType:::")
	public Method valueWithStringWithTypeWithType(String arg0, org.objectweb.asm.Type arg1, org.objectweb.asm.Type[] arg2) {
		Method self = (Method) Method.alloc().init();
		self.original = new org.objectweb.asm.commons.Method(arg0, arg1, arg2);
		return self;
	}

	@Selector("getMethodWithMethod:")
	public static org.objectweb.asm.commons.Method getMethodWithMethod(java.lang.reflect.Method arg0) {
		return org.objectweb.asm.commons.Method.getMethod(arg0);
	}

	@Selector("getMethodWithConstructor:")
	public static org.objectweb.asm.commons.Method getMethodWithConstructor(java.lang.reflect.Constructor arg0) {
		return org.objectweb.asm.commons.Method.getMethod(arg0);
	}

	@Selector("getMethodWithString:")
	public static org.objectweb.asm.commons.Method getMethodWithString(String arg0) throws IllegalArgumentException {
		return org.objectweb.asm.commons.Method.getMethod(arg0);
	}

	@Selector("getMethodWithStringWithBoolean::")
	public static org.objectweb.asm.commons.Method getMethodWithStringWithBoolean(String arg0, boolean arg1) throws IllegalArgumentException {
		return org.objectweb.asm.commons.Method.getMethod(arg0, arg1);
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
	public org.objectweb.asm.Type getReturnType() {
		return original.getReturnType();
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
	public boolean equalsWithObject(Object arg0) {
		return original.equals(arg0);
	}

	@Selector("hashCode")
	public int hashCode() {
		return original.hashCode();
	}

}
