package JavaSE.Java_intermediate.Thread.L6_alternate.s1_bad_solution;

public class Hero{
    public String name;
    public float hp;

    public int damage;

    public synchronized void recover(){
        hp=hp+1;
    }

    public synchronized void hurt(){
        hp=hp-1;
    }

    public void attackHero(Hero h) {
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if(h.isDead())
            System.out.println(h.name +"死了！");
    }

    public boolean isDead() {
        return 0>=hp?true:false;
    }

}