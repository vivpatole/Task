package Task24;


import java.util.Scanner;

public class Task1 {
	
	public void Calculater()
	{
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("👍😊---------My Calculater----------🙌😊");
		
		System.out.println("Enter the first number you want:");
		double first=sc.nextDouble();
		
		System.out.println("Enter the Second number you want:");
		
		double Second=sc.nextDouble();
		
		
		
		System.out.println("-------------Choose the operation You want :----------------");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        int YourChoice=sc.nextInt();
        
        System.out.println("--------------Your Result-------------------");
        
        switch(YourChoice)
        {
        case 1:
        	double Addition=first+Second;
        	System.out.printf("Addition : %f + %f =%f \n",first,Second,Addition);
        	break;
        	
        case 2:
        	double Subtraction=first-Second;
        	System.out.printf("Subtraction : %f - %f =%f \n",first,Second,Subtraction);
        	break;
        	
        case 3:
        	
        	double Multiplication=first*Second;
        	System.out.printf("Multiplication : %f * %f =%f \n",first,Second,Multiplication);
        	break;
        	
        case 4 :
        	if(Second== 0)
        	{
        		System.out.println("oops you're not Divided by Zero");
        	}
        	else {
        	double Divided=first/Second;
        	System.out.printf("Divided : %f / %f =%f \n",first,Second,Divided);
        	break;
        	}

       
    }

	
	}
        
		
		
		
	
	
	public static void main(String[] args) {
		Task1 t=new Task1();
		t.Calculater();
	}
		
}

