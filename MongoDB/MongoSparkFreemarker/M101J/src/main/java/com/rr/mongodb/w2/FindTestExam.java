package com.rr.mongodb.w2;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.*;
import static com.rr.mongodb.w2.Helpers.printJson;

/**
 * @author roman.rudenko on 06-Jun-16.
 */
public class FindTestExam {
    public static void main(String[] args) {
        MongoClient client = new MongoClient();
        MongoDatabase database = client.getDatabase("enron");
        MongoCollection<Document> collection = database.getCollection("messages");


//        System.out.println("Find one:");
//        Document first = collection.find().first();
//        printJson(first);

//        System.out.println("Find all with into: ");
//        List<Document> all = collection.find().into(new ArrayList<Document>());
//        for (Document cur : all) {
//            printJson(cur);
//        }

//        System.out.println("Find all with iteration: ");
//        MongoCursor<Document> cursor = collection.find().iterator();
//        try {
//            while (cursor.hasNext()) {
//                Document cur = cursor.next();
//                printJson(cur);
//            }
//        } finally {
//            cursor.close();
//        }

//        System.out.println("Count:");
//        long count = collection.count();
//        System.out.println(count);

        Bson filter = eq("headers.Message-ID", "<8147308.1075851042335.JavaMail.evans@thyme>");

        List<Document> all = collection.find(filter).into(new ArrayList<Document>());

        for (Document cur : all) {
            printJson(cur);
        }

//        collection.updateOne(eq("headers.Message-ID", "<8147308.1075851042335.JavaMail.evans@thyme>"),
//                new Document("$push",
//                new Document("headers.To", "mrpotatohead@mongodb.com")));
//
//        for (Document cur : all) {
//            printJson(cur);
//        }

        long count = collection.count(filter);
        System.out.println();
        System.out.println(count);
    }
}
