public class Vectores extends DatoMatCom{
    public Vectores(double dato1, double dato2){
        super(dato1, dato2);
        sumita = new SumaVector();
        multi = new NoMultiplica();
    }
    @Override
    public void mostrarDatos(){
        System.out.println("[" + (int)dato1 + "@" + (int)dato2 + "]");
    }
}