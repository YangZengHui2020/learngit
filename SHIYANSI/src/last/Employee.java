package last;

public class Employee extends Person implements add {//����̳и��ಢ���нӿ�ʵ��
	String ID;
	double wage;
	int workAge;
    add addwage;
	public Employee(String name, String address, String ID, double wage, int workAge) {//���췽��
		super(name, address);
		this.ID = ID;
		this.wage = wage;
		this.workAge = workAge;
	}
//���ID
	public String getID() {
		return ID;
	}
//����ID
	public void setID(String ID) {
		this.ID = ID;
	}
//��ù���
	public double getWage() {
		return wage;
	}
//���ù���
	public void setWage(double wage) {
		this.wage = wage;
	}
//��ù���
	public int getWorkAge() {
		return workAge;
	}
//���ù���
	public void setWorkAge(int workAge) {
		this.workAge = workAge;
	}

	public double addwage() {//���Ӻ���
		return wage * 1.1;
	}
	//��ӡ���
	public void printInfo() {
		System.out.println("name:"+name+" address:"+address+" id:"+ID+" wage:"+wage+" workAge:"+workAge);
		System.out.println("name:"+name+" address:"+address+" id:"+ID+" wage:"+addwage()+" workAge:"+workAge);
	}
	}
