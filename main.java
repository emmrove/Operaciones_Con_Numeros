public class main{
    public static void main(){
        System.out.println("+++++++++++++++");
        System.out.println("SUMAS");
        System.out.println("+++++++++++++++");
        //PUNTOS
        DatoMatCom puntoS1 = new Punto(4, 6);
        DatoMatCom puntoS2 = new Punto(2, 2);   
        System.out.println("El primer punto es");
        puntoS1.mostrarDatos();
        System.out.println("El segundo punto es");
        puntoS2.mostrarDatos();
        System.out.println("La Suma es");
        puntoS1.Sumando(puntoS2).mostrarDatos();
        //NUMEROS COMPLEJOS
        System.out.println("+++++++++++++++");
        DatoMatCom numcomS1 = new NumerosComplejos(3, -4);
        DatoMatCom numcomS2 = new NumerosComplejos(1, 9);
        System.out.println("El primer Numero Complejo es");
        numcomS1.mostrarDatos();
        System.out.println("El segundo Numero Complejo es");
        numcomS2.mostrarDatos();
        System.out.println("La Suma es");
        numcomS1.Sumando(numcomS2).mostrarDatos();
        //VECTORES
        System.out.println("+++++++++++++++");
        DatoMatCom vecS1 = new Vectores(5, 4);
        DatoMatCom vecS2 = new Vectores(7, 4);
        System.out.println("El primer Vector es");
        vecS1.mostrarDatos();
        System.out.println("El segundo Vector es");
        vecS2.mostrarDatos();
        System.out.println("La Suma es");
        vecS1.Sumando(vecS2).mostrarDatos();
        //FRACCIONES
        System.out.println("+++++++++++++++");
        DatoMatCom fraccS1 = new Fracciones(5, 5);
        DatoMatCom fraccS2 = new Fracciones(5, 5);
        System.out.println("La primera Fraccion es");
        fraccS1.mostrarDatos();
        System.out.println("La segunda Fraccion es");
        fraccS2.mostrarDatos();
        System.out.println("La Suma simplificada es");
        fraccS1.Sumando(fraccS2).mostrarDatos();
        
        
        System.out.println("\n+++++++++++++++");
        System.out.println("MULTIPLICACIONES");
        System.out.println("+++++++++++++++");
        //PUNTOS
        DatoMatCom puntoM1 = new Punto(4, 6);
        DatoMatCom puntoM2 = new Punto(2, 2);   
        System.out.println("El primer punto es");
        puntoM1.mostrarDatos();
        System.out.println("El segundo punto es");
        puntoM2.mostrarDatos();
        System.out.println("La Multiplicacion es");
        puntoM1.Multiplicando(puntoM2).mostrarDatos();
        //NUMEROSCOMPLEJOS
        DatoMatCom numcomM1 = new NumerosComplejos(4, 6);
        DatoMatCom numcomM2 = new NumerosComplejos(3, 3);   
        System.out.println("El primer Numero Complejo es");
        numcomM1.mostrarDatos();
        System.out.println("El segundo Numero Complejo es");
        numcomM2.mostrarDatos();
        System.out.println("La Multiplicacion es");
        numcomM1.Multiplicando(numcomM2).mostrarDatos();
        //VECTORES
        System.out.println("+++++++++++++++");
        DatoMatCom vecM1 = new Vectores(5, 4);
        DatoMatCom vecM2 = new Vectores(7, 4);
        System.out.println("El primer Vector es");
        vecM1.mostrarDatos();
        System.out.println("El segundo Vector es");
        vecM2.mostrarDatos();
        System.out.println("La Multiplicacion es");
        vecM1.Multiplicando(vecM2).mostrarDatos();
        //FRACCIONES
        System.out.println("+++++++++++++++");
        DatoMatCom fraccM1 = new Fracciones(3, 5);
        DatoMatCom fraccM2 = new Fracciones(2, 5);
        System.out.println("La primera Fraccion es");
        fraccM1.mostrarDatos();
        System.out.println("La segunda Fraccion es");
        fraccM2.mostrarDatos();
        System.out.println("La Multiplicacion simplificada es");
        fraccM1.Multiplicando(fraccM2).mostrarDatos();      
    }
}