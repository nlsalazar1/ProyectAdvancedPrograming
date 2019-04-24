
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
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("register")
public class Register {

    @Context
    private UriInfo context;

    public Register() {
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String instructions() {
        //TODO return proper representation object
        return "To register a [ USER ] the following "
                + "format is used:\n"
                + ".../USER/{name}/{pass}/{type}\n"
                + "Example: \n"
                + ".../USER/Lucas/Ld123/admin\n"
                + ".../USER/Pepe/Ld123/employee\n\n\n"
                +
                "To register a [ SAUCER ] the following "
                + "format is used:\n"
                + ".../SAUCER/{idSaurce}/{name}/{cost}\n"
                + "Example: \n"
                + ".../SAUCER/15/stuffed rice/3.50\n\n\n"
                +
                "To register a [ CLIENT ] the following "
                + "format is used:\n"
                + ".../CLIENT/{id}/{firsname}/{lastname}/{telephone}/{mail}\n"
                + "Example: \n"
                + ".../CLIENT/20/Luigi/Villarreal/0985246604/mega777leo@hotmail.com\n\n\n";
    }
    
    @Path("USER/{name}/{pass}/{type}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public User setUser(@PathParam("sample") String idCourse) 
    {
        User us = new User("LuviSan", "admin", "admin");
        return us;
    }
    
    @Path("SAUCER/{id}/{name}/{cost}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public Saucer setSaurce(@PathParam("sample") String idCourse) 
    {
        Saucer sa = new Saucer("1", "stuffed rice", (float) 3.50);
        return sa;
    }
    
    @Path("CLIENT/{id}/{firsname}/{lastname}/{telephone}/{mail}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public Client setClient(@PathParam("sample") String idCourse) 
    {
        Client cl = new Client("1","Luigi","Villarreal","0985246604","mega777leo@hotmail.com");
        return cl;
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
