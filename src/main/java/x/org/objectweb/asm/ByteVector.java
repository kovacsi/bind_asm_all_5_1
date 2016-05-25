package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_ByteVector")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ByteVector extends NSObject {

	private org.objectweb.asm.ByteVector original;

	protected ByteVector(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithInt:")
	public ByteVector valueWithInt(int arg0) {
		ByteVector self = (ByteVector) ByteVector.alloc().init();
		self.original = new org.objectweb.asm.ByteVector(arg0);
		return self;
	}

	@Selector("putByteWithInt:")
	public org.objectweb.asm.ByteVector putByteWithInt(int arg0) {
		return original.putByte(arg0);
	}

	@Selector("putShortWithInt:")
	public org.objectweb.asm.ByteVector putShortWithInt(int arg0) {
		return original.putShort(arg0);
	}

	@Selector("putIntWithInt:")
	public org.objectweb.asm.ByteVector putIntWithInt(int arg0) {
		return original.putInt(arg0);
	}

	@Selector("putLongWithLong:")
	public org.objectweb.asm.ByteVector putLongWithLong(long arg0) {
		return original.putLong(arg0);
	}

	@Selector("putUTF8WithString:")
	public org.objectweb.asm.ByteVector putUTF8WithString(String arg0) {
		return original.putUTF8(arg0);
	}

	@Selector("putByteArrayWithIdWithIntWithInt:::")
	public org.objectweb.asm.ByteVector putByteArrayWithIdWithIntWithInt(byte[] arg0, int arg1, int arg2) {
		return original.putByteArray(arg0, arg1, arg2);
	}

}
