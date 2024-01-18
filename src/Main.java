
public class Main {
    public static void main(String[] args) {
        int vet[] = new int[11];
        int cont = 10;

        System.out.println("Os elementos impares no intervalo são: ");

        for (int i = 0; i < 11; i++) {
            vet[i] = cont;
            cont++;
        }

        for (int i = 0; i < 11; i++) {
            if (vet[i] % 2 != 0) {
                System.out.print(vet[i] + "\t");

            }

        }

        System.out.println("\nOs elementos pares no intervalo são: ");
        for (int i = 0; i < 11; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + "\t");

            }

        }

    }
}