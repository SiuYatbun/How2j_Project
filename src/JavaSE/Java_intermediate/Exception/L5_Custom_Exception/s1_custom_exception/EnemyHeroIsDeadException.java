package JavaSE.Java_intermediate.Exception.L5_Custom_Exception.s1_custom_exception;

/*
一个英雄攻击另一个英雄的时候，如果发现另一个英雄已经挂了，就会抛出EnemyHeroIsDeadException
创建一个类EnemyHeroIsDeadException，并继承Exception
提供两个构造方法
1. 无参的构造方法
2. 带参的构造方法，并调用父类的对应的构造方法
 */

class EnemyHeroIsDeadException extends Exception{

    public EnemyHeroIsDeadException(){

    }
    public EnemyHeroIsDeadException(String msg){
        super(msg);
    }
}
