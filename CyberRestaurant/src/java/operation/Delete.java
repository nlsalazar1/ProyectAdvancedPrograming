
package operation;

import model.Client;
import model.Saucer;
import model.User;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import model.Menu;
import model.Purchase;
import services.Link;

@Path("delete")
public class Delete {
    
    Link link = new Link();
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String instructions() {
        //TODO return proper representation object
        return "To delete a [ USER ] the following "
                + "format is used:\n"
                + ".../USER/{nameUser}\n"
                + "Example: \n"
                + ".../USER/Leo\n\n\n"
                +
                "To delete a [ SAUCER ] the following "
                + "format is used:\n"
                + ".../SAUCER/{nameSaucer}\n"
                + "Example: \n"
                + ".../SAUCER/Encebollado\n\n\n"
                +
                "To delete a [ MENU ] the following "
                + "format is used:\n"
                + ".../MENU/{nameMenu}\n"
                + "Example: \n"
                + ".../MENU/Oriental\n\n\n"
                +
                "To delete a [ CLIENT ] the following "
                + "format is used:\n"
                + ".../CLIENT/{lastname}\n"
                + "Example: \n"
                + ".../MENU/Taday\n\n\n";
    }
    
    @Path("CLIENT/{lastname}")   
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    //@Produces(MediaType.APPLICATION_JSON)
    public String deleteClient(@PathParam("lastname") String lastname)
    {
        link.deleteClient(lastname);
        return "CLIENT [ " + lastname + " ] ";
    }
    
    @Path("USER/{nameUser}")   
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    //@Produces(MediaType.APPLICATION_JSON)
    public String deleteUser(@PathParam("nameUser") String nameUser)
    {
        link.deleteUser(nameUser);
        return "USER [ " + nameUser + " ] ";
    }
    
    @Path("SAUCER/{nameSaucer}")   
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    //@Produces(MediaType.APPLICATION_JSON)
    public String deleteSaucer(@PathParam("nameSaucer") String nameSaucer)
    {
        link.deleteSaucer(nameSaucer);
        return "SAUCER [ " + nameSaucer + " ] ";
    }
    
    @Path("MENU/{nameMenu}")   
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    //@Produces(MediaType.APPLICATION_JSON)
    public String deleteMenu(@PathParam("nameMenu") String nameMenu)
    {
        link.deleteMenu(nameMenu);
        return "MENU [ " + nameMenu + " ] ";
    }
}
