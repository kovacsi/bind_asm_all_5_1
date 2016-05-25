package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_IincInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class IincInsnNode extends NSObject {

	private org.objectweb.asm.tree.IincInsnNode original;

	protected IincInsnNode(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithIntWithInt::")
	public IincInsnNode valueWithIntWithInt(int arg0, int arg1) {
		IincInsnNode self = (IincInsnNode) IincInsnNode.alloc().init();
		self.original = new org.objectweb.asm.tree.IincInsnNode(arg0, arg1);
		return self;
	}

	@Selector("getType")
	public int getType() {
		return original.getType();
	}

	@Selector("acceptWithId:")
	public void acceptWithId(org.objectweb.asm.MethodVisitor arg0) {
		original.accept(arg0);
	}

	@Selector("cloneWithId:")
	public org.objectweb.asm.tree.AbstractInsnNode cloneWithId(java.util.Map arg0) {
		return original.clone(arg0);
	}

}
