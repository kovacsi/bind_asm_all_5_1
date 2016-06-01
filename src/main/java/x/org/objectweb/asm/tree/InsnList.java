package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("InsnList")
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
	
	@Selector("getFirst")	
	public Object getFirst() {
		return original.getFirst();		
	}	
	
	@Selector("getLast")	
	public Object getLast() {
		return original.getLast();		
	}	
	
	@Selector("getWithInt:")	
	public Object getWithInt(int arg0) {
		return original.get(arg0);		
	}	
	
	@Selector("containsWithAbstractInsnNode:")	
	public boolean containsWithAbstractInsnNode(Object arg0) {
		return original.contains((org.objectweb.asm.tree.AbstractInsnNode) arg0);		
	}	
	
	@Selector("indexOfWithAbstractInsnNode:")	
	public int indexOfWithAbstractInsnNode(Object arg0) {
		return original.indexOf((org.objectweb.asm.tree.AbstractInsnNode) arg0);		
	}	
	
	@Selector("acceptWithMethodVisitor:")	
	public void acceptWithMethodVisitor(Object arg0) {
		original.accept((org.objectweb.asm.MethodVisitor) arg0);		
	}	
	
	@Selector("iterator")	
	public java.util.ListIterator iterator() {		
		return original.iterator();		
	}	
	
	@Selector("iteratorWithInt:")	
	public java.util.ListIterator iteratorWithInt(int arg0) {		
		return original.iterator(arg0);		
	}	
	
	@Selector("toArray")	
	public org.objectweb.asm.tree.AbstractInsnNode[] toArray() {		
		return original.toArray();		
	}	
	
	@Selector("setWithAbstractInsnNode:withAbstractInsnNode:")	
	public void setWithAbstractInsnNodewithAbstractInsnNode(Object arg0, Object arg1) {
		original.set((org.objectweb.asm.tree.AbstractInsnNode) arg0, (org.objectweb.asm.tree.AbstractInsnNode) arg1);		
	}	
	
	@Selector("addWithAbstractInsnNode:")	
	public void addWithAbstractInsnNode(Object arg0) {
		original.add((org.objectweb.asm.tree.AbstractInsnNode) arg0);		
	}	
	
	@Selector("addWithInsnList:")	
	public void addWithInsnList(InsnList arg0) {
		original.add(arg0.original);		
	}	
	
	@Selector("insertWithAbstractInsnNode:")	
	public void insertWithAbstractInsnNode(Object arg0) {
		original.insert((org.objectweb.asm.tree.AbstractInsnNode) arg0);		
	}	
	
	@Selector("insertWithInsnList:")	
	public void insertWithInsnList(InsnList arg0) {
		original.insert(arg0.original);		
	}	
	
	@Selector("insertWithAbstractInsnNode:withAbstractInsnNode:")	
	public void insertWithAbstractInsnNodewithAbstractInsnNode(Object arg0, Object arg1) {
		original.insert((org.objectweb.asm.tree.AbstractInsnNode) arg0, (org.objectweb.asm.tree.AbstractInsnNode) arg1);		
	}	
	
	@Selector("insertWithAbstractInsnNode:withInsnList:")	
	public void insertWithAbstractInsnNodewithInsnList(Object arg0, InsnList arg1) {
		original.insert((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1.original);		
	}	
	
	@Selector("insertBeforeWithAbstractInsnNode:withAbstractInsnNode:")	
	public void insertBeforeWithAbstractInsnNodewithAbstractInsnNode(Object arg0, Object arg1) {
		original.insertBefore((org.objectweb.asm.tree.AbstractInsnNode) arg0, (org.objectweb.asm.tree.AbstractInsnNode) arg1);		
	}	
	
	@Selector("insertBeforeWithAbstractInsnNode:withInsnList:")	
	public void insertBeforeWithAbstractInsnNodewithInsnList(Object arg0, InsnList arg1) {
		original.insertBefore((org.objectweb.asm.tree.AbstractInsnNode) arg0, arg1.original);		
	}	
	
	@Selector("removeWithAbstractInsnNode:")	
	public void removeWithAbstractInsnNode(Object arg0) {
		original.remove((org.objectweb.asm.tree.AbstractInsnNode) arg0);		
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
