package methods;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("/logic")
public class logic {

	@Path("/greeting/{n}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response Greetings(@PathParam("n") String name)
	{
		JSONObject output = new JSONObject();
		String greeting = "Hello "+name;
		output.put("Greeting", greeting);
		return Response.status(200).entity(output.toString()).build();
	}
	
	@Path("/iseven")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response IsEven(@QueryParam("number") int number)
	{
		JSONObject output = new JSONObject();
		boolean isEven = number % 2 == 0 ? true : false;
		output.put("isEven", isEven);
		return Response.status(200).entity(output.toString()).build();
		
	}
}
