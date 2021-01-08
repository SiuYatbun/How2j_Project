package JavaSE.Java_elementary.Class_and_Object.L11_Enum.s2_advantage;

/*
假设在使用switch的时候，不是使用枚举，
而是使用int，而int的取值范围就不只是1-4，有可能取一个超出1-4之间的值，这样判断结果就似是而非了。（因为只有4个季节）

但是使用枚举，就能把范围死死的限定在这四个当中：
SPRING,SUMMER,AUTUMN,WINTER


而不会出现奇怪的 第5季
 */
public class HelloWorld {
    public static void main(String[] args) {
        int season = 5;
        switch (season) {
            case 1:
                System.out.println("春天");
                break;
            case 2:
                System.out.println("夏天");
                break;
            case 3:
                System.out.println("秋天");
                break;
            case 4:
                System.out.println("冬天");
                break;
        }
    }
}