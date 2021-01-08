package JavaSE.Java_intermediate.Thread.L2_Thread_method.s6_lsq_cry;

public class TestThread {
    public static void main(String[] args) {
        Thread lsq =new Thread(){
            @Override
            public void run() {
                while (true) {
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("吕素勤开始流下第" + i + "滴眼泪");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("开始为时5秒的冷静");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("眼角又湿了");
                }
            }
        };
        lsq.start();
    }

}
