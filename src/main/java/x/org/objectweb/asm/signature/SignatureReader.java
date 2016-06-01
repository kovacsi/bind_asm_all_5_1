package x.org.objectweb.asm.signature;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBSignatureReader")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SignatureReader extends NSObject {	
	
	public org.objectweb.asm.signature.SignatureReader original;	
	
	protected SignatureReader(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native SignatureReader alloc();	
	
	@Selector("valueWithString:")	
	public SignatureReader valueWithString(String arg0) {
		SignatureReader self = (SignatureReader) SignatureReader.alloc().init();		
		self.original = new org.objectweb.asm.signature.SignatureReader(arg0);		
		return self;		
	}	
	
	@Selector("acceptWithSignatureVisitor:")	
	public void acceptWithSignatureVisitor(Object arg0) {
		original.accept((org.objectweb.asm.signature.SignatureVisitor) arg0);		
	}	
	
	@Selector("acceptTypeWithSignatureVisitor:")	
	public void acceptTypeWithSignatureVisitor(Object arg0) {
		original.acceptType((org.objectweb.asm.signature.SignatureVisitor) arg0);		
	}	
}
