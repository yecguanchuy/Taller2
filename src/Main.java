public class Main {
 public static void main(String[] args) {

  Oracle c = new Oracle();
  c.conectar();
  c.consultar();
  c.eliminar();
  c.insertar();

  Postgress p = new Postgress();
  p.conectar();
  p.consultar();
  p.eliminar();
  p.insertar();

  Mysql m = new Mysql();
  m.conectar();
  m.consultar();
  m.eliminar();
  m.insertar();

 }

}
