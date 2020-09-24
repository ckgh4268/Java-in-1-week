public interface Skinnable {

  int BLACK = 0;
  int RED = 1;
  int GREEN = 2;
  int BLUE = 3;
  int YELLOW = 4;
  void changeSkin(int skin);

}

//인터페이스는 상수를 가질수 있다.
//모두 public static fianl 의 속성을 가지고 있다.
//인터페이스 내의 상수는 모두 '인터페이스명. 필드명으로 접근'
//인터페이스가 가질수 있는 멤버
//1. 클래스  2. 상수  3. 인터페이스  4. 추상메서드
