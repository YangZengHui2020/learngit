package number;

public class Yangzenghui_PerfectNumber {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int total=0;
		for(int i=1;i<=9999;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {   
				if(i%j==0) {
					sum+=j;
				}
			}
			if(sum==i) {
				System.out.println(i + "������");
				total++;
			}
		}
		System.out.println("9999��������һ����"+ total +"��" );
	}

}
