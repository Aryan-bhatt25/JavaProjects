import java.util.*;

class Student //class name 
{
    public int sum; //stores the sum of the grades 
    public int size; //stores the size of the array or classroom

    Student(int size) //constructor storing the size of the array
    { 
        this.size = size; 
    } //end of constructor

    String name[] = new String[size]; //stores the names of the students 
    int grade[] = new int[size]; //stores the grades of the students 

    Student(String name[], int grade[]) //constructor to assign values in the arrays 
    {
        this.name = name;
        this.grade = grade;
    } //end of constructor 

    public void sum() //sum method 
    {
        sum = 0; //initializing sum to 0
        for(int n : grade) //enhanced loop
        {
            sum+= n; //sum of the grades of the class
        } //end of for loop
    }

    public void display() //display method 
    {
        for(int i = 0; i < grade.length; i++)
        {
            System.out.println("Name: " + name[i].substring(0,1).toUpperCase() + name[i].substring(1) + " \t Grade: " + grade[i]); //displays name and grade of each student in the class
        } //end of for loop
    }

    public void avg() //average method 
    {
        System.out.println("Average score: " + (sum/(grade.length))); //displays the average score of the class
    } //end of method 

    public void highestavg() //highest average method
    {
        int highestavg = grade[0]; //assigning the value of the grade of the first student as the highest average 
        String highestavgname = name[0]; //assigning the name of the first student as the highest average student 

        for(int i = 1; i < grade.length; i++) 
        {
            if(grade[i] > highestavg)
            {
                highestavg = grade[i]; 
                highestavgname = name[i];
            } //end of if construct 
        } //end of for loop

        System.out.println("Highest Average: " + highestavg + " achieved by " + highestavgname); //displays name and grade of the highest average achieving student 
    } //end of method 

} //end of "Student" class

public class score //class name 
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner input = new Scanner(System.in); //Scanner Class

        int size; //stores the size of the array or students in the class

        System.out.print("Enter the number of students in the class: "); size = input.nextInt(); //accepting the number of students in the class

        Student student = new Student(size); //object created of the Student class, passing the size of the class to the Student Class

        input.nextLine();

        int grade[] = new int[size]; //stores the grades of the students
        String name[] = new String[size]; //stores the name of the students

        System.out.println("Enter the name of each student below.");

        for(int i = 0; i < size; i++)
        {
            System.out.print("Name: ");  
            name[i] = input.nextLine(); //accepting the name of each student in the class
            if(name[i].length() < 2) //if the name provided is technically not a name 
            {
                System.out.println("Enter a valid name."); //appropriate recommended action to user
                i--; //decrement counter to allow another attempt
            }
            Thread.sleep(100); //sleep for 100 milliseconds
        } //end of for loop
        
         System.out.println();
         System.out.println("Enter the marks of each student below, corresponding to their name.");

        for(int i = 0; i < size; i++)
        {
            System.out.print("Grade: "); 
            grade[i] = input.nextInt(); //accepting the grades of each student in the class
             if(grade[i] > 100) //if grades are invalid or above 100
            {
                System.out.println("Enter a valid grade. It needs to be less than or equal to 100."); //appropriate message  
                i--; //decrement counter to allow another attempt
            }
            Thread.sleep(100); //sleep for 100 milliseconds
        } //end of for loop 

        student = new Student(name, grade); //passing the arrays to the "Student" class
        
        System.out.println();
        student.display(); //calling the display method from the Student class
        Thread.sleep(100);
        System.out.println();
        student.sum(); //calling the sum method from the Student class
        student.avg(); //calling the avg method from the Student class
        System.out.println();
        student.highestavg(); //calling the highestavg method from the Student class

        input.close(); //closes the Scanner Class

        System.exit(0); //exits the program

    }
    
} //end of "score" class