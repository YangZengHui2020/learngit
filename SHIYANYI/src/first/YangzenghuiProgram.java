package first;

public class YangzenghuiProgram {
	private int data;
	private String  str;
    int  getData()//获得数据
    {
    	return data;
    }
    String getStr()//获得str
    {
    	return str;
    }
    public void setData(int data)//设置数据,即赋值
  	{
       this.data=data;
  	}
  	 public void setStr(String  str)//设置str
  	{
  	this.str=str;
  	}
    String toStr()//将对象转换为字符串输出
    {
    	return  "data="+data+"str="+str;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        YangzenghuiProgram  x=new YangzenghuiProgram();
        //调用函数
        x.setData(19);
        x.setStr("helloworld");
        System.out.println(x.toStr());
	}

}
