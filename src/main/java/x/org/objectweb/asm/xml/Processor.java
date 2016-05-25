package x.org.objectweb.asm.xml;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_xml_Processor")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Processor extends NSObject {

	private org.objectweb.asm.xml.Processor original;

	protected Processor(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithIntWithIntWithIdWithIdWithId:::::")
	public Processor valueWithIntWithIntWithIdWithIdWithId(int arg0, int arg1, java.io.InputStream arg2, java.io.OutputStream arg3, javax.xml.transform.Source arg4) {
		Processor self = (Processor) Processor.alloc().init();
		self.original = new org.objectweb.asm.xml.Processor(arg0, arg1, arg2, arg3, arg4);
		return self;
	}

	@Selector("process")
	public int process() throws javax.xml.transform.TransformerException, java.io.IOException, org.xml.sax.SAXException {
		return original.process();
	}

	@Selector("mainWithId:")
	public static void mainWithId(String[] arg0) throws Exception {
		org.objectweb.asm.xml.Processor.main(arg0);
	}

}
