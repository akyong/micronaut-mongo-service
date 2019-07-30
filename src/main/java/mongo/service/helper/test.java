package mongo.service.helper;

import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonProperty;

@BsonDiscriminator
public class test {
    public test(){}

    @BsonCreator
    public test(@BsonProperty("name") String name, @BsonProperty("description") String description){
//        this.idn = idn;
//        this.id = id;
        this.name_e = name;
        System.out.println("nameee == "+name);
        this.description = description;
    }
//    String idn;
//    int id;

    String name_e;


    String description;

//    public void setIdn(String idn) {
//        this.idn = idn;
//    }
//
//    public String getIdn() {
//        return idn;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getId() {
//        return id;
//    }

    public void setName(String name) {
        this.name_e = name;
    }

    public String getName() {
        return name_e;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        try {
            return new com.fasterxml.jackson.databind.ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(this);
        } catch (com.fasterxml.jackson.core.JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
