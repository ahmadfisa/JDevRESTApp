package br.com.waslleysouza.webservice;

import javax.ejb.Stateless;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Stateless
@Path("employees")
@Consumes(value = { "application/json", "application/xml" })
@Produces(value = { "application/json", "application/xml" })
public class EmployeesResource {

String Name;    

    @POST
    public String create() {
        return "OK from home     " ;
        
    }
}
