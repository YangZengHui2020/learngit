package student;

public class Student {
	private String Xuehao;
	private String Name;
	private int Age;
	private String Sex;
	private String Banji;

	public Student(String Xuehao,String Name, int Age, String Sex, String Banji) {//构造函数
		super();
		this.Xuehao = Xuehao;
		this.Name = Name;
		this.Age = Age;
		this.Sex = Sex;
		this.Banji = Banji;
	}
//获得学号
	public String getXuehao() {
		return Xuehao;
	}

	public void setXuehao(String Xuehao) {
		this.Xuehao = Xuehao;
	}
//获得姓名
	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
//获得年龄
	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}
//获得性别
	public String getSex() {
		return Sex;
	}

	public void setSex(String Sex) {
		this.Sex = Sex;
	}
//获得班级
	public String getBanji() {
		return Banji;
	}

	public void setBanji(String Banji) {
		this.Banji = Banji;
	}
//打印输出学生信息
	public void printInfo() {
		System.out.println("学号：" + Xuehao);
		System.out.println("姓名：" + Name);
		System.out.println("年龄:" + Age);
		System.out.println("性别：" + Sex);
		System.out.println("班级:" + Banji);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student a = new Student("202012900838", "Yangzenghui", 20, "男", "软工207");
		a.printInfo();//调用printInfo()方法

	}

}
