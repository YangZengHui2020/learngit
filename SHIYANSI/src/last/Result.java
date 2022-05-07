package last;
//定义结果类
public class Result {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建对象
		Employee a=new  Employee("Yangzenghui","putian","0001",1000,2);
		Manager b=new Manager("Yangzenghui","putian","0002",10000,5,"D");
		//函数调用
		a.printInfo();
		a.addwage();
		b.printInfo();
		b.addwage();
		
		
	}
}
