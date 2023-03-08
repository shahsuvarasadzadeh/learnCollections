package l_COLLECTION_FRAMEWORK.l_COLLECTIONS.l_LIST.m_ReplaceAll;

import java.util.ArrayList;

public class M_replaceAll {
 /**   The replaceAll() method of the List interface accept an object of the UnaryOperator representing
            a particular operation, performs the specified operation on all the elements of
            the current list and replaces the existing values in the list with their respective results.

  List interfeysinin replaceAll() metodu müəyyən əməliyyatı təmsil edən UnaryOperator obyektini implement edir,
  cari siyahının bütün elementləri üzərində göstərilən əməliyyatı yerinə yetirir
  və siyahıdakı mövcud dəyərləri müvafiq nəticələrlə əvəz edir.*/


 public static void main(String[] args) {
  ArrayList<String> list = new ArrayList<>();
  list.add("Java");
  list.add("JavaScript");
  list.add("CoffeeScript");
  list.add("HBase");
  list.add("OpenNLP");
  System.out.println("Contents of the list: \n "+list);
  System.out.println("----------------------");
  list.replaceAll(new UOperator());
  System.out.println("Contents of the list after replace operation: \n"+list);
 }
}
