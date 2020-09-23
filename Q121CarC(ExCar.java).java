class ExCar extends Car {
  
  // Car Class : 부모, 상위, 기본, 슈퍼
  // Excar Class : 자식, 하위, 파생, 서브
  private double totalMileage;

//생성자
  public ExCar(String name, int width, int height, int length, double fuel, String purchaseDay) {
    super(name, width, height, length, fuel, purchaseDay);
    totalMileage = 0.0;
  }

  public double getTotalMileage() {
    return totalMileage;
  }

  public void putSpec() {
    super.putSpec();
    System.out.printf("총 주행 거리 : %.2fkm\n", totalMileage);
  }

  public boolean move(double dx, double dy) {
    double dist = Math.sqrt(dx * dx + dy * dy);
    if (!super.move(dx,dy))
    return false;
    else {
      totalMileage += dist;
      return true;
    }
  }
}
