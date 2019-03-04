import java.util.*;

class FactoryMap {

  public Map getImplementation(int implementation) {

    switch(implementation){
      case 1:
        return new HashM();
        break;

      case 2:
        return new TreeM();
        break;

      case 3:
        return new LinkedH();
        break;

      default:
        return null;
        break;
    }
  }
}
