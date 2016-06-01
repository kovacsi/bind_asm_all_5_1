package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBByteVector")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ByteVector extends NSObject {	
	
	public org.objectweb.asm.ByteVector original;	
	
	protected ByteVector(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native ByteVector alloc();	
	
	@Selector("value")	
	public ByteVector value() {		
		ByteVector self = (ByteVector) ByteVector.alloc().init();		
		self.original = new org.objectweb.asm.ByteVector();		
		return self;		
	}	
	
	@Selector("valueWithInt:")	
	public ByteVector valueWithInt(int arg0) {		
		ByteVector self = (ByteVector) ByteVector.alloc().init();		
		self.original = new org.objectweb.asm.ByteVector(arg0);		
		return self;		
	}	
	
	@Selector("putByteWithInt:")	
	public ByteVector putByteWithInt(int arg0) {
		ByteVector ret = (ByteVector) ByteVector.alloc().init();
		ret.original = original.putByte(arg0);		
		return ret;		
	}	
	
	@Selector("putShortWithInt:")	
	public ByteVector putShortWithInt(int arg0) {
		ByteVector ret = (ByteVector) ByteVector.alloc().init();
		ret.original = original.putShort(arg0);		
		return ret;		
	}	
	
	@Selector("putIntWithInt:")	
	public ByteVector putIntWithInt(int arg0) {
		ByteVector ret = (ByteVector) ByteVector.alloc().init();
		ret.original = original.putInt(arg0);		
		return ret;		
	}	
	
	@Selector("putLongWithLong:")	
	public ByteVector putLongWithLong(long arg0) {
		ByteVector ret = (ByteVector) ByteVector.alloc().init();
		ret.original = original.putLong(arg0);		
		return ret;		
	}	
	
	@Selector("putUTF8WithString:")	
	public ByteVector putUTF8WithString(String arg0) {
		ByteVector ret = (ByteVector) ByteVector.alloc().init();
		ret.original = original.putUTF8(arg0);		
		return ret;		
	}	
	
	@Selector("putByteArrayWithByte:withInt:withInt:")	
	public ByteVector putByteArrayWithBytewithIntwithInt(byte[] arg0, int arg1, int arg2) {
		ByteVector ret = (ByteVector) ByteVector.alloc().init();
		ret.original = original.putByteArray(arg0, arg1, arg2);		
		return ret;		
	}	
}
