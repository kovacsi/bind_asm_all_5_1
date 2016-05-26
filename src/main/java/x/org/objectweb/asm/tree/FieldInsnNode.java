package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_FieldInsnNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class FieldInsnNode extends NSObject {

	private org.objectweb.asm.tree.FieldInsnNode original;

	protected FieldInsnNode(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithIntWithStringWithStringWithString::::")
	public FieldInsnNode valueWithIntWithStringWithStringWithString(int arg0, String arg1, String arg2, String arg3) {
		FieldInsnNode self = (FieldInsnNode) FieldInsnNode.alloc().init();
		self.original = new org.objectweb.asm.tree.FieldInsnNode(arg0, arg1, arg2, arg3);
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
