package com.redhat.training.example.javaserverhost.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.net.InetAddress;

@Path("/")
public class ServerHostEndPoint {

  @GET
  @Produces("text/plain")
  public Response doGet() {
    String host = "";
    try {
      host = InetAddress.getLocalHost().getHostName();
    }
    catch (Exception e) {
       e.printStackTrace();
    }
    String msg = "[Siddhu: 10.46 AM on 28-Nov-2019...] This code is running on server "+host+" Version 1.0 \n";
    return Response.ok(msg).build();
  }
}

