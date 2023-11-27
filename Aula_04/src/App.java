public class App {
    public static void main(String[] args) throws Exception {


        System.out.println("Tipos de numeros inteiros.");
        
        int v1 = 50;
        byte v2 = 30;
        short v3 = 60;
        long v4 = -8;
        
        long pop = 231783617831L;
        System.out.println("\n");
        System.out.println("BYTE: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("Integer: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
        System.out.println("\n");

        System.out.println("Tipos de numeros com ponto flutuante");

        float f1 = 54.84f;
        double d1 = 54.43;
        System.out.println("\n");
        System.out.println("Float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
        System.out.println("\n");

        System.out.println("Tipos de caractere");

        char letra = 'A';
        char letraAcentuada = '\u00DA'; // Ù
        System.out.println("\n");

        System.out.println("Tipo booleano");

        boolean concederDesconto = true;
        boolean naoconcederDesconto = false;


        int x1 = 100;
        int x2 = x1;
        x1 = 200;
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);

    }
}
