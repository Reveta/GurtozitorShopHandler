package com.shopManeger.java.maria;

import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;

import java.net.UnknownHostException;

public class ConnectToDB {

    public static void main( String args[] ) throws UnknownHostException {

        // Creating a Mongo client
        MongoClient mongo = new MongoClient( "localhost" , 27017 );

        // Creating Credentials
        MongoCredential credential;
        credential = MongoCredential.createCredential("sampleUser", "myDbTest",
                "password".toCharArray());
        System.out.println("Connected to the database successfully");

        // Accessing the database
        MongoDatabase database = mongo.getDatabase("myDb");
        System.out.println("Credentials ::"+ credential);

        database.createCollection("sampleCollection");


    }
}