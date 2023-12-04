package java1.encode_decode;

import java.util.Base64;
import java.util.UUID;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/19/2023, Thursday
 **/
public class EnCodeAndDeCode {
  public static void main(String[] args) {
    baseBase64();
    urlBase64();
  }

  public static void baseBase64() {
//    String myLove = "Maria Ozawa";
    StringBuilder myLoveBuilder = new StringBuilder();
    for (int i = 0; i <= 15; i++) {
      myLoveBuilder.append(UUID.randomUUID().toString());
    }
    String myLove = myLoveBuilder.toString();

    String myLoveEncoded = Base64.getMimeEncoder().withoutPadding().encodeToString(myLove.getBytes());
    System.err.println("Encode : " + myLoveEncoded);
    byte[] decodeStrs = Base64.getMimeDecoder().decode(myLoveEncoded);
    String decodeStr = new String(decodeStrs);
    System.err.println("Decode : " + decodeStr);
  }

  public static void urlBase64() {
    String url = "https://codelearn.io/sharing/annotation-trong-java-la-gi";
    String encodeurl = Base64.getUrlEncoder().encodeToString(url.getBytes());
    System.out.println("Encode : " + encodeurl);
    byte[] decodeBytes = Base64.getUrlDecoder().decode(encodeurl);
    System.out.println("Decode : " + decodeBytes);
  }
}
