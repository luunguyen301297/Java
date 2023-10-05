package QLBB;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/22/2023, Friday
 **/
public class Ticket {
  static List<Character> characterList = new ArrayList<>();
  static List<Integer> indexList = new ArrayList<>();
  String code;
  Date registeredDate;

  public Ticket() {
  }

  public String getCode() {
    return code;
  }

  public Date getRegisteredDate() {
    return registeredDate;
  }

  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }

  public void autoGenerateCode() {
    autoGenerateCharacter();

    code = "";
    for (int i = 0; i < indexList.size(); i++) {
      int currentIndex = indexList.get(i);
      code += String.valueOf(characterList.get(currentIndex));
    }

    int lasiIndex = indexList.size() - 1;
    indexList.set(lasiIndex, indexList.get(lasiIndex) + 1);

    for (int i = indexList.size() - 1; i > 0 ; i--) {
      if (indexList.get(i) < characterList.size()) {
        break;
      }
      indexList.set(i, 0);
      indexList.set(i - 1, indexList.get(i - 1) + 1);
    }
  }

  private static void autoGenerateCharacter() {
    if (characterList.size() > 0)
      return;

    //Khoi tao mang du lieu
    for (int i = (int)'a'; i < (int)'z'; i++) {
      characterList.add((char) i);
    }
//    for (int i = (int)'A'; i < (int)'Z'; i++) {
//      characterList.add((char) i);
//    }
    for (int i = (int)'0'; i < (int)'9'; i++) {
      characterList.add((char) i);
    }

    //save index tai thoi diem tiep theo se dc generate
    for (int i = 0; i < 6; i++) {
      indexList.add(0);
    }
  }

  public Date convertStringToDate(String str) {
    try {
      SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
      return format.parse(str);
    } catch (ParseException e) {
      Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, e);
      return new Date();
    }
  }

  public void input() {
    Scanner scanner = new Scanner(System.in);
    autoGenerateCode();

    System.out.println("Enter resgistered date (dd/MM/yyyy) : ");
    String registeredDateStr = scanner.nextLine();
    registeredDate = convertStringToDate(registeredDateStr);
  }
}
