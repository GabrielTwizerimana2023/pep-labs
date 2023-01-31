package com.revature;

import org.eclipse.jetty.server.Request;

import io.javalin.Javalin;

public class JavalinSingleton {

    
    /**
     * Lab: Create an HTTP GET endpoint at the url: http://localhost:9000/hello that will return the string "Hello
     * World" in the response.
     * 
     * Note: Please refer to the "CreatingEndpoints.MD" file for more assistance if needed.
     */

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        app.start(9001);
        app.get("/hello", ctx->{
        ctx.result("Hello World");
    });
       
        return app;
    }}
    

