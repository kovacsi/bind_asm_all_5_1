package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("SignatureRemapper")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SignatureRemapper extends NSObject {	
	
	public org.objectweb.asm.commons.SignatureRemapper original;	
	
	protected SignatureRemapper(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithSignatureVisitor:withRemapper:")	
	public SignatureRemapper valueWithSignatureVisitorwithRemapper(Object arg0, Object arg1) {
		SignatureRemapper self = (SignatureRemapper) SignatureRemapper.alloc().init();		
		self.original = new org.objectweb.asm.commons.SignatureRemapper((org.objectweb.asm.signature.SignatureVisitor) arg0, (org.objectweb.asm.commons.Remapper) arg1);		
		return self;		
	}	
	
	@Selector("visitClassTypeWithString:")	
	public void visitClassTypeWithString(String arg0) {
		original.visitClassType(arg0);		
	}	
	
	@Selector("visitInnerClassTypeWithString:")	
	public void visitInnerClassTypeWithString(String arg0) {
		original.visitInnerClassType(arg0);		
	}	
	
	@Selector("visitFormalTypeParameterWithString:")	
	public void visitFormalTypeParameterWithString(String arg0) {
		original.visitFormalTypeParameter(arg0);		
	}	
	
	@Selector("visitTypeVariableWithString:")	
	public void visitTypeVariableWithString(String arg0) {
		original.visitTypeVariable(arg0);		
	}	
	
	@Selector("visitArrayType")	
	public Object visitArrayType() {
		return original.visitArrayType();		
	}	
	
	@Selector("visitBaseTypeWithChar:")	
	public void visitBaseTypeWithChar(char arg0) {		
		original.visitBaseType(arg0);		
	}	
	
	@Selector("visitClassBound")	
	public Object visitClassBound() {
		return original.visitClassBound();		
	}	
	
	@Selector("visitExceptionType")	
	public Object visitExceptionType() {
		return original.visitExceptionType();		
	}	
	
	@Selector("visitInterface")	
	public Object visitInterface() {
		return original.visitInterface();		
	}	
	
	@Selector("visitInterfaceBound")	
	public Object visitInterfaceBound() {
		return original.visitInterfaceBound();		
	}	
	
	@Selector("visitParameterType")	
	public Object visitParameterType() {
		return original.visitParameterType();		
	}	
	
	@Selector("visitReturnType")	
	public Object visitReturnType() {
		return original.visitReturnType();		
	}	
	
	@Selector("visitSuperclass")	
	public Object visitSuperclass() {
		return original.visitSuperclass();		
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
}
