package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_StaticInitMerger")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class StaticInitMerger extends NSObject {

	private org.objectweb.asm.commons.StaticInitMerger original;

	protected StaticInitMerger(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithStringWithId::")
	public StaticInitMerger valueWithStringWithId(String arg0, org.objectweb.asm.ClassVisitor arg1) {
		StaticInitMerger self = (StaticInitMerger) StaticInitMerger.alloc().init();
		self.original = new org.objectweb.asm.commons.StaticInitMerger(arg0, arg1);
		return self;
	}

	@Selector("visitWithIntWithIntWithStringWithStringWithStringWithId::::::")
	public void visitWithIntWithIntWithStringWithStringWithStringWithId(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		original.visit(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Selector("visitMethodWithIntWithStringWithStringWithStringWithId:::::")
	public org.objectweb.asm.MethodVisitor visitMethodWithIntWithStringWithStringWithStringWithId(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
		return original.visitMethod(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitEnd")
	public void visitEnd() {
		original.visitEnd();
	}

}
