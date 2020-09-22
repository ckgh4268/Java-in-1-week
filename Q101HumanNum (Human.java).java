class Human {

  private static int counter = 0; //마지막 몇번, 정적 필드
                                  //정적: 변하지 않는다 고정,
  private String name;
  private int height;
  private int weight;
  private int id;

// 생성자

  Human(String name, int height, int weight){

    this.name = name;
    this.height = height;
    this.weight = weight;  
    id =  ++counter;
  }

  public int getId() {return id;}

  public void putData() {
    System.out.println("이름 : " + name);
    System.out.println("신장 : " + height + "cm");
    System.out.println("체중 : " + weight + "kg");
  }
}
