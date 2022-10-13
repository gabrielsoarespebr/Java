public class VetorInverso {
    public static void main(String[] args) {
        //int[] vetor = { 7, 13, 25, 33, 42, 58 };
        int[] vetor = { 10, 20, 30, 40, 50, 60 };

        System.out.println("Vetor inverso:");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i]);
            if (i != 0)
                System.out.print(", ");
        }
    }
}