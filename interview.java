import java.util.*;

class interview //class name 
{
    public static void main(String[] args) //start of main
    {
        Scanner sc = new Scanner(System.in); //calling Scanner Class

        String name = ""; //declaring the 'name' variable 
        int age; //declaring the 'age' variable 
        int grade; //declaring the 'grade' variable 
        int num; //declaring the 'num' variable 

        System.out.print("Enter your name: "); name = sc.nextLine(); //inputting the user's name 

        System.out.println();

        System.out.print("Enter your age: "); age = sc.nextInt(); //inputting the age of the user

        System.out.println();

        System.out.print("Which grade are you in?: "); grade = sc.nextInt(); //inputting the grade of the user

        System.out.println();

        System.out.print("Enter the number of subjects you study in grade " +  grade + ": "); num = sc.nextInt(); //inputting the number of subjects taken by the user

        int mid = num/2; //find half of the subjects taken by the user

        System.out.println("Enter the grades of your best " + mid + " subjects one by one below.");


        int a[] = new int[mid]; //declaring the 'a' array with the length of the value of mid

        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt(); //storing the values in the array
        }

        for(int i = 0; i < a.length; i++)
        {
            Sytstem.out.println("Subject " + (i+1) + " Marks:" a[i]); //storing the values in the array
        }
    }
}