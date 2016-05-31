package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_ClassReader")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ClassReader extends NSObject {	
	
	public org.objectweb.asm.ClassReader original;	
	
	protected ClassReader(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithByte:")	
	public ClassReader value(byte[] arg0) {		
		ClassReader self = (ClassReader) ClassReader.alloc().init();		
		self.original = new org.objectweb.asm.ClassReader(arg0);		
		return self;		
	}	
	
	@Selector("valueWithByte:withInt:withInt:")	
	public ClassReader value(byte[] arg0, int arg1, int arg2) {		
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
	
	@Selector("valueWithInputStream:")	
	public ClassReader value(java.io.InputStream arg0) throws java.io.IOException {		
		ClassReader self = (ClassReader) ClassReader.alloc().init();		
		self.original = new org.objectweb.asm.ClassReader(arg0);		
		return self;		
	}	
	
	@Selector("valueWithString:")	
	public ClassReader value(String arg0) throws java.io.IOException {
		ClassReader self = (ClassReader) ClassReader.alloc().init();		
		self.original = new org.objectweb.asm.ClassReader(arg0);		
		return self;		
	}	
	
	@Selector("getItemCount")	
	public int getItemCount() {		
		return original.getItemCount();		
	}	
	
	@Selector("getItemWithInt:")	
	public int getItem(int arg0) {		
		return original.getItem(arg0);		
	}	
	
	@Selector("getMaxStringLength")	
	public int getMaxStringLength() {		
		return original.getMaxStringLength();		
	}	
	
	@Selector("readByteWithInt:")	
	public int readByte(int arg0) {		
		return original.readByte(arg0);		
	}	
	
	@Selector("readUnsignedShortWithInt:")	
	public int readUnsignedShort(int arg0) {		
		return original.readUnsignedShort(arg0);		
	}	
	
	@Selector("readShortWithInt:")	
	public short readShort(int arg0) {		
		return original.readShort(arg0);		
	}	
	
	@Selector("readIntWithInt:")	
	public int readInt(int arg0) {		
		return original.readInt(arg0);		
	}	
	
	@Selector("readLongWithInt:")	
	public long readLong(int arg0) {		
		return original.readLong(arg0);		
	}	
	
	@Selector("readUTF8WithInt:withChar:")	
	public String readUTF8(int arg0, char[] arg1) {
		return original.readUTF8(arg0, arg1);		
	}	
	
	@Selector("readClassWithInt:withChar:")	
	public String readClass(int arg0, char[] arg1) {
		return original.readClass(arg0, arg1);		
	}	
	
	@Selector("readConstWithInt:withChar:")	
	public Object readConst(int arg0, char[] arg1) {
		return original.readConst(arg0, arg1);		
	}	
}
