
package operation;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("search")
public class Search {
    
    @Context
    private UriInfo context;

    public Search() {
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String instructions() {
        //TODO return proper representation object
        return "To search a [ USER ] the following "
                + "format is used:\n"
                + ".../USER/{name}/{type}\n"
                + ".../USER/ADMINS\n"
                + ".../USER/EMPLOYEES\n"
                + ".../USERS\n"
                + "Example: \n"
                + ".../USER/Lucas/admin\n"
                + ".../USER/Pepe/employee\n\n\n"
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
                + ".../CLIENT/Luigi/Villarreal\n\n\n";
    }
    
    @Path("USER/{name}/{type}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public String getUserNT(@PathParam("sample") String idCourse) 
    {
        return "USER";
    }
    @Path("USER/ADMINS")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public String getUserAdmins(@PathParam("sample") String idCourse) 
    {
        return "ADMINS";
    }
    @Path("USER/EMPLOYEES")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public String getUserEmployees(@PathParam("sample") String idCourse) 
    {
        return "EMPLOYEES";
    }
    @Path("USERS")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public String getUsers(@PathParam("sample") String idCourse) 
    {
        return "USERS";
    }
    
    @Path("SAUCER/{name}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public String getSaurceName(@PathParam("sample") String idCourse) 
    {
        return "SAUCER";
    }
    @Path("SAUCERS")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public String setSaurces(@PathParam("sample") String idCourse) 
    {
        return "SAUCERS";
    }
    
    
    
    @Path("CLIENT/{firsname}/{lastname}")  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String setClient(@PathParam("sample") String idCourse) 
    {
        return "CLIENT";
    }
    
    @Path("CLIENTS")  
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String setClients(@PathParam("sample") String idCourse) 
    {
        return "CLIENTS";
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
