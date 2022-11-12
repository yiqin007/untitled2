package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 叶嘉卫
 * @date 2022/10/04/10:52
 * @Description
 */
public class HashMapDemo {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);
        //使用 get(key) 方法来获取 key 对应的 value:
        System.out.println(Sites.get(3));
        //使用 remove(key) 方法来删除 key 对应的键值对(key-value):
        Sites.remove(4);
        System.out.println(Sites);
        //用values获取value
        for(String value: Sites.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }
        System.out.println();
        // 用keyset获取key，
        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        //entryset获取键值
        for (Map.Entry s:Sites.entrySet()) {
            System.out.println(s.getKey()+" "+s.getValue());
        }
    }
}
