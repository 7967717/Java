package com.rr.mongodb.other;

import com.mongodb.*;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;

/**
 * @author roman.rudenko on 01-Sep-16.
 */
public class SaveVideo {
    public static void main(String[] args) {

        try {

            Mongo mongo = new Mongo("localhost", 27017);
            DB db = mongo.getDB("test0");
            DBCollection collection = db.getCollection("video0");

            String newFileName = "video";

            File videoFile = new File("C:\\test\\mov.mp4");

            // create a "video" namespace
            GridFS gfsVideo = new GridFS(db, "video");

            // get video file from local drive
            GridFSInputFile gfsFile = gfsVideo.createFile(videoFile);

            // set a new filename for identify purpose
            gfsFile.setFilename(newFileName);

            // save the video file into mongoDB
            gfsFile.save();

            // print the result
            DBCursor cursor = gfsVideo.getFileList();
            while (cursor.hasNext()) {
                System.out.println(cursor.next());
            }

            // get video file by it's filename
            GridFSDBFile videoForOutput = gfsVideo.findOne(newFileName);

            // save it into a new video file
            videoForOutput.writeTo("C:\\test\\NEWmov.mp4");

            // remove the video file from mongoDB
//            gfsVideo.remove(gfsVideo.findOne(newFileName));

            System.out.println("Done");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MongoException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
