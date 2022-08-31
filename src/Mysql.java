public class Mysql extends BDatos implements Operaciones {
    @Override
    public void conectar() {
        System.out.println("Se conecta con mysql");
    }

    @Override
    public void consultar() {
        System.out.println("Se consultar con mysql");
    }

    @Override
    public void insertar() {
        System.out.println("Se insertar con mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Se eliminar con mysql");
    }
}
