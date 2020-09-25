import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);

    int no = 100 + rand.nextInt(900)

    System.out.println("숫자 맞추기 게임 시작!");
    System.out.println("100부터 999 사이의 숫자를 맞추세요.");

    int x;
    int count = 0;

    {
      System.out.print("어떤 숫자일까? :");
      x = stdIn.nextInt();
      count;
      if (x > no)
        System.out.println("더 작은 숫자입니다.");
      else if ( x < no) 
        System.out.println("더 큰 숫자입니다.");

     }



    System.out.print("정답입니다.");
    System.out.print
  }
}
