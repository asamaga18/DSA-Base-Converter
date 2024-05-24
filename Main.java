import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in); // scan 
    int num = 0;
    do{
    System.out.println("Enter number: "); // prompting user for base 10 number
    num = myScan.nextInt();
    if (num !=0){ // sentinal value to exit the command 
      int base;
    do {
      System.out.println("Enter base(2-16): "); // base conversion prompt
      base = myScan.nextInt();
      if ((base<2) || (base >16)) { // base range
        System.out.println("Please stay in Range\n");
      }
      
    } while((base<2) || (base >16)); // keeps prompting until the base is between 2 and 16

    System.out.println(baseConv(num, base)+"\n"); // initial call for recursive method
    }
    } while(num != 0);
    myScan.close();
  }

  public static String baseConv(int n, int b) { // 
    if (n == 0) // base case to end
      return "";
    else if(n%b >= 10){
      return baseConv(n/b,b) + Character.toString((char)(55+(n%b))); // case for when the base is over 9 and a character is needed
        }
    else
      return baseConv(n / b, b) + Integer.toString(n % b); // adds the corresponding number if a character is not needed
  }
}