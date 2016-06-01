package x.org.objectweb.asm.xml;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBSAXAnnotationAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SAXAnnotationAdapter extends NSObject {	
	
	public org.objectweb.asm.xml.SAXAnnotationAdapter original;	
	
	protected SAXAnnotationAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native SAXAnnotationAdapter alloc();	
	
	@Selector("valueWithSAXAdapter:withString:withInt:withString:withString:")	
	public SAXAnnotationAdapter valueWithSAXAdapterwithStringwithIntwithStringwithString(SAXAdapter arg0, String arg1, int arg2, String arg3, String arg4) {
		SAXAnnotationAdapter self = (SAXAnnotationAdapter) SAXAnnotationAdapter.alloc().init();		
		self.original = new org.objectweb.asm.xml.SAXAnnotationAdapter(arg0.original, arg1, arg2, arg3, arg4);		
		return self;		
	}	
	
	@Selector("valueWithSAXAdapter:withString:withInt:withInt:withString:")	
	public SAXAnnotationAdapter valueWithSAXAdapterwithStringwithIntwithIntwithString(SAXAdapter arg0, String arg1, int arg2, int arg3, String arg4) {
		SAXAnnotationAdapter self = (SAXAnnotationAdapter) SAXAnnotationAdapter.alloc().init();		
		self.original = new org.objectweb.asm.xml.SAXAnnotationAdapter(arg0.original, arg1, arg2, arg3, arg4);		
		return self;		
	}	
	
	@Selector("valueWithSAXAdapter:withString:withInt:withString:withString:withInt:withTypePath:")	
	public SAXAnnotationAdapter valueWithSAXAdapterwithStringwithIntwithStringwithStringwithIntwithTypePath(SAXAdapter arg0, String arg1, int arg2, String arg3, String arg4, int arg5, x.org.objectweb.asm.TypePath arg6) {
		SAXAnnotationAdapter self = (SAXAnnotationAdapter) SAXAnnotationAdapter.alloc().init();		
		self.original = new org.objectweb.asm.xml.SAXAnnotationAdapter(arg0.original, arg1, arg2, arg3, arg4, arg5, arg6.original);		
		return self;		
	}	
	
	@Selector("valueWithSAXAdapter:withString:withInt:withString:withString:withInt:withTypePath:withString:withString:withInt:")	
	public SAXAnnotationAdapter valueWithSAXAdapterwithStringwithIntwithStringwithStringwithIntwithTypePathwithStringwithStringwithInt(SAXAdapter arg0, String arg1, int arg2, String arg3, String arg4, int arg5, x.org.objectweb.asm.TypePath arg6, String[] arg7, String[] arg8, int[] arg9) {
		SAXAnnotationAdapter self = (SAXAnnotationAdapter) SAXAnnotationAdapter.alloc().init();		
		self.original = new org.objectweb.asm.xml.SAXAnnotationAdapter(arg0.original, arg1, arg2, arg3, arg4, arg5, arg6.original, arg7, arg8, arg9);		
		return self;		
	}	
	
	@Selector("visitWithString:withObject:")	
	public void visitWithStringwithObject(String arg0, Object arg1) {
		original.visit(arg0, arg1);		
	}	
	
	@Selector("visitEnumWithString:withString:withString:")	
	public void visitEnumWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.visitEnum(arg0, arg1, arg2);		
	}	
	
	@Selector("visitAnnotationWithString:withString:")	
	public Object visitAnnotationWithStringwithString(String arg0, String arg1) {
		return original.visitAnnotation(arg0, arg1);		
	}	
	
	@Selector("visitArrayWithString:")	
	public Object visitArrayWithString(String arg0) {
		return original.visitArray(arg0);		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
}
