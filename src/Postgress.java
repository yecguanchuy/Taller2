public class Postgress extends BDatos implements Operaciones {
    @Override
    public void conectar() {
        System.out.println("Se conecta con postgress");
    }

    @Override
    public void consultar() {
        System.out.println("Se consultar con postgress");
    }

    @Override
    public void insertar() {
        System.out.println("Se insertar con postgress");
    }

    @Override
    public void eliminar() {
        System.out.println("Se eliminar con postgress");
    }
}
