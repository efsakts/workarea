import java.util.Iterator;
import java.util.Random;

public class Test extends AArrayOperations {
	
/*	Your class constructor must fill myArray with random odd integers.

	2. Your class constructor must have three parameters, and all parameters must be integers. One of the parameters must represent 

	length of myArray. The other two must represent upper bound and lower bound of the random numbers.

	3. Your constructor must throw an exception if the upper bound is lower than the lower bound.

	3. Implement the findMax, getLowerThan and findAverage methods as described above. */

public Test(int l,int u,int b) throws Exception{
	
try {
	myArray = new int[l];
	if(u>b) {
	Random ran=new Random();
	for (int i=0;i<l;i++) {
		int number = ran.nextInt(u - b + 1) + b;
		if(number%2==1) {
			myArray[i] = number;
		}
		else { i--;};
	
		
	}
	for (int i = 0; i < myArray.length; i++) {
		System.out.print(myArray[i] + " ");
	}
	System.out.println();
	}
		
} catch(Exception e) {
	System.out.println(e.getMessage());
}
	
	
}
	@Override
	public double findAverage() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<myArray.length;i++) {
			sum=sum+i;
		}
		
		int average=sum/myArray.length;
		return average;
	}

	@Override
	public int findMax() {
		// TODO Auto-generated method stub
		int max=0;
		for(int i=0;i<myArray.length;i++) {
			if(max<myArray[i]) {
				max=myArray[i];
			}
	}
		return max;
	}
	@Override
	public int[] getLowerThan(int n) {
		// TODO Auto-generated method stub
		int lk=0;
		int m = 0;
		for(int i=0;i<myArray.length;i++) {
			if(myArray[i]<=n) {
				lk++;
			}
		}
		int a[]=new int [lk];
		for(int i=0;i<myArray.length;i++) {
			if(myArray[i]<=n) {
				a[m] = myArray[i];
				m++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		return a;
	}

	public static void main(String[] args) throws Exception {
	Test t=new Test(6,30,2);
	t.findAverage();
	t.findMax();
	t.getLowerThan(15);
		System.out.println(t.findAverage());
		System.out.println(t.findMax());
//		System.out.println(t.getLowerThan(4));
	}
	
	
}
