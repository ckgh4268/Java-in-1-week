public class Main{
  public static void main(String[] args) {
    Member[] m = {
      new Member("길동", 101, 27),
      new SpecialMember("철수", 102, 31, "회비무료"),
      new SpecialMember("영희", 103, 52, "회비 반값 할인"),
    };

    for(Member k:m){
      k.print();
      System.out.println();
    }
  }
}
