package x.org.objectweb.asm.tree;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_InsnList")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class InsnList extends NSObject {

	private org.objectweb.asm.tree.InsnList original;

	protected InsnList(Pointer peer) {
		super(peer);
	}

	@Selector("size")
	public int size() {
		return original.size();
	}

	@Selector("getFirst")
	public org.objectweb.asm.tree.AbstractInsnNode getFirst() {
		return original.getFirst();
	}

	@Selector("getLast")
	public org.objectweb.asm.tree.AbstractInsnNode getLast() {
		return original.getLast();
	}

	@Selector("getWithInt:")
	public org.objectweb.asm.tree.AbstractInsnNode getWithInt(int arg0) {
		return original.get(arg0);
	}

	@Selector("containsWithAbstractInsnNode:")
	public boolean containsWithAbstractInsnNode(org.objectweb.asm.tree.AbstractInsnNode arg0) {
		return original.contains(arg0);
	}

	@Selector("indexOfWithAbstractInsnNode:")
	public int indexOfWithAbstractInsnNode(org.objectweb.asm.tree.AbstractInsnNode arg0) {
		return original.indexOf(arg0);
	}

	@Selector("acceptWithMethodVisitor:")
	public void acceptWithMethodVisitor(org.objectweb.asm.MethodVisitor arg0) {
		original.accept(arg0);
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

	@Selector("setWithAbstractInsnNodeWithAbstractInsnNode::")
	public void setWithAbstractInsnNodeWithAbstractInsnNode(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.AbstractInsnNode arg1) {
		original.set(arg0, arg1);
	}

	@Selector("addWithAbstractInsnNode:")
	public void addWithAbstractInsnNode(org.objectweb.asm.tree.AbstractInsnNode arg0) {
		original.add(arg0);
	}

	@Selector("addWithInsnList:")
	public void addWithInsnList(org.objectweb.asm.tree.InsnList arg0) {
		original.add(arg0);
	}

	@Selector("insertWithAbstractInsnNode:")
	public void insertWithAbstractInsnNode(org.objectweb.asm.tree.AbstractInsnNode arg0) {
		original.insert(arg0);
	}

	@Selector("insertWithInsnList:")
	public void insertWithInsnList(org.objectweb.asm.tree.InsnList arg0) {
		original.insert(arg0);
	}

	@Selector("insertWithAbstractInsnNodeWithAbstractInsnNode::")
	public void insertWithAbstractInsnNodeWithAbstractInsnNode(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.AbstractInsnNode arg1) {
		original.insert(arg0, arg1);
	}

	@Selector("insertWithAbstractInsnNodeWithInsnList::")
	public void insertWithAbstractInsnNodeWithInsnList(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.InsnList arg1) {
		original.insert(arg0, arg1);
	}

	@Selector("insertBeforeWithAbstractInsnNodeWithAbstractInsnNode::")
	public void insertBeforeWithAbstractInsnNodeWithAbstractInsnNode(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.AbstractInsnNode arg1) {
		original.insertBefore(arg0, arg1);
	}

	@Selector("insertBeforeWithAbstractInsnNodeWithInsnList::")
	public void insertBeforeWithAbstractInsnNodeWithInsnList(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.InsnList arg1) {
		original.insertBefore(arg0, arg1);
	}

	@Selector("removeWithAbstractInsnNode:")
	public void removeWithAbstractInsnNode(org.objectweb.asm.tree.AbstractInsnNode arg0) {
		original.remove(arg0);
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
