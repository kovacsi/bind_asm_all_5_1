package x.org.objectweb.asm.signature;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("SignatureWriter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SignatureWriter extends NSObject {	
	
	public org.objectweb.asm.signature.SignatureWriter original;	
	
	protected SignatureWriter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("value")	
	public SignatureWriter value() {		
		SignatureWriter self = (SignatureWriter) SignatureWriter.alloc().init();		
		self.original = new org.objectweb.asm.signature.SignatureWriter();		
		return self;		
	}	
	
	@Selector("visitFormalTypeParameterWithString:")	
	public void visitFormalTypeParameterWithString(String arg0) {
		original.visitFormalTypeParameter(arg0);		
	}	
	
	@Selector("visitClassBound")	
	public Object visitClassBound() {
		return original.visitClassBound();		
	}	
	
	@Selector("visitInterfaceBound")	
	public Object visitInterfaceBound() {
		return original.visitInterfaceBound();		
	}	
	
	@Selector("visitSuperclass")	
	public Object visitSuperclass() {
		return original.visitSuperclass();		
	}	
	
	@Selector("visitInterface")	
	public Object visitInterface() {
		return original.visitInterface();		
	}	
	
	@Selector("visitParameterType")	
	public Object visitParameterType() {
		return original.visitParameterType();		
	}	
	
	@Selector("visitReturnType")	
	public Object visitReturnType() {
		return original.visitReturnType();		
	}	
	
	@Selector("visitExceptionType")	
	public Object visitExceptionType() {
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
	public Object visitArrayType() {
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
	public Object visitTypeArgumentWithChar(char arg0) {
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
