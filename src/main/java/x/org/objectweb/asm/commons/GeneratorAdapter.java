package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBGeneratorAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class GeneratorAdapter extends NSObject {	
	
	public org.objectweb.asm.commons.GeneratorAdapter original;	
	
	protected GeneratorAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native GeneratorAdapter alloc();	
	
	@Selector("valueWithMethodVisitor:withInt:withString:withString:")	
	public GeneratorAdapter valueWithMethodVisitorwithIntwithStringwithString(Object arg0, int arg1, String arg2, String arg3) {
		GeneratorAdapter self = (GeneratorAdapter) GeneratorAdapter.alloc().init();		
		self.original = new org.objectweb.asm.commons.GeneratorAdapter((org.objectweb.asm.MethodVisitor) arg0, arg1, arg2, arg3);		
		return self;		
	}	
	
	@Selector("valueWithInt:withMethod:withMethodVisitor:")	
	public GeneratorAdapter valueWithIntwithMethodwithMethodVisitor(int arg0, Method arg1, Object arg2) {
		GeneratorAdapter self = (GeneratorAdapter) GeneratorAdapter.alloc().init();		
		self.original = new org.objectweb.asm.commons.GeneratorAdapter(arg0, arg1.original, (org.objectweb.asm.MethodVisitor) arg2);		
		return self;		
	}	
	
	@Selector("valueWithInt:withMethod:withString:withType:withClassVisitor:")	
	public GeneratorAdapter valueWithIntwithMethodwithStringwithTypewithClassVisitor(int arg0, Method arg1, String arg2, org.objectweb.asm.Type[] arg3, Object arg4) {
		GeneratorAdapter self = (GeneratorAdapter) GeneratorAdapter.alloc().init();		
		self.original = new org.objectweb.asm.commons.GeneratorAdapter(arg0, arg1.original, arg2, arg3, (org.objectweb.asm.ClassVisitor) arg4);		
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
	public void pushWithType(x.org.objectweb.asm.Type arg0) {		
		original.push(arg0.original);		
	}	
	
	@Selector("pushWithHandle:")	
	public void pushWithHandle(x.org.objectweb.asm.Handle arg0) {		
		original.push(arg0.original);		
	}	
	
	@Selector("loadThis")	
	public void loadThis() {		
		original.loadThis();		
	}	
	
	@Selector("loadArgWithInt:")	
	public void loadArgWithInt(int arg0) {		
		original.loadArg(arg0);		
	}	
	
	@Selector("loadArgsWithInt:withInt:")	
	public void loadArgsWithIntwithInt(int arg0, int arg1) {		
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
	public x.org.objectweb.asm.Type getLocalTypeWithInt(int arg0) {		
		x.org.objectweb.asm.Type ret = (x.org.objectweb.asm.Type) x.org.objectweb.asm.Type.alloc().init();		
		ret.original = original.getLocalType(arg0);		
		return ret;		
	}	
	
	@Selector("loadLocalWithInt:")	
	public void loadLocalWithInt(int arg0) {		
		original.loadLocal(arg0);		
	}	
	
	@Selector("loadLocalWithInt:withType:")	
	public void loadLocalWithIntwithType(int arg0, x.org.objectweb.asm.Type arg1) {		
		original.loadLocal(arg0, arg1.original);		
	}	
	
	@Selector("storeLocalWithInt:")	
	public void storeLocalWithInt(int arg0) {		
		original.storeLocal(arg0);		
	}	
	
	@Selector("storeLocalWithInt:withType:")	
	public void storeLocalWithIntwithType(int arg0, x.org.objectweb.asm.Type arg1) {		
		original.storeLocal(arg0, arg1.original);		
	}	
	
	@Selector("arrayLoadWithType:")	
	public void arrayLoadWithType(x.org.objectweb.asm.Type arg0) {		
		original.arrayLoad(arg0.original);		
	}	
	
	@Selector("arrayStoreWithType:")	
	public void arrayStoreWithType(x.org.objectweb.asm.Type arg0) {		
		original.arrayStore(arg0.original);		
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
	
	@Selector("swapWithType:withType:")	
	public void swapWithTypewithType(x.org.objectweb.asm.Type arg0, x.org.objectweb.asm.Type arg1) {		
		original.swap(arg0.original, arg1.original);		
	}	
	
	@Selector("mathWithInt:withType:")	
	public void mathWithIntwithType(int arg0, x.org.objectweb.asm.Type arg1) {		
		original.math(arg0, arg1.original);		
	}	
	
	@Selector("not")	
	public void not() {		
		original.not();		
	}	
	
	@Selector("iincWithInt:withInt:")	
	public void iincWithIntwithInt(int arg0, int arg1) {		
		original.iinc(arg0, arg1);		
	}	
	
	@Selector("castWithType:withType:")	
	public void castWithTypewithType(x.org.objectweb.asm.Type arg0, x.org.objectweb.asm.Type arg1) {		
		original.cast(arg0.original, arg1.original);		
	}	
	
	@Selector("boxWithType:")	
	public void boxWithType(x.org.objectweb.asm.Type arg0) {		
		original.box(arg0.original);		
	}	
	
	@Selector("valueOfWithType:")	
	public void valueOfWithType(x.org.objectweb.asm.Type arg0) {		
		original.valueOf(arg0.original);		
	}	
	
	@Selector("unboxWithType:")	
	public void unboxWithType(x.org.objectweb.asm.Type arg0) {		
		original.unbox(arg0.original);		
	}	
	
	@Selector("newLabel")	
	public x.org.objectweb.asm.Label newLabel() {		
		x.org.objectweb.asm.Label ret = (x.org.objectweb.asm.Label) x.org.objectweb.asm.Label.alloc().init();		
		ret.original = original.newLabel();		
		return ret;		
	}	
	
	@Selector("markWithLabel:")	
	public void markWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.mark(arg0.original);		
	}	
	
	@Selector("mark")	
	public x.org.objectweb.asm.Label mark() {		
		x.org.objectweb.asm.Label ret = (x.org.objectweb.asm.Label) x.org.objectweb.asm.Label.alloc().init();		
		ret.original = original.mark();		
		return ret;		
	}	
	
	@Selector("ifCmpWithType:withInt:withLabel:")	
	public void ifCmpWithTypewithIntwithLabel(x.org.objectweb.asm.Type arg0, int arg1, x.org.objectweb.asm.Label arg2) {		
		original.ifCmp(arg0.original, arg1, arg2.original);		
	}	
	
	@Selector("ifICmpWithInt:withLabel:")	
	public void ifICmpWithIntwithLabel(int arg0, x.org.objectweb.asm.Label arg1) {		
		original.ifICmp(arg0, arg1.original);		
	}	
	
	@Selector("ifZCmpWithInt:withLabel:")	
	public void ifZCmpWithIntwithLabel(int arg0, x.org.objectweb.asm.Label arg1) {		
		original.ifZCmp(arg0, arg1.original);		
	}	
	
	@Selector("ifNullWithLabel:")	
	public void ifNullWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ifNull(arg0.original);		
	}	
	
	@Selector("ifNonNullWithLabel:")	
	public void ifNonNullWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.ifNonNull(arg0.original);		
	}	
	
	@Selector("goToWithLabel:")	
	public void goToWithLabel(x.org.objectweb.asm.Label arg0) {		
		original.goTo(arg0.original);		
	}	
	
	@Selector("retWithInt:")	
	public void retWithInt(int arg0) {		
		original.ret(arg0);		
	}	
	
	@Selector("tableSwitchWithInt:withTableSwitchGenerator:")	
	public void tableSwitchWithIntwithTableSwitchGenerator(int[] arg0, Object arg1) {
		original.tableSwitch(arg0, (org.objectweb.asm.commons.TableSwitchGenerator) arg1);		
	}	
	
	@Selector("tableSwitchWithInt:withTableSwitchGenerator:withBoolean:")	
	public void tableSwitchWithIntwithTableSwitchGeneratorwithBoolean(int[] arg0, Object arg1, boolean arg2) {
		original.tableSwitch(arg0, (org.objectweb.asm.commons.TableSwitchGenerator) arg1, arg2);		
	}	
	
	@Selector("returnValue")	
	public void returnValue() {		
		original.returnValue();		
	}	
	
	@Selector("getStaticWithType:withString:withType:")	
	public void getStaticWithTypewithStringwithType(x.org.objectweb.asm.Type arg0, String arg1, x.org.objectweb.asm.Type arg2) {
		original.getStatic(arg0.original, arg1, arg2.original);		
	}	
	
	@Selector("putStaticWithType:withString:withType:")	
	public void putStaticWithTypewithStringwithType(x.org.objectweb.asm.Type arg0, String arg1, x.org.objectweb.asm.Type arg2) {
		original.putStatic(arg0.original, arg1, arg2.original);		
	}	
	
	@Selector("getFieldWithType:withString:withType:")	
	public void getFieldWithTypewithStringwithType(x.org.objectweb.asm.Type arg0, String arg1, x.org.objectweb.asm.Type arg2) {
		original.getField(arg0.original, arg1, arg2.original);		
	}	
	
	@Selector("putFieldWithType:withString:withType:")	
	public void putFieldWithTypewithStringwithType(x.org.objectweb.asm.Type arg0, String arg1, x.org.objectweb.asm.Type arg2) {
		original.putField(arg0.original, arg1, arg2.original);		
	}	
	
	@Selector("invokeVirtualWithType:withMethod:")	
	public void invokeVirtualWithTypewithMethod(x.org.objectweb.asm.Type arg0, Method arg1) {
		original.invokeVirtual(arg0.original, arg1.original);		
	}	
	
	@Selector("invokeConstructorWithType:withMethod:")	
	public void invokeConstructorWithTypewithMethod(x.org.objectweb.asm.Type arg0, Method arg1) {
		original.invokeConstructor(arg0.original, arg1.original);		
	}	
	
	@Selector("invokeStaticWithType:withMethod:")	
	public void invokeStaticWithTypewithMethod(x.org.objectweb.asm.Type arg0, Method arg1) {
		original.invokeStatic(arg0.original, arg1.original);		
	}	
	
	@Selector("invokeInterfaceWithType:withMethod:")	
	public void invokeInterfaceWithTypewithMethod(x.org.objectweb.asm.Type arg0, Method arg1) {
		original.invokeInterface(arg0.original, arg1.original);		
	}	
	
	@Selector("invokeDynamicWithString:withString:withHandle:withObject:")	
	public void invokeDynamicWithStringwithStringwithHandlewithObject(String arg0, String arg1, x.org.objectweb.asm.Handle arg2, Object[] arg3) {
		original.invokeDynamic(arg0, arg1, arg2.original, arg3);		
	}	
	
	@Selector("newInstanceWithType:")	
	public void newInstanceWithType(x.org.objectweb.asm.Type arg0) {		
		original.newInstance(arg0.original);		
	}	
	
	@Selector("newArrayWithType:")	
	public void newArrayWithType(x.org.objectweb.asm.Type arg0) {		
		original.newArray(arg0.original);		
	}	
	
	@Selector("arrayLength")	
	public void arrayLength() {		
		original.arrayLength();		
	}	
	
	@Selector("throwException")	
	public void throwException() {		
		original.throwException();		
	}	
	
	@Selector("throwExceptionWithType:withString:")	
	public void throwExceptionWithTypewithString(x.org.objectweb.asm.Type arg0, String arg1) {
		original.throwException(arg0.original, arg1);		
	}	
	
	@Selector("checkCastWithType:")	
	public void checkCastWithType(x.org.objectweb.asm.Type arg0) {		
		original.checkCast(arg0.original);		
	}	
	
	@Selector("instanceOfWithType:")	
	public void instanceOfWithType(x.org.objectweb.asm.Type arg0) {		
		original.instanceOf(arg0.original);		
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
	
	@Selector("catchExceptionWithLabel:withLabel:withType:")	
	public void catchExceptionWithLabelwithLabelwithType(x.org.objectweb.asm.Label arg0, x.org.objectweb.asm.Label arg1, x.org.objectweb.asm.Type arg2) {		
		original.catchException(arg0.original, arg1.original, arg2.original);		
	}	
}
