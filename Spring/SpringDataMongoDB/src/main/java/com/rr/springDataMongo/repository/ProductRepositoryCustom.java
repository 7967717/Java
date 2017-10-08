package com.rr.springDataMongo.repository;

import com.rr.springDataMongo.dto.WarehouseSummary;

import java.util.List;

/**
 * @author roman.rudenko on 14-Apr-16.
 */
public interface ProductRepositoryCustom {
    List<WarehouseSummary> aggregate(float minPrice, float maxPrice);
}
