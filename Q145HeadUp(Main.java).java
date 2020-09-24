class Main {
  public static void main(String[] args) {

    HeadMounted hmd = new HeadMounted();
    hmd.putOn();
    hmd.putOff();
    hmd.changeSkin(Skinnable.BLACK);
    hmd.putSkin();



    Wearable w = hmd;
    // Wearable w = new Wearable();
    w.putOn();
    w.putOff();

    Skinnable s = hmd;
    // Skinnable s = new Skinnable();
    s.changeSkin(Skinnable.BLACK);

    hmd.putSkin();



  }
}

//클래스형 인스턴스
//HeadMounted 클래스의 변수 hmd, Wearable형의 변수 w, Skinnable형의 변수는 모두 생성된 동일 인스턴스를 참조한다. 변수  hmd, w, s 형이 각각 다르기 때문에 해당 형에서 호출가능한 메서드만 호출한다.
