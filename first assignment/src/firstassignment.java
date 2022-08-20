import java.util.*;
public class  firstassignment {
	
	
	Scanner sc = new Scanner(System.in);
	public void checkpalindrome(){
		int num=525,x, r , sum=0;  
		
		x=num;
		while(num>0){
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
		}
		if(x==sum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");			
		}
			}
	public void printpattern() {
	int i, j,n=5;
	for(i=n;i<=n;i--) {
		for(j=1;j<=n;j++) {
			if(j<=i) {
			System.out.println("*");
			}
			}
		System.out.println("");
	}
	
	}
	public void primenumbercheck() {
		int x=11,i;
		boolean flag= true;
		for (i=2;i<x;i++) {
			if (x%i==0){
			flag = true;
				break;
			}
			}
			if(flag=true) {
			System.out.println(" the number is prime"+x);
			}
			else {
				System.out.println("the number is not a prime"+x);
			}		
	}
	public void printfibonaci() {
		int i,num=11,count=1;
		for(i=1;i<=num;i++)
		{
			count=count*i;
			}
		System.out.println("the fibonaci series"+count);
	}

	public static void main(String[]args){
	firstassignment  obj = new firstassignment();
	 int choice;
	 Scanner sc= new Scanner(System.in);
	 do {
		 System.out.println("enter your choice:\n"+"1.find palindrome\n"+"2.print pattern\n"+"3.check prime number\n"+"4.fibonacci series\n"+"enter 0 to Exit");
		 System.out.println();
		 choice=sc.nextInt();
		 switch(choice) {
		 case 0:
			 choice=0;
			 break;
		 case 1:{
			 obj.checkpalindrome();
		 }
		 break;
		 case 2:{
			 obj.printpattern();
		 }
		 break;
		 case 3:{
			 obj.primenumbercheck();
			 }
		 break;
		 case 4:{
		obj.printfibonaci();	 
		 }
		 break;
		 default:
			 System.out.println("invalid choice. entera valid  choice.\n");
		 }
	}
		while(choice!=0); 
	 System.out.println("thank you ");
	 sc.close();
	 }
	}


		
	
