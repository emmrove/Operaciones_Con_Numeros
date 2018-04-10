public class NoMultiplica implements Multiplicar{
    @Override
    public DatoMatCom Multiplicar(DatoMatCom obj, DatoMatCom obj2){
         try {
             throw new UnsupportedOperationException("Not supported yet."); 
        } catch (Exception e) {
            System.out.println("sin resultado\n No se puede Realizar la Operacion ");
        }
        return obj2;
    }
}