public class Clock {
	private Display hour= new Display(24);
	private Display minute= new Display(60);

	public void start(){
		for(int i=0;i==0;){
		minute.increase();
		if(minute.getValue()== 0)
			hour.increase();
	
	System.out.printf("%02d:%02d\n",hour.getValue(),minute.getValue());
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock = new Clock();
		clock.start();
	}

}
