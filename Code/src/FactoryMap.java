//package src;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class FactoryMap {

  public Map<String, String> getMap(int n) {

    if (n == 1) {
      return new HashMap<>();
    }

    else if (n == 2) {
      return new LinkedHashMap<>();
    }

    else {
      return new TreeMap<>();
    }
  }
}
