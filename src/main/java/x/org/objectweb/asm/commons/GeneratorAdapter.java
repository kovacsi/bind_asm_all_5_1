package x.org.objectweb.asm.commons;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_objectweb_asm_commons_GeneratorAdapter")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class GeneratorAdapter extends NSObject {	
	
	public org.objectweb.asm.commons.GeneratorAdapter original;	
	
	protected GeneratorAdapter(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("pushWithBoolean:")	
	public void push(boolean arg0) {		
		original.push(arg0);		
	}	
	
	@Selector("pushWithInt:")	
	public void push(int arg0) {		
		original.push(arg0);		
	}	
	
	@Selector("pushWithLong:")	
	public void push(long arg0) {		
		original.push(arg0);		
	}	
	
	@Selector("pushWithFloat:")	
	public void push(float arg0) {		
		original.push(arg0);		
	}	
	
	@Selector("pushWithDouble:")	
	public void push(double arg0) {		
		original.push(arg0);		
	}	
	
	@Selector("pushWithString:")	
	public void push(String arg0) {
		original.push(arg0);		
	}	
	
	@Selector("pushWithType:")	
	public void push(org.objectweb.asm.Type arg0) {		
		original.push(arg0);		
	}	
	
	@Selector("pushWithHandle:")	
	public void push(org.objectweb.asm.Handle arg0) {		
		original.push(arg0);		
	}	
	
	@Selector("loadThis")	
	public void loadThis() {		
		original.loadThis();		
	}	
	
	@Selector("loadArgWithInt:")	
	public void loadArg(int arg0) {		
		original.loadArg(arg0);		
	}	
	
	@Selector("loadArgsWithInt:withInt:")	
	public void loadArgs(int arg0, int arg1) {		
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
	public void storeArg(int arg0) {		
		original.storeArg(arg0);		
	}	
	
	@Selector("getLocalTypeWithInt:")	
	public x.org.objectweb.asm.Type getLocalType(int arg0) {		
		x.org.objectweb.asm.Type ret = (x.org.objectweb.asm.Type) x.org.objectweb.asm.Type.alloc().init();		
		ret.original = original.getLocalType(arg0);		
		return ret;		
	}	
	
	@Selector("loadLocalWithInt:")	
	public void loadLocal(int arg0) {		
		original.loadLocal(arg0);		
	}	
	
	@Selector("loadLocalWithInt:withType:")	
	public void loadLocal(int arg0, org.objectweb.asm.Type arg1) {		
		original.loadLocal(arg0, arg1);		
	}	
	
	@Selector("storeLocalWithInt:")	
	public void storeLocal(int arg0) {		
		original.storeLocal(arg0);		
	}	
	
	@Selector("storeLocalWithInt:withType:")	
	public void storeLocal(int arg0, org.objectweb.asm.Type arg1) {		
		original.storeLocal(arg0, arg1);		
	}	
	
	@Selector("arrayLoadWithType:")	
	public void arrayLoad(org.objectweb.asm.Type arg0) {		
		original.arrayLoad(arg0);		
	}	
	
	@Selector("arrayStoreWithType:")	
	public void arrayStore(org.objectweb.asm.Type arg0) {		
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
	
	@Selector("swapWithType:withType:")	
	public void swap(org.objectweb.asm.Type arg0, org.objectweb.asm.Type arg1) {		
		original.swap(arg0, arg1);		
	}	
	
	@Selector("mathWithInt:withType:")	
	public void math(int arg0, org.objectweb.asm.Type arg1) {		
		original.math(arg0, arg1);		
	}	
	
	@Selector("not")	
	public void not() {		
		original.not();		
	}	
	
	@Selector("iincWithInt:withInt:")	
	public void iinc(int arg0, int arg1) {		
		original.iinc(arg0, arg1);		
	}	
	
	@Selector("castWithType:withType:")	
	public void cast(org.objectweb.asm.Type arg0, org.objectweb.asm.Type arg1) {		
		original.cast(arg0, arg1);		
	}	
	
	@Selector("boxWithType:")	
	public void box(org.objectweb.asm.Type arg0) {		
		original.box(arg0);		
	}	
	
	@Selector("valueOfWithType:")	
	public void valueOf(org.objectweb.asm.Type arg0) {		
		original.valueOf(arg0);		
	}	
	
	@Selector("unboxWithType:")	
	public void unbox(org.objectweb.asm.Type arg0) {		
		original.unbox(arg0);		
	}	
	
	@Selector("newLabel")	
	public x.org.objectweb.asm.Label newLabel() {		
		x.org.objectweb.asm.Label ret = (x.org.objectweb.asm.Label) x.org.objectweb.asm.Label.alloc().init();		
		ret.original = original.newLabel();		
		return ret;		
	}	
	
	@Selector("markWithLabel:")	
	public void mark(org.objectweb.asm.Label arg0) {		
		original.mark(arg0);		
	}	
	
	@Selector("mark")	
	public x.org.objectweb.asm.Label mark() {		
		x.org.objectweb.asm.Label ret = (x.org.objectweb.asm.Label) x.org.objectweb.asm.Label.alloc().init();		
		ret.original = original.mark();		
		return ret;		
	}	
	
	@Selector("ifCmpWithType:withInt:withLabel:")	
	public void ifCmp(org.objectweb.asm.Type arg0, int arg1, org.objectweb.asm.Label arg2) {		
		original.ifCmp(arg0, arg1, arg2);		
	}	
	
	@Selector("ifICmpWithInt:withLabel:")	
	public void ifICmp(int arg0, org.objectweb.asm.Label arg1) {		
		original.ifICmp(arg0, arg1);		
	}	
	
	@Selector("ifZCmpWithInt:withLabel:")	
	public void ifZCmp(int arg0, org.objectweb.asm.Label arg1) {		
		original.ifZCmp(arg0, arg1);		
	}	
	
	@Selector("ifNullWithLabel:")	
	public void ifNull(org.objectweb.asm.Label arg0) {		
		original.ifNull(arg0);		
	}	
	
	@Selector("ifNonNullWithLabel:")	
	public void ifNonNull(org.objectweb.asm.Label arg0) {		
		original.ifNonNull(arg0);		
	}	
	
	@Selector("goToWithLabel:")	
	public void goTo(org.objectweb.asm.Label arg0) {		
		original.goTo(arg0);		
	}	
	
	@Selector("retWithInt:")	
	public void ret(int arg0) {		
		original.ret(arg0);		
	}	
	
	@Selector("tableSwitchWithInt:withTableSwitchGenerator:")	
	public void tableSwitch(int[] arg0, org.objectweb.asm.commons.TableSwitchGenerator arg1) {		
		original.tableSwitch(arg0, arg1);		
	}	
	
	@Selector("tableSwitchWithInt:withTableSwitchGenerator:withBoolean:")	
	public void tableSwitch(int[] arg0, org.objectweb.asm.commons.TableSwitchGenerator arg1, boolean arg2) {		
		original.tableSwitch(arg0, arg1, arg2);		
	}	
	
	@Selector("returnValue")	
	public void returnValue() {		
		original.returnValue();		
	}	
	
	@Selector("getStaticWithType:withString:withType:")	
	public void getStatic(org.objectweb.asm.Type arg0, String arg1, org.objectweb.asm.Type arg2) {
		original.getStatic(arg0, arg1, arg2);		
	}	
	
	@Selector("putStaticWithType:withString:withType:")	
	public void putStatic(org.objectweb.asm.Type arg0, String arg1, org.objectweb.asm.Type arg2) {
		original.putStatic(arg0, arg1, arg2);		
	}	
	
	@Selector("getFieldWithType:withString:withType:")	
	public void getField(org.objectweb.asm.Type arg0, String arg1, org.objectweb.asm.Type arg2) {
		original.getField(arg0, arg1, arg2);		
	}	
	
	@Selector("putFieldWithType:withString:withType:")	
	public void putField(org.objectweb.asm.Type arg0, String arg1, org.objectweb.asm.Type arg2) {
		original.putField(arg0, arg1, arg2);		
	}	
	
	@Selector("invokeVirtualWithType:withMethod:")	
	public void invokeVirtual(org.objectweb.asm.Type arg0, org.objectweb.asm.commons.Method arg1) {		
		original.invokeVirtual(arg0, arg1);		
	}	
	
	@Selector("invokeConstructorWithType:withMethod:")	
	public void invokeConstructor(org.objectweb.asm.Type arg0, org.objectweb.asm.commons.Method arg1) {		
		original.invokeConstructor(arg0, arg1);		
	}	
	
	@Selector("invokeStaticWithType:withMethod:")	
	public void invokeStatic(org.objectweb.asm.Type arg0, org.objectweb.asm.commons.Method arg1) {		
		original.invokeStatic(arg0, arg1);		
	}	
	
	@Selector("invokeInterfaceWithType:withMethod:")	
	public void invokeInterface(org.objectweb.asm.Type arg0, org.objectweb.asm.commons.Method arg1) {		
		original.invokeInterface(arg0, arg1);		
	}	
	
	@Selector("invokeDynamicWithString:withString:withHandle:withObject:")	
	public void invokeDynamic(String arg0, String arg1, org.objectweb.asm.Handle arg2, Object[] arg3) {
		original.invokeDynamic(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("newInstanceWithType:")	
	public void newInstance(org.objectweb.asm.Type arg0) {		
		original.newInstance(arg0);		
	}	
	
	@Selector("newArrayWithType:")	
	public void newArray(org.objectweb.asm.Type arg0) {		
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
	
	@Selector("throwExceptionWithType:withString:")	
	public void throwException(org.objectweb.asm.Type arg0, String arg1) {
		original.throwException(arg0, arg1);		
	}	
	
	@Selector("checkCastWithType:")	
	public void checkCast(org.objectweb.asm.Type arg0) {		
		original.checkCast(arg0);		
	}	
	
	@Selector("instanceOfWithType:")	
	public void instanceOf(org.objectweb.asm.Type arg0) {		
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
	
	@Selector("catchExceptionWithLabel:withLabel:withType:")	
	public void catchException(org.objectweb.asm.Label arg0, org.objectweb.asm.Label arg1, org.objectweb.asm.Type arg2) {		
		original.catchException(arg0, arg1, arg2);		
	}	
}
