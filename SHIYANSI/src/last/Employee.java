package last;

public class Employee extends Person implements add {//子类继承父类并进行接口实现
	String ID;
	double wage;
	int workAge;
    add addwage;
	public Employee(String name, String address, String ID, double wage, int workAge) {//构造方法
		super(name, address);
		this.ID = ID;
		this.wage = wage;
		this.workAge = workAge;
	}
//获得ID
	public String getID() {
		return ID;
	}
//设置ID
	public void setID(String ID) {
		this.ID = ID;
	}
//获得工资
	public double getWage() {
		return wage;
	}
//设置工资
	public void setWage(double wage) {
		this.wage = wage;
	}
//获得工龄
	public int getWorkAge() {
		return workAge;
	}
//设置工龄
	public void setWorkAge(int workAge) {
		this.workAge = workAge;
	}

	public double addwage() {//增加后工资
		return wage * 1.1;
	}
	//打印输出
	public void printInfo() {
		System.out.println("name:"+name+" address:"+address+" id:"+ID+" wage:"+wage+" workAge:"+workAge);
		System.out.println("name:"+name+" address:"+address+" id:"+ID+" wage:"+addwage()+" workAge:"+workAge);
	}
	}
