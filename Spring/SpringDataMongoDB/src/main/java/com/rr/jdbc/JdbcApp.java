package com.rr.jdbc;


import com.mongodb.*;

/**
 * @author roman.rudenko on 14-Apr-16.
 */
public class JdbcApp {
    public static void main(String[] args) {
        MongoClient mongoClient = null;
        DBCollection collection = null;
        DBObject query = null;
        try {
            // To connect to mongodb server
            mongoClient = new MongoClient("localhost", 27017);

            // To connect to databases
            DB database = mongoClient.getDB("test");
            System.out.println("Connect to database successfully - " + database);
            collection = database.getCollection("people");
            System.out.println("DBCollection - " + collection);

            DBObject person = new BasicDBObject("_id", "rr")
                    .append("name", "Roman R")
                    .append("address", new BasicDBObject("street", "123 Str St")
                            .append("city", "City")
                            .append("zip", 12345));

            collection.insert(person);

            query = new BasicDBObject("_id", "rr");
            DBCursor cursor = collection.find(query);
            System.out.println("Person - " + cursor.one());
            System.out.println("Person name - " + cursor.one().get("name"));

//            collection.remove(query);
            System.out.println("Person - " + cursor.one());
        } finally {
            if (collection != null && query != null) {
                collection.remove(query);
            }

            if (mongoClient != null ) {
                mongoClient.close();
            }
        }

    }
}
