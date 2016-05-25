package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_TypeReference")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TypeReference extends NSObject {

	private org.objectweb.asm.TypeReference original;

	protected TypeReference(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithInt:")
	public TypeReference valueWithInt(int arg0) {
		TypeReference self = (TypeReference) TypeReference.alloc().init();
		self.original = new org.objectweb.asm.TypeReference(arg0);
		return self;
	}

	@Selector("newTypeReferenceWithInt:")
	public static org.objectweb.asm.TypeReference newTypeReferenceWithInt(int arg0) {
		return org.objectweb.asm.TypeReference.newTypeReference(arg0);
	}

	@Selector("newTypeParameterReferenceWithIntWithInt::")
	public static org.objectweb.asm.TypeReference newTypeParameterReferenceWithIntWithInt(int arg0, int arg1) {
		return org.objectweb.asm.TypeReference.newTypeParameterReference(arg0, arg1);
	}

	@Selector("newTypeParameterBoundReferenceWithIntWithIntWithInt:::")
	public static org.objectweb.asm.TypeReference newTypeParameterBoundReferenceWithIntWithIntWithInt(int arg0, int arg1, int arg2) {
		return org.objectweb.asm.TypeReference.newTypeParameterBoundReference(arg0, arg1, arg2);
	}

	@Selector("newSuperTypeReferenceWithInt:")
	public static org.objectweb.asm.TypeReference newSuperTypeReferenceWithInt(int arg0) {
		return org.objectweb.asm.TypeReference.newSuperTypeReference(arg0);
	}

	@Selector("newFormalParameterReferenceWithInt:")
	public static org.objectweb.asm.TypeReference newFormalParameterReferenceWithInt(int arg0) {
		return org.objectweb.asm.TypeReference.newFormalParameterReference(arg0);
	}

	@Selector("newExceptionReferenceWithInt:")
	public static org.objectweb.asm.TypeReference newExceptionReferenceWithInt(int arg0) {
		return org.objectweb.asm.TypeReference.newExceptionReference(arg0);
	}

	@Selector("newTryCatchReferenceWithInt:")
	public static org.objectweb.asm.TypeReference newTryCatchReferenceWithInt(int arg0) {
		return org.objectweb.asm.TypeReference.newTryCatchReference(arg0);
	}

	@Selector("newTypeArgumentReferenceWithIntWithInt::")
	public static org.objectweb.asm.TypeReference newTypeArgumentReferenceWithIntWithInt(int arg0, int arg1) {
		return org.objectweb.asm.TypeReference.newTypeArgumentReference(arg0, arg1);
	}

	@Selector("getSort")
	public int getSort() {
		return original.getSort();
	}

	@Selector("getTypeParameterIndex")
	public int getTypeParameterIndex() {
		return original.getTypeParameterIndex();
	}

	@Selector("getTypeParameterBoundIndex")
	public int getTypeParameterBoundIndex() {
		return original.getTypeParameterBoundIndex();
	}

	@Selector("getSuperTypeIndex")
	public int getSuperTypeIndex() {
		return original.getSuperTypeIndex();
	}

	@Selector("getFormalParameterIndex")
	public int getFormalParameterIndex() {
		return original.getFormalParameterIndex();
	}

	@Selector("getExceptionIndex")
	public int getExceptionIndex() {
		return original.getExceptionIndex();
	}

	@Selector("getTryCatchBlockIndex")
	public int getTryCatchBlockIndex() {
		return original.getTryCatchBlockIndex();
	}

	@Selector("getTypeArgumentIndex")
	public int getTypeArgumentIndex() {
		return original.getTypeArgumentIndex();
	}

	@Selector("getValue")
	public int getValue() {
		return original.getValue();
	}

}
