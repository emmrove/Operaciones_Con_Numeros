public class Punto extends DatoMatCom{
    public Punto(double dato1, double dato2){
        super(dato1, dato2);
        sumita = new SumaDirecta();
        multi = new NoMultiplica();
    }
    @Override
    public void mostrarDatos(){
        System.out.println("(" + (int)dato1 + "," + (int)dato2 + ")");
    }
}