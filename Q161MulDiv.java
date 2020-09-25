import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("x값 : ");
    int x = stdIn.nextInt();
    System.out.print("y값 : ");
    int y = stdIn.nextInt();

    System.out.println("x*y = "+ x*y);
    System.out.println("x/y = "+ x/y);   

  }
}

//런타임오류
//1. 입력 부적합  2. 산술연산제외 ( 0으로 나누어 발생 오류)

//  try문

// try {

//   //처리
// }

// catch (ExpA e) {


// }

// catch (ExpB e) {


// }

// finally {
//   최종처리
// }
