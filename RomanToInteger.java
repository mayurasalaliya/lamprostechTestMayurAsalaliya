import java.util.*;

class RomanToInteger {

  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);

    //taking input from user.
    System.out.print("Enter Roman Number:");
    String romanStr = scan.nextLine();

    RomanToInteger obj = new RomanToInteger();

    //printing the integer value of roman number.
    System.out.println("Interger value: " + obj.convert(romanStr));

  }

  //this function retun the actual value of Roman number.
  int value(char r) {
    if (r == 'I') return 1;
    if (r == 'V') return 5;
    if (r == 'X') return 10;
    if (r == 'L') return 50;
    if (r == 'C') return 100;
    if (r == 'D') return 500;
    if (r == 'M') return 1000;

    return -1;
  }

  //this function return the convert value of Roman to Integer.
  int convert(String str) {


    //default value of total is 0.
    int total = 0;
    
    int lengthOfString = str.length();

    //this loop start from 0 to length of String.
    for (int i = 0; i < lengthOfString; i++) {

        int romanValue = value(str.charAt(i));

        //Checking the length of string for next roman number.
        if((i+1) < lengthOfString)
        {
            int romanValueNext = value(str.charAt(i+1));

            //compare the current roman number value with next roman number.
            if(romanValue >= romanValueNext)
                total += romanValue;
            else
                total -= romanValue;
        }
        else
            total += romanValue;

    }

    //retuning the actual value of roman number.
    return total;
  }

}
