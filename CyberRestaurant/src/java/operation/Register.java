
package operation;

import com.google.gson.*;

import model.Client;
import model.Saucer;
import model.User;
import model.Menu;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;


import services.Link;
//import com.google.gson.*;

@Path("register")
public class Register {

    @Context
    private UriInfo context;
    
    Link link = new Link();
    
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
                + ".../CLIENT/20/Luigi/Villarreal/0985246604/mega777leo@hotmail.com\n\n\n"
                +
                "To register a [ MENU ] the following "
                + "format is used:\n"
                + ".../MENU/{idMenu}/{nameMenu}\n"
                + "Example: \n"
                + ".../MENU/B04/Oriental\n\n\n";
    }
    
    @Path("MENU/{idMenu}/{nameMenu}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public Menu setMenu(@PathParam("idMenu") String idMenu, 
            @PathParam("nameMenu") String nameMenu) 
    {
        return link.setMenu(idMenu, nameMenu);
    }
    
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    @Produces(MediaType.APPLICATION_JSON)
//    public Tiger postJson(String json){
//        Gson gson = new Gson();
//        Tiger tiger = gson.fromJson(json, Tiger.class);
//        
//        TigerDAO tigerDAO = new TigerDAO();
//        tigerDAO.registerTiger(tiger);
//        
//        
//        return tiger;
//    }
    
    
    @Path("USER/{name}/{pass}/{type}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public User setUser(@PathParam("name") String name, 
            @PathParam("pass") String pass, 
            @PathParam("type") String type) 
    {
        if(type.equals("admin")||type.equals("employee"))
        {
            return link.setUser(name, pass, type);
        }
        return null;
    }
    @Path("usuario")   
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public Gson setUserPost(Gson user) 
    {
        //Gson gson = new Gson();
        //String representacionJSON = gson.toJson(empleado);
        //User tiger = gson.fromJson(user, User.class);
        
//        if(user.getType().equals("admin")||user.getType().equals("employee"))
//        {
//            return link.setUser(user.getUsername(), user.getPassword(), user.getType());
//        }
//        
//        return null;
        return user;
    }
    
    @Path("SAUCER/{id}/{name}/{cost}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public Saucer setSaurce(@PathParam("id") String idCourse, 
            @PathParam("name") String name, 
            @PathParam("cost") String cost) 
    {
        return link.setSaucer(idCourse, name, Float.parseFloat(cost));
    }
    
    @Path("CLIENT/{id}/{firsname}/{lastname}/{telephone}/{mail}")   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_JSON)
    public Client setClient(@PathParam("id") String idCourse,
            @PathParam("firsname") String firsname,
            @PathParam("lastname") String lastname,
            @PathParam("telephone") String telephone,
            @PathParam("mail") String mail) 
    {
        return link.setClient(idCourse, firsname, lastname, telephone, mail);
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
