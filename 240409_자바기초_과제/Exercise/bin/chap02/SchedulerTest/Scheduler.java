package SchedulerTest;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Scheduler {
    public static void main(String[] args) {
        Scheduler s = new Scheduler();

        s.insert(new SwP(1, 7));
        s.start();

        s.sleep(1000);
        s.insert(new SwP(2, 3));
        s.sleep(1000);
        s.insert(new SwP(3, 1));
    }

    List<SwP> rQ = new CopyOnWriteArrayList<>();
    ExecutorService rT = Executors.newSingleThreadExecutor();

    void insert(SwP p) {
        rQ.add(p);
    }

    void sleep(int i) {
        try {
            TimeUnit.MILLISECONDS.sleep(i);
        } catch (Exception e) {
            e.printStackTrace(); // 예외 처리 수정
        }
    }

    void log(SwP p) {
        System.out.println(p + " is running " + rQ);
    }

    void start() {
        rT.execute(() -> {
            while (rQ.size() != 0) {
                for (SwP p : rQ) {
                    log(p);
                    sleep(1000);
                    p.eTime--;

                    if (p.eTime == 0) {
                        rQ.removeIf(j -> j.eTime == 0);
                    }
                }
            }

            rT.shutdown();
            System.exit(0);
        });
    }
}
