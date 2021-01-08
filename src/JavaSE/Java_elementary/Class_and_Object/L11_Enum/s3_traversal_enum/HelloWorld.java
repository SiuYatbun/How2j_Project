package JavaSE.Java_elementary.Class_and_Object.L11_Enum.s3_traversal_enum;

import JavaSE.Java_elementary.Class_and_Object.L11_Enum.s1_predefined_constant.Season;

public class HelloWorld {
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }
}
