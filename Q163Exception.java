import java.util.Scanner;

import javax.management.RuntimeMBeanException;

class Main {

  static void check(int sw) throws Exception {
    switch (sw) {
      case 1 : throw new Exception ("검사 예외 발생!!");
      case 2 : throw new RuntimeException("비검사 예외 발생!!");


    }
  }
  static void test (int sw) throws Exception {
    check (sw); 
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("sw:");
    int sw = stdIn.nextInt();

    try {
      test(sw);
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e. getMessage());
    }


    }

  }

// check 메서드 : 인수 sw 받은 값에 따라 exception 또는 RuntimeException 예외를 던지는 메써드

// 메서드 본체의 switch sw 값에 따라 예외를 던진다. 예외를 던지는 구문이 throw "throw 식" 인스턴스를 new로 생성해서 던진다.

// test 메서드는 check메서드를 호출하는게 전부인 메서드이다. 호출되는 check에서 Exception이 발생한다는 것을 프로그래머와 컴파일러 알고있다. test 메서드도 에러가 발생할 가능성이 있으며 throws Exception이라는 throws 절 지정이 필수이다.

//Exception 캐치하면 "검사 예외 발생!!" RuntimeException 캐치되면 "비검사 예외 발생!!" 출력

//NullPointerException    Null참조
