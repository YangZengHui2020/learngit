package last;

public class Person {
	String name;
	String address;

	public Person(String name, String address) {//���췽��
		this.name = name;
		this.address = address;
	}
//�������
	public String getName() {
		return name;
	}
//��������
	public void setName(String name) {
		this.name = name;
	}
//��õ�ַ
	public String getAddress() {
		return address;
	}
//���õ�ַ
	public void setAddress(String address) {
		this.address = address;
	}
}
