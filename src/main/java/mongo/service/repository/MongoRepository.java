package mongo.service.repository;

import io.reactivex.Maybe;
import io.reactivex.Single;
import mongo.service.domain.Products;
import mongo.service.helper.test;

import java.util.List;

public interface MongoRepository {
    Single<Products> add(Products products);

    Single<List<Products>> findAll();

    Single<Products> update(Products products);

    Maybe<Products> findOne(int product_id);

    Single<test> addd(test test1);

    void adddd(test test1);
}
