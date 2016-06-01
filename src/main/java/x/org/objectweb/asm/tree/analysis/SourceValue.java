package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBSourceValue")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SourceValue extends NSObject {	
	
	public org.objectweb.asm.tree.analysis.SourceValue original;	
	
	protected SourceValue(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native SourceValue alloc();	
	
	@Selector("valueWithInt:")	
	public SourceValue valueWithInt(int arg0) {		
		SourceValue self = (SourceValue) SourceValue.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.SourceValue(arg0);		
		return self;		
	}	
	
	@Selector("valueWithInt:withAbstractInsnNode:")	
	public SourceValue valueWithIntwithAbstractInsnNode(int arg0, Object arg1) {
		SourceValue self = (SourceValue) SourceValue.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.SourceValue(arg0, (org.objectweb.asm.tree.AbstractInsnNode) arg1);		
		return self;		
	}	
	
	@Selector("valueWithInt:withSet:")	
	public SourceValue valueWithIntwithSet(int arg0, java.util.Set arg1) {		
		SourceValue self = (SourceValue) SourceValue.alloc().init();		
		self.original = new org.objectweb.asm.tree.analysis.SourceValue(arg0, arg1);		
		return self;		
	}	
	
	@Selector("getSize")	
	public int getSize() {		
		return original.getSize();		
	}	
	
	@Selector("equalsWithObject:")	
	public boolean equalsWithObject(Object arg0) {
		return original.equals(arg0);		
	}	
	
	@Selector("hashCode")	
	public int hashCode() {		
		return original.hashCode();		
	}	
}
