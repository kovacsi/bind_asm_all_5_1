package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_SerialVersionUIDAdder")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SerialVersionUIDAdder extends NSObject {

	private org.objectweb.asm.commons.SerialVersionUIDAdder original;

	protected SerialVersionUIDAdder(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithClassVisitor:")
	public SerialVersionUIDAdder valueWithClassVisitor(org.objectweb.asm.ClassVisitor arg0) {
		SerialVersionUIDAdder self = (SerialVersionUIDAdder) SerialVersionUIDAdder.alloc().init();
		self.original = new org.objectweb.asm.commons.SerialVersionUIDAdder(arg0);
		return self;
	}

	@Selector("visitWithIntWithIntWithStringWithStringWithStringWithString::::::")
	public void visitWithIntWithIntWithStringWithStringWithStringWithString(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		original.visit(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Selector("visitMethodWithIntWithStringWithStringWithStringWithString:::::")
	public org.objectweb.asm.MethodVisitor visitMethodWithIntWithStringWithStringWithStringWithString(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
		return original.visitMethod(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitFieldWithIntWithStringWithStringWithStringWithObject:::::")
	public org.objectweb.asm.FieldVisitor visitFieldWithIntWithStringWithStringWithStringWithObject(int arg0, String arg1, String arg2, String arg3, Object arg4) {
		return original.visitField(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitInnerClassWithStringWithStringWithStringWithInt::::")
	public void visitInnerClassWithStringWithStringWithStringWithInt(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);
	}

	@Selector("visitEnd")
	public void visitEnd() {
		original.visitEnd();
	}

	@Selector("hasSVUID")
	public boolean hasSVUID() {
		return original.hasSVUID();
	}

}
