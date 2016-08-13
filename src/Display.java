
public class Display {
	private int value=0;
	private int limit=0;
	
	//因为有两个limit 上限，构造
	public Display(int limit){
		this.limit=limit;
	}
	
	
	public void increase(){
		value++;
		if(value == limit){
			value = 0;//不断增加的value 值到达相应的地方。进行反转，回到0；
		}
	}
	  
	public int getValue(){
		return value;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d =new Display(60);//60 是limit
		for (;;){
			d.increase();
		System.out.println(d.getValue());
	}

}
}
