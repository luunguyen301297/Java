package oop.Lab8;

import java.time.LocalDate;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/26/2023, Thursday
 **/
@FunctionalInterface
public interface ILevel {
  enum LEVEL {
    PRIMARY, JUNIOR, HIGH, UNIVERSITY;
  }
  LEVEL level = null;

  void showLevel();

  default LEVEL getLevel(LocalDate enrollDate) {
    LEVEL level = null;
    LocalDate dayNow = LocalDate.now();
    int inSchool = dayNow.getYear() - enrollDate.getYear();
    if (inSchool >= 1 && inSchool <= 5) {
      level = LEVEL.PRIMARY;
    } else if (inSchool >= 6 && inSchool <= 9) {
      level = LEVEL.JUNIOR;
    } else if (inSchool >= 10 && inSchool <= 12) {
      level = LEVEL.HIGH;
    } else if (inSchool > 12) {
      level = LEVEL.UNIVERSITY;
    }
    return level;
  }

  default void onLevel() {
    switch (level) {
      case PRIMARY:
        System.out.println("Primary school student level");
        break;
      case JUNIOR:
        System.out.println("Junior high school student level");
        break;
      case HIGH:
        System.out.println("High school student level");
        break;
      case UNIVERSITY:
        System.out.println("University student level");
        break;
      default:
    }
  }
}
