package com.romanrudenko.store.service;

import com.romanrudenko.store.model.Store;

import java.util.List;

/**
 * @author roman.rudenko on 13-Apr-16.
 */
public interface StoreService {
    Store addStore(Store store);
    List getAllStores();
    Store getStore(Long id);
    Store updateStore(Store store);
    void deleteStore(Long id);
}
