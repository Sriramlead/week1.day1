package week1.day1;

public class SumOfDigits {
   public static void main(String[] args) {
	int  number = 1234;
	int remainder, sum= 0 ;
	
	while(number >0)
	{
	remainder = number % 10;
	sum = sum +remainder ;
	number =number /10;

}
 
	System.out.println("sum of number="+ sum);
   }
}
