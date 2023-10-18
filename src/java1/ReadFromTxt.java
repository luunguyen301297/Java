package java1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/13/2023, Friday
 **/
public class ReadFromTxt {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      Path path = Path.of("C:\\Users\\ad\\Desktop\\Java\\Basic.txt");
      List<String> dataList = Files.readAllLines(path);

      while (true) {
        System.err.println("Enter keyword :");
        String search = scanner.nextLine();

        for (String line : dataList) {
          if (line == "\n") {
            System.out.println("a");
          }
        }
      }
    } catch (IOException ex) {
      System.err.println("I/O error : " + ex);
    }
  }
}
