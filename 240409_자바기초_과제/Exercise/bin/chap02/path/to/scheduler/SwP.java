package scheduler;

public class SwP {
  public int PID;
  public int time;
  
  public SwP(int PID, int eTime) {
    this.PID = PID;
    this.time = eTime;
  }

  @Override
  public String toString() {
    return "[PID = " + PID + ", time = " + time + "]";
  }

}