package JavaSE.charactor;

public class ADHero extends Hero implements AD{
    public String name;
    public float hp;

    public int damage;

    public ADHero(){

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

    public ADHero(String name) {
        this.name =name;

    }

    //初始化name,hp,damage的构造方法
    public ADHero(String name,float hp, int damage) {
        this.name =name;
        this.hp = hp;
        this.damage = damage;
    }
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }

}