import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000};

        for (int n : sizes) {
            System.out.println("\n--- Testando para N = " + n + " ---");

            int[] vetorTeste = generateRandom(n);

            long start = System.nanoTime();

            SortingAlgorithms.quickSort(vetorTeste, 0, vetorTeste.length - 1);

            long end = System.nanoTime();

            long durationMs = (end - start) / 1000000;
            System.out.println("Quick Sort (Aleatório): " + durationMs + "ms");
        }
    }

    public static int[] generateRandom(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);
        Collections.shuffle(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] generateOrdered(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;
        return arr;
    }

    public static int[] generateReverse(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = n - i;
        return arr;
    }
}