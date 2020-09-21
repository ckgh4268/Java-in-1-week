import java.util.Scanner;

class Main {
  static void putstar (int n){
    for (int i =1; i<=n ; i++)
      System.out.print("*");


  }


  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.\n 단수는:");
    int n = stdIn.nextInt();

    for (int i = 1; i <= n ; i++) {
      putstar(i);
      System.out.println();
    }
  }
}
