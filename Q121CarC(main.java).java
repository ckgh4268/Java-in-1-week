class Main {
  public static void main(String[] args) {

     //12-2

    ExCar myCar = new ExCar("W221",
                          1845,1490,5205,
                          90.0,
                          "2015,12,24");

    System.out.println(myCar.getName());
    System.out.printf("현재위치: (%.2f,%.2f)\n", myCar.getX(), myCar.getY());
    System.out.printf("남은연료: %.2f리터\n", myCar.getFuel());
    System.out.printf("구 입 일: %s\n",myCar.getPurchaseDay());
  }
}

    //Q123
    // ExCar myCar = new ExCar("W221", 1845, 1490, 5205, 90.0, "2015,12,24");
    // mycar.putSpec();

    //파생 클래스에 상속되지않는 자원 -> 생성자
    //슈퍼 클래스의 생성자는 super. 호출가능
    //생성자를 하나도 정의하지 않으면 빈 생성자가 컴파일러를 통해 자동으로 정의된다.
    // X() {}

    //매서드 덮어쓰기
    //super(부모클라스명을 의미).멤버명

    //상속의 장점 중 하나는 기존 프로그램을 최소한으로 추가 및 수정만 해서 새로운 프로그램을 완성한다. (증분 프로그래밍, incremental programming) , 프로그램 개발시 효율성을 높이고 유지관리 보수를 용이하게 한다.

    //Q124

        // Car car1 = new Car ("W140", 1885, 1490, 5220, 95.0, "2018,10,13");
        // Excar car2 = new Car ("W221", 1845, 1490, 5205, 90.0, "2015,12,24");

        // Car x;        //클래스형 변수
        // x = car1;     //자기자신의 형 인스턴스를 참조할 수 있다.
        // x = car2;     //하위 클래스형의 인스턴스도 참조할 수 있다!!!!!

        // System.out.println("x구입일 : " + x.getPurchaseDay());

        // // is - A관계 : ExCar는 Car의 자식으로 Car 가족의 일원이라고 볼 수 있다.
        // // ExCar는 Car의 일종이다.
        // // 관계의 반대는 성립하지 않는다, 즉, Car는 ExCar의 일종이 아니다.
        // // Car1 자동차 클래스 Car의 인스턴스
        // // Car2 ExCar형의 인스턴스 ( 총 주행거리가 있는 인스턴스)

        // ExCar y;
        // y = car1;
        // y = car2;

        // System.out.println("y구입일 : " + y.getPurchaseDay());
        // System.out.println("y의 총 주행거리 :" + y.getTotalMileage());

        //ExCar형의 변수 y 는 슈퍼 클래스 Car 형의 Car1인스턴스를 참조할 수 없다.
        //상위 클래스 형의 변수는 하위 ㅋ르래스의 인스턴스를 참조할수 있지만 하위 클래스 형의 변수 상위 클래스의 인스턴스를 참조 할 수 없다. (우회방법있음)

        //Q125

        // Car car1 = new ExCar("W221",1845,1490,5205,90.0,"2015,12,24");

        // car1.putSpec();

        //매서드 putSpec 와 move같은 상위 클래스의 매서드를 하위 클래스에서 새롭게 정의하는것을 오버라이드.
        // Car형의 클래스형 변수 Car1이 Excar형의 인스턴스를 참조한다. 다라서 변수와 참조대상의 형이 다르다.
        // 참조 대상의 인스턴스가  ExCar 형이기 때문에 ExCar형의 putSpec을 호출한다.
        //호출해야 할 메서드가 실행 시에 결정되므로 이러한 방식을 동적결합 또는 지연결합(결속)
        //클래스 형 변수가 파생관계에 있는 다양한 ㅋ르래스형의 인스턴스를 참조한것을 다형성이라고 한다, (폴리 다양한 많은 모피즘 형태), 다양성, 다상성.....
        // 다형성이 있는 메서드 호출은 프로그램 실행시에 호출할 매서드가 결정된다.

        //Annotation(사람과 컴퓨터가 모두 볼 수 있는 주석)

      //Q126

//         Car car1 = new ExCar("W221",1845,1490,5205,90.0,"2015,12,24");

//         car1.move(10,10);

//         // System.out.println("총 주행거리 : " + car1.getTotalMileage());
//         System.out.println("총 주행거리 : " + ((ExCar)car1).getTotalMileage());
//   }
// }

//ExCar 클래스의 인스턴스 자동차가 이동 총 주행거리 TotalMileage +@
// 상속하지않고 override
// 메써드 호출 시 ExCar의 move가 호출된다.
// 캐스트를 사용해서 ExCar형의 매서드를 호출

//객체 지향 프로그래밍의 3대요소
// 1. 클래스   2. 상속   3.다형성




    // 12-3

    // ExCar myCar = new ExCar("W221", 1845, 1490, 5205, 90.0, "2015,12,24");
    // myCar.putSpec();



    // 12-4
    
//       Car car1 = new Car("W140", 1885, 1490, 5220, 95.0, "2018,10,13");

//       ExCar car2 = new ExCar("W221", 1845, 1490, 5205, 90.0, "2015,12,24"); 

//       Car x;
//       x = car1;
//       x = car2;

//       System.out.println("x구입일 : " + x.getPurchaseDay());


//       ExCar y;
//  //     y = car1;
//       y = car2;

//       System.out.println("y구입일 : " + y.getPurchaseDay());
//       System.out.println("y의 총 주행 거리 : " + y.getTotalMileage());
