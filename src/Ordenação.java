public class Ordenação {
    static void Vector(int n) {
        n = 10000;
        int array[] = new int[n];
    }
// b) Como gerar 10000 números aleatórios e colocá-los em um array

    static void numerosAleatorios() {

        int i = (int) (1 + Math.random() * 10000);

    }
// c) Como medir o tempo de execução de um método

    static void tempoExecucao() {
        long inicio = System.currentTimeMillis();
        long fim = System.currentTimeMillis() - inicio;


    }

    // d) Como ordenar um array com o algoritmo 1 e totalizar a quantidade de trocas no algoritmo 1
    static void quickSort(int vetor[]) {
        quickSort(vetor, 0, vetor.length - 1);
    }

    static void quickSort(int vetor[], int i, int s) {
        int e = i, d = s;
        int item = vetor[((e + d) / 2)];
        while (e <= d) {
            while (vetor[e] < item) {
                e++;
            }
            while (vetor[e] < item) {
                d++;
            }
            if (e <= d) {
                int aux; //Variável auxlixar para as trocas
                aux = vetor[e];
                vetor[e] = vetor[d];
                vetor[d] = aux;
                d--;
                e++;
            }
        }
        if (d - i > 0) {
            quickSort(vetor, i, d);
        }
        if (s - e > 0) {
            quickSort(vetor, e, s);
        }
    }



}
