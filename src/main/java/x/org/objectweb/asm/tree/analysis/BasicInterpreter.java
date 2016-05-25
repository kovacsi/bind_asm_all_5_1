package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_analysis_BasicInterpreter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class BasicInterpreter extends NSObject {

	private org.objectweb.asm.tree.analysis.BasicInterpreter original;

	protected BasicInterpreter(Pointer peer) {
		super(peer);
	}

	@Selector("copyOperationWithIdWithId::")
	public org.objectweb.asm.tree.analysis.BasicValue copyOperationWithIdWithId(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.BasicValue arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.copyOperation(arg0, arg1);
	}

	@Selector("unaryOperationWithIdWithId::")
	public org.objectweb.asm.tree.analysis.BasicValue unaryOperationWithIdWithId(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.BasicValue arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.unaryOperation(arg0, arg1);
	}

	@Selector("binaryOperationWithIdWithIdWithId:::")
	public org.objectweb.asm.tree.analysis.BasicValue binaryOperationWithIdWithIdWithId(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.BasicValue arg1, org.objectweb.asm.tree.analysis.BasicValue arg2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.binaryOperation(arg0, arg1, arg2);
	}

	@Selector("ternaryOperationWithIdWithIdWithIdWithId::::")
	public org.objectweb.asm.tree.analysis.BasicValue ternaryOperationWithIdWithIdWithIdWithId(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.BasicValue arg1, org.objectweb.asm.tree.analysis.BasicValue arg2, org.objectweb.asm.tree.analysis.BasicValue arg3) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.ternaryOperation(arg0, arg1, arg2, arg3);
	}

	@Selector("returnOperationWithIdWithIdWithId:::")
	public void returnOperationWithIdWithIdWithId(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.BasicValue arg1, org.objectweb.asm.tree.analysis.BasicValue arg2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		original.returnOperation(arg0, arg1, arg2);
	}

	@Selector("mergeWithIdWithId::")
	public org.objectweb.asm.tree.analysis.BasicValue mergeWithIdWithId(org.objectweb.asm.tree.analysis.BasicValue arg0, org.objectweb.asm.tree.analysis.BasicValue arg1) {
		return original.merge(arg0, arg1);
	}

	@Selector("mergeWithIdWithId::")
	public org.objectweb.asm.tree.analysis.Value mergeWithIdWithId(org.objectweb.asm.tree.analysis.Value arg0, org.objectweb.asm.tree.analysis.Value arg1) {
		return original.merge(arg0, arg1);
	}

	@Selector("returnOperationWithIdWithIdWithId:::")
	public void returnOperationWithIdWithIdWithId(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.Value arg1, org.objectweb.asm.tree.analysis.Value arg2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		original.returnOperation(arg0, arg1, arg2);
	}

	@Selector("naryOperationWithIdWithId::")
	public org.objectweb.asm.tree.analysis.Value naryOperationWithIdWithId(org.objectweb.asm.tree.AbstractInsnNode arg0, java.util.List arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.naryOperation(arg0, arg1);
	}

	@Selector("ternaryOperationWithIdWithIdWithIdWithId::::")
	public org.objectweb.asm.tree.analysis.Value ternaryOperationWithIdWithIdWithIdWithId(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.Value arg1, org.objectweb.asm.tree.analysis.Value arg2, org.objectweb.asm.tree.analysis.Value arg3) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.ternaryOperation(arg0, arg1, arg2, arg3);
	}

	@Selector("binaryOperationWithIdWithIdWithId:::")
	public org.objectweb.asm.tree.analysis.Value binaryOperationWithIdWithIdWithId(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.Value arg1, org.objectweb.asm.tree.analysis.Value arg2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.binaryOperation(arg0, arg1, arg2);
	}

	@Selector("unaryOperationWithIdWithId::")
	public org.objectweb.asm.tree.analysis.Value unaryOperationWithIdWithId(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.Value arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.unaryOperation(arg0, arg1);
	}

	@Selector("copyOperationWithIdWithId::")
	public org.objectweb.asm.tree.analysis.Value copyOperationWithIdWithId(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.Value arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.copyOperation(arg0, arg1);
	}

	@Selector("newOperationWithId:")
	public org.objectweb.asm.tree.analysis.Value newOperationWithId(org.objectweb.asm.tree.AbstractInsnNode arg0) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.newOperation(arg0);
	}

	@Selector("newValueWithId:")
	public org.objectweb.asm.tree.analysis.Value newValueWithId(org.objectweb.asm.Type arg0) {
		return original.newValue(arg0);
	}

}
