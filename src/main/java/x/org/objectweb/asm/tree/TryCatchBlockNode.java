package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_TryCatchBlockNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TryCatchBlockNode extends NSObject {

	private org.objectweb.asm.tree.TryCatchBlockNode original;

	protected TryCatchBlockNode(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithIdWithIdWithIdWithString::::")
	public TryCatchBlockNode valueWithIdWithIdWithIdWithString(org.objectweb.asm.tree.LabelNode arg0, org.objectweb.asm.tree.LabelNode arg1, org.objectweb.asm.tree.LabelNode arg2, String arg3) {
		TryCatchBlockNode self = (TryCatchBlockNode) TryCatchBlockNode.alloc().init();
		self.original = new org.objectweb.asm.tree.TryCatchBlockNode(arg0, arg1, arg2, arg3);
		return self;
	}

	@Selector("updateIndexWithInt:")
	public void updateIndexWithInt(int arg0) {
		original.updateIndex(arg0);
	}

	@Selector("acceptWithId:")
	public void acceptWithId(org.objectweb.asm.MethodVisitor arg0) {
		original.accept(arg0);
	}

}
