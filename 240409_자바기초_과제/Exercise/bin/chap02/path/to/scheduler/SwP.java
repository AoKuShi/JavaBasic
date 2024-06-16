package scheduler;

public class SwP {
  public int PID;
  public int time;
  
  public SwP(int PID, int time) {
    this.PID = PID;
    this.time = time;
  }

  @Override
  public String toString() {
    return "[PID = " + PID + ", time = " + time + "]";
  }

}
