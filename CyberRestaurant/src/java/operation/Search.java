
package operation;

import java.util.List;
import model.Client;
import model.Saucer;
import model.User;
import model.Menu;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import model.Purchase;
import services.Link;


@Path("search")
public class Search {
    
    @Context
    private UriInfo context;
    
    Link link = new Link();
    
    public Search() {
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String instructions() {
        //TODO return proper representation object
        return "To search a [ USER ] the following "
                + "format is used:\n"
                + ".../USER/{name}\n"
                + ".../USER/ADMINS\n"
                + ".../USER/EMPLOYEES\n"
                + ".../USERS\n"
                + "Example: \n"
                + ".../USER/Lucas\n"
                +
                "To search a [ SAUCER ] the following "
                + "format is used:\n"
                + ".../SAUCER/{name}\n"
                + ".../SAUCERS\n"
                + "Example: \n"
                + ".../SAUCER/stuffed rice\n\n\n"
                +
                "To search a [ CLIENT ] the following "
                + "format is used:\n"
                + ".../CLIENT/{firsname}/{lastname}\n"
                + ".../CLIENTS\n"
                + "Example: \n"
                + ".../CLIENT/Luigi/Villarreal\n\n\n"
                +
                "To search a [ MENU ] the following "
                + "format is used:\n"
                + ".../MENU/{nameMenu}\n"
                + ".../MENUS\n"
                + "Example: \n"
                + ".../MENU/ComidaSierra\n\n\n"
                +
                "To search a [ PURCHASE ] the following "
                + "format is used:\n"
                + ".../PURCHASE/{namePurchase}\n"
                + ".../PURCHASE\n"
                + ".../PURCHASEDAY\n"
                + "Example: \n"
                + ".../PURCHASE/Encebollado\n\n\n";
    }
    
    @Path("PURCHASE")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public List<Purchase> getPurchase() 
    {
        return link.listPurchase();
    }
    @Path("PURCHASEDAY")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public String getPurchaseDay() 
    {
        return "the PURCHASE of day is [ " + link.PurchaseDay() + " ]";
    }
    
    @Path("PURCHASE/{namePurchase}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public List<Purchase> getPurchaseSaucer(@PathParam("namePurchase") String namePurchase) 
    {
        return link.listPurchaseSaucer(namePurchase);
    }
    
    @Path("MENU/{nameMenu}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public Menu getMenu(@PathParam("nameMenu") String nameMenu) 
    {
        return link.getMenu(nameMenu);
    }
    
    @Path("MENUS")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public List<Menu> getMenus() 
    {
        return link.listMenu();
    }
    
    @Path("USER/{name}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public User getUserN(@PathParam("name") String name) 
    {
        return link.getUser(name);
    }
    
    @Path("USER/ADMINS")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public List<User> getUserAdmins() 
    {
        return link.listUserAdmin();
    }
    @Path("USER/EMPLOYEES")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public List<User> getUserEmployees() 
    {
        return link.listUserEmployee();
    }
    @Path("USERS")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers() 
    {
        return link.listUser();
    }
    
    @Path("SAUCER/{name}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public Saucer getSaurceName(@PathParam("name") String name) 
    {
        return link.getSaucer(name);
    }
    @Path("SAUCERCOST/{name}")   
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    //@Produces(MediaType.APPLICATION_JSON)
    public String getSaurceCost(@PathParam("name") String name) 
    {
        return "The SAUCER [ " + name + " ] cost is [ " + link.getSaucerCost(name) + " ]";
    }
    @Path("SAUCERS")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public List<Saucer> setSaurces() 
    {
        return link.listSaucer();
    }
    
    
    
    @Path("CLIENT/{firsname}/{lastname}")  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Client setClient(@PathParam("firsname") String firsname, 
            @PathParam("lastname") String lastname) 
    {
        return link.getCliente(firsname, lastname);
    }
    
    @Path("CLIENTS")  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Client> setClients() 
    {
        return link.listClient();
    }
    /**
     * PUT method for updating or creating an instance of register
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
