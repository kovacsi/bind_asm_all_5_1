package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_LocalVariableNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class LocalVariableNode extends NSObject {

	private org.objectweb.asm.tree.LocalVariableNode original;

	protected LocalVariableNode(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithStringWithStringWithStringWithIdWithIdWithInt::::::")
	public LocalVariableNode valueWithStringWithStringWithStringWithIdWithIdWithInt(String arg0, String arg1, String arg2, org.objectweb.asm.tree.LabelNode arg3, org.objectweb.asm.tree.LabelNode arg4, int arg5) {
		LocalVariableNode self = (LocalVariableNode) LocalVariableNode.alloc().init();
		self.original = new org.objectweb.asm.tree.LocalVariableNode(arg0, arg1, arg2, arg3, arg4, arg5);
		return self;
	}

	@Selector("acceptWithId:")
	public void acceptWithId(org.objectweb.asm.MethodVisitor arg0) {
		original.accept(arg0);
	}

}
