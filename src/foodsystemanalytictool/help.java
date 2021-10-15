
package foodsystemanalytictool;

/**
 *
 * @author Liyabona Saki
 */
public class help {
    
    public static void openAutomatedLink(){
        
        String link = "https://sway.office.com/EWFBUVIHQvhB0wUW?ref=Link";
     
         try {
            String url = link;
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
         } catch (java.io.IOException e) {
            System.out.println(e.getMessage());
        }
       
    }
        
    
}
