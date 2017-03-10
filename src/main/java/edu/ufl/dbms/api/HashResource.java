package edu.ufl.dbms.api;

import edu.ufl.dbms.types.Digest;
import edu.ufl.dbms.types.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.DigestUtils;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/***
 *
 */
@Path("/digest")
@Produces("application/json")
@Consumes("application/json")
public class HashResource {
    private static final Logger LOG = LoggerFactory.getLogger(HashResource.class);

    @POST
    public Response sendMessage(Message message) {
        LOG.info("{}-{}", message.getPayload(), message.getTimestamp());
        if(message.getPayload() != null)
            return Response.ok().entity(new Digest(message.getPayload(), DigestUtils.md5DigestAsHex(message.getPayload().getBytes()))).build();
        else
            return Response.status(400).build();
    }

    @GET
    public Response getMessage(){
        return Response.ok().entity("hello").build();
    }
}