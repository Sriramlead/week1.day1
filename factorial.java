package week1.day1;

public class factorial {
public static void main(String[] args) {
	int i,fact =1;
	int number =5;//1*2*3*4*5 factorials
	for(i=1;i<=number;i++) {
		fact =fact*i;
	}
	System.out.println("factorial of number is "+fact );
}  
}
