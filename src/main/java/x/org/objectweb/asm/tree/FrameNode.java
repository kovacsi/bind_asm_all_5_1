package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_FrameNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class FrameNode extends NSObject {

	private org.objectweb.asm.tree.FrameNode original;

	protected FrameNode(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithIntWithIntWithObjectWithIntWithObject:::::")
	public FrameNode valueWithIntWithIntWithObjectWithIntWithObject(int arg0, int arg1, Object[] arg2, int arg3, Object[] arg4) {
		FrameNode self = (FrameNode) FrameNode.alloc().init();
		self.original = new org.objectweb.asm.tree.FrameNode(arg0, arg1, arg2, arg3, arg4);
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
