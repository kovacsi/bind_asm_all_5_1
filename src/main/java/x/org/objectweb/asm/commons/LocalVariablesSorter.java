package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_LocalVariablesSorter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class LocalVariablesSorter extends NSObject {

	private org.objectweb.asm.commons.LocalVariablesSorter original;

	protected LocalVariablesSorter(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithIntWithStringWithMethodVisitor:::")
	public LocalVariablesSorter valueWithIntWithStringWithMethodVisitor(int arg0, String arg1, org.objectweb.asm.MethodVisitor arg2) {
		LocalVariablesSorter self = (LocalVariablesSorter) LocalVariablesSorter.alloc().init();
		self.original = new org.objectweb.asm.commons.LocalVariablesSorter(arg0, arg1, arg2);
		return self;
	}

	@Selector("visitVarInsnWithIntWithInt::")
	public void visitVarInsnWithIntWithInt(int arg0, int arg1) {
		original.visitVarInsn(arg0, arg1);
	}

	@Selector("visitIincInsnWithIntWithInt::")
	public void visitIincInsnWithIntWithInt(int arg0, int arg1) {
		original.visitIincInsn(arg0, arg1);
	}

	@Selector("visitMaxsWithIntWithInt::")
	public void visitMaxsWithIntWithInt(int arg0, int arg1) {
		original.visitMaxs(arg0, arg1);
	}

	@Selector("visitLocalVariableWithStringWithStringWithStringWithLabelWithLabelWithInt::::::")
	public void visitLocalVariableWithStringWithStringWithStringWithLabelWithLabelWithInt(String arg0, String arg1, String arg2, org.objectweb.asm.Label arg3, org.objectweb.asm.Label arg4, int arg5) {
		original.visitLocalVariable(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Selector("visitLocalVariableAnnotationWithIntWithTypePathWithLabelWithLabelWithIntWithStringWithBoolean:::::::")
	public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotationWithIntWithTypePathWithLabelWithLabelWithIntWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, org.objectweb.asm.Label[] arg2, org.objectweb.asm.Label[] arg3, int[] arg4, String arg5, boolean arg6) {
		return original.visitLocalVariableAnnotation(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Selector("visitFrameWithIntWithIntWithObjectWithIntWithObject:::::")
	public void visitFrameWithIntWithIntWithObjectWithIntWithObject(int arg0, int arg1, Object[] arg2, int arg3, Object[] arg4) {
		original.visitFrame(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("newLocalWithType:")
	public int newLocalWithType(org.objectweb.asm.Type arg0) {
		return original.newLocal(arg0);
	}

}
