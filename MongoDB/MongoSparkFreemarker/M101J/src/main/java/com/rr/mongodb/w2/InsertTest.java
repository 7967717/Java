package com.rr.mongodb.w2;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import static com.rr.mongodb.w2.Helpers.printJson;
import static java.util.Arrays.asList;

/**
 * @author roman.rudenko on 06-Jun-16.
 */
public class InsertTest {
    public static void main(String[] args) {
        MongoClient client = new MongoClient();
        MongoDatabase db = client.getDatabase("course");
        MongoCollection<Document> coll = db.getCollection("insertTest");

        coll.drop();

        Document smith = new Document("name", "Smith")
                .append("age", 30)
                .append("profession", "programmer");

        Document jones = new Document("name", "Jones")
                .append("age", 25)
                .append("profession", "hacker");

        printJson(smith);

        coll.insertOne(smith);
        coll.insertOne(jones);

        printJson(smith);
        printJson(jones);

        coll.drop();

        coll.insertMany(asList(smith, jones));

        printJson(smith);
        printJson(jones);
    }
}
