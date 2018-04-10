public class SumaVector implements Sumar{
    @Override
    public DatoMatCom Suma(DatoMatCom obj, DatoMatCom obj2){
        double x1, x2, y1, y2;
        if(obj.getDato2() == obj2.getDato2()){
            obj2.setDato1(obj.getDato1() + obj2.getDato1());
            obj2.setDato2(obj.getDato2());
        }else{
            x1 = obj.getDato1()*Math.cos(obj.getDato2());
            y1 = obj.getDato1()*Math.sin(obj.getDato2());
            x2 = obj2.getDato1()*Math.cos(obj2.getDato2());
            y2 = obj2.getDato1()*Math.sin(obj2.getDato2());
            obj2.setDato1(x1+x2);
            obj2.setDato2(y1+y2);
        }
        return obj2;
    }
    public void mostrarFraccionSimplificada(int numerador, int denominador){
        int div=0;
        if((numerador % denominador)==0){
            div=numerador/denominador;
            //JOptionPane.showMessageDialog(null,""+div);
        }
        else if((denominador % numerador)==0){
            div=denominador/numerador;
            //JOptionPane.showMessageDialog(null,"1/"+div);
        }else{
            //JOptionPane.showMessageDialog(null,""+numerador+"/"+denominador);
        }
    }
}