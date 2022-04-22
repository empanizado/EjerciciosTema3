public class Cochecito {
    int puerta = 0;
    public static void main(String []args ){
        Cochecito coche = new Cochecito();
        coche.incrementar();
        System.out.println("las puertas actuales son"+ coche.puerta);
    }
    public void incrementar(){
        puerta = puerta +1;
    }

}
