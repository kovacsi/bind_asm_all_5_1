package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_ParameterNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ParameterNode extends NSObject {

	private org.objectweb.asm.tree.ParameterNode original;

	protected ParameterNode(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithStringWithInt::")
	public ParameterNode valueWithStringWithInt(String arg0, int arg1) {
		ParameterNode self = (ParameterNode) ParameterNode.alloc().init();
		self.original = new org.objectweb.asm.tree.ParameterNode(arg0, arg1);
		return self;
	}

	@Selector("acceptWithId:")
	public void acceptWithId(org.objectweb.asm.MethodVisitor arg0) {
		original.accept(arg0);
	}

}
