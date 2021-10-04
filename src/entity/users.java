package entity;

/**
 *
 * @author Liyabona Saki
 */
public class users {

    private String firstname;
    private String lastname;
    private String address;
    private int id;
    private String username;
    private String password;

    private users() {
        
        
    }

    private users(String firstname, String lastname, String address, int id, String username, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.id = id;
        this.username = username;
        this.password = password;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "users{" + "firstname=" + firstname + ", lastname=" + lastname + ", address=" + address
                + ", id=" + id + ", username=" + username + ", password=" + password + '}';
    }

}
