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

	@Selector("valueWithMethodVisitorWithIntWithStringWithString::::")
	public GeneratorAdapter valueWithMethodVisitorWithIntWithStringWithString(org.objectweb.asm.MethodVisitor arg0, int arg1, String arg2, String arg3) {
		GeneratorAdapter self = (GeneratorAdapter) GeneratorAdapter.alloc().init();
		self.original = new org.objectweb.asm.commons.GeneratorAdapter(arg0, arg1, arg2, arg3);
		return self;
	}

	@Selector("valueWithIntWithMethodWithMethodVisitor:::")
	public GeneratorAdapter valueWithIntWithMethodWithMethodVisitor(int arg0, org.objectweb.asm.commons.Method arg1, org.objectweb.asm.MethodVisitor arg2) {
		GeneratorAdapter self = (GeneratorAdapter) GeneratorAdapter.alloc().init();
		self.original = new org.objectweb.asm.commons.GeneratorAdapter(arg0, arg1, arg2);
		return self;
	}

	@Selector("valueWithIntWithMethodWithStringWithTypeWithClassVisitor:::::")
	public GeneratorAdapter valueWithIntWithMethodWithStringWithTypeWithClassVisitor(int arg0, org.objectweb.asm.commons.Method arg1, String arg2, org.objectweb.asm.Type[] arg3, org.objectweb.asm.ClassVisitor arg4) {
		GeneratorAdapter self = (GeneratorAdapter) GeneratorAdapter.alloc().init();
		self.original = new org.objectweb.asm.commons.GeneratorAdapter(arg0, arg1, arg2, arg3, arg4);
		return self;
	}

	@Selector("pushWithBoolean:")
	public void pushWithBoolean(boolean arg0) {
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

	@Selector("pushWithType:")
	public void pushWithType(org.objectweb.asm.Type arg0) {
		original.push(arg0);
	}

	@Selector("pushWithHandle:")
	public void pushWithHandle(org.objectweb.asm.Handle arg0) {
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

	@Selector("loadLocalWithIntWithType::")
	public void loadLocalWithIntWithType(int arg0, org.objectweb.asm.Type arg1) {
		original.loadLocal(arg0, arg1);
	}

	@Selector("storeLocalWithInt:")
	public void storeLocalWithInt(int arg0) {
		original.storeLocal(arg0);
	}

	@Selector("storeLocalWithIntWithType::")
	public void storeLocalWithIntWithType(int arg0, org.objectweb.asm.Type arg1) {
		original.storeLocal(arg0, arg1);
	}

	@Selector("arrayLoadWithType:")
	public void arrayLoadWithType(org.objectweb.asm.Type arg0) {
		original.arrayLoad(arg0);
	}

	@Selector("arrayStoreWithType:")
	public void arrayStoreWithType(org.objectweb.asm.Type arg0) {
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

	@Selector("swapWithTypeWithType::")
	public void swapWithTypeWithType(org.objectweb.asm.Type arg0, org.objectweb.asm.Type arg1) {
		original.swap(arg0, arg1);
	}

	@Selector("mathWithIntWithType::")
	public void mathWithIntWithType(int arg0, org.objectweb.asm.Type arg1) {
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

	@Selector("castWithTypeWithType::")
	public void castWithTypeWithType(org.objectweb.asm.Type arg0, org.objectweb.asm.Type arg1) {
		original.cast(arg0, arg1);
	}

	@Selector("boxWithType:")
	public void boxWithType(org.objectweb.asm.Type arg0) {
		original.box(arg0);
	}

	@Selector("valueOfWithType:")
	public void valueOfWithType(org.objectweb.asm.Type arg0) {
		original.valueOf(arg0);
	}

	@Selector("unboxWithType:")
	public void unboxWithType(org.objectweb.asm.Type arg0) {
		original.unbox(arg0);
	}

	@Selector("newLabel")
	public org.objectweb.asm.Label newLabel() {
		return original.newLabel();
	}

	@Selector("markWithLabel:")
	public void markWithLabel(org.objectweb.asm.Label arg0) {
		original.mark(arg0);
	}

	@Selector("mark")
	public org.objectweb.asm.Label mark() {
		return original.mark();
	}

	@Selector("ifCmpWithTypeWithIntWithLabel:::")
	public void ifCmpWithTypeWithIntWithLabel(org.objectweb.asm.Type arg0, int arg1, org.objectweb.asm.Label arg2) {
		original.ifCmp(arg0, arg1, arg2);
	}

	@Selector("ifICmpWithIntWithLabel::")
	public void ifICmpWithIntWithLabel(int arg0, org.objectweb.asm.Label arg1) {
		original.ifICmp(arg0, arg1);
	}

	@Selector("ifZCmpWithIntWithLabel::")
	public void ifZCmpWithIntWithLabel(int arg0, org.objectweb.asm.Label arg1) {
		original.ifZCmp(arg0, arg1);
	}

	@Selector("ifNullWithLabel:")
	public void ifNullWithLabel(org.objectweb.asm.Label arg0) {
		original.ifNull(arg0);
	}

	@Selector("ifNonNullWithLabel:")
	public void ifNonNullWithLabel(org.objectweb.asm.Label arg0) {
		original.ifNonNull(arg0);
	}

	@Selector("goToWithLabel:")
	public void goToWithLabel(org.objectweb.asm.Label arg0) {
		original.goTo(arg0);
	}

	@Selector("retWithInt:")
	public void retWithInt(int arg0) {
		original.ret(arg0);
	}

	@Selector("tableSwitchWithIntWithTableSwitchGenerator::")
	public void tableSwitchWithIntWithTableSwitchGenerator(int[] arg0, org.objectweb.asm.commons.TableSwitchGenerator arg1) {
		original.tableSwitch(arg0, arg1);
	}

	@Selector("tableSwitchWithIntWithTableSwitchGeneratorWithBoolean:::")
	public void tableSwitchWithIntWithTableSwitchGeneratorWithBoolean(int[] arg0, org.objectweb.asm.commons.TableSwitchGenerator arg1, boolean arg2) {
		original.tableSwitch(arg0, arg1, arg2);
	}

	@Selector("returnValue")
	public void returnValue() {
		original.returnValue();
	}

	@Selector("getStaticWithTypeWithStringWithType:::")
	public void getStaticWithTypeWithStringWithType(org.objectweb.asm.Type arg0, String arg1, org.objectweb.asm.Type arg2) {
		original.getStatic(arg0, arg1, arg2);
	}

	@Selector("putStaticWithTypeWithStringWithType:::")
	public void putStaticWithTypeWithStringWithType(org.objectweb.asm.Type arg0, String arg1, org.objectweb.asm.Type arg2) {
		original.putStatic(arg0, arg1, arg2);
	}

	@Selector("getFieldWithTypeWithStringWithType:::")
	public void getFieldWithTypeWithStringWithType(org.objectweb.asm.Type arg0, String arg1, org.objectweb.asm.Type arg2) {
		original.getField(arg0, arg1, arg2);
	}

	@Selector("putFieldWithTypeWithStringWithType:::")
	public void putFieldWithTypeWithStringWithType(org.objectweb.asm.Type arg0, String arg1, org.objectweb.asm.Type arg2) {
		original.putField(arg0, arg1, arg2);
	}

	@Selector("invokeVirtualWithTypeWithMethod::")
	public void invokeVirtualWithTypeWithMethod(org.objectweb.asm.Type arg0, org.objectweb.asm.commons.Method arg1) {
		original.invokeVirtual(arg0, arg1);
	}

	@Selector("invokeConstructorWithTypeWithMethod::")
	public void invokeConstructorWithTypeWithMethod(org.objectweb.asm.Type arg0, org.objectweb.asm.commons.Method arg1) {
		original.invokeConstructor(arg0, arg1);
	}

	@Selector("invokeStaticWithTypeWithMethod::")
	public void invokeStaticWithTypeWithMethod(org.objectweb.asm.Type arg0, org.objectweb.asm.commons.Method arg1) {
		original.invokeStatic(arg0, arg1);
	}

	@Selector("invokeInterfaceWithTypeWithMethod::")
	public void invokeInterfaceWithTypeWithMethod(org.objectweb.asm.Type arg0, org.objectweb.asm.commons.Method arg1) {
		original.invokeInterface(arg0, arg1);
	}

	@Selector("invokeDynamicWithStringWithStringWithHandleWithObject::::")
	public void invokeDynamicWithStringWithStringWithHandleWithObject(String arg0, String arg1, org.objectweb.asm.Handle arg2, Object[] arg3) {
		original.invokeDynamic(arg0, arg1, arg2, arg3);
	}

	@Selector("newInstanceWithType:")
	public void newInstanceWithType(org.objectweb.asm.Type arg0) {
		original.newInstance(arg0);
	}

	@Selector("newArrayWithType:")
	public void newArrayWithType(org.objectweb.asm.Type arg0) {
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

	@Selector("throwExceptionWithTypeWithString::")
	public void throwExceptionWithTypeWithString(org.objectweb.asm.Type arg0, String arg1) {
		original.throwException(arg0, arg1);
	}

	@Selector("checkCastWithType:")
	public void checkCastWithType(org.objectweb.asm.Type arg0) {
		original.checkCast(arg0);
	}

	@Selector("instanceOfWithType:")
	public void instanceOfWithType(org.objectweb.asm.Type arg0) {
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

	@Selector("catchExceptionWithLabelWithLabelWithType:::")
	public void catchExceptionWithLabelWithLabelWithType(org.objectweb.asm.Label arg0, org.objectweb.asm.Label arg1, org.objectweb.asm.Type arg2) {
		original.catchException(arg0, arg1, arg2);
	}

}
