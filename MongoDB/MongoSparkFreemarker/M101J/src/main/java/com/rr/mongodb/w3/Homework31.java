package com.rr.mongodb.w3;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;
import static com.rr.mongodb.w2.Helpers.printJson;

/**
 * @author roman.rudenko on 10-Jun-16.
 */
public class Homework31 {
    public static void main(String[] args) {
        MongoClient client = new MongoClient();
        MongoDatabase database = client.getDatabase("school");
        MongoCollection<Document> collection = database.getCollection("students");

//        collection.drop();

//        System.out.println("Find one:");
//        Document first = collection.find().first();
//        printJson(first);
//
//        System.out.println("Find all with into: ");
//        List<Document> all = collection.find().into(new ArrayList<Document>());
//        for (Document cur : all) {
//            printJson(cur);
//        }

        System.out.println("Find all with iteration: ");
        MongoCursor<Document> cursor = collection.find().iterator();
        try {
            while (cursor.hasNext()) {
                Document cur = cursor.next();
                List<Document> scores = (List<Document>) cur.get("scores");
                Double score0 = null;
                Double min = null;
                for (Document doc : scores) {
                    if (score0 == null && doc.get("type").equals("homework")) {
                        score0 = (Double) doc.get("score");
                    } else if (doc.get("type").equals("homework")) {
                        Double score1 = (Double) doc.get("score");
                        if (score0 >= score1) {
                            min = score1;
                        } else {
                            min = score0;
                        }
                        score0 = null;
                    }
                }
                Integer i = (Integer) cur.get("_id");
                collection.updateOne(eq("_id", i), new Document("$pull",
                                                    new Document("scores",
                                                    new Document("score", min))));
                printJson(cur);
                System.out.println(min);
            }
        } finally {
            cursor.close();
        }

        System.out.println("Count:");
        long count = collection.count();
        System.out.println(count);
    }
}
