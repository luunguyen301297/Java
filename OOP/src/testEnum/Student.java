package testEnum;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/6/2023, Wednesday
 **/
public class Student {
  private int id;
  private String name;
  private double avgScore;
  private Classification status;

  public Student(int id, String name, double avgScore) {
    this.id = id;
    this.name = name;
    this.avgScore = avgScore;
    this.status = getStatus();
  }

  public Classification getStatus() {
    if (this.avgScore >= 8)
      status = Classification.gioi;
    else if (this.avgScore >= 6.5)
      status = Classification.kha;
    else if (this.avgScore >= 5)
      status = Classification.trungBinh;
    else if (this.avgScore >= 3)
      status = Classification.yeu;
    else
      status = Classification.duoiHoc;
    return status;
  }

  @Override
  public String toString() {
    return id + " | " +
      name + " | " +
      avgScore + " | " +
      this.status.getMessage();
  }
}
