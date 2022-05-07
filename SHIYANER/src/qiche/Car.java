package qiche;

public class Car {
	String Name;
	int Speed;

	public Car(String Name, int Speed) {// 构造函数
		super();
		this.Name = Name;
		this.Speed = Speed;
	}

	public String getName() {//获得车主名
		return Name;
	}

	public void changeName(String Name) {//改变车主名
		this.Name = Name;
	}

	public int getSpeed() {//获得车速
		return Speed;
	}

	public void changeSpeed(int Speed) {//改变车速
		this.Speed = Speed;
	}

	public void stop() {//停车操作
		this.Speed = 0;
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Car a = new Car("Yangzenghui", 0);
		//函数调用
		a.getName();
		a.getSpeed();
		System.out.println("初始速度为：" + a.getSpeed());
		System.out.println("车主为：" + a.getName());
		System.out.println("------------------------");
		a.changeName("huizengYang");
		System.out.println("车主为：" + a.getName());
		a.changeSpeed(20);
		System.out.println("当前速度为：" + a.getSpeed());
		a.stop();
		System.out.println("停车后，速度为:" + a.getSpeed());
	}
}
