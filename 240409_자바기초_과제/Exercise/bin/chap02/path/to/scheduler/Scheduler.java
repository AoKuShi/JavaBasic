package scheduler;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Scheduler {
  public static void main(String[] args) throws FileNotFoundException {
    File f = new File("text.txt");
    Scanner sc = new Scanner(f);
    Scheduler s =  new Scheduler();

    s.insert(new SwP(sc.nextInt(), sc.nextInt()));
    s.start();

    while(sc.hasNextLine()){
      s.sleep(1000);
      s.insert(new SwP(sc.nextInt(), sc.nextInt()));
    }
  }

  List<SwP> sl = new CopyOnWriteArrayList<>();
  ExecutorService es = Executors.newSingleThreadExecutor();

  void insert(SwP p){
    sl.add(p);
  }

  void sleep(int i) {
    try {
      TimeUnit.MILLISECONDS.sleep(i);
    } catch (Exception e) {
      e.getMessage();
    }
  }

  void start() {
    es.execute(() -> {
      while (sl.size() != 0) {
        for (SwP p : sl) {
          System.out.println(p + " is running " + sl);
          sleep(1000);
          p.time--;
          
          if (p.time == 0) {
            sl.removeIf(j -> j.time == 0);
          }
        }
      }

      es.shutdown();
      System.exit(0);

    });
  }
}
