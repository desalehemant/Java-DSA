//WAP to accept Student Information from the user using Array 

import java.util.*;

 class Personal 
{    
   String name,email,phone,reg_no,adress;
    void accept()
    {
    
     Scanner sc=new Scanner(System.in);
     
     System.out.print("\nEnter Your Name     :");
     name=sc.nextLine();
     System.out.println("Enter Your Reg.No   :");
     reg_no=sc.nextLine();
     System.out.println("Enter Your Adress   :");
     adress=sc.nextLine();
     System.out.println("Enter Your Email    :");
     email=sc.nextLine();
     System.out.println("Enter Your Phone no :");
     phone=sc.nextLine();
     
    }

    void display()
    {
     System.out.println("Name     : "+name);
     System.out.println("Reg.No   : "+reg_no);
     System.out.println("Adress   : "+adress);
     System.out.println("Email    : "+email);
     System.out.println("Phone no : "+phone);
    
    } 
}

  class Academic
{  
      float marks[]=new float[5];
      float total=0,per;   
    void accept()
    {

      int i;
 
      Scanner ss=new Scanner(System.in);
      System.out.println("\nEnter 5 Subjects of Marks :");

      for(i=0;i<5;i++)
        { 
         marks[i]=ss.nextFloat();
         total=total+marks[i]; 
        }
        per=(total/500)*100;
    }

    void display()
    {
     int i;
     for(i=0;i<5;i++)
       {
        System.out.println(marks[i]);
       }
        System.out.println("Total is      ="+total);
        System.out.println("Persantage is ="+per);
    }
}

class Student
{
 public static void main(String args[])
  {
   int num,i;
   
   Scanner sn=new Scanner(System.in);
   
   Personal P[]=new Personal[10];
   Academic A[]=new Academic[10];  
  
   System.out.println("Enter No of Student :");
   
   num=sn.nextInt();
   
   for(i=0;i<num;i++)
    {
     P[i]=new Personal();
     System.out.print("\n\nEnter Student "+(i+1)+" Information :");
     P[i].accept();
     A[i]=new Academic();
     A[i].accept();
    }

  for(i=0;i<num;i++)
    {
     System.out.print("\n\nStudent "+(i+1)+" Information :");
     
     P[i].display();  
     A[i].display();
 
     }
  } 
}