import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.in;
// import static java.lang.System.out;
import static java.lang.System.out.println;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    out.print("실 수:");
    double x = stdIn.nextDouble();


    // out.println("절대값 : " + abs(x));
    // out.println("제곱근 : " + sqrt(x));
    // out.println("넓  이 : " + PI*x*x);
    println("넓  이 : " + PI*x*x);
 
  }
}

// println클래스 매서드 아니라 인스턴스 메서드
