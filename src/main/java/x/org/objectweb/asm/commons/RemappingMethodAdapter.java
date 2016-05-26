package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_RemappingMethodAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class RemappingMethodAdapter extends NSObject {

	private org.objectweb.asm.commons.RemappingMethodAdapter original;

	protected RemappingMethodAdapter(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithIntWithStringWithMethodVisitorWithRemapper::::")
	public RemappingMethodAdapter valueWithIntWithStringWithMethodVisitorWithRemapper(int arg0, String arg1, org.objectweb.asm.MethodVisitor arg2, org.objectweb.asm.commons.Remapper arg3) {
		RemappingMethodAdapter self = (RemappingMethodAdapter) RemappingMethodAdapter.alloc().init();
		self.original = new org.objectweb.asm.commons.RemappingMethodAdapter(arg0, arg1, arg2, arg3);
		return self;
	}

	@Selector("visitAnnotationDefault")
	public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
		return original.visitAnnotationDefault();
	}

	@Selector("visitAnnotationWithStringWithBoolean::")
	public org.objectweb.asm.AnnotationVisitor visitAnnotationWithStringWithBoolean(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);
	}

	@Selector("visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean::::")
	public org.objectweb.asm.AnnotationVisitor visitTypeAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitParameterAnnotationWithIntWithStringWithBoolean:::")
	public org.objectweb.asm.AnnotationVisitor visitParameterAnnotationWithIntWithStringWithBoolean(int arg0, String arg1, boolean arg2) {
		return original.visitParameterAnnotation(arg0, arg1, arg2);
	}

	@Selector("visitFrameWithIntWithIntWithObjectWithIntWithObject:::::")
	public void visitFrameWithIntWithIntWithObjectWithIntWithObject(int arg0, int arg1, Object[] arg2, int arg3, Object[] arg4) {
		original.visitFrame(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitFieldInsnWithIntWithStringWithStringWithString::::")
	public void visitFieldInsnWithIntWithStringWithStringWithString(int arg0, String arg1, String arg2, String arg3) {
		original.visitFieldInsn(arg0, arg1, arg2, arg3);
	}

	@Selector("visitMethodInsnWithIntWithStringWithStringWithString::::")
	public void visitMethodInsnWithIntWithStringWithStringWithString(int arg0, String arg1, String arg2, String arg3) {
		original.visitMethodInsn(arg0, arg1, arg2, arg3);
	}

	@Selector("visitMethodInsnWithIntWithStringWithStringWithStringWithBoolean:::::")
	public void visitMethodInsnWithIntWithStringWithStringWithStringWithBoolean(int arg0, String arg1, String arg2, String arg3, boolean arg4) {
		original.visitMethodInsn(arg0, arg1, arg2, arg3, arg4);
	}

	@Selector("visitInvokeDynamicInsnWithStringWithStringWithHandleWithObject::::")
	public void visitInvokeDynamicInsnWithStringWithStringWithHandleWithObject(String arg0, String arg1, org.objectweb.asm.Handle arg2, Object[] arg3) {
		original.visitInvokeDynamicInsn(arg0, arg1, arg2, arg3);
	}

	@Selector("visitTypeInsnWithIntWithString::")
	public void visitTypeInsnWithIntWithString(int arg0, String arg1) {
		original.visitTypeInsn(arg0, arg1);
	}

	@Selector("visitLdcInsnWithObject:")
	public void visitLdcInsnWithObject(Object arg0) {
		original.visitLdcInsn(arg0);
	}

	@Selector("visitMultiANewArrayInsnWithStringWithInt::")
	public void visitMultiANewArrayInsnWithStringWithInt(String arg0, int arg1) {
		original.visitMultiANewArrayInsn(arg0, arg1);
	}

	@Selector("visitInsnAnnotationWithIntWithTypePathWithStringWithBoolean::::")
	public org.objectweb.asm.AnnotationVisitor visitInsnAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitInsnAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitTryCatchBlockWithLabelWithLabelWithLabelWithString::::")
	public void visitTryCatchBlockWithLabelWithLabelWithLabelWithString(org.objectweb.asm.Label arg0, org.objectweb.asm.Label arg1, org.objectweb.asm.Label arg2, String arg3) {
		original.visitTryCatchBlock(arg0, arg1, arg2, arg3);
	}

	@Selector("visitTryCatchAnnotationWithIntWithTypePathWithStringWithBoolean::::")
	public org.objectweb.asm.AnnotationVisitor visitTryCatchAnnotationWithIntWithTypePathWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTryCatchAnnotation(arg0, arg1, arg2, arg3);
	}

	@Selector("visitLocalVariableWithStringWithStringWithStringWithLabelWithLabelWithInt::::::")
	public void visitLocalVariableWithStringWithStringWithStringWithLabelWithLabelWithInt(String arg0, String arg1, String arg2, org.objectweb.asm.Label arg3, org.objectweb.asm.Label arg4, int arg5) {
		original.visitLocalVariable(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@Selector("visitLocalVariableAnnotationWithIntWithTypePathWithLabelWithLabelWithIntWithStringWithBoolean:::::::")
	public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotationWithIntWithTypePathWithLabelWithLabelWithIntWithStringWithBoolean(int arg0, org.objectweb.asm.TypePath arg1, org.objectweb.asm.Label[] arg2, org.objectweb.asm.Label[] arg3, int[] arg4, String arg5, boolean arg6) {
		return original.visitLocalVariableAnnotation(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

}
