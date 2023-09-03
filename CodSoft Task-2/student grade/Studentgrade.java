import java.util.*;


public class Studentgrade

{
    // hey
    public static void main(String args[])
    {
    	/* This program assumes that the student has 6 subjects,
    	 * thats why I have created the array of size 6. You can
    	 * change this as per the requirement.
    	 */
         System.out.println("enter the no of subjects");
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
         int marks[] = new int[n];
        int i;
        float total=0, avg;char grade;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<n; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/n;
        
        if(avg>=80)
        {
             grade = 'A';
            System.out.print(grade);
        }
        else if(avg>=60 && avg<80)
        {
             grade = 'B';
           System.out.print(grade);
        } 
        else if(avg>=40 && avg<60)
        {grade = 'C';
            System.out.print(grade);
        }
        else
        { grade = 'D';
            System.out.print(grade);
        }
        System.out.println("total marks =" + total);
        System.out.println("garde =" +grade);
        System.out.println("average =" + avg);
    }
}