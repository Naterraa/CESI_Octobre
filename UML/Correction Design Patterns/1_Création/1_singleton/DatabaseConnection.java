public class DatabaseConnection {

    private static DatabaseConnection instance;
    private String connection;

    // Constructeur privé pour empêcher new DatabaseConnection()
    private DatabaseConnection() {
        connection = "Connexion à la base de données initialisée.";
        System.out.println("Nouvelle connexion créée !");
    }

    // Méthode d’accès global (Singleton)
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public String getConnection() {
        return connection;
    }
}