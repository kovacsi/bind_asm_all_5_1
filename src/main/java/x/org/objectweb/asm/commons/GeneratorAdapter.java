package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_objectweb_asm_commons_GeneratorAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class GeneratorAdapter extends NSObject {

	private org.objectweb.asm.commons.GeneratorAdapter original;

	protected GeneratorAdapter(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithIdWithIntWithStringWithString::::")
	public GeneratorAdapter valueWithIdWithIntWithStringWithString(org.objectweb.asm.MethodVisitor arg0, int arg1, String arg2, String arg3) {
		GeneratorAdapter self = (GeneratorAdapter) GeneratorAdapter.alloc().init();
		self.original = new org.objectweb.asm.commons.GeneratorAdapter(arg0, arg1, arg2, arg3);
		return self;
	}

	@Selector("valueWithIntWithIdWithId:::")
	public GeneratorAdapter valueWithIntWithIdWithId(int arg0, org.objectweb.asm.commons.Method arg1, org.objectweb.asm.MethodVisitor arg2) {
		GeneratorAdapter self = (GeneratorAdapter) GeneratorAdapter.alloc().init();
		self.original = new org.objectweb.asm.commons.GeneratorAdapter(arg0, arg1, arg2);
		return self;
	}

	@Selector("valueWithIntWithIdWithStringWithIdWithId:::::")
	public GeneratorAdapter valueWithIntWithIdWithStringWithIdWithId(int arg0, org.objectweb.asm.commons.Method arg1, String arg2, org.objectweb.asm.Type[] arg3, org.objectweb.asm.ClassVisitor arg4) {
		GeneratorAdapter self = (GeneratorAdapter) GeneratorAdapter.alloc().init();
		self.original = new org.objectweb.asm.commons.GeneratorAdapter(arg0, arg1, arg2, arg3, arg4);
		return self;
	}

	@Selector("pushWithBool:")
	public void pushWithBool(boolean arg0) {
		original.push(arg0);
	}

	@Selector("pushWithInt:")
	public void pushWithInt(int arg0) {
		original.push(arg0);
	}

	@Selector("pushWithLong:")
	public void pushWithLong(long arg0) {
		original.push(arg0);
	}

	@Selector("pushWithFloat:")
	public void pushWithFloat(float arg0) {
		original.push(arg0);
	}

	@Selector("pushWithDouble:")
	public void pushWithDouble(double arg0) {
		original.push(arg0);
	}

	@Selector("pushWithString:")
	public void pushWithString(String arg0) {
		original.push(arg0);
	}

	@Selector("pushWithId:")
	public void pushWithId(org.objectweb.asm.Type arg0) {
		original.push(arg0);
	}

	@Selector("pushWithId:")
	public void pushWithId(org.objectweb.asm.Handle arg0) {
		original.push(arg0);
	}

	@Selector("loadThis")
	public void loadThis() {
		original.loadThis();
	}

	@Selector("loadArgWithInt:")
	public void loadArgWithInt(int arg0) {
		original.loadArg(arg0);
	}

	@Selector("loadArgsWithIntWithInt::")
	public void loadArgsWithIntWithInt(int arg0, int arg1) {
		original.loadArgs(arg0, arg1);
	}

	@Selector("loadArgs")
	public void loadArgs() {
		original.loadArgs();
	}

	@Selector("loadArgArray")
	public void loadArgArray() {
		original.loadArgArray();
	}

	@Selector("storeArgWithInt:")
	public void storeArgWithInt(int arg0) {
		original.storeArg(arg0);
	}

	@Selector("getLocalTypeWithInt:")
	public org.objectweb.asm.Type getLocalTypeWithInt(int arg0) {
		return original.getLocalType(arg0);
	}

	@Selector("loadLocalWithInt:")
	public void loadLocalWithInt(int arg0) {
		original.loadLocal(arg0);
	}

	@Selector("loadLocalWithIntWithId::")
	public void loadLocalWithIntWithId(int arg0, org.objectweb.asm.Type arg1) {
		original.loadLocal(arg0, arg1);
	}

	@Selector("storeLocalWithInt:")
	public void storeLocalWithInt(int arg0) {
		original.storeLocal(arg0);
	}

	@Selector("storeLocalWithIntWithId::")
	public void storeLocalWithIntWithId(int arg0, org.objectweb.asm.Type arg1) {
		original.storeLocal(arg0, arg1);
	}

	@Selector("arrayLoadWithId:")
	public void arrayLoadWithId(org.objectweb.asm.Type arg0) {
		original.arrayLoad(arg0);
	}

	@Selector("arrayStoreWithId:")
	public void arrayStoreWithId(org.objectweb.asm.Type arg0) {
		original.arrayStore(arg0);
	}

	@Selector("pop")
	public void pop() {
		original.pop();
	}

	@Selector("pop2")
	public void pop2() {
		original.pop2();
	}

	@Selector("dup")
	public void dup() {
		original.dup();
	}

	@Selector("dup2")
	public void dup2() {
		original.dup2();
	}

	@Selector("dupX1")
	public void dupX1() {
		original.dupX1();
	}

	@Selector("dupX2")
	public void dupX2() {
		original.dupX2();
	}

	@Selector("dup2X1")
	public void dup2X1() {
		original.dup2X1();
	}

	@Selector("dup2X2")
	public void dup2X2() {
		original.dup2X2();
	}

	@Selector("swap")
	public void swap() {
		original.swap();
	}

	@Selector("swapWithIdWithId::")
	public void swapWithIdWithId(org.objectweb.asm.Type arg0, org.objectweb.asm.Type arg1) {
		original.swap(arg0, arg1);
	}

	@Selector("mathWithIntWithId::")
	public void mathWithIntWithId(int arg0, org.objectweb.asm.Type arg1) {
		original.math(arg0, arg1);
	}

	@Selector("not")
	public void not() {
		original.not();
	}

	@Selector("iincWithIntWithInt::")
	public void iincWithIntWithInt(int arg0, int arg1) {
		original.iinc(arg0, arg1);
	}

	@Selector("castWithIdWithId::")
	public void castWithIdWithId(org.objectweb.asm.Type arg0, org.objectweb.asm.Type arg1) {
		original.cast(arg0, arg1);
	}

	@Selector("boxWithId:")
	public void boxWithId(org.objectweb.asm.Type arg0) {
		original.box(arg0);
	}

	@Selector("valueOfWithId:")
	public void valueOfWithId(org.objectweb.asm.Type arg0) {
		original.valueOf(arg0);
	}

	@Selector("unboxWithId:")
	public void unboxWithId(org.objectweb.asm.Type arg0) {
		original.unbox(arg0);
	}

	@Selector("newLabel")
	public org.objectweb.asm.Label newLabel() {
		return original.newLabel();
	}

	@Selector("markWithId:")
	public void markWithId(org.objectweb.asm.Label arg0) {
		original.mark(arg0);
	}

	@Selector("mark")
	public org.objectweb.asm.Label mark() {
		return original.mark();
	}

	@Selector("ifCmpWithIdWithIntWithId:::")
	public void ifCmpWithIdWithIntWithId(org.objectweb.asm.Type arg0, int arg1, org.objectweb.asm.Label arg2) {
		original.ifCmp(arg0, arg1, arg2);
	}

	@Selector("ifICmpWithIntWithId::")
	public void ifICmpWithIntWithId(int arg0, org.objectweb.asm.Label arg1) {
		original.ifICmp(arg0, arg1);
	}

	@Selector("ifZCmpWithIntWithId::")
	public void ifZCmpWithIntWithId(int arg0, org.objectweb.asm.Label arg1) {
		original.ifZCmp(arg0, arg1);
	}

	@Selector("ifNullWithId:")
	public void ifNullWithId(org.objectweb.asm.Label arg0) {
		original.ifNull(arg0);
	}

	@Selector("ifNonNullWithId:")
	public void ifNonNullWithId(org.objectweb.asm.Label arg0) {
		original.ifNonNull(arg0);
	}

	@Selector("goToWithId:")
	public void goToWithId(org.objectweb.asm.Label arg0) {
		original.goTo(arg0);
	}

	@Selector("retWithInt:")
	public void retWithInt(int arg0) {
		original.ret(arg0);
	}

	@Selector("tableSwitchWithIdWithId::")
	public void tableSwitchWithIdWithId(int[] arg0, org.objectweb.asm.commons.TableSwitchGenerator arg1) {
		original.tableSwitch(arg0, arg1);
	}

	@Selector("tableSwitchWithIdWithIdWithBool:::")
	public void tableSwitchWithIdWithIdWithBool(int[] arg0, org.objectweb.asm.commons.TableSwitchGenerator arg1, boolean arg2) {
		original.tableSwitch(arg0, arg1, arg2);
	}

	@Selector("returnValue")
	public void returnValue() {
		original.returnValue();
	}

	@Selector("getStaticWithIdWithStringWithId:::")
	public void getStaticWithIdWithStringWithId(org.objectweb.asm.Type arg0, String arg1, org.objectweb.asm.Type arg2) {
		original.getStatic(arg0, arg1, arg2);
	}

	@Selector("putStaticWithIdWithStringWithId:::")
	public void putStaticWithIdWithStringWithId(org.objectweb.asm.Type arg0, String arg1, org.objectweb.asm.Type arg2) {
		original.putStatic(arg0, arg1, arg2);
	}

	@Selector("getFieldWithIdWithStringWithId:::")
	public void getFieldWithIdWithStringWithId(org.objectweb.asm.Type arg0, String arg1, org.objectweb.asm.Type arg2) {
		original.getField(arg0, arg1, arg2);
	}

	@Selector("putFieldWithIdWithStringWithId:::")
	public void putFieldWithIdWithStringWithId(org.objectweb.asm.Type arg0, String arg1, org.objectweb.asm.Type arg2) {
		original.putField(arg0, arg1, arg2);
	}

	@Selector("invokeVirtualWithIdWithId::")
	public void invokeVirtualWithIdWithId(org.objectweb.asm.Type arg0, org.objectweb.asm.commons.Method arg1) {
		original.invokeVirtual(arg0, arg1);
	}

	@Selector("invokeConstructorWithIdWithId::")
	public void invokeConstructorWithIdWithId(org.objectweb.asm.Type arg0, org.objectweb.asm.commons.Method arg1) {
		original.invokeConstructor(arg0, arg1);
	}

	@Selector("invokeStaticWithIdWithId::")
	public void invokeStaticWithIdWithId(org.objectweb.asm.Type arg0, org.objectweb.asm.commons.Method arg1) {
		original.invokeStatic(arg0, arg1);
	}

	@Selector("invokeInterfaceWithIdWithId::")
	public void invokeInterfaceWithIdWithId(org.objectweb.asm.Type arg0, org.objectweb.asm.commons.Method arg1) {
		original.invokeInterface(arg0, arg1);
	}

	@Selector("invokeDynamicWithStringWithStringWithIdWithId::::")
	public void invokeDynamicWithStringWithStringWithIdWithId(String arg0, String arg1, org.objectweb.asm.Handle arg2, Object[] arg3) {
		original.invokeDynamic(arg0, arg1, arg2, arg3);
	}

	@Selector("newInstanceWithId:")
	public void newInstanceWithId(org.objectweb.asm.Type arg0) {
		original.newInstance(arg0);
	}

	@Selector("newArrayWithId:")
	public void newArrayWithId(org.objectweb.asm.Type arg0) {
		original.newArray(arg0);
	}

	@Selector("arrayLength")
	public void arrayLength() {
		original.arrayLength();
	}

	@Selector("throwException")
	public void throwException() {
		original.throwException();
	}

	@Selector("throwExceptionWithIdWithString::")
	public void throwExceptionWithIdWithString(org.objectweb.asm.Type arg0, String arg1) {
		original.throwException(arg0, arg1);
	}

	@Selector("checkCastWithId:")
	public void checkCastWithId(org.objectweb.asm.Type arg0) {
		original.checkCast(arg0);
	}

	@Selector("instanceOfWithId:")
	public void instanceOfWithId(org.objectweb.asm.Type arg0) {
		original.instanceOf(arg0);
	}

	@Selector("monitorEnter")
	public void monitorEnter() {
		original.monitorEnter();
	}

	@Selector("monitorExit")
	public void monitorExit() {
		original.monitorExit();
	}

	@Selector("endMethod")
	public void endMethod() {
		original.endMethod();
	}

	@Selector("catchExceptionWithIdWithIdWithId:::")
	public void catchExceptionWithIdWithIdWithId(org.objectweb.asm.Label arg0, org.objectweb.asm.Label arg1, org.objectweb.asm.Type arg2) {
		original.catchException(arg0, arg1, arg2);
	}

}
