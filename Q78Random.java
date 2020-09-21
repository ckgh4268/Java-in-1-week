import java.util.Random;
import java.util.Scanner;


class Main {
  // 랜덤으로 받을 a와 b를 지정
  static int random(int a, int b){
    //만약 b가 a보다 작거나 같다면
    if(b<=a)
      //a에게 돌아간다.
      return a;
      // 그렇지 않다면
    else{
      //랜덤으로 생성할 난수를 입력
      Random rand = new Random();
      // 기존 a에 입력한 난수의 b-a+1 를 더한 숫자의 범위내에서 숫자를 무작위로 생성한다.
      return a + rand.nextInt(b-a+1);
    }
  }
  
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    
    System.out.println("난수를 생성합니다.");
    // 랜덤 a값을 입력
    System.out.print("하한값:"); int min = stdIn.nextInt();
    // 랜덤 b값을 입력 ( a보다 작으면 a가 출력될것.)
    System.out.print("상한값:"); int max = stdIn.nextInt();
    // a값과 b값의 사이에서 무작위로 숫자를 생성한다.
    System.out.println("생성한 난수는 "+random(min,max)+"입니다.");
  
  }
}
