package x.org.objectweb.asm.tree.analysis;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_tree_analysis_Analyzer")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Analyzer extends NSObject {

	private org.objectweb.asm.tree.analysis.Analyzer original;

	protected Analyzer(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithInterpreter:")
	public Analyzer valueWithInterpreter(org.objectweb.asm.tree.analysis.Interpreter arg0) {
		Analyzer self = (Analyzer) Analyzer.alloc().init();
		self.original = new org.objectweb.asm.tree.analysis.Analyzer(arg0);
		return self;
	}

	@Selector("analyzeWithStringWithMethodNode::")
	public org.objectweb.asm.tree.analysis.Frame[] analyzeWithStringWithMethodNode(String arg0, org.objectweb.asm.tree.MethodNode arg1) throws org.objectweb.asm.tree.analysis.AnalyzerException {
		return original.analyze(arg0, arg1);
	}

	@Selector("getFrames")
	public org.objectweb.asm.tree.analysis.Frame[] getFrames() {
		return original.getFrames();
	}

	@Selector("getHandlersWithInt:")
	public java.util.List getHandlersWithInt(int arg0) {
		return original.getHandlers(arg0);
	}

}
