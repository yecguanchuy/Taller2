public class Oracle extends  BDatos implements  Operaciones{
    @Override
    public void conectar() {
    System.out.println("Se conecta con oracle");
    }

    @Override
    public void consultar() {
        System.out.println("Se consulta con oracle");

    }

    @Override
    public void insertar() {
        System.out.println("Se inserta con oracle");

    }

    @Override
    public void eliminar() {
        System.out.println("Se elimina con oracle");

    }
}
