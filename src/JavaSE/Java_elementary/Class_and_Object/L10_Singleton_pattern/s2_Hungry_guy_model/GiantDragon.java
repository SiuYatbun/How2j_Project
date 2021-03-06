package JavaSE.Java_elementary.Class_and_Object.L10_Singleton_pattern.s2_Hungry_guy_model;

/*
GiantDragon 应该只有一只，通过私有化其构造方法，使得外部无法通过new 得到新的实例。
GiantDragon 提供了一个public static的getInstance方法，
外部调用者通过该方法获取19行定义的对象，而且每一次都是获取同一个对象。 从而达到单例的目的。
这种单例模式又叫做饿汉式单例模式，无论如何都会创建一个实例
 */

public class GiantDragon {

    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragon(){

    }


    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个
    private static GiantDragon instance = new GiantDragon();


    //public static 方法，提供给调用者获取19行定义的对象
    public static GiantDragon getInstance(){
        return instance;
    }

}
