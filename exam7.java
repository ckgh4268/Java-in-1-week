import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("a : "); int a = stdIn.nextInt();
    System.out.print("b : "); int b = stdIn.nextInt();
    
    if (a%2==0 && b%2==0)
      System.out.println("양쪽 모두 짝수입니다.");
    else if (a%2==0 || b%2==0)
      System.out.println("한쪽만 짝수 입니다.");
    else if (a%2!=0 && b%2!=0)
      System.out.println("양쪽 모두 홀수 입니다.");
      
    
  }
}
