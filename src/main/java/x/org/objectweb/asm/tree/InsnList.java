package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_tree_InsnList")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class InsnList extends NSObject {	
	
	public org.objectweb.asm.tree.InsnList original;	
	
	protected InsnList(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("value")	
	public InsnList value() {		
		InsnList self = (InsnList) InsnList.alloc().init();		
		self.original = new org.objectweb.asm.tree.InsnList();		
		return self;		
	}	
	
	@Selector("size")	
	public int size() {		
		return original.size();		
	}	
	
	@Selector("iterator")	
	public java.util.ListIterator iterator() {		
		return original.iterator();		
	}	
	
	@Selector("iteratorWithInt:")	
	public java.util.ListIterator iterator(int arg0) {		
		return original.iterator(arg0);		
	}	
	
	@Selector("toArray")	
	public org.objectweb.asm.tree.AbstractInsnNode[] toArray() {		
		return original.toArray();		
	}	
	
	@Selector("addWithInsnList:")	
	public void add(org.objectweb.asm.tree.InsnList arg0) {		
		original.add(arg0);		
	}	
	
	@Selector("insertWithInsnList:")	
	public void insert(org.objectweb.asm.tree.InsnList arg0) {		
		original.insert(arg0);		
	}	
	
	@Selector("clear")	
	public void clear() {		
		original.clear();		
	}	
	
	@Selector("resetLabels")	
	public void resetLabels() {		
		original.resetLabels();		
	}	
}
