package qiche;

public class Car {
	String Name;
	int Speed;

	public Car(String Name, int Speed) {// ���캯��
		super();
		this.Name = Name;
		this.Speed = Speed;
	}

	public String getName() {//��ó�����
		return Name;
	}

	public void changeName(String Name) {//�ı䳵����
		this.Name = Name;
	}

	public int getSpeed() {//��ó���
		return Speed;
	}

	public void changeSpeed(int Speed) {//�ı䳵��
		this.Speed = Speed;
	}

	public void stop() {//ͣ������
		this.Speed = 0;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Car a = new Car("Yangzenghui", 0);
		//��������
		a.getName();
		a.getSpeed();
		System.out.println("��ʼ�ٶ�Ϊ��" + a.getSpeed());
		System.out.println("����Ϊ��" + a.getName());
		System.out.println("------------------------");
		a.changeName("huizengYang");
		System.out.println("����Ϊ��" + a.getName());
		a.changeSpeed(20);
		System.out.println("��ǰ�ٶ�Ϊ��" + a.getSpeed());
		a.stop();
		System.out.println("ͣ�����ٶ�Ϊ:" + a.getSpeed());
	}
}
