package com.redhat.training.example;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.net.InetAddress;


@Path("/")
public class Quip {

@GET
@Produces("text/plain")
public Response index() throws Exception {
    String host = InetAddress.getLocalHost().getHostName();
    return Response.ok("Veni, vidi, vici... Siddhu ... modified.. 11.39 AM and on 12.13 PM... on 29/Nov/2019...\n").build();
  }

@GET
@Path("/ready")
@Produces("text/plain")
public Response ready() throws Exception {
    return Response.ok("OK\n").build();
  }

}

