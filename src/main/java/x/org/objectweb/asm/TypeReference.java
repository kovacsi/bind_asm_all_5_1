package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_TypeReference")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TypeReference extends NSObject {	
	
	public org.objectweb.asm.TypeReference original;	
	
	protected TypeReference(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithInt:")	
	public TypeReference value(int arg0) {		
		TypeReference self = (TypeReference) TypeReference.alloc().init();		
		self.original = new org.objectweb.asm.TypeReference(arg0);		
		return self;		
	}	
	
	@Selector("newTypeReferenceWithInt:")	
	public static TypeReference newTypeReference(int arg0) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newTypeReference(arg0);		
		return ret;		
	}	
	
	@Selector("newTypeParameterReferenceWithInt:withInt:")	
	public static TypeReference newTypeParameterReference(int arg0, int arg1) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newTypeParameterReference(arg0, arg1);		
		return ret;		
	}	
	
	@Selector("newTypeParameterBoundReferenceWithInt:withInt:withInt:")	
	public static TypeReference newTypeParameterBoundReference(int arg0, int arg1, int arg2) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newTypeParameterBoundReference(arg0, arg1, arg2);		
		return ret;		
	}	
	
	@Selector("newSuperTypeReferenceWithInt:")	
	public static TypeReference newSuperTypeReference(int arg0) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newSuperTypeReference(arg0);		
		return ret;		
	}	
	
	@Selector("newFormalParameterReferenceWithInt:")	
	public static TypeReference newFormalParameterReference(int arg0) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newFormalParameterReference(arg0);		
		return ret;		
	}	
	
	@Selector("newExceptionReferenceWithInt:")	
	public static TypeReference newExceptionReference(int arg0) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newExceptionReference(arg0);		
		return ret;		
	}	
	
	@Selector("newTryCatchReferenceWithInt:")	
	public static TypeReference newTryCatchReference(int arg0) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newTryCatchReference(arg0);		
		return ret;		
	}	
	
	@Selector("newTypeArgumentReferenceWithInt:withInt:")	
	public static TypeReference newTypeArgumentReference(int arg0, int arg1) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newTypeArgumentReference(arg0, arg1);		
		return ret;		
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
