package chap07.p04;

public class TalkableTest {
  static void speak(Talkable tk){
    tk.talk();
  }
  public static void main(String[] args) {
    speak(new Korean());
    speak(new American());
  }
}
