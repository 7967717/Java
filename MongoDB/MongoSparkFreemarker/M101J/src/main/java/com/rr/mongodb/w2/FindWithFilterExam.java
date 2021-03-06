package com.rr.mongodb.w2;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.mongodb.client.model.Filters.*;
import static com.rr.mongodb.w2.Helpers.printJson;

/**
 * @author roman.rudenko on 06-Jun-16.
 */
public class FindWithFilterExam {
    public static void main(String[] args) {
        MongoClient client = new MongoClient();
        MongoDatabase database = client.getDatabase("enron");
        MongoCollection<Document> collection = database.getCollection("messages");

        Bson filter = new Document("headers.From", "andrew.fastow@enron.com")
        .append("headers.To", "jeff.skilling@enron.com");

//        Bson filter = and(eq("x", 0), gt("y", 10), lt("y", 90));

        List<Document> all = collection.find(filter).into(new ArrayList<Document>());

        for (Document cur : all) {
            printJson(cur);
        }

        long count = collection.count(filter);
        System.out.println();
        System.out.println(count);
    }
}

//db.movieDetails.find({ year: {$gte: 2010, $lte: 2013},
//        "imdb.votes": {$lt: 10000},
//        $and: [{"tomato.consensus": {$exists: true} },
//        {"tomato.consensus": null} ] });

//    Bson filter = new Document("imdb.votes", new Document("$lt", 10000))
//            .append("year", new Document("$gte", 2010).append("$lte", 2013))
//            .append("tomato", new Document("$exists", true))
//            .append("tomato.consensus", null);
