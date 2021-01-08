package JavaSE.charactor;

public class Hero implements Comparable<Hero>{
    public int id;
    public String name;
    public float hp;

    public int damage;

    static String copyright;

    static {
        System.out.println("初始化 copyright");
        copyright = "版权由Riot Games公司所有";
        System.out.println(copyright);
    }

    public Hero(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Hero(String name) {
        this.name =name;

    }

    public Hero(String name,float hp, int damage) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    //初始化name,hp,damage的构造方法
    public Hero(int id,String name,float hp, int damage) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    @Override
    public int compareTo(Hero anotherHero) {
        if(damage<anotherHero.damage)
            return 1;
        else
            return -1;
    }

    public void attackHero(Hero h2) {
        System.out.println(this.name+ " 正在攻击 " + h2.getName());
    }

    @Override
    public String toString() {
        return "id:"+id+"\tname:" + name + "\thp:" + hp + "\tdamage:" + damage + "\r\n";
    }

    public boolean matched(){
        return this.hp>100 && this.damage<50;
    }
}