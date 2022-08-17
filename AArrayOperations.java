abstract class AArrayOperations implements IMethods{
	
 int[] myArray = {};
private int l;//length of array
private int u;//upper bound
private int lo;//lower bound

public abstract int findMax(); // returns the highest number in array.

 public abstract int[] getLowerThan(int n); //returns an array that consists of elements of myArray lower than n. For example; if myArray
   // is {3,1,7,9,5} and n is 5; then this method returns {3,1}.

 public abstract double findAverage(); // finds the average of numbers in array

	

		/* 

		 Create a class that extends the abstract class above.

		1. Your class constructor must fill myArray with random odd integers.

		2. Your class constructor must have three parameters, and all parameters must be integers. One of the parameters must represent 

		length of myArray. The other two must represent upper bound and lower bound of the random numbers.

		3. Your constructor must throw an exception if the upper bound is lower than the lower bound.

		3. Implement the findMax, getLowerThan and findAverage methods as described above.

		4. Write a test class and test all methods.

		 */
} 