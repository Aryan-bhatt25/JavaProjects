import java.util.*;

class PlusOne //class name 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //calling the Scanner class

        int num[] = new int[3]; //num array declaration

        System.out.println("Enter the numbers one by one: "); 

        for(int i = 0; i <= num.length-1; i++)
        {
            num[i] = sc.nextInt(); //initializing the num array with values entered by the user

        } //end of for loop

        System.out.print("Original Array: " + Arrays.toString(num));

        int result[] = Plus(num); //storing the incoming array in the final array

        System.out.println();
        System.out.println("Final Array: " + Arrays.toString(result)); //printing the resulting array 

        sc.close(); //closes the Scanner 

    } //end of main

    public static int[] Plus(int digits[])
    {
        if(1 <= digits.length && digits.length <= 100) //if condition to continue with the operation 
        {
            for(int i = 0; i <= digits.length-1; i++)
            {
                if(digits[i] < 9 && i==digits.length-1)
                {

                    digits[i] = digits[i] + 1;

                } //end of if-construct

                if(digits[i] == 9 && i==digits.length-1)
                {
                    if(digits[i-1]!=9)
                    {
                        digits[i] = 0;
                        digits[i-1] = digits[i-1]+1;
                    }

                    else
                    {
                        digits[i] = 0;
                        digits[i-1] = 0;
                        digits[0] = digits[0] + 1;
                    }

                } //end of if-construct

            } //end of for loop

        } //end of if-construct

        return digits; //return the manipulated array to main

    } //end of Plus()

} //end of class