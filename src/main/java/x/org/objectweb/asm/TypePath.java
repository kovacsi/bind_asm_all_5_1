package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_TypePath")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TypePath extends NSObject {

	private org.objectweb.asm.TypePath original;

	protected TypePath(Pointer peer) {
		super(peer);
	}

	@Selector("getLength")
	public int getLength() {
		return original.getLength();
	}

	@Selector("getStepWithInt:")
	public int getStepWithInt(int arg0) {
		return original.getStep(arg0);
	}

	@Selector("getStepArgumentWithInt:")
	public int getStepArgumentWithInt(int arg0) {
		return original.getStepArgument(arg0);
	}

	@Selector("fromStringWithString:")
	public static org.objectweb.asm.TypePath fromStringWithString(String arg0) {
		return org.objectweb.asm.TypePath.fromString(arg0);
	}

	@Selector("toString")
	public String toString() {
		return original.toString();
	}

}
