package last;

public class Person {
	String name;
	String address;

	public Person(String name, String address) {//构造方法
		this.name = name;
		this.address = address;
	}
//获得姓名
	public String getName() {
		return name;
	}
//设置姓名
	public void setName(String name) {
		this.name = name;
	}
//获得地址
	public String getAddress() {
		return address;
	}
//设置地址
	public void setAddress(String address) {
		this.address = address;
	}
}
