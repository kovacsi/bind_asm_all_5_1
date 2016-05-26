package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_analysis_SourceInterpreter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class SourceInterpreter extends NSObject {

	private org.objectweb.asm.tree.analysis.SourceInterpreter original;

	protected SourceInterpreter(Pointer peer) {
		super(peer);
	}

	@Selector("newValueWithType:")
	public org.objectweb.asm.tree.analysis.SourceValue newValueWithType(org.objectweb.asm.Type arg0) {
		return original.newValue(arg0);
	}

	@Selector("newOperationWithAbstractInsnNode:")
	public org.objectweb.asm.tree.analysis.SourceValue newOperationWithAbstractInsnNode(org.objectweb.asm.tree.AbstractInsnNode arg0) {
		return original.newOperation(arg0);
	}

	@Selector("copyOperationWithAbstractInsnNodeWithSourceValue::")
	public org.objectweb.asm.tree.analysis.SourceValue copyOperationWithAbstractInsnNodeWithSourceValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.SourceValue arg1) {
		return original.copyOperation(arg0, arg1);
	}

	@Selector("unaryOperationWithAbstractInsnNodeWithSourceValue::")
	public org.objectweb.asm.tree.analysis.SourceValue unaryOperationWithAbstractInsnNodeWithSourceValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.SourceValue arg1) {
		return original.unaryOperation(arg0, arg1);
	}

	@Selector("binaryOperationWithAbstractInsnNodeWithSourceValueWithSourceValue:::")
	public org.objectweb.asm.tree.analysis.SourceValue binaryOperationWithAbstractInsnNodeWithSourceValueWithSourceValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.SourceValue arg1, org.objectweb.asm.tree.analysis.SourceValue arg2) {
		return original.binaryOperation(arg0, arg1, arg2);
	}

	@Selector("ternaryOperationWithAbstractInsnNodeWithSourceValueWithSourceValueWithSourceValue::::")
	public org.objectweb.asm.tree.analysis.SourceValue ternaryOperationWithAbstractInsnNodeWithSourceValueWithSourceValueWithSourceValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.SourceValue arg1, org.objectweb.asm.tree.analysis.SourceValue arg2, org.objectweb.asm.tree.analysis.SourceValue arg3) {
		return original.ternaryOperation(arg0, arg1, arg2, arg3);
	}

	@Selector("naryOperationWithAbstractInsnNodeWithList::")
	public org.objectweb.asm.tree.analysis.SourceValue naryOperationWithAbstractInsnNodeWithList(org.objectweb.asm.tree.AbstractInsnNode arg0, java.util.List arg1) {
		return original.naryOperation(arg0, arg1);
	}

	@Selector("returnOperationWithAbstractInsnNodeWithSourceValueWithSourceValue:::")
	public void returnOperationWithAbstractInsnNodeWithSourceValueWithSourceValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.SourceValue arg1, org.objectweb.asm.tree.analysis.SourceValue arg2) {
		original.returnOperation(arg0, arg1, arg2);
	}

	@Selector("mergeWithSourceValueWithSourceValue::")
	public org.objectweb.asm.tree.analysis.SourceValue mergeWithSourceValueWithSourceValue(org.objectweb.asm.tree.analysis.SourceValue arg0, org.objectweb.asm.tree.analysis.SourceValue arg1) {
		return original.merge(arg0, arg1);
	}

	@Selector("mergeWithValueWithValue::")
	public org.objectweb.asm.tree.analysis.Value mergeWithValueWithValue(org.objectweb.asm.tree.analysis.Value arg0, org.objectweb.asm.tree.analysis.Value arg1) {
		return original.merge(arg0, arg1);
	}

	@Selector("returnOperationWithAbstractInsnNodeWithValueWithValue:::")
	public void returnOperationWithAbstractInsnNodeWithValueWithValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.Value arg1, org.objectweb.asm.tree.analysis.Value arg2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		original.returnOperation(arg0, arg1, arg2);
	}

	@Selector("ternaryOperationWithAbstractInsnNodeWithValueWithValueWithValue::::")
	public org.objectweb.asm.tree.analysis.Value ternaryOperationWithAbstractInsnNodeWithValueWithValueWithValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.Value arg1, org.objectweb.asm.tree.analysis.Value arg2, org.objectweb.asm.tree.analysis.Value arg3) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.ternaryOperation(arg0, arg1, arg2, arg3);
	}

	@Selector("binaryOperationWithAbstractInsnNodeWithValueWithValue:::")
	public org.objectweb.asm.tree.analysis.Value binaryOperationWithAbstractInsnNodeWithValueWithValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.Value arg1, org.objectweb.asm.tree.analysis.Value arg2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.binaryOperation(arg0, arg1, arg2);
	}

	@Selector("unaryOperationWithAbstractInsnNodeWithValue::")
	public org.objectweb.asm.tree.analysis.Value unaryOperationWithAbstractInsnNodeWithValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.Value arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.unaryOperation(arg0, arg1);
	}

	@Selector("copyOperationWithAbstractInsnNodeWithValue::")
	public org.objectweb.asm.tree.analysis.Value copyOperationWithAbstractInsnNodeWithValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.Value arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.copyOperation(arg0, arg1);
	}

}
