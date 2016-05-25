package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_MultiANewArrayInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class MultiANewArrayInsnNode extends NSObject {

	private org.objectweb.asm.tree.MultiANewArrayInsnNode original;

	protected MultiANewArrayInsnNode(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithStringWithInt::")
	public MultiANewArrayInsnNode valueWithStringWithInt(String arg0, int arg1) {
		MultiANewArrayInsnNode self = (MultiANewArrayInsnNode) MultiANewArrayInsnNode.alloc().init();
		self.original = new org.objectweb.asm.tree.MultiANewArrayInsnNode(arg0, arg1);
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
