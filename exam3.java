import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double PI = 3.1416;
    Scanner stdIn = new Scanner(System.in);
    System.out.print("반지름 :");
    double r = stdIn.nextDouble(); 
    System.out.println("원의 둘레는 " + 2*PI*r+"입니다.");
    System.out.println("면적은" +PI*(Math.pow(r,2))+"입니다.");
  }
}
