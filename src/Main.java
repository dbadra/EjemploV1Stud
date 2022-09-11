public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;



        Auto miAuto = new Auto();
        miAuto.agregarPuerta();
        miAuto.agregarPuerta();

        System.out.println("El Auto tiene " + miAuto.puerta + " puertas");
        System.out.println("El resultado de la suma es: " + suma(a,b,c));
    }

    public static int suma (int a, int b, int c){

        return a+b+c;

    }

}


class Auto{

    public int puerta = 0;

    public void agregarPuerta() {
        this.puerta++;
    }
}