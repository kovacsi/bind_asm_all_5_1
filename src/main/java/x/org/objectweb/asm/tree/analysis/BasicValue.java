package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_analysis_BasicValue")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class BasicValue extends NSObject {

	private org.objectweb.asm.tree.analysis.BasicValue original;

	protected BasicValue(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithId:")
	public BasicValue valueWithId(org.objectweb.asm.Type arg0) {
		BasicValue self = (BasicValue) BasicValue.alloc().init();
		self.original = new org.objectweb.asm.tree.analysis.BasicValue(arg0);
		return self;
	}

	@Selector("getType")
	public org.objectweb.asm.Type getType() {
		return original.getType();
	}

	@Selector("getSize")
	public int getSize() {
		return original.getSize();
	}

	@Selector("isReference")
	public boolean isReference() {
		return original.isReference();
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
