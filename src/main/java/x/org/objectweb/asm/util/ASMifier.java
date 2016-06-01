package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBASMifier")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ASMifier extends NSObject {	
	
	public org.objectweb.asm.util.ASMifier original;	
	
	protected ASMifier(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native ASMifier alloc();	
	
	@Selector("value")	
	public ASMifier value() {		
		ASMifier self = (ASMifier) ASMifier.alloc().init();		
		self.original = new org.objectweb.asm.util.ASMifier();		
		return self;		
	}	
	
	@Selector("mainWithString:")	
	public static void mainWithString(String[] arg0) throws Exception {
		org.objectweb.asm.util.ASMifier.main(arg0);		
	}	
	
	@Selector("visitWithInt:withInt:withString:withString:withString:withString:")	
	public void visitWithIntwithIntwithStringwithStringwithStringwithString(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		original.visit(arg0, arg1, arg2, arg3, arg4, arg5);		
	}	
	
	@Selector("visitSourceWithString:withString:")	
	public void visitSourceWithStringwithString(String arg0, String arg1) {
		original.visitSource(arg0, arg1);		
	}	
	
	@Selector("visitOuterClassWithString:withString:withString:")	
	public void visitOuterClassWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.visitOuterClass(arg0, arg1, arg2);		
	}	
	
	@Selector("visitClassAttributeWithAttribute:")	
	public void visitClassAttributeWithAttribute(x.org.objectweb.asm.Attribute arg0) {		
		original.visitClassAttribute(arg0.original);		
	}	
	
	@Selector("visitInnerClassWithString:withString:withString:withInt:")	
	public void visitInnerClassWithStringwithStringwithStringwithInt(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitClassEnd")	
	public void visitClassEnd() {		
		original.visitClassEnd();		
	}	
	
	@Selector("visitWithString:withObject:")	
	public void visitWithStringwithObject(String arg0, Object arg1) {
		original.visit(arg0, arg1);		
	}	
	
	@Selector("visitEnumWithString:withString:withString:")	
	public void visitEnumWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.visitEnum(arg0, arg1, arg2);		
	}	
	
	@Selector("visitAnnotationEnd")	
	public void visitAnnotationEnd() {		
		original.visitAnnotationEnd();		
	}	
	
	@Selector("visitFieldAttributeWithAttribute:")	
	public void visitFieldAttributeWithAttribute(x.org.objectweb.asm.Attribute arg0) {		
		original.visitFieldAttribute(arg0.original);		
	}	
	
	@Selector("visitFieldEnd")	
	public void visitFieldEnd() {		
		original.visitFieldEnd();		
	}	
	
	@Selector("visitParameterWithString:withInt:")	
	public void visitParameterWithStringwithInt(String arg0, int arg1) {
		original.visitParameter(arg0, arg1);		
	}	
	
	@Selector("visitMethodAttributeWithAttribute:")	
	public void visitMethodAttributeWithAttribute(x.org.objectweb.asm.Attribute arg0) {		
		original.visitMethodAttribute(arg0.original);		
	}	
	
	@Selector("visitCode")	
	public void visitCode() {		
		original.visitCode();		
	}	
	
	@Selector("visitFrameWithInt:withInt:withObject:withInt:withObject:")	
	public void visitFrameWithIntwithIntwithObjectwithIntwithObject(int arg0, int arg1, Object[] arg2, int arg3, Object[] arg4) {
		original.visitFrame(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitInsnWithInt:")	
	public void visitInsnWithInt(int arg0) {		
		original.visitInsn(arg0);		
	}	
	
	@Selector("visitIntInsnWithInt:withInt:")	
	public void visitIntInsnWithIntwithInt(int arg0, int arg1) {		
		original.visitIntInsn(arg0, arg1);		
	}	
	
	@Selector("visitVarInsnWithInt:withInt:")	
	public void visitVarInsnWithIntwithInt(int arg0, int arg1) {		
		original.visitVarInsn(arg0, arg1);		
	}	
	
	@Selector("visitTypeInsnWithInt:withString:")	
	public void visitTypeInsnWithIntwithString(int arg0, String arg1) {
		original.visitTypeInsn(arg0, arg1);		
	}	
	
	@Selector("visitFieldInsnWithInt:withString:withString:withString:")	
	public void visitFieldInsnWithIntwithStringwithStringwithString(int arg0, String arg1, String arg2, String arg3) {
		original.visitFieldInsn(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitMethodInsnWithInt:withString:withString:withString:")	
	public void visitMethodInsnWithIntwithStringwithStringwithString(int arg0, String arg1, String arg2, String arg3) {
		original.visitMethodInsn(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitMethodInsnWithInt:withString:withString:withString:withBoolean:")	
	public void visitMethodInsnWithIntwithStringwithStringwithStringwithBoolean(int arg0, String arg1, String arg2, String arg3, boolean arg4) {
		original.visitMethodInsn(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitInvokeDynamicInsnWithString:withString:withHandle:withObject:")	
	public void visitInvokeDynamicInsnWithStringwithStringwithHandlewithObject(String arg0, String arg1, x.org.objectweb.asm.Handle arg2, Object[] arg3) {
		original.visitInvokeDynamicInsn(arg0, arg1, arg2.original, arg3);		
	}	
	
	@Selector("visitJumpInsnWithInt:withLabel:")	
	public void visitJumpInsnWithIntwithLabel(int arg0, x.org.objectweb.asm.Label arg1) {		
		original.visitJumpInsn(arg0, arg1.original);		
	}	
	
	@Selector("visitLabelWithLabel:")	
	public void visitLabelWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.visitLabel(arg0.original);		
	}	
	
	@Selector("visitLdcInsnWithObject:")	
	public void visitLdcInsnWithObject(Object arg0) {
		original.visitLdcInsn(arg0);		
	}	
	
	@Selector("visitIincInsnWithInt:withInt:")	
	public void visitIincInsnWithIntwithInt(int arg0, int arg1) {		
		original.visitIincInsn(arg0, arg1);		
	}	
	
	@Selector("visitTableSwitchInsnWithInt:withInt:withLabel:withLabel:")	
	public void visitTableSwitchInsnWithIntwithIntwithLabelwithLabel(int arg0, int arg1, x.org.objectweb.asm.Label arg2, org.objectweb.asm.Label[] arg3) {		
		original.visitTableSwitchInsn(arg0, arg1, arg2.original, arg3);		
	}	
	
	@Selector("visitLookupSwitchInsnWithLabel:withInt:withLabel:")	
	public void visitLookupSwitchInsnWithLabelwithIntwithLabel(x.org.objectweb.asm.Label arg0, int[] arg1, org.objectweb.asm.Label[] arg2) {		
		original.visitLookupSwitchInsn(arg0.original, arg1, arg2);		
	}	
	
	@Selector("visitMultiANewArrayInsnWithString:withInt:")	
	public void visitMultiANewArrayInsnWithStringwithInt(String arg0, int arg1) {
		original.visitMultiANewArrayInsn(arg0, arg1);		
	}	
	
	@Selector("visitTryCatchBlockWithLabel:withLabel:withLabel:withString:")	
	public void visitTryCatchBlockWithLabelwithLabelwithLabelwithString(x.org.objectweb.asm.Label arg0, x.org.objectweb.asm.Label arg1, x.org.objectweb.asm.Label arg2, String arg3) {
		original.visitTryCatchBlock(arg0.original, arg1.original, arg2.original, arg3);		
	}	
	
	@Selector("visitLocalVariableWithString:withString:withString:withLabel:withLabel:withInt:")	
	public void visitLocalVariableWithStringwithStringwithStringwithLabelwithLabelwithInt(String arg0, String arg1, String arg2, x.org.objectweb.asm.Label arg3, x.org.objectweb.asm.Label arg4, int arg5) {
		original.visitLocalVariable(arg0, arg1, arg2, arg3.original, arg4.original, arg5);		
	}	
	
	@Selector("visitLocalVariableAnnotationWithInt:withTypePath:withLabel:withLabel:withInt:withString:withBoolean:")	
	public Object visitLocalVariableAnnotationWithIntwithTypePathwithLabelwithLabelwithIntwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, org.objectweb.asm.Label[] arg2, org.objectweb.asm.Label[] arg3, int[] arg4, String arg5, boolean arg6) {
		return original.visitLocalVariableAnnotation(arg0, arg1.original, arg2, arg3, arg4, arg5, arg6);		
	}	
	
	@Selector("visitLineNumberWithInt:withLabel:")	
	public void visitLineNumberWithIntwithLabel(int arg0, x.org.objectweb.asm.Label arg1) {		
		original.visitLineNumber(arg0, arg1.original);		
	}	
	
	@Selector("visitMaxsWithInt:withInt:")	
	public void visitMaxsWithIntwithInt(int arg0, int arg1) {		
		original.visitMaxs(arg0, arg1);		
	}	
	
	@Selector("visitMethodEnd")	
	public void visitMethodEnd() {		
		original.visitMethodEnd();		
	}	
	
	@Selector("visitAnnotationWithString:withBoolean:")	
	public ASMifier visitAnnotationWithStringwithBoolean(String arg0, boolean arg1) {
		ASMifier ret = (ASMifier) ASMifier.alloc().init();
		ret.original = original.visitAnnotation(arg0, arg1);		
		return ret;		
	}	
	
	@Selector("visitTypeAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public ASMifier visitTypeAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		ASMifier ret = (ASMifier) ASMifier.alloc().init();
		ret.original = original.visitTypeAnnotation(arg0, arg1.original, arg2, arg3);		
		return ret;		
	}	
	
	@Selector("visitTypeAnnotationWithString:withInt:withTypePath:withString:withBoolean:")	
	public ASMifier visitTypeAnnotationWithStringwithIntwithTypePathwithStringwithBoolean(String arg0, int arg1, x.org.objectweb.asm.TypePath arg2, String arg3, boolean arg4) {
		ASMifier ret = (ASMifier) ASMifier.alloc().init();
		ret.original = original.visitTypeAnnotation(arg0, arg1, arg2.original, arg3, arg4);		
		return ret;		
	}	
	
	@Selector("visitAttributeWithAttribute:")	
	public void visitAttributeWithAttribute(x.org.objectweb.asm.Attribute arg0) {		
		original.visitAttribute(arg0.original);		
	}	
	
	@Selector("visitTryCatchAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Object visitTryCatchAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTryCatchAnnotation(arg0, arg1.original, arg2, arg3);		
	}	
	
	@Selector("visitInsnAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Object visitInsnAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitInsnAnnotation(arg0, arg1.original, arg2, arg3);		
	}	
	
	@Selector("visitParameterAnnotationWithInt:withString:withBoolean:")	
	public Object visitParameterAnnotationWithIntwithStringwithBoolean(int arg0, String arg1, boolean arg2) {
		return original.visitParameterAnnotation(arg0, arg1, arg2);		
	}	
	
	@Selector("visitMethodTypeAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Object visitMethodTypeAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitMethodTypeAnnotation(arg0, arg1.original, arg2, arg3);		
	}	
	
	@Selector("visitMethodAnnotationWithString:withBoolean:")	
	public Object visitMethodAnnotationWithStringwithBoolean(String arg0, boolean arg1) {
		return original.visitMethodAnnotation(arg0, arg1);		
	}	
	
	@Selector("visitAnnotationDefault")	
	public Object visitAnnotationDefault() {
		return original.visitAnnotationDefault();		
	}	
	
	@Selector("visitFieldTypeAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Object visitFieldTypeAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitFieldTypeAnnotation(arg0, arg1.original, arg2, arg3);		
	}	
	
	@Selector("visitFieldAnnotationWithString:withBoolean:")	
	public Object visitFieldAnnotationWithStringwithBoolean(String arg0, boolean arg1) {
		return original.visitFieldAnnotation(arg0, arg1);		
	}	
	
	@Selector("visitArrayWithString:")	
	public Object visitArrayWithString(String arg0) {
		return original.visitArray(arg0);		
	}	
	
	@Selector("visitAnnotationWithString:withString:")	
	public Object visitAnnotationWithStringwithString(String arg0, String arg1) {
		return original.visitAnnotation(arg0, arg1);		
	}	
	
	@Selector("visitMethodWithInt:withString:withString:withString:withString:")	
	public Object visitMethodWithIntwithStringwithStringwithStringwithString(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
		return original.visitMethod(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitFieldWithInt:withString:withString:withString:withObject:")	
	public Object visitFieldWithIntwithStringwithStringwithStringwithObject(int arg0, String arg1, String arg2, String arg3, Object arg4) {
		return original.visitField(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitClassTypeAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Object visitClassTypeAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitClassTypeAnnotation(arg0, arg1.original, arg2, arg3);		
	}	
	
	@Selector("visitClassAnnotationWithString:withBoolean:")	
	public Object visitClassAnnotationWithStringwithBoolean(String arg0, boolean arg1) {
		return original.visitClassAnnotation(arg0, arg1);		
	}	
}
