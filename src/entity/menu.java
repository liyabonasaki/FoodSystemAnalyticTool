package entity;

/**
 *
 * @author Liyabona Saki
 */
public class menu {

    private int id;
    private String name;
    private String type;
    private String price;

    private menu() {
        super.toString();

    }

    private menu(int id, String name, String type, String price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "menu{" + "id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + '}';
    }

}
