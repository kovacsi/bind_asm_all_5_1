package x.org.objectweb.asm;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBTypePath")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class TypePath extends NSObject {	
	
	public org.objectweb.asm.TypePath original;	
	
	protected TypePath(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native TypePath alloc();	
	
	@Selector("getLength")	
	public int getLength() {		
		return original.getLength();		
	}	
	
	@Selector("getStepWithInt:")	
	public int getStepWithInt(int arg0) {		
		return original.getStep(arg0);		
	}	
	
	@Selector("getStepArgumentWithInt:")	
	public int getStepArgumentWithInt(int arg0) {		
		return original.getStepArgument(arg0);		
	}	
	
	@Selector("fromStringWithString:")	
	public static TypePath fromStringWithString(String arg0) {
		TypePath ret = (TypePath) TypePath.alloc().init();
		ret.original = org.objectweb.asm.TypePath.fromString(arg0);		
		return ret;		
	}	
	
	@Selector("toString")	
	public String toString() {
		return original.toString();		
	}	
}
