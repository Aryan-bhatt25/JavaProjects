import java.util.*;

class ValidPalindrome //class name 
{
    public static void main(String[] args) throws InterruptedException
    {

        boolean chk = false; //declaring the chk variable and initialized with a default value of false

        Scanner sc = new Scanner(System.in); //calling the Scanner class

        System.out.print("Enter a sentence: "); String sent = sc.nextLine(); //accepting and initializing the sent variable with the sentence entered by the user

        chk = isPalindorme(sent); //store the return value in the chk variable 

        System.out.println("Loading..."); //delay message
        Thread.sleep(4000); //introducing a slight delay 

        if(chk) //if the chk variable is true
        {
             System.out.println("\"" + sent + " \" is a palindrome");
        }

        else //if the chk variable is false
        {
            System.out.println("\"" + sent + " \" is not a palindrome");
        }

        sc.close() //closes the Scanner

    } //end of main

    public static boolean isPalindorme(String s)
    {

        s = s.toLowerCase(); //converting the sentence to lower case

        String without = ""; //declaration of 'without' variable 

        for(int i = 0; i <= s.length()-1; i++)
        {
            
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                without += s.charAt(i);
            }

        } //end of for loop

        String reversedString = ""; //declaration of 'reversedString' variable

        for(int i = without.length()-1; i >= 0; i--)
        { 
                reversedString += without.charAt(i);
        } //end of for loop

        if(reversedString.equals(without)) //checking if the 'reversedString' variable is equal to the 'without' variable 
        {
            return true; //return true if the sentence is a valid palindrome 
        }

        else
            return false; //final return if none of the conditions match

    } //end of isPalindrome

} //end of class