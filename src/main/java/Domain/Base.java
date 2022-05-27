package Domain;

public class Base {
  private String campo_base;
  private BaseAbstract campo2;

  public String getCampo_base() {
    return campo_base;
  }

  public void setCampo_base(String campo_base) {
    this.campo_base = campo_base;
  }

  public void setCampo2(BaseAbstract base){
    this.campo2 = base;
    this.campo2.setNombre("NOMBRE");
  }

  public String getCampo2_nombre(){
    return this.campo2.nombre;
  }

  public String getCampo2_apellido(){
    return this.campo2.apellido;
  }

  public void getTodo(){
    System.out.println("HERE GOES EVERYTHING" + this.campo_base);
    System.out.println(this.campo2.nombre);
    System.out.println(this.campo2.apellido);
  }

}
