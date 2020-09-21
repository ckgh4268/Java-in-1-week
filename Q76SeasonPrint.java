import java.util.Scanner;

class Main {
// static void printSeason(int m){
//     switch (m) {
//       case 3 : case 4: case 5: System.out.print("봄"); break;
//       case 6 : case 7: case 8: System.out.print("여름"); break;
//       case 9 : case 10: case 11: System.out.print("가을"); break;
//       case 12 : case 1: case 2: System.out.print("겨울"); break;

//     }
                //printSeason안의 각 숫자에대한 위치를 설정.
  static String printSeason(int m) {
    switch (m){
      //printSeason(3~5)는 봄
      case 3 : case 4: case 5: return "봄";
      //printSeason(6~8)는 여름
      case 6 : case 7: case 8: return "여름";
      //printSeason(9~11)는 가을
      case 9 : case 10: case 11: return "가을";
      //printSeason(12~2)는 겨울
      case 12 : case 1: case 2: return "겨울";
      }
    }


  public static void main(String[] args) {
    // 입력명령어
    Scanner stdIn = new Scanner(System.in);
    // { }월의 범위를 설정
    int month;
    // 몇월입니까 의 질문을 출력
    do {
      System.out.print("몇 월입니까(1~12):");
      // month의 범위에 입력할 숫자를 제시.
      month = stdIn.nextInt();
      // 1~12의 사이가 아니라면 다시 돌아간다.
    } while (month < 1 || month > 12);
      //그렇게 지정된 문자의 출력과 위의 PrintSeason에 맞는 입력 숫자에 대한 위치를 가르킨다.
    System.out.print("해당 월의 계절은" + printSeason(month)+ "입니다.");
    // System.out.print("해당 월의 계절은 ");
    // printSeason(month);
    // System.out.print("입니다.");
  }
}
