package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_InvokeDynamicInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class InvokeDynamicInsnNode extends NSObject {

	private org.objectweb.asm.tree.InvokeDynamicInsnNode original;

	protected InvokeDynamicInsnNode(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithStringWithStringWithHandleWithObject::::")
	public InvokeDynamicInsnNode valueWithStringWithStringWithHandleWithObject(String arg0, String arg1, org.objectweb.asm.Handle arg2, Object[] arg3) {
		InvokeDynamicInsnNode self = (InvokeDynamicInsnNode) InvokeDynamicInsnNode.alloc().init();
		self.original = new org.objectweb.asm.tree.InvokeDynamicInsnNode(arg0, arg1, arg2, arg3);
		return self;
	}

	@Selector("getType")
	public int getType() {
		return original.getType();
	}

	@Selector("acceptWithMethodVisitor:")
	public void acceptWithMethodVisitor(org.objectweb.asm.MethodVisitor arg0) {
		original.accept(arg0);
	}

	@Selector("cloneWithMap:")
	public org.objectweb.asm.tree.AbstractInsnNode cloneWithMap(java.util.Map arg0) {
		return original.clone(arg0);
	}

}
