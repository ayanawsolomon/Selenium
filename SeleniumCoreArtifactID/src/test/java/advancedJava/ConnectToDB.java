package advancedJava;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.Filters;

public class ConnectToDB { 
	   
	   public static void main( String args[] ) {  
		   // creating a mongo client
	      MongoClient mongo = new MongoClient("localhost", 27017);
	     // creating credentials and connecting to the database
	     MongoCredential credential = MongoCredential.createCredential("ayanawsolomon1@gmail.com", "myDb1", "Asrat2me.M".toCharArray());
	      System.out.println("Connected to  successfully");  
	   // getting the database
	      MongoDatabase database = mongo.getDatabase("myDb1");
	      System.out.println("Credentials ::"+ credential); 
	     MongoCollection<Document> collection = database.getCollection("javacollectionw2");
	     Document document = new Document().append("name", "solomon").append("address","coppermien rod").append("phone", 234234234);
	     collection.insertOne(document);
	     System.out.println(collection.count());
	     FindIterable<Document> col = collection.find();
	    MongoCursor<Document> iter = col.iterator();
	    while(iter.hasNext()){
	    	System.out.println(iter.next() + "------");
	    }
	      
	    /// listing all collections
	  MongoIterable<String> cols = database.listCollectionNames();
	  MongoCursor<String> icols = cols.iterator();
	  while(icols.hasNext()){
		  System.out.println(icols.next());
	  }
	  for(Document doc : collection.find()){
		  System.out.println(doc.get("name"));
	  }
	   }
	}