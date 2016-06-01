package x.org.objectweb.asm.xml;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("SAXClassAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SAXClassAdapter extends NSObject {	
	
	public org.objectweb.asm.xml.SAXClassAdapter original;	
	
	protected SAXClassAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithContentHandler:withBoolean:")	
	public SAXClassAdapter valueWithContentHandlerwithBoolean(org.xml.sax.ContentHandler arg0, boolean arg1) {		
		SAXClassAdapter self = (SAXClassAdapter) SAXClassAdapter.alloc().init();		
		self.original = new org.objectweb.asm.xml.SAXClassAdapter(arg0, arg1);		
		return self;		
	}	
	
	@Selector("visitSourceWithString:withString:")	
	public void visitSourceWithStringwithString(String arg0, String arg1) {
		original.visitSource(arg0, arg1);		
	}	
	
	@Selector("visitOuterClassWithString:withString:withString:")	
	public void visitOuterClassWithStringwithStringwithString(String arg0, String arg1, String arg2) {
		original.visitOuterClass(arg0, arg1, arg2);		
	}	
	
	@Selector("visitAnnotationWithString:withBoolean:")	
	public Object visitAnnotationWithStringwithBoolean(String arg0, boolean arg1) {
		return original.visitAnnotation(arg0, arg1);		
	}	
	
	@Selector("visitTypeAnnotationWithInt:withTypePath:withString:withBoolean:")	
	public Object visitTypeAnnotationWithIntwithTypePathwithStringwithBoolean(int arg0, x.org.objectweb.asm.TypePath arg1, String arg2, boolean arg3) {
		return original.visitTypeAnnotation(arg0, arg1.original, arg2, arg3);		
	}	
	
	@Selector("visitWithInt:withInt:withString:withString:withString:withString:")	
	public void visitWithIntwithIntwithStringwithStringwithStringwithString(int arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		original.visit(arg0, arg1, arg2, arg3, arg4, arg5);		
	}	
	
	@Selector("visitFieldWithInt:withString:withString:withString:withObject:")	
	public Object visitFieldWithIntwithStringwithStringwithStringwithObject(int arg0, String arg1, String arg2, String arg3, Object arg4) {
		return original.visitField(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitMethodWithInt:withString:withString:withString:withString:")	
	public Object visitMethodWithIntwithStringwithStringwithStringwithString(int arg0, String arg1, String arg2, String arg3, String[] arg4) {
		return original.visitMethod(arg0, arg1, arg2, arg3, arg4);		
	}	
	
	@Selector("visitInnerClassWithString:withString:withString:withInt:")	
	public void visitInnerClassWithStringwithStringwithStringwithInt(String arg0, String arg1, String arg2, int arg3) {
		original.visitInnerClass(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
}
