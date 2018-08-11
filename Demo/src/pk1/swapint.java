package pk1;

public class swapint {

	public static void main(String[] args) 
	{
		int x=5;
		int y=10;
		
		//int t;
		//t=x;
		//x=y;
		//y=t;
		
	//	without using third variable
		
	//	x=x+y; //15
	//	y=x-y; // 5
	//	x= x-y;
		
	// another method
	//	x=x*y; //50
	//	y=x/y; //5
	//	x=x/y; //10
		
		//using xor operator
		x=x^y; //1111 // 15
		y=x^y; //1010  //10
		x=x^y; //0101 //5
		
		
		System.out.println(+x);
		System.out.println(+y);

	}

}
