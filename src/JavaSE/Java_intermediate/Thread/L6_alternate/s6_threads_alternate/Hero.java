package JavaSE.Java_intermediate.Thread.L6_alternate.s6_threads_alternate;

/*
假设加血线程运行得更加频繁，英雄的最大血量是1000
设计加血线程和减血线程的交互，让回血回满之后，加血线程等待，直到有减血线程减血

在上面的练习的基础上，增加回血线程到2条，减血线程到5条，同时运行。
运行一段时间，观察会发生的错误，分析错误原因，并考虑解决办法
 */
public class Hero {
    public String name;
    public float hp;

    public int damage;

    public synchronized void recover() {
        if(this.hp == 1000)
            try
            {
                this.wait();
            } catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        this.hp+=1;
        System.out.println("增加一滴血，还剩" + this.hp);
        //this.notify();
    }

    public synchronized void hurt() {
        if (hp == 1) {
            try {
                // 让占有this的减血线程，暂时释放对this的占有，并等待
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        hp = hp - 1;
        System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);
        this.notify();
    }

    public void attackHero(Hero h) {
        h.hp -= damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n", name, h.name, h.name, h.hp);
        if (h.isDead())
            System.out.println(h.name + "死了！");
    }

    public boolean isDead() {
        return 0 >= hp ? true : false;
    }

}
