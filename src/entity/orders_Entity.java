
package entity;

/**
 *
 * @author Liyabona Saki
 */
public class orders_Entity {
    
    private int order_id;
    private String order_type;
    private String location;
    private String customer_name;
    private String order_date;
    
    
    private orders_Entity(){
        
    }
    
    private orders_Entity(int order_id, String order_type, String location, String customer_name, String order_date){
        
        this.order_id = order_id;
        this.order_type = order_type;
        this.location = location;
        this.customer_name = customer_name;
        this.order_date = order_date;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    @Override  
    public String toString() {
        return "orders_Entity{" + "order_id=" + order_id + ", order_type=" + order_type + 
                ", location=" + location + ", customer_name=" + customer_name + ", order_date=" + order_date + '}';
    }
    
    
}
