package testEnum;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/6/2023, Wednesday
 **/
public enum Classification {
  gioi ("Giỏi"),
  kha ("Khá"),
  trungBinh ("Trung Bình"),
  yeu ("Yếu"),
  duoiHoc ("Đuổi Học");

  private String message;

  Classification(String message) {
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }
}
