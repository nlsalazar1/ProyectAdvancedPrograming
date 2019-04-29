
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
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import model.Menu;
import model.Purchase;
import services.Link;

@Path("buy")
public class Buy {
    @Context
    private UriInfo context;
    
    Link link = new Link();
    
    public Buy() {
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String instructions() {
        //TODO return proper representation object
        return "To buy a [ SAUCER ] the following "
                + "format is used:\n"
                + ".../SAUCER/{nameSaucer}/{qualification}\n"
                + "Example: \n"
                + ".../SAUCER/Encebollado/10\n\n\n";
    }
    
    @Path("SAUCER/{nameSaucer}/{qualification}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public Purchase getSaurceName(@PathParam("nameSaucer") String nameSaucer, 
            @PathParam("qualification") String qualification)
    {
        return link.getPurchase(nameSaucer, Integer.parseInt(qualification));
    }
    
    
    
}
