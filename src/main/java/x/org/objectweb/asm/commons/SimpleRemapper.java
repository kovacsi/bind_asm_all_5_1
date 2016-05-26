package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_SimpleRemapper")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SimpleRemapper extends NSObject {

	private org.objectweb.asm.commons.SimpleRemapper original;

	protected SimpleRemapper(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithMap:")
	public SimpleRemapper valueWithMap(java.util.Map arg0) {
		SimpleRemapper self = (SimpleRemapper) SimpleRemapper.alloc().init();
		self.original = new org.objectweb.asm.commons.SimpleRemapper(arg0);
		return self;
	}

	@Selector("valueWithStringWithString::")
	public SimpleRemapper valueWithStringWithString(String arg0, String arg1) {
		SimpleRemapper self = (SimpleRemapper) SimpleRemapper.alloc().init();
		self.original = new org.objectweb.asm.commons.SimpleRemapper(arg0, arg1);
		return self;
	}

	@Selector("mapMethodNameWithStringWithStringWithString:::")
	public String mapMethodNameWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		return original.mapMethodName(arg0, arg1, arg2);
	}

	@Selector("mapInvokeDynamicMethodNameWithStringWithString::")
	public String mapInvokeDynamicMethodNameWithStringWithString(String arg0, String arg1) {
		return original.mapInvokeDynamicMethodName(arg0, arg1);
	}

	@Selector("mapFieldNameWithStringWithStringWithString:::")
	public String mapFieldNameWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		return original.mapFieldName(arg0, arg1, arg2);
	}

	@Selector("mapWithString:")
	public String mapWithString(String arg0) {
		return original.map(arg0);
	}

}
