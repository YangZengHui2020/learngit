package student;

public class Student {
	private String Xuehao;
	private String Name;
	private int Age;
	private String Sex;
	private String Banji;

	public Student(String Xuehao,String Name, int Age, String Sex, String Banji) {//���캯��
		super();
		this.Xuehao = Xuehao;
		this.Name = Name;
		this.Age = Age;
		this.Sex = Sex;
		this.Banji = Banji;
	}
//���ѧ��
	public String getXuehao() {
		return Xuehao;
	}

	public void setXuehao(String Xuehao) {
		this.Xuehao = Xuehao;
	}
//�������
	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
//�������
	public int getAge() {
		return Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}
//����Ա�
	public String getSex() {
		return Sex;
	}

	public void setSex(String Sex) {
		this.Sex = Sex;
	}
//��ð༶
	public String getBanji() {
		return Banji;
	}

	public void setBanji(String Banji) {
		this.Banji = Banji;
	}
//��ӡ���ѧ����Ϣ
	public void printInfo() {
		System.out.println("ѧ�ţ�" + Xuehao);
		System.out.println("������" + Name);
		System.out.println("����:" + Age);
		System.out.println("�Ա�" + Sex);
		System.out.println("�༶:" + Banji);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Student a = new Student("202012900838", "Yangzenghui", 20, "��", "��207");
		a.printInfo();//����printInfo()����

	}

}
