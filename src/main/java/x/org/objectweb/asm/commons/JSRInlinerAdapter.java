package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JSRInlinerAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class JSRInlinerAdapter extends NSObject {	
	
	public org.objectweb.asm.commons.JSRInlinerAdapter original;	
	
	protected JSRInlinerAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("valueWithMethodVisitor:withInt:withString:withString:withString:withString:")	
	public JSRInlinerAdapter valueWithMethodVisitorwithIntwithStringwithStringwithStringwithString(Object arg0, int arg1, String arg2, String arg3, String arg4, String[] arg5) {
		JSRInlinerAdapter self = (JSRInlinerAdapter) JSRInlinerAdapter.alloc().init();		
		self.original = new org.objectweb.asm.commons.JSRInlinerAdapter((org.objectweb.asm.MethodVisitor) arg0, arg1, arg2, arg3, arg4, arg5);		
		return self;		
	}	
	
	@Selector("visitJumpInsnWithInt:withLabel:")	
	public void visitJumpInsnWithIntwithLabel(int arg0, x.org.objectweb.asm.Label arg1) {		
		original.visitJumpInsn(arg0, arg1.original);		
	}	
	
	@Selector("visitEnd")	
	public void visitEnd() {		
		original.visitEnd();		
	}	
}
