//package src;

import src.AMap;

import java.util.*;

class LinkedHashMap<K, V> extends AMap<K, V> {

  private   linkedh<K, V> data;

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
    return data.get(k);
  }

  public V put(K k, V v){
    V object = data.put(k, v);
    return object;
  }

  public V remove(K k){
    V object = data.remove(k);
    return object;
  }

  public boolean equals(Object other) {
    return data.equals(other);
  }

  public Set<K> keySet() {
    return data.keySet();
  }

  public void show() {
    Set<K> keys = data.keySet();
    for (K key : keys) {
      System.out.println("Carta: " + key + " - Tipo: " + data.get(key));
    }
  }

  public void showOrder() {
    Set<K> keys = data.keySet();
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
