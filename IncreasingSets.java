import java.util.*;

class IncreasingSets //my class name 
{
    public static void main(String[] args)
    {

        int size1, size2; //declaring the variables for storing the size of the arrays

        Scanner sc = new Scanner(System.in); //calling the Scanner Class

        System.out.print("Enter the size of the first array: "); size1 = sc.nextInt(); //printing a message and accepting the size of the first array 

        System.out.println("Enter each element of the array one by one: "); //message for the user 

        int a[] = new int[size1]; //declaring and initializing the 'a' array with the size recieved from the user. 

        for(int i = 0; i < size1; i++)
        {
            a[i] = sc.nextInt(); //accepting the values of the array from the user 
        } //end of for loop

        System.out.print("Enter the size of the second array: "); size2 = sc.nextInt(); //printing a message and accepting the size of the second array 

        System.out.println("Enter each element of the array one by one: "); //message for the user
        
        int b[] = new int[size2]; //declaring and initializing the 'b' array with the size recieved from the user. 

        for(int i = 0; i < size2; i++)
        {
            b[i] = sc.nextInt(); //accepting the values of the array from the user 
        } //end of for loop

        boolean chk = isValid(a,b); //calling and storing the value returned from the isValid method into the 'chk' variable

        if(chk == true) //if the chk variable is true 
            System.out.println("Increasing sets"); //prints the message to the user
        else //if chk variable is not true 
             System.out.println("Not Increasing sets"); //prints the user to the user 

    } //end of main

    public static boolean isValid(int x[], int y[])
    {

        int count = 0; //declaring the count variable, used as a counter 
        int a = x[x.length-1]; //declaraing and initializing the 'a' variable with the value of the last element of array x

        for(int i = 1; i <= y.length; i++)
        {
            if(y[i-1] == a+i) //if the first element of the y array is equal to the last element added to the specific i value 
            {
                count+=1; //increment count variable 
            } //end of if construct
        } //end of for loop

        if(count == y.length) //if the count variable is equal to the length of array y
        { 
            return true; //returns true to main
        } //end of if statement 
        else
        {
            return false; //returns false to main
        } //end of else statement 

    } //end of isValid

} //end of class