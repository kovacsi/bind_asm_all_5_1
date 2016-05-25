package x.org.objectweb.asm.signature;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_signature_SignatureWriter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SignatureWriter extends NSObject {

	private org.objectweb.asm.signature.SignatureWriter original;

	protected SignatureWriter(Pointer peer) {
		super(peer);
	}

	@Selector("visitFormalTypeParameterWithString:")
	public void visitFormalTypeParameterWithString(String arg0) {
		original.visitFormalTypeParameter(arg0);
	}

	@Selector("visitClassBound")
	public org.objectweb.asm.signature.SignatureVisitor visitClassBound() {
		return original.visitClassBound();
	}

	@Selector("visitInterfaceBound")
	public org.objectweb.asm.signature.SignatureVisitor visitInterfaceBound() {
		return original.visitInterfaceBound();
	}

	@Selector("visitSuperclass")
	public org.objectweb.asm.signature.SignatureVisitor visitSuperclass() {
		return original.visitSuperclass();
	}

	@Selector("visitInterface")
	public org.objectweb.asm.signature.SignatureVisitor visitInterface() {
		return original.visitInterface();
	}

	@Selector("visitParameterType")
	public org.objectweb.asm.signature.SignatureVisitor visitParameterType() {
		return original.visitParameterType();
	}

	@Selector("visitReturnType")
	public org.objectweb.asm.signature.SignatureVisitor visitReturnType() {
		return original.visitReturnType();
	}

	@Selector("visitExceptionType")
	public org.objectweb.asm.signature.SignatureVisitor visitExceptionType() {
		return original.visitExceptionType();
	}

	@Selector("visitBaseTypeWithChar:")
	public void visitBaseTypeWithChar(char arg0) {
		original.visitBaseType(arg0);
	}

	@Selector("visitTypeVariableWithString:")
	public void visitTypeVariableWithString(String arg0) {
		original.visitTypeVariable(arg0);
	}

	@Selector("visitArrayType")
	public org.objectweb.asm.signature.SignatureVisitor visitArrayType() {
		return original.visitArrayType();
	}

	@Selector("visitClassTypeWithString:")
	public void visitClassTypeWithString(String arg0) {
		original.visitClassType(arg0);
	}

	@Selector("visitInnerClassTypeWithString:")
	public void visitInnerClassTypeWithString(String arg0) {
		original.visitInnerClassType(arg0);
	}

	@Selector("visitTypeArgument")
	public void visitTypeArgument() {
		original.visitTypeArgument();
	}

	@Selector("visitTypeArgumentWithChar:")
	public org.objectweb.asm.signature.SignatureVisitor visitTypeArgumentWithChar(char arg0) {
		return original.visitTypeArgument(arg0);
	}

	@Selector("visitEnd")
	public void visitEnd() {
		original.visitEnd();
	}

	@Selector("toString")
	public String toString() {
		return original.toString();
	}

}
