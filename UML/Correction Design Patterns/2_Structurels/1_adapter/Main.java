public class Main {
    public static void main(String[] args) {

        // Adapteur vers l'interface nouvelle
        IDataReader adapter = new DataAdapter(new LegacyLibrary());

        System.out.println(adapter.readData());
    }
}