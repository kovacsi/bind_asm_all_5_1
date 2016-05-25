package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_LocalVariableAnnotationNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class LocalVariableAnnotationNode extends NSObject {

	private org.objectweb.asm.tree.LocalVariableAnnotationNode original;

	protected LocalVariableAnnotationNode(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithIntWithIdWithIdWithIdWithIdWithString::::::")
	public LocalVariableAnnotationNode valueWithIntWithIdWithIdWithIdWithIdWithString(int arg0, org.objectweb.asm.TypePath arg1, org.objectweb.asm.tree.LabelNode[] arg2, org.objectweb.asm.tree.LabelNode[] arg3, int[] arg4, String arg5) {
		LocalVariableAnnotationNode self = (LocalVariableAnnotationNode) LocalVariableAnnotationNode.alloc().init();
		self.original = new org.objectweb.asm.tree.LocalVariableAnnotationNode(arg0, arg1, arg2, arg3, arg4, arg5);
		return self;
	}

	@Selector("valueWithIntWithIntWithIdWithIdWithIdWithIdWithString:::::::")
	public LocalVariableAnnotationNode valueWithIntWithIntWithIdWithIdWithIdWithIdWithString(int arg0, int arg1, org.objectweb.asm.TypePath arg2, org.objectweb.asm.tree.LabelNode[] arg3, org.objectweb.asm.tree.LabelNode[] arg4, int[] arg5, String arg6) {
		LocalVariableAnnotationNode self = (LocalVariableAnnotationNode) LocalVariableAnnotationNode.alloc().init();
		self.original = new org.objectweb.asm.tree.LocalVariableAnnotationNode(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		return self;
	}

	@Selector("acceptWithIdWithBool::")
	public void acceptWithIdWithBool(org.objectweb.asm.MethodVisitor arg0, boolean arg1) {
		original.accept(arg0, arg1);
	}

}
