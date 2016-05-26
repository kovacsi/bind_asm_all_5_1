package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_JSRInlinerAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class JSRInlinerAdapter extends NSObject {

	private org.objectweb.asm.commons.JSRInlinerAdapter original;

	protected JSRInlinerAdapter(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithMethodVisitorWithIntWithStringWithStringWithStringWithString::::::")
	public JSRInlinerAdapter valueWithMethodVisitorWithIntWithStringWithStringWithStringWithString(org.objectweb.asm.MethodVisitor arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		JSRInlinerAdapter self = (JSRInlinerAdapter) JSRInlinerAdapter.alloc().init();
		self.original = new org.objectweb.asm.commons.JSRInlinerAdapter(arg0, arg1, arg2, arg3, arg4, arg5);
		return self;
	}

	@Selector("visitJumpInsnWithIntWithLabel::")
	public void visitJumpInsnWithIntWithLabel(int arg0, org.objectweb.asm.Label arg1) {
		original.visitJumpInsn(arg0, arg1);
	}

	@Selector("visitEnd")
	public void visitEnd() {
		original.visitEnd();
	}

}
