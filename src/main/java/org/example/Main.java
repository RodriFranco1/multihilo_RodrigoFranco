public class Main {

    static class Hebra extends Thread {
        private final char caracter;
        private final int veces;

        public Hebra(char caracter, int veces) {
            this.caracter = caracter;
            this.veces = veces;
        }

        @Override
        public void run() {
            for (int i = 0; i < veces; i++) {
                System.out.print(caracter);
            }
        }
    }

    public static void main(String[] args) {
        Hebra h1 = new Hebra('A', 10);
        Hebra h2 = new Hebra('B', 20);
        Hebra h3 = new Hebra('C', 3);

        h1.start();
        h2.start();
        h3.start();
    }
}
