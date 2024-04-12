package chap04;

public class Member {
  // 이름 아이디 암호 나이
  private String name = "";
  private String id = "";
  private String pw = "";
  private String age = "";

  public Member(String name, String id, String pw, String age) {
    this.name = name;
    this.id = id;
    this.pw = pw;
    this.age = age;
  }

  public String getName() {
    return name;
  }
  public String getId() {
    return id;
  }
  public String getPw() {
    return pw;
  }
  public String getAge() {
    return age;
  }

  
}
