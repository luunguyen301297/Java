import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/12/2023, Thursday
 **/
public class ArrayListLab {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    String[] str = {"a", "b", "c"};
    List<String> list1 = new ArrayList<>(Arrays.asList(str));
    //if capacity = 10 & size = 10
    //add new element -> capacity increase 50%

    Human h1 = new Human("Trump", 2);
    Human h2 = new Human("Putin", 10);

    List<Human> humans = Arrays.asList(h1, h2);

    List<Students> students = new ArrayList<>();
    for (Human h : humans) {
      Students s = h.grow();
      if (h != null) {
        students.add(s);
      }
    }

    List<Students> students1 = humans.stream().map(Human::grow).collect(Collectors.toList());
  }
}
