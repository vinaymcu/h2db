package com.app.h2db.util;

import java.net.URI;
import java.net.URISyntaxException;

public class Test1 {
    public static void main(String args[]){

        String str="vinay,kumar,Gupta";
        try {
            URI uri = new URI("http://www.example.org");
            System.out.println(" >>>uri:"+uri.toString());
            //System.out.println(" >>>uri:"+uri.toURL().toString());

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }
}
