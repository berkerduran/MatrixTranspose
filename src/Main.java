import java.util.Scanner;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan matris boyutlarını al
        System.out.print("Matrisin satır sayısını girin: ");
        int rows = input.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        // Matris elemanlarını kullanıcıdan al
        System.out.println("Matris elemanlarını girin:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Transpoz matrisi oluştur
        int[][] transpose = new int[cols][rows];

        // Transpoz işlemi
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Matrisleri ekrana yazdır
        System.out.println("\nMatris:");
        printMatrix(matrix);

        System.out.println("\nTranspoze:");
        printMatrix(transpose);

        input.close();
    }

    // Matris yazdırma metodu
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

