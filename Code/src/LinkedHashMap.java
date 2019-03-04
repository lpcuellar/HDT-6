import java.util.*;

class LinkedHashMap<K, V> implements iMap<K, V>{

  private LinkedHashMap<K, V> data;

  public LinkedH() {
    this.data = new LinkedHashMap();
  }

  public int size() {
    return data.size();
  }

  public boolean isEmpty() {
    return data.isEmpty;
  }

  public boolean containsKey(K k) {
    return data.containsKey;
  }

  public boolean containsValue(V v) {
    return data.containsValue;
  }

  public V get(K k) {
    return datos.get(k);
  }

  public V put(K k, V v){
    V object = datos.put(k, v);
    return object;
  }

  public V remove(K k){
    V object = datos.remove(k);
    return object;
  }

  public boolean equals(Object other) {
    return datos.equals(other);
  }

  public Set<K> keySet() {
    return datos.keySet();
  }

  public void show() {
    Set<K> keys = datos.keySet();
    for (K key : keys) {
      System.out.println("Carta: " + key + " - Tipo: " + datos.get(key));
    }
  }

  public void showOrder() {
    Set<K> keys = datos.keySet();
    System.out.println("Cartas de tipo Monstruo: ");
    for (K key : keys) {
      if (key.equals("Monstruo")) {
      System.out.println(key);
      }
    }

    System.out.println("Cartas de tipo Hechizo: ");
    for (K key : keys) {
      if (key.equals("Hechizo")) {
      System.out.println(key);
      }
    }

    System.out.println("Cartas de tipo Trampa: ");
    for (K key : keys) {
      if (key.equals("Trampa")) {
      System.out.println(key);
      }
    }
  }
}
