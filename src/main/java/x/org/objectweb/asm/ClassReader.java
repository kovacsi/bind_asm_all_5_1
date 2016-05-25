package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_ClassReader")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ClassReader extends NSObject {

	private org.objectweb.asm.ClassReader original;

	protected ClassReader(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithId:")
	public ClassReader valueWithId(byte[] arg0) {
		ClassReader self = (ClassReader) ClassReader.alloc().init();
		self.original = new org.objectweb.asm.ClassReader(arg0);
		return self;
	}

	@Selector("valueWithIdWithIntWithInt:::")
	public ClassReader valueWithIdWithIntWithInt(byte[] arg0, int arg1, int arg2) {
		ClassReader self = (ClassReader) ClassReader.alloc().init();
		self.original = new org.objectweb.asm.ClassReader(arg0, arg1, arg2);
		return self;
	}

	@Selector("getAccess")
	public int getAccess() {
		return original.getAccess();
	}

	@Selector("getClassName")
	public String getClassName() {
		return original.getClassName();
	}

	@Selector("getSuperName")
	public String getSuperName() {
		return original.getSuperName();
	}

	@Selector("getInterfaces")
	public String[] getInterfaces() {
		return original.getInterfaces();
	}

	@Selector("valueWithId:")
	public ClassReader valueWithId(java.io.InputStream arg0) throws java.io.IOException {
		ClassReader self = (ClassReader) ClassReader.alloc().init();
		self.original = new org.objectweb.asm.ClassReader(arg0);
		return self;
	}

	@Selector("valueWithString:")
	public ClassReader valueWithString(String arg0) throws java.io.IOException {
		ClassReader self = (ClassReader) ClassReader.alloc().init();
		self.original = new org.objectweb.asm.ClassReader(arg0);
		return self;
	}

	@Selector("acceptWithIdWithInt::")
	public void acceptWithIdWithInt(org.objectweb.asm.ClassVisitor arg0, int arg1) {
		original.accept(arg0, arg1);
	}

	@Selector("acceptWithIdWithIdWithInt:::")
	public void acceptWithIdWithIdWithInt(org.objectweb.asm.ClassVisitor arg0, org.objectweb.asm.Attribute[] arg1, int arg2) {
		original.accept(arg0, arg1, arg2);
	}

	@Selector("getItemCount")
	public int getItemCount() {
		return original.getItemCount();
	}

	@Selector("getItemWithInt:")
	public int getItemWithInt(int arg0) {
		return original.getItem(arg0);
	}

	@Selector("getMaxStringLength")
	public int getMaxStringLength() {
		return original.getMaxStringLength();
	}

	@Selector("readByteWithInt:")
	public int readByteWithInt(int arg0) {
		return original.readByte(arg0);
	}

	@Selector("readUnsignedShortWithInt:")
	public int readUnsignedShortWithInt(int arg0) {
		return original.readUnsignedShort(arg0);
	}

	@Selector("readShortWithInt:")
	public short readShortWithInt(int arg0) {
		return original.readShort(arg0);
	}

	@Selector("readIntWithInt:")
	public int readIntWithInt(int arg0) {
		return original.readInt(arg0);
	}

	@Selector("readLongWithInt:")
	public long readLongWithInt(int arg0) {
		return original.readLong(arg0);
	}

	@Selector("readUTF8WithIntWithId::")
	public String readUTF8WithIntWithId(int arg0, char[] arg1) {
		return original.readUTF8(arg0, arg1);
	}

	@Selector("readClassWithIntWithId::")
	public String readClassWithIntWithId(int arg0, char[] arg1) {
		return original.readClass(arg0, arg1);
	}

	@Selector("readConstWithIntWithId::")
	public Object readConstWithIntWithId(int arg0, char[] arg1) {
		return original.readConst(arg0, arg1);
	}

}
