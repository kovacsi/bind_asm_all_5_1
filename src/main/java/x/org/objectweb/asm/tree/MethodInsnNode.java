package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_MethodInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class MethodInsnNode extends NSObject {

	private org.objectweb.asm.tree.MethodInsnNode original;

	protected MethodInsnNode(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithIntWithStringWithStringWithString::::")
	public MethodInsnNode valueWithIntWithStringWithStringWithString(int arg0, String arg1, String arg2, String arg3) {
		MethodInsnNode self = (MethodInsnNode) MethodInsnNode.alloc().init();
		self.original = new org.objectweb.asm.tree.MethodInsnNode(arg0, arg1, arg2, arg3);
		return self;
	}

	@Selector("valueWithIntWithStringWithStringWithStringWithBoolean:::::")
	public MethodInsnNode valueWithIntWithStringWithStringWithStringWithBoolean(int arg0, String arg1, String arg2, String arg3, boolean arg4) {
		MethodInsnNode self = (MethodInsnNode) MethodInsnNode.alloc().init();
		self.original = new org.objectweb.asm.tree.MethodInsnNode(arg0, arg1, arg2, arg3, arg4);
		return self;
	}

	@Selector("setOpcodeWithInt:")
	public void setOpcodeWithInt(int arg0) {
		original.setOpcode(arg0);
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
