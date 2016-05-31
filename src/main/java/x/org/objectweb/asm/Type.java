package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_Type")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Type extends NSObject {	
	
	public org.objectweb.asm.Type original;	
	
	protected Type(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("getTypeWithString:")	
	public static Type getType(String arg0) {
		Type ret = (Type) Type.alloc().init();
		ret.original = org.objectweb.asm.Type.getType(arg0);		
		return ret;		
	}	
	
	@Selector("getObjectTypeWithString:")	
	public static Type getObjectType(String arg0) {
		Type ret = (Type) Type.alloc().init();
		ret.original = org.objectweb.asm.Type.getObjectType(arg0);		
		return ret;		
	}	
	
	@Selector("getMethodTypeWithString:")	
	public static Type getMethodType(String arg0) {
		Type ret = (Type) Type.alloc().init();
		ret.original = org.objectweb.asm.Type.getMethodType(arg0);		
		return ret;		
	}	
	
	@Selector("getMethodTypeWithType:withType:")	
	public static Type getMethodType(org.objectweb.asm.Type arg0, org.objectweb.asm.Type[] arg1) {
		Type ret = (Type) Type.alloc().init();
		ret.original = org.objectweb.asm.Type.getMethodType(arg0, arg1);		
		return ret;		
	}	
	
	@Selector("getTypeWithClass:")	
	public static Type getType(Class arg0) {
		Type ret = (Type) Type.alloc().init();
		ret.original = org.objectweb.asm.Type.getType(arg0);		
		return ret;		
	}	
	
	@Selector("getTypeWithConstructor:")	
	public static Type getType(java.lang.reflect.Constructor arg0) {
		Type ret = (Type) Type.alloc().init();
		ret.original = org.objectweb.asm.Type.getType(arg0);		
		return ret;		
	}	
	
	@Selector("getTypeWithMethod:")	
	public static Type getType(java.lang.reflect.Method arg0) {
		Type ret = (Type) Type.alloc().init();
		ret.original = org.objectweb.asm.Type.getType(arg0);		
		return ret;		
	}	
	
	@Selector("getArgumentTypesWithString:")	
	public static org.objectweb.asm.Type[] getArgumentTypes(String arg0) {
		return org.objectweb.asm.Type.getArgumentTypes(arg0);		
	}	
	
	@Selector("getArgumentTypesWithMethod:")	
	public static org.objectweb.asm.Type[] getArgumentTypes(java.lang.reflect.Method arg0) {		
		return org.objectweb.asm.Type.getArgumentTypes(arg0);		
	}	
	
	@Selector("getReturnTypeWithString:")	
	public static Type getReturnType(String arg0) {
		Type ret = (Type) Type.alloc().init();
		ret.original = org.objectweb.asm.Type.getReturnType(arg0);		
		return ret;		
	}	
	
	@Selector("getReturnTypeWithMethod:")	
	public static Type getReturnType(java.lang.reflect.Method arg0) {
		Type ret = (Type) Type.alloc().init();
		ret.original = org.objectweb.asm.Type.getReturnType(arg0);		
		return ret;		
	}	
	
	@Selector("getArgumentsAndReturnSizesWithString:")	
	public static int getArgumentsAndReturnSizes(String arg0) {
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
	public Type getElementType() {
		Type ret = (Type) Type.alloc().init();
		ret.original = original.getElementType();		
		return ret;		
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
	public Type getReturnType() {
		Type ret = (Type) Type.alloc().init();
		ret.original = original.getReturnType();		
		return ret;		
	}	
	
	@Selector("getArgumentsAndReturnSizes")	
	public int getArgumentsAndReturnSizes() {		
		return original.getArgumentsAndReturnSizes();		
	}	
	
	@Selector("getDescriptor")	
	public String getDescriptor() {
		return original.getDescriptor();		
	}	
	
	@Selector("getMethodDescriptorWithType:withType:")	
	public static String getMethodDescriptor(org.objectweb.asm.Type arg0, org.objectweb.asm.Type[] arg1) {
		return org.objectweb.asm.Type.getMethodDescriptor(arg0, arg1);		
	}	
	
	@Selector("getInternalNameWithClass:")	
	public static String getInternalName(Class arg0) {
		return org.objectweb.asm.Type.getInternalName(arg0);		
	}	
	
	@Selector("getDescriptorWithClass:")	
	public static String getDescriptor(Class arg0) {
		return org.objectweb.asm.Type.getDescriptor(arg0);		
	}	
	
	@Selector("getConstructorDescriptorWithConstructor:")	
	public static String getConstructorDescriptor(java.lang.reflect.Constructor arg0) {
		return org.objectweb.asm.Type.getConstructorDescriptor(arg0);		
	}	
	
	@Selector("getMethodDescriptorWithMethod:")	
	public static String getMethodDescriptor(java.lang.reflect.Method arg0) {
		return org.objectweb.asm.Type.getMethodDescriptor(arg0);		
	}	
	
	@Selector("getSize")	
	public int getSize() {		
		return original.getSize();		
	}	
	
	@Selector("getOpcodeWithInt:")	
	public int getOpcode(int arg0) {		
		return original.getOpcode(arg0);		
	}	
	
	@Selector("equalsWithObject:")	
	public boolean equals(Object arg0) {
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
