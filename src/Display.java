
public class Display {
	private int value=0;
	private int limit=0;
	
	//��Ϊ������limit ���ޣ�����
	public Display(int limit){
		this.limit=limit;
	}
	
	
	public void increase(){
		value++;
		if(value == limit){
			value = 0;//�������ӵ�value ֵ������Ӧ�ĵط������з�ת���ص�0��
		}
	}
	  
	public int getValue(){
		return value;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d =new Display(60);//60 ��limit
		for (;;){
			d.increase();
		System.out.println(d.getValue());
	}

}
}
