package map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author 叶嘉卫
 * @date 2022/10/04/11:00
 * @Description
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        //key如果没有实现Comparable接口，就应该在创建Treemap时指定一个排序算法
        Map<Person, Integer> map = new TreeMap<>(new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });
        map.put(new Person("Tom"), 1);
        map.put(new Person("Bob"), 2);
        map.put(new Person("Lily"), 3);
        for (Person key : map.keySet()) {
            System.out.println(key);
        }
        // {Person: Bob}, {Person: Lily}, {Person: Tom}
        System.out.println(map.get(new Person("Bob"))); // 2
    }
}

class Person {
    public String name;
    Person(String name) {
        this.name = name;
    }
    public String toString() {
        return "{Person: " + name + "}";
    }
}


