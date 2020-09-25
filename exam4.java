// Exam 4. 2053 다음은 세자리 홀수 (101, 103, ,,,,999)를 난수로 생성해서 해당 난수와 그 난수를 10배한 값 그리고 난수의 마지막 자릿수를 표시하는 프로그램이다.
// (생성한 난수가 537이면 537과 5370과 5370.7를 표시한다.)

import java.util.Random;


class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    int k = 2 * rand.nextInt(449)+101;

    System.out.println("생성한 난수는 "+ k + "입니다.");
    System.out.println("10배 한 값은 "+ 10*k + "입니다.");
    System.out.println("마지막 자릿수는 "+ k%10 + "입니다.");


  }
}
