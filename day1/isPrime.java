package week1.day1;

public class isPrime {

	public static void main(String[] args) {
		int n=7,num=0; 
		for(int i=1;i<=n;i++) {
	  if(n%i==0)
	  {
       num++;
	  }
  }
	if(num==2)	{
		  System.out.println(n+" is a Prime number");
	}
	else
	{
		System.out.println(n+" is not a Prime number");
	}
}}