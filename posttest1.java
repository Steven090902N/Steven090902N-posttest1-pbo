import java.util.ArrayList;
import java.util.Scanner;

public class posttest1 {

    // Create an ArrayList to store items
    private static ArrayList<String> itemList = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("Penjualan Mobil");

        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. tambah data mobil");
            System.out.println("2. lihat data mobil");
            System.out.println("3. ubah data mobil");
            System.out.println("4. hapus data mobil");
            System.out.println("5. Exit");

            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    addItem(scanner);
                    break;
                case 2:
                    viewItems();
                    break;
                case 3:
                    updateItem(scanner);
                    break;
                case 4:
                    deleteItem(scanner);
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static void addItem(Scanner scanner) {
        System.out.println("masukan data mobil:");
        String item = scanner.next();
        itemList.add(item);
        System.out.println("Item added successfully.");
    }

    private static void viewItems() {
        if (itemList.isEmpty()) {
            System.out.println("data tidak ditemukan.");
            return;
        }

        System.out.println("daftar data :");
        for (String item : itemList) {
            System.out.println(item);
        }
    }

    private static void updateItem(Scanner scanner) {
        if (itemList.isEmpty()) {
            System.out.println("data tidak ditemukan.");
            return;
        }

        System.out.println("masukan id yang ingin diubah :");
        int index = scanner.nextInt();

        if (index >= itemList.size()) {
            System.out.println("id salah. coba lagi.");
            return;
        }

        System.out.println("masukan data baru mobil:");
        String newItem = scanner.next();

        itemList.set(index, newItem);
        System.out.println("data berhasil di ubah.");
    }

    private static void deleteItem(Scanner scanner) {
        if (itemList.isEmpty()) {
            System.out.println("data tidak ditemukan.");
            return;
        }

        System.out.println("masukan id untuk menghapus data:");
        int index = scanner.nextInt();

        if (index >= itemList.size()) {
            System.out.println("id salah. coba lagi.");
            return;
        }

        itemList.remove(index);
        System.out.println("hapus data mobil berhasil.");
    }
}
