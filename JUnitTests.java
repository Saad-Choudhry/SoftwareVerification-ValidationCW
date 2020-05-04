package Testing;

import java.util.Scanner;

public class JUnitTests 
{
	public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int task;

        System.out.println("JAVA BASIC PROGRAMS");
        System.out.println();
        System.out.println("1. Square A Number");
        System.out.println("2. Basic Arithmetic");
        System.out.println("3. Concatenate");
        System.out.println("4. Count Number Of Es");  
        System.out.println("5. Module Average");    
        System.out.println("6. Draw A Square"); 
        System.out.println("7. Vowel Checker"); 
        System.out.println("8. Palindrome");    
        System.out.println();

        System.out.println("Enter the number of the task you want: ");
        task = input.nextInt();

        if (task == 1)                  
        {                                   
            squareNum(10);           
        }                             
        else if (task == 2)
        {
            basicArithmetic();
        }
        else if (task == 3)
        {
            concatenate("Hello", "World");
        }
        else if (task == 4)
        {
            countE("elephant");
        }
        else if (task == 5)
        {
            moduleAverage();
        }
        else if (task == 6)
        {
            square();
        }
        else if (task == 7)
        {
            vowelChecker();
        }
        else if (task == 8)
        {
            palindrome();
        }
        else if (task < 1 || task > 7)
        {
            System.out.println("Sorry, that action does not exist");    
        }
    }

    public static int squareNum (int x)
    {
    	System.out.println("When " + x + " is squared, you get " + x*x);
    	return x*x;        
    }

    public static void basicArithmetic()
    {
        int num1, num2, add, subtract, multiply;
        float divide;
        String decision;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number you want you want to perform arithmetic on: ");
        num1 = input.nextInt();
        System.out.println("Enter a second number you want to perform arithmetic on: ");
        num2 = input.nextInt();

        add = num1 + num2;
        System.out.println("The sum of your two numbers is: " + add);
        subtract = num1 - num2;
        System.out.println("The difference of your two numbers is: " + subtract);
        multiply = num1 * num2;
        System.out.println("The multipication of your two numbers is: " + multiply);
        divide = (float) num1 / num2;
        System.out.println("The division of your two numbers is: " + divide);
    }

    public int add (int num1, int num2)
    {
    	System.out.println("Number 1 (" + num1 + ") in addition with Number 2 (" + num2 + ") equals: " + "7");
    	return num1 + num2;        
    }
    
    public int subtract (int num1, int num2)
    {
    	System.out.println("Number 1 (" + num1 + ") subtracted from Number 2 (" + num2 + ") equals: " + "-1");
    	return num1 - num2;        
    }
    
    public int multiply (int num1, int num2)
    {
    	System.out.println("Number 1 (" + num1 + ") multiplied with Number 2 (" + num2 + ") equals: " + num1*num2);
    	return num1 * num2;        
    }
    
    public int divide (int num1, int num2)
    {
    	System.out.println("Number 1 (" + num1 + ") divided by Number 2 (" + num2 + ") equals: " + num1/num2);
    	return num1 / num2;        
    }
    
    public static String concatenate(String one, String two)
    {
        System.out.println("The concatenated string is: " + one+two);
    	return one + two;
    }
    
    public static int countE(String word) 
    {
        int count = 0;
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == 'e' || word.charAt(i) == 'E')
            {
                count++;
            }
        }
        System.out.println("(" + count + ")" + " e(s) present in " + word);
        return count;
    }
    
    public static void moduleAverage()

    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your coursework mark: ");
        int cw = input.nextInt();

        System.out.println("Enter your exam mark: ");
        int ex = input.nextInt();

        double mark = ((double) ex + (double) cw) / 2;

        System.out.println("Coursework = " + cw);
        System.out.println("Exam = " + ex);
        System.out.println("Module Mark = " + mark);
    }

    public static void square()
    {
        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.println("Enter the size of the square you want to draw: ");
        int size = input.nextInt();

        for (y = 0; y < size; y++) 
        {
            for (x = 0; x < size; x++) 
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void vowelChecker()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word/sentence to check how many vowels are present: ");
        String sentence = input.nextLine();

        int i = 0 ;
        int vowels = 0;

        while(!sentence.equals("END"))
        {
            while(i < sentence.length())
            {
                if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'A')
                {
                    vowels++;
                }
                else if(sentence.charAt(i) == 'e' || sentence.charAt(i) == 'E')
                {
                    vowels++;
                }
                else if(sentence.charAt(i) == 'i' || sentence.charAt(i) == 'I')
                {
                    vowels++;
                }
                else if(sentence.charAt(i) == 'o' || sentence.charAt(i) == 'O')
                {
                    vowels++;
                }
                else if(sentence.charAt(i) == 'u' || sentence.charAt(i) == 'U')
                {
                    vowels++;
                }
                i++;
            }
            System.out.println("[ " + vowels + "] " + "vowels in " + "\"" + sentence + "\"" + "\n");
            
            System.out.println("Enter the size of the square you want to draw: - if you want to stop, enter 'END'" + "\n");
            sentence = input.nextLine();
            vowels = 0;
            i = 0;
        }

    }

    public static void palindrome()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word to check if it is a palindrome: ");
        String word = input.nextLine();

        String backwards = "";

        while(!word.contentEquals("END"))
        {
            String newWord = word.toLowerCase();
            for(int i = word.length(); i > 0; i--)
            {
                backwards = backwards + newWord.charAt(i - 1);
            }
            if(newWord.contentEquals(backwards))
            {
                System.out.printf("%-10s %-10s",word,"is a palindrome");
            }
            else
            {
                System.out.printf("%-10s %-10s",word,"is not a palindrome");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("Enter a word to check if it is a palindrome: - if you want to stop, enter 'END'" + "\n");
            word = input.nextLine();
            backwards = "";
        }
    }	
}