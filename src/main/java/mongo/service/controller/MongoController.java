package mongo.service.controller;

import com.mongodb.client.model.Filters;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoCollection;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import mongo.service.domain.Products;
import mongo.service.helper.test;
import mongo.service.repository.MongoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Controller("/mongo")
public class MongoController implements MongoRepository {

    private Logger log = LoggerFactory.getLogger(MongoController.class);
    private final MongoClient mongoClient;

    public MongoController(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @Override
    @Post("/new-product")
    public Single<Products> add(Products products) {
        return Single.fromPublisher(
                getCollection().insertOne(products)
        ).map(success -> products);
    }


    @Post("/update")
    public Single<Products> update(Products Products) {
        return Single.fromPublisher(getCollection().replaceOne(Filters.eq("product_id",Products.getProductId()),Products)).map(success -> Products);
    }


    @Override
    @Get("list")
    public Single<List<Products>> findAll() {
        return Flowable.fromPublisher(
                getCollection().find()
        ).toList();
    }

    @Post("/find")
    @Override
    public Maybe<Products> findOne(int product_id) {

        return Flowable.fromPublisher(
                getCollection()
                        .find(Filters.eq("product_id", product_id))
                        .limit(1)
        ).firstElement();
    }

    private MongoCollection<Products> getCollection() {
        return mongoClient
                .getDatabase("tokdis_job")
                .getCollection("products", Products.class);
    }

    @Override
    @Post("/new-product1")
    public Single<test> addd(test test1) {
        return Single.fromPublisher(
                getCollectionTest().insertOne(test1)
        ).map(success -> test1);
    }

    @Post("/update2")
    public Single<test> update(test test) {
        return Single.fromPublisher(getCollectionTest().replaceOne(Filters.eq("name","akiong"),test)).map(success -> test);
    }

    @Override
    public void adddd(test test1) {
        getCollectionTest().insertOne(test1);

    }

    private MongoCollection<test> getCollectionTest() {
        return mongoClient
                .getDatabase("tokdis_job")
                .getCollection("test123", test.class);
    }


}
