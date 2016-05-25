package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_AnnotationNode")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class AnnotationNode extends NSObject {

	private org.objectweb.asm.tree.AnnotationNode original;

	protected AnnotationNode(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithString:")
	public AnnotationNode valueWithString(String arg0) {
		AnnotationNode self = (AnnotationNode) AnnotationNode.alloc().init();
		self.original = new org.objectweb.asm.tree.AnnotationNode(arg0);
		return self;
	}

	@Selector("valueWithIntWithString::")
	public AnnotationNode valueWithIntWithString(int arg0, String arg1) {
		AnnotationNode self = (AnnotationNode) AnnotationNode.alloc().init();
		self.original = new org.objectweb.asm.tree.AnnotationNode(arg0, arg1);
		return self;
	}

	@Selector("visitWithStringWithObject::")
	public void visitWithStringWithObject(String arg0, Object arg1) {
		original.visit(arg0, arg1);
	}

	@Selector("visitEnumWithStringWithStringWithString:::")
	public void visitEnumWithStringWithStringWithString(String arg0, String arg1, String arg2) {
		original.visitEnum(arg0, arg1, arg2);
	}

	@Selector("visitAnnotationWithStringWithString::")
	public org.objectweb.asm.AnnotationVisitor visitAnnotationWithStringWithString(String arg0, String arg1) {
		return original.visitAnnotation(arg0, arg1);
	}

	@Selector("visitArrayWithString:")
	public org.objectweb.asm.AnnotationVisitor visitArrayWithString(String arg0) {
		return original.visitArray(arg0);
	}

	@Selector("visitEnd")
	public void visitEnd() {
		original.visitEnd();
	}

	@Selector("checkWithInt:")
	public void checkWithInt(int arg0) {
		original.check(arg0);
	}

	@Selector("acceptWithId:")
	public void acceptWithId(org.objectweb.asm.AnnotationVisitor arg0) {
		original.accept(arg0);
	}

}
