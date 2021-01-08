package JavaSE.Java_intermediate.Collection.Other_Collection.L3_HashMap.s1_key_value;

import java.util.HashMap;

public class TestCollection {
    public static void main(String[] args) {
        HashMap<String, String> hs = new HashMap<>();
        hs.put("adc", "物理英雄");
        hs.put("apc", "魔法英雄");
        hs.put("t", "坦克");

        System.out.println(hs.get("t"));
    }
}
