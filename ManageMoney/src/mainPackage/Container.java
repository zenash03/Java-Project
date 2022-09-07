package mainPackage;

public class Container<A, B, C, D> {
	private A data1;
	private B data2;
	private C data3;
	private D data4;

	public Container(A data1, B data2, C data3, D data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
	public void setData(A data1, B data2, C data3, D data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	public A getData1() {
		return this.data1;
	}
	public B getData2() {
		return this.data2;
	}
	public C getData3() {
		return this.data3;
	}
	public D getData4() {
		return this.data4;
	}
}
