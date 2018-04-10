public class NumerosComplejos extends DatoMatCom{
    public NumerosComplejos(double dato1, double dato2){
        super(dato1, dato2);
        sumita = new SumaDirecta();
        multi = new MultiplicaDirecta();
    }
    @Override
    public void mostrarDatos(){
        System.out.println((int)dato1 + "  " + "+" + "  " + (int)dato2 + "i");
    }
}