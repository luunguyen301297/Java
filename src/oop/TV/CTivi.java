package oop.TV;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 10/3/2023, Tuesday
 **/
public class CTivi {
  private String[] channelList;
  private boolean isOn;
  private String currentChanenl;

  public CTivi() {
    isOn = false;
    channelList = new String[3];
    channelList[0] = "VTV1";
    channelList[0] = "VTV2";
    channelList[0] = "VTV3";
    currentChanenl = "VTV1";
  }

  public CTivi(String[] channelList) {
    this.channelList = channelList;
    isOn = false;
    currentChanenl = channelList[0];
  }

  public String searchNextChannel(boolean isForward) {
    int currentIndex = -1;

    for (int i = 0; i < channelList.length; i++) {
      if (channelList[i].equalsIgnoreCase(currentChanenl)) {
        currentIndex = i;
        break;
      }
    }

    if (isForward) {
      currentIndex++;
      if (currentIndex > channelList.length) {
        currentIndex = 0;
      }
    } else {
      currentIndex--;
      if (currentIndex < 0) {
        currentIndex = channelList.length - 1;
      }
    }
    currentChanenl = channelList[currentIndex];
    return currentChanenl;
  }

  public void On() {
    isOn = false;
    System.out.println("TV ON");
  }

  public void Off() {
    isOn = false;
    System.out.println("TV OFF");
  }

  public void  Switch() {
    if (isOn) {
      Off();
    } else {
      On();
    }
  }

  public void  Switch(String channel) {
    Switch();
    if (isOn) {
      boolean isFind = false;

      for (int i = 0; i < channelList.length; i++) {
        if (channelList[i].equalsIgnoreCase(channel)) {
          isFind = true;
          break;
        }
      }

      if (isFind) {
        currentChanenl = channel;
        System.out.println("Kenh hien tai : " + channel);
      } else {
        System.out.println("Khong tim thay kenh");
      }
    }
  }

  public void nextChannel() {
    if (isOn) {
      searchNextChannel(true);
      System.out.println("Current Channel : " + currentChanenl);
    }
  }

  public void previousChannel() {
    if (isOn) {
      searchNextChannel(false);
      System.out.println("Current Channel : " + currentChanenl);
    }
  }

  public void show() {
    if (isOn) {
      System.out.println("------TV is ON at Channel : " + currentChanenl);
    } else {
      System.out.println("------TV is OFF");
    }
  }
}
