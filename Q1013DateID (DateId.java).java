package id;


import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

public class DateId {

  private static int counter;
  private int id;

  static {
    GregorianCalendar today = new GregorianCalendar();
    int y = today.get(YEAR);
    int m = today.get(MONTH)+1;
    int d = today.get(DATE);

    System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n",y,m,d);

    counter = y * 1000000 + m * 10000 + d * 100;
  }

  // 생성자

  public DateId() {
    id = ++counter;
  }

  public int getId() {
    return id;
  }
}

// public 클래스 패키지와는 관계없이 (패키지 내부든 외부든 ) 사용할수 있다.
// 공개접근이 가능.
// 비public 클래스 패키지 이외의 패키지에서는 사용할 수 없다. 패키지 접근
// public 클래스의 이름과 소스 프로그램의 파일명은 일치.
// 1개의 소스프로그램에는 public class가 0개 또는 1개만 정의 할 수 있다.
