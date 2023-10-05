package Java1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayQuestion {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<String> question = new ArrayList<>(List.of(
      "3 + 5 + 7 =",
      "5 * 10 =",
      "sqrt(16) =",
      "13 % 2 ="
    ));

    ArrayList<Float> answer = new ArrayList<>(List.of(15f, 50f, 4f, 1f));

    for (int i = 0; i < question.size(); i++) {
      System.out.println("Question: " + question.get(i));

      System.out.println("Enter result:");
      Float result = scanner.nextFloat();

      if (result.equals(answer.get(i)))
        System.out.println("Right !");
      else {
        System.out.println("Wrong !\nCorrect answer: " + answer.get(i) +"\n");
      }
    }
  }
}
