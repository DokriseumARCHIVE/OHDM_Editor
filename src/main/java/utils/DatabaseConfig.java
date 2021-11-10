package utils;

public class DatabaseConfig {
    String username;
    String password;
    String url;
    String database;
    int port;

    public DatabaseConfig(String username, String password, String url, String database, int port) {
        this.username = username;
        this.password = password;
        this.url = url;
        this.database = database;
        this.port = port;
    }
    public DatabaseConfig(String username, String password, String url, String database) {
        this.username = username;
        this.password = password;
        this.url = url;
        this.database = database;
        this.port = 5432;
    }

    /**
     *
     * GETTER && SETTER
     *
     */

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
