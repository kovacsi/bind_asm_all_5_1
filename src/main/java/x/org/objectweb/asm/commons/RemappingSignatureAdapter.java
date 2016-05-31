package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_commons_RemappingSignatureAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class RemappingSignatureAdapter extends NSObject {	
	
	public org.objectweb.asm.commons.RemappingSignatureAdapter original;	
	
	protected RemappingSignatureAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("visitClassTypeWithString:")	
	public void visitClassType(String arg0) {
		original.visitClassType(arg0);		
	}	
	
	@Selector("visitInnerClassTypeWithString:")	
	public void visitInnerClassType(String arg0) {
		original.visitInnerClassType(arg0);		
	}	
	
	@Selector("visitFormalTypeParameterWithString:")	
	public void visitFormalTypeParameter(String arg0) {
		original.visitFormalTypeParameter(arg0);		
	}	
	
	@Selector("visitTypeVariableWithString:")	
	public void visitTypeVariable(String arg0) {
		original.visitTypeVariable(arg0);		
	}	
	
	@Selector("visitBaseTypeWithChar:")	
	public void visitBaseType(char arg0) {		
		original.visitBaseType(arg0);		
	}	
	
	@Selector("visitTypeArgument")	
	public void visitTypeArgument() {		
		original.visitTypeArgument();		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
}
