package last;
//��������
public class Result {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//��������
		Employee a=new  Employee("Yangzenghui","putian","0001",1000,2);
		Manager b=new Manager("Yangzenghui","putian","0002",10000,5,"D");
		//��������
		a.printInfo();
		a.addwage();
		b.printInfo();
		b.addwage();
		
		
	}
}
