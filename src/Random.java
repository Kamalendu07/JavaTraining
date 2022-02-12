import java.util.Random;
public class Abc {
// global
	Random R;
	int number;
	Abc(){
		R=new Random();
//		int number=0;
		mn(R,number);
	
	}

	void mn(Random R,int number){
		number=R.nextInt(10)+1;
		System.out.println(number);
	}
}