package java1;

public class SumOfNumInString {
  public static void main(String[] args) {
    String s = "Toan: 9, Ly: 8, Hoa: 7, Anh: 6";
    s = s.replace(",", "");
    String[] arr = s.split(" ");

    int sum = 0;
    int count = 0;

    for (String parts : arr) {
      System.out.println(parts);
      try {
        int num = Integer.parseInt(parts);
        sum += num;
        count++;
      } catch (NumberFormatException exception) {

      }
    }
    double avg = (double) sum / count;
    System.out.println("Tong diem: " + sum);
    System.out.println("Diem TB: " + avg);
  }
}
