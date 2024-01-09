import java.util.Scanner;
public class Deportes {
    private String tipo;
    private String genero;

    public void aceptacion(){
        System.out.println("El juego de "+tipo+ " participan "+genero);
    }
}
class Futbol extends Deportes{
    private int sancionesfut;
    private int examenesfut;
    private int edadfut;

    public int getEdadfut(){
        return edadfut;
    }
    public void setEdadfut(int edadfut){
        this.edadfut=edadfut;
    }

    @Override
    public void aceptacion() {
        System.out.println("El participante cumple los requisitos");
    }

    public void sancionesparafut(){
        System.out.println("El participante carece de sanciones");
    }
    public void examenesparafut(){
        System.out.println("El participante tiene examenes");
    }

}
class Basquet extends Deportes{
    private String sancionesbas;
    private String examenesbas;
    private String edadbas;
    @Override
    public void aceptacion() {
        System.out.println("El participante cumple los requisitos");
    }

    public void sancionesparabas(){
        System.out.println("El participante carece de sanciones");
    }
    public void examenesparabas(){
        System.out.println("El participante tiene examenes");
    }

    public static void main(String[] args){
        Scanner dato = new Scanner(System.in);
        Futbol jugadorfutbol1 = new Futbol();

        try{
            System.out.print("Ingrese la edad del jugador: ");
            double ingreso = dato.nextInt();
            System.out.print("Ingrese el numero de sanciones del jugador: ");
            double ingreso2 = dato.nextDouble();
            System.out.print("Ingrese el número de examens del jugador: ");
            double ingreso3= dato.nextDouble();
            int ingresoint = (int) ingreso;
            int ingreso2int = (int) ingreso2;
            int ingreso3int = (int) ingreso3;

            if(ingresoint>=18 && ingreso2int==0 && ingreso3int>0){
                jugadorfutbol1.setEdadfut(ingresoint);
                jugadorfutbol1.examenesparafut();
                jugadorfutbol1.sancionesparafut();
                jugadorfutbol1.aceptacion();
            } else if (ingreso>=18 || ingreso2int>0 || ingreso3int ==0) {
                System.out.print("El participante no cumple con los requisitos");
            } else if(ingresoint>0 && ingresoint<18){
                System.out.println("Es menor de edad");
            } else if (ingreso<0 || ingreso2int<0 || ingreso3int<0) {
                System.out.println("No se aceptan valores negativos");
            }
        }catch (Exception ex){
            System.out.println("El dato ingresado es incorrecto");
        }
        System.out.println("Fin del Programa");
    }
}
