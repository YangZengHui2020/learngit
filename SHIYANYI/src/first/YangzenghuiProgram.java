package first;

public class YangzenghuiProgram {
	private int data;
	private String  str;
    int  getData()//�������
    {
    	return data;
    }
    String getStr()//���str
    {
    	return str;
    }
    public void setData(int data)//��������,����ֵ
  	{
       this.data=data;
  	}
  	 public void setStr(String  str)//����str
  	{
  	this.str=str;
  	}
    String toStr()//������ת��Ϊ�ַ������
    {
    	return  "data="+data+"str="+str;
    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        YangzenghuiProgram  x=new YangzenghuiProgram();
        //���ú���
        x.setData(19);
        x.setStr("helloworld");
        System.out.println(x.toStr());
	}

}
