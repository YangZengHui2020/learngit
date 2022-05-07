package last;

public class Manager extends Employee implements add {//子类继承父类并进行接口实现
     String level;
     public Manager(String name,String address,String ID,double wage,int workAge,String level) {
    	 super(name,address,ID,wage,workAge);
    	 this.level=level;
     }
     //获得等级
     public String getLevel() {
    	 return level;
     }
     //设置等级
     public void setLevel(String level) {
    	 this.level=level;
     }
     public double addwage() {//增加后工资
    	 return  wage=wage*1.2;
     }
     //打印输出
     public void printInfo() {
    	 System.out.println("name:"+name+" address:"+address+" id:"+ID+" wage:"+wage+" workAge:"+workAge+"   level:"+level);
    	 System.out.println("name:"+name+" address:"+address+" id:"+ID+" wage:"+addwage()+" workAge:"+workAge+"   level:"+level);
     }
}
