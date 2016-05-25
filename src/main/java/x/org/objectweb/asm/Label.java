package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_Label")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Label extends NSObject {

	private org.objectweb.asm.Label original;

	protected Label(Pointer peer) {
		super(peer);
	}

	@Selector("getOffset")
	public int getOffset() {
		return original.getOffset();
	}

	@Selector("toString")
	public String toString() {
		return original.toString();
	}

}
