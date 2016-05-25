package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_Type")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Type extends NSObject {

	private org.objectweb.asm.Type original;

	protected Type(Pointer peer) {
		super(peer);
	}

	@Selector("getTypeWithString:")
	public static org.objectweb.asm.Type getTypeWithString(String arg0) {
		return org.objectweb.asm.Type.getType(arg0);
	}

	@Selector("getObjectTypeWithString:")
	public static org.objectweb.asm.Type getObjectTypeWithString(String arg0) {
		return org.objectweb.asm.Type.getObjectType(arg0);
	}

	@Selector("getMethodTypeWithString:")
	public static org.objectweb.asm.Type getMethodTypeWithString(String arg0) {
		return org.objectweb.asm.Type.getMethodType(arg0);
	}

	@Selector("getMethodTypeWithIdWithId::")
	public static org.objectweb.asm.Type getMethodTypeWithIdWithId(org.objectweb.asm.Type arg0, org.objectweb.asm.Type[] arg1) {
		return org.objectweb.asm.Type.getMethodType(arg0, arg1);
	}

	@Selector("getTypeWithId:")
	public static org.objectweb.asm.Type getTypeWithId(Class arg0) {
		return org.objectweb.asm.Type.getType(arg0);
	}

	@Selector("getTypeWithId:")
	public static org.objectweb.asm.Type getTypeWithId(java.lang.reflect.Constructor arg0) {
		return org.objectweb.asm.Type.getType(arg0);
	}

	@Selector("getTypeWithId:")
	public static org.objectweb.asm.Type getTypeWithId(java.lang.reflect.Method arg0) {
		return org.objectweb.asm.Type.getType(arg0);
	}

	@Selector("getArgumentTypesWithString:")
	public static org.objectweb.asm.Type[] getArgumentTypesWithString(String arg0) {
		return org.objectweb.asm.Type.getArgumentTypes(arg0);
	}

	@Selector("getArgumentTypesWithId:")
	public static org.objectweb.asm.Type[] getArgumentTypesWithId(java.lang.reflect.Method arg0) {
		return org.objectweb.asm.Type.getArgumentTypes(arg0);
	}

	@Selector("getReturnTypeWithString:")
	public static org.objectweb.asm.Type getReturnTypeWithString(String arg0) {
		return org.objectweb.asm.Type.getReturnType(arg0);
	}

	@Selector("getReturnTypeWithId:")
	public static org.objectweb.asm.Type getReturnTypeWithId(java.lang.reflect.Method arg0) {
		return org.objectweb.asm.Type.getReturnType(arg0);
	}

	@Selector("getArgumentsAndReturnSizesWithString:")
	public static int getArgumentsAndReturnSizesWithString(String arg0) {
		return org.objectweb.asm.Type.getArgumentsAndReturnSizes(arg0);
	}

	@Selector("getSort")
	public int getSort() {
		return original.getSort();
	}

	@Selector("getDimensions")
	public int getDimensions() {
		return original.getDimensions();
	}

	@Selector("getElementType")
	public org.objectweb.asm.Type getElementType() {
		return original.getElementType();
	}

	@Selector("getClassName")
	public String getClassName() {
		return original.getClassName();
	}

	@Selector("getInternalName")
	public String getInternalName() {
		return original.getInternalName();
	}

	@Selector("getArgumentTypes")
	public org.objectweb.asm.Type[] getArgumentTypes() {
		return original.getArgumentTypes();
	}

	@Selector("getReturnType")
	public org.objectweb.asm.Type getReturnType() {
		return original.getReturnType();
	}

	@Selector("getArgumentsAndReturnSizes")
	public int getArgumentsAndReturnSizes() {
		return original.getArgumentsAndReturnSizes();
	}

	@Selector("getDescriptor")
	public String getDescriptor() {
		return original.getDescriptor();
	}

	@Selector("getMethodDescriptorWithIdWithId::")
	public static String getMethodDescriptorWithIdWithId(org.objectweb.asm.Type arg0, org.objectweb.asm.Type[] arg1) {
		return org.objectweb.asm.Type.getMethodDescriptor(arg0, arg1);
	}

	@Selector("getInternalNameWithId:")
	public static String getInternalNameWithId(Class arg0) {
		return org.objectweb.asm.Type.getInternalName(arg0);
	}

	@Selector("getDescriptorWithId:")
	public static String getDescriptorWithId(Class arg0) {
		return org.objectweb.asm.Type.getDescriptor(arg0);
	}

	@Selector("getConstructorDescriptorWithId:")
	public static String getConstructorDescriptorWithId(java.lang.reflect.Constructor arg0) {
		return org.objectweb.asm.Type.getConstructorDescriptor(arg0);
	}

	@Selector("getMethodDescriptorWithId:")
	public static String getMethodDescriptorWithId(java.lang.reflect.Method arg0) {
		return org.objectweb.asm.Type.getMethodDescriptor(arg0);
	}

	@Selector("getSize")
	public int getSize() {
		return original.getSize();
	}

	@Selector("getOpcodeWithInt:")
	public int getOpcodeWithInt(int arg0) {
		return original.getOpcode(arg0);
	}

	@Selector("equalsWithObject:")
	public boolean equalsWithObject(Object arg0) {
		return original.equals(arg0);
	}

	@Selector("hashCode")
	public int hashCode() {
		return original.hashCode();
	}

	@Selector("toString")
	public String toString() {
		return original.toString();
	}

}
