package DBConnection;

/**
 *
 * @author Liyabona Saki
 */
public class ConnectorEntities {

    private String username;
    private String password;
    private String hostname;
    private int port_number;

    public ConnectorEntities() {

    }

    public ConnectorEntities(String username, String password, String hostname, int port_number) {

        this.username = username;
        this.password = password;
        this.hostname = hostname;
        this.port_number = port_number;

    }

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

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort_number() {
        return port_number;
    }

    public void setPort_number(int port_number) {
        this.port_number = port_number;
    }

    @Override
    public String toString() {
        return "ConnectorEntities{" + "username=" + username + ", password=" + password + ", hostname=" + hostname + 
                ", port_number=" + port_number + '}';
    }


}
