package JavaSE.Java_intermediate.Thread.L1_Start_a_thread.s2_create_threads_extends_Thread;

public class KillThread extends Thread{

    private Hero h1;
    private Hero h2;

    public KillThread(Hero h1, Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }

    public void run(){
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}