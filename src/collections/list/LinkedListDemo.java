package collections.list;

import java.util.LinkedList;

/**
 * @author 叶嘉卫
 * @date 2022/10/04/10:05
 * @Description
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        // 使用 addFirst() 在头部添加元素
        sites.addFirst("Wiki");
        System.out.println(sites);
        // 使用 addLast() 在尾部添加元素
        sites.addLast("Wiki");
        // 使用 removeFirst() 移除头部元素
        sites.removeFirst();
        System.out.println(sites);
        // 使用 removeLast() 移除尾部元素
        sites.removeLast();
        System.out.println(sites);
        // 使用 getFirst() 获取头部元素，使用 getLast() 获取尾部元素
        System.out.println(sites.getFirst());
        System.out.println(sites.getLast());
        //使用 for-each 来迭代元素：
        for (String i : sites) {
            System.out.println(i);
        }
    }
}
