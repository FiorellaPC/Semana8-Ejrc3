public class Main {
    public static void main(String[] args) {
        int numeroPar = 0;

        for (int contador = 1; contador <= 50; contador++){
            if (contador % 2 == 0){
                numeroPar++;
            }
        }
        System.out.println("Cant. de números pares del 1 a 50: "+numeroPar);
    }
}
