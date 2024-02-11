import java.util.*;

class ValidParenthesis //class name 
{
    public static void main(String[] args) throws InterruptedException
    {
        String input = ""; //declaring the input variable
        boolean chk = false; //declaring the chk variable with a default value of false

        Scanner sc = new Scanner(System.in); //calling the Scanner class

        System.out.println("Enter your string that should contain: '()[]{}' "); //printed message 

        input = sc.nextLine(); //accepts and initializes the input variable with the entered string by the user

        chk = isValid(input); //stores the boolean value after checking for validity in the chk variable 

        System.out.println("Loading..."); //delay message

        System.out.println(); 

        Thread.sleep(3000); //introducing a delay

        System.out.println(chk); //print the validity of the string

        sc.close(); //closes the Scanner class

    } //end of main

    public static boolean isValid(String s) 
    {
        boolean chk = true; //declaring the ch variable
        int token = 0; //token variable
        int count = 0; //counter variable 

        s = s.replace(" ",""); //removes any whitespaces from the string 

        for(int i = 0; i <= s.length()-1; i++)
        {
            chk = true; //set the value of chk to true everytime the loop commences

            if(s.charAt(i) == '(')
            {
                token = 1; //set value of token to 1 
                count++; //increment counter variable 
            }
            if(s.charAt(i) == '[')
            {
                token = 2; //set value of token to 2 
                count++; //increment counter variable
            }
            if(s.charAt(i) == '{')
            {
                token = 3; //set value of token to 3
                count++; //increment counter variable
            }
            for(int j = i+1; j < s.length(); j++)
            {
                if(token == 1 && chk == true) //if the token has a value of 1
                {
                    if(s.charAt(j)==')') //if the next character in the string is ')'
                    {
                        count++; //increment the count
                        break; //break out of the for loop
                    }
                    else //if its invalid
                    {
                        chk = false; //set chk variable to false
                        break; //break out of for loop
                    }
                }
                if(token == 2 && chk == true) //if the next character in the string is ']'
                {
                    if(s.charAt(j)==']')
                    {
                        count++; //increment the count
                        break; //break out of the for loop
                    }
                    else //if its invalid
                    {
                        chk = false; //set chk variable to false
                        break; //break out of the for loop
                    }
                }
                if(token == 3 && chk == true) //if the next character in the string is '}'
                {
                    if(s.charAt(j)=='}')
                    {
                        count++; //increment the count
                        break; //break out of the for loop
                    }
                    else //if its invalid
                    {
                        chk = false; //set chk variable to false
                        break; //break out of the for loop
                    }
                }

            } //end of nested for loop

        } //end of for loop

        if(chk==true && count == s.length())
        {
            return true; //return true if above conditions are met or the string is valid 
        }
        else
            return false; //return false if the string is invalid
        
    } //end of isValid()

} //end of class