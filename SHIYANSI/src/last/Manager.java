package last;

public class Manager extends Employee implements add {//����̳и��ಢ���нӿ�ʵ��
     String level;
     public Manager(String name,String address,String ID,double wage,int workAge,String level) {
    	 super(name,address,ID,wage,workAge);
    	 this.level=level;
     }
     //��õȼ�
     public String getLevel() {
    	 return level;
     }
     //���õȼ�
     public void setLevel(String level) {
    	 this.level=level;
     }
     public double addwage() {//���Ӻ���
    	 return  wage=wage*1.2;
     }
     //��ӡ���
     public void printInfo() {
    	 System.out.println("name:"+name+" address:"+address+" id:"+ID+" wage:"+wage+" workAge:"+workAge+"   level:"+level);
    	 System.out.println("name:"+name+" address:"+address+" id:"+ID+" wage:"+addwage()+" workAge:"+workAge+"   level:"+level);
     }
}
