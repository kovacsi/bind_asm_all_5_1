package x.org.objectweb.asm.util;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_util_TraceSignatureVisitor")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TraceSignatureVisitor extends NSObject {	
	
	public org.objectweb.asm.util.TraceSignatureVisitor original;	
	
	protected TraceSignatureVisitor(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:")	
	public TraceSignatureVisitor value(int arg0) {		
		TraceSignatureVisitor self = (TraceSignatureVisitor) TraceSignatureVisitor.alloc().init();		
		self.original = new org.objectweb.asm.util.TraceSignatureVisitor(arg0);		
		return self;		
	}	
	
	@Selector("visitFormalTypeParameterWithString:")	
	public void visitFormalTypeParameter(String arg0) {
		original.visitFormalTypeParameter(arg0);		
	}	
	
	@Selector("visitBaseTypeWithChar:")	
	public void visitBaseType(char arg0) {		
		original.visitBaseType(arg0);		
	}	
	
	@Selector("visitTypeVariableWithString:")	
	public void visitTypeVariable(String arg0) {
		original.visitTypeVariable(arg0);		
	}	
	
	@Selector("visitClassTypeWithString:")	
	public void visitClassType(String arg0) {
		original.visitClassType(arg0);		
	}	
	
	@Selector("visitInnerClassTypeWithString:")	
	public void visitInnerClassType(String arg0) {
		original.visitInnerClassType(arg0);		
	}	
	
	@Selector("visitTypeArgument")	
	public void visitTypeArgument() {		
		original.visitTypeArgument();		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
	
	@Selector("getDeclaration")	
	public String getDeclaration() {
		return original.getDeclaration();		
	}	
	
	@Selector("getReturnType")	
	public String getReturnType() {
		return original.getReturnType();		
	}	
	
	@Selector("getExceptions")	
	public String getExceptions() {
		return original.getExceptions();		
	}	
}
