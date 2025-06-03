package Pertemuan14;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        // Mengakses variabel static connectionString
        System.out.println("Connection String: " + DatabaseConnection.getConnectionString());
    }
}