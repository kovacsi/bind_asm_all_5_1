package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_analysis_BasicVerifier")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class BasicVerifier extends NSObject {

	private org.objectweb.asm.tree.analysis.BasicVerifier original;

	protected BasicVerifier(Pointer peer) {
		super(peer);
	}

	@Selector("copyOperationWithAbstractInsnNodeWithBasicValue::")
	public org.objectweb.asm.tree.analysis.BasicValue copyOperationWithAbstractInsnNodeWithBasicValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.BasicValue arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.copyOperation(arg0, arg1);
	}

	@Selector("unaryOperationWithAbstractInsnNodeWithBasicValue::")
	public org.objectweb.asm.tree.analysis.BasicValue unaryOperationWithAbstractInsnNodeWithBasicValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.BasicValue arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.unaryOperation(arg0, arg1);
	}

	@Selector("binaryOperationWithAbstractInsnNodeWithBasicValueWithBasicValue:::")
	public org.objectweb.asm.tree.analysis.BasicValue binaryOperationWithAbstractInsnNodeWithBasicValueWithBasicValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.BasicValue arg1, org.objectweb.asm.tree.analysis.BasicValue arg2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.binaryOperation(arg0, arg1, arg2);
	}

	@Selector("ternaryOperationWithAbstractInsnNodeWithBasicValueWithBasicValueWithBasicValue::::")
	public org.objectweb.asm.tree.analysis.BasicValue ternaryOperationWithAbstractInsnNodeWithBasicValueWithBasicValueWithBasicValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.BasicValue arg1, org.objectweb.asm.tree.analysis.BasicValue arg2, org.objectweb.asm.tree.analysis.BasicValue arg3) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.ternaryOperation(arg0, arg1, arg2, arg3);
	}

	@Selector("naryOperationWithAbstractInsnNodeWithList::")
	public org.objectweb.asm.tree.analysis.BasicValue naryOperationWithAbstractInsnNodeWithList(org.objectweb.asm.tree.AbstractInsnNode arg0, java.util.List arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.naryOperation(arg0, arg1);
	}

	@Selector("returnOperationWithAbstractInsnNodeWithBasicValueWithBasicValue:::")
	public void returnOperationWithAbstractInsnNodeWithBasicValueWithBasicValue(org.objectweb.asm.tree.AbstractInsnNode arg0, org.objectweb.asm.tree.analysis.BasicValue arg1, org.objectweb.asm.tree.analysis.BasicValue arg2) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		original.returnOperation(arg0, arg1, arg2);
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
