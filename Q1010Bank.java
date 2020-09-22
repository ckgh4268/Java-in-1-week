import java.util.GregorianCalendar;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    GregorianCalendar today = new GregorianCalendar();
    int y = today.get(GregorianCalendar.YEAR);
    int m = today.get(GregorianCalendar.MONTH)+1;
    int d = today.get(GregorianCalendar.DATE);
    System.out.printf("오늘은 %d년 %d월 %d일 입니다. \n",y,m,d);

    Random random = new Random();
    int k = random.nextInt(9);
    System.out.print("오늘의 운세는 ");
    switch (k){
      case 0:
        System.out.print("대길");
        break;
      case 1: case 2:
        System.out.print("길");
        break;
      case 3: case 4: case 5:
        System.out.print("중길");
        break;
      case 6: case 7:
        System.out.print("소길");
        break;
      case 8:
        System.out.print("흉");
        break;

    }
    System.out.print("입니다.");
  }
}
