package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBTypeReference")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TypeReference extends NSObject {	
	
	public org.objectweb.asm.TypeReference original;	
	
	protected TypeReference(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native TypeReference alloc();	
	
	@Selector("valueWithInt:")	
	public TypeReference valueWithInt(int arg0) {		
		TypeReference self = (TypeReference) TypeReference.alloc().init();		
		self.original = new org.objectweb.asm.TypeReference(arg0);		
		return self;		
	}	
	
	@Selector("newTypeReferenceWithInt:")	
	public static TypeReference newTypeReferenceWithInt(int arg0) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newTypeReference(arg0);		
		return ret;		
	}	
	
	@Selector("newTypeParameterReferenceWithInt:withInt:")	
	public static TypeReference newTypeParameterReferenceWithIntwithInt(int arg0, int arg1) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newTypeParameterReference(arg0, arg1);		
		return ret;		
	}	
	
	@Selector("newTypeParameterBoundReferenceWithInt:withInt:withInt:")	
	public static TypeReference newTypeParameterBoundReferenceWithIntwithIntwithInt(int arg0, int arg1, int arg2) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newTypeParameterBoundReference(arg0, arg1, arg2);		
		return ret;		
	}	
	
	@Selector("newSuperTypeReferenceWithInt:")	
	public static TypeReference newSuperTypeReferenceWithInt(int arg0) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newSuperTypeReference(arg0);		
		return ret;		
	}	
	
	@Selector("newFormalParameterReferenceWithInt:")	
	public static TypeReference newFormalParameterReferenceWithInt(int arg0) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newFormalParameterReference(arg0);		
		return ret;		
	}	
	
	@Selector("newExceptionReferenceWithInt:")	
	public static TypeReference newExceptionReferenceWithInt(int arg0) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newExceptionReference(arg0);		
		return ret;		
	}	
	
	@Selector("newTryCatchReferenceWithInt:")	
	public static TypeReference newTryCatchReferenceWithInt(int arg0) {
		TypeReference ret = (TypeReference) TypeReference.alloc().init();
		ret.original = org.objectweb.asm.TypeReference.newTryCatchReference(arg0);		
		return ret;		
	}	
	
	@Selector("newTypeArgumentReferenceWithInt:withInt:")	
	public static TypeReference newTypeArgumentReferenceWithIntwithInt(int arg0, int arg1) {
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
