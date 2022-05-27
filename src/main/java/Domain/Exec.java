package Domain;

public class Exec {
  public static void main(String[] args){
    Base c2 = new Base();
    Base2 c3 = new Base2();
    c2.setCampo_base("CAMPO 1");
    c2.setCampo2(c3);

    c2.getTodo();
  }
}
