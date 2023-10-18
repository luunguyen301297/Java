package qlbb;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : ad
 * @mailto : luunguyen301297@gmail.com
 * @created : 9/22/2023, Friday
 **/
public class DataMgr {
  private static DataMgr instance = null;
  List<SwimmingPool> swimmingPools = new ArrayList<>();
  private DataMgr() {

  }

  public List<SwimmingPool> getSwimmingPools() {
    return swimmingPools;
  }

  public void setSwimmingPools(List<SwimmingPool> swimmingPools) {
    this.swimmingPools = swimmingPools;
  }

  public synchronized static DataMgr getInstance() {
    if (instance == null) {
      instance = new DataMgr();
    }
    return instance;
  }
}
