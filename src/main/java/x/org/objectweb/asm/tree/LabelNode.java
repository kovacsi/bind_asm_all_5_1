package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_LabelNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class LabelNode extends NSObject {

	private org.objectweb.asm.tree.LabelNode original;

	protected LabelNode(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithId:")
	public LabelNode valueWithId(org.objectweb.asm.Label arg0) {
		LabelNode self = (LabelNode) LabelNode.alloc().init();
		self.original = new org.objectweb.asm.tree.LabelNode(arg0);
		return self;
	}

	@Selector("getType")
	public int getType() {
		return original.getType();
	}

	@Selector("getLabel")
	public org.objectweb.asm.Label getLabel() {
		return original.getLabel();
	}

	@Selector("acceptWithId:")
	public void acceptWithId(org.objectweb.asm.MethodVisitor arg0) {
		original.accept(arg0);
	}

	@Selector("cloneWithId:")
	public org.objectweb.asm.tree.AbstractInsnNode cloneWithId(java.util.Map arg0) {
		return original.clone(arg0);
	}

	@Selector("resetLabel")
	public void resetLabel() {
		original.resetLabel();
	}

}
