package x.org.objectweb.asm.signature;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_signature_SignatureReader")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SignatureReader extends NSObject {

	private org.objectweb.asm.signature.SignatureReader original;

	protected SignatureReader(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithString:")
	public SignatureReader valueWithString(String arg0) {
		SignatureReader self = (SignatureReader) SignatureReader.alloc().init();
		self.original = new org.objectweb.asm.signature.SignatureReader(arg0);
		return self;
	}

	@Selector("acceptWithSignatureVisitor:")
	public void acceptWithSignatureVisitor(org.objectweb.asm.signature.SignatureVisitor arg0) {
		original.accept(arg0);
	}

	@Selector("acceptTypeWithSignatureVisitor:")
	public void acceptTypeWithSignatureVisitor(org.objectweb.asm.signature.SignatureVisitor arg0) {
		original.acceptType(arg0);
	}

}
