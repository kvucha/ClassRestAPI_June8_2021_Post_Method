package com.info.controller;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.info.dao.dataExtractDao;
import com.info.model.StateCityInfo;








@Path("/y1")
public class RestPostController
{
	
	
    @POST
    @Path("/postthisJSON")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postJSON(StateCityInfo sci) {
    	dataExtractDao dao = new dataExtractDao();
    	int rowsInserted = dao.postSCI(sci);
    	if (rowsInserted == 0) {
    		return Response.status(800).entity("failure because of Unqiure constraint").build();
		} 
    	else
		{
			return Response.status(200).entity("Success").build();	
		}
    	
    }
    
	
	    
    
}
