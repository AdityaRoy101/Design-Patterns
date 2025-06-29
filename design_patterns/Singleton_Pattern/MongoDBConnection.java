package Singleton_Pattern;

public class MongoDBConnection {

    private MongoDBConnection() {
        System.out.println("Successfully connected MongoDB...");
    }

    public static class MongoDBConnectionHelper {
        private static final MongoDBConnection instance = new MongoDBConnection();
    }

    public static MongoDBConnection createMongoDBConnection() {
        return MongoDBConnectionHelper.instance;
    }
}
