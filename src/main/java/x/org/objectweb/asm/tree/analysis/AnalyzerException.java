package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_analysis_AnalyzerException")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class AnalyzerException extends NSObject {

	private org.objectweb.asm.tree.analysis.AnalyzerException original;

	protected AnalyzerException(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithAbstractInsnNodeWithString::")
	public AnalyzerException valueWithAbstractInsnNodeWithString(org.objectweb.asm.tree.AbstractInsnNode arg0, String arg1) {
		AnalyzerException self = (AnalyzerException) AnalyzerException.alloc().init();
		self.original = new org.objectweb.asm.tree.analysis.AnalyzerException(arg0, arg1);
		return self;
	}

	@Selector("valueWithAbstractInsnNodeWithStringWithThrowable:::")
	public AnalyzerException valueWithAbstractInsnNodeWithStringWithThrowable(org.objectweb.asm.tree.AbstractInsnNode arg0, String arg1, Throwable arg2) {
		AnalyzerException self = (AnalyzerException) AnalyzerException.alloc().init();
		self.original = new org.objectweb.asm.tree.analysis.AnalyzerException(arg0, arg1, arg2);
		return self;
	}

	@Selector("valueWithAbstractInsnNodeWithStringWithObjectWithValue::::")
	public AnalyzerException valueWithAbstractInsnNodeWithStringWithObjectWithValue(org.objectweb.asm.tree.AbstractInsnNode arg0, String arg1, Object arg2, org.objectweb.asm.tree.analysis.Value arg3) {
		AnalyzerException self = (AnalyzerException) AnalyzerException.alloc().init();
		self.original = new org.objectweb.asm.tree.analysis.AnalyzerException(arg0, arg1, arg2, arg3);
		return self;
	}

}
