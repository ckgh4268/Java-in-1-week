import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("문자열 s1 : "); String s1 = stdIn.next();

    System.out.print("문자열 s2 : "); String s2 = stdIn.next();

    int idx = s1.indexOf(s2);
    if (idx == -1)
      System.out.println("s1안에 s2가 포함되어 있지 않습니다.");
    else {
      System.out.println(s1);
      for (int i = 0 ; i <idx ; i++)
        System.out.print(' ');
      System.out.println(s2);




    }
  }
}





// indexof 메서드 문자열 내에서 포함 문자열을 탐색한다.
// 변수명.indexof(s)
// 위치를 반환한다.
