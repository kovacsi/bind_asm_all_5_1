package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBRemappingFieldAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class RemappingFieldAdapter extends NSObject {	
	
	public org.objectweb.asm.commons.RemappingFieldAdapter original;	
	
	protected RemappingFieldAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native RemappingFieldAdapter alloc();	
	
	@Selector("valueWithFieldVisitor:withRemapper:")	
	public RemappingFieldAdapter valueWithFieldVisitorwithRemapper(Object arg0, Object arg1) {
		RemappingFieldAdapter self = (RemappingFieldAdapter) RemappingFieldAdapter.alloc().init();		
		self.original = new org.objectweb.asm.commons.RemappingFieldAdapter((org.objectweb.asm.FieldVisitor) arg0, (org.objectweb.asm.commons.Remapper) arg1);		
		return self;		
	}	
	
	@Selector("visitAnnotationWithString:withBoolean:")	
	public Object visitAnnotationWithStringwithBoolean(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);		
	}	
	
	@Selector("visitTypeAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Object visitTypeAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1.original, arg2, arg3);		
	}	
}
