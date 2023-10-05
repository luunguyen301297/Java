package Java1;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/23/2023, Saturday
 **/
public class String_Ex {
  public static void main(String[] args) {
    //String (Class Object)
    String s = "Gucci Gang";

    //kiem tra chuoi con
    boolean check = s.contains("Boy");
    if (check)
      System.out.println("Yes");
    else
      System.out.println("No");

    System.out.println(s.replace(" ", "-"));


    System.out.println("--------------------");


    //thay the ki tu trong chuoi
    String s2 = s.replace("Gang", "Gay");
    System.out.println(s2);


    //split
    String s3 = "Wibu, Gay";
    String[] arr = s3.split(", ");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    //tach ky tu
    String password = "Lyh30121501";
    char[] arr2 = password.toCharArray();

    //tach path
    String path = "C:/folder/tai_lieu_hoc_tap/jav.mp4";
    int lastSlashIndex = path.lastIndexOf('/');
    String fileName = path.substring(lastSlashIndex + 1);
    System.out.println(fileName);

    int lastDotIndex = fileName.lastIndexOf('.');
    String nameOnly = fileName.substring(0, lastDotIndex);
    System.out.println(nameOnly);


    System.out.println("--------------------");


    //StringBuilder, StringBuffer : xu ly so luong lon chuoi
    //StringBuilder
    StringBuilder stringBuilder = new StringBuilder(s);

    //them vao cuoi chuoi
    stringBuilder.append(" Rap");
    System.out.println(stringBuilder);

    //chen theo index
    stringBuilder.insert(0, "1. ");
    System.out.println(stringBuilder);

    //xoa
    stringBuilder.delete(0, 3);
    System.out.println(stringBuilder);
  }
}
