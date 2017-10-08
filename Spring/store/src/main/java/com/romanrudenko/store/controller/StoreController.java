package com.romanrudenko.store.controller;

import com.romanrudenko.store.model.Store;
import com.romanrudenko.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author roman.rudenko on 13-Apr-16.
 */
@Controller
public class StoreController extends BaseController {

    @Autowired
    StoreService storeService;

    @RequestMapping(value = "/loadstore", method = RequestMethod.GET)
    public String storeLoad(Model model) {
        model.addAttribute("store", new Store());
        return "store";
    }


    @RequestMapping(value = "/getallstores", method = RequestMethod.GET)
    public String getAllStores(Model model) {
        model.addAttribute("stores", storeService.getAllStores());
        return "storelist";
    }

    @RequestMapping(value = "/addstore", method = RequestMethod.POST)
    public String storeAdd(@ModelAttribute Store store, Model model) {
        Store addedStore = storeService.addStore(store);
        model.addAttribute("stores", storeService.getAllStores());
        return "storelist";
    }

    @RequestMapping(value = "/deletestore/{id}", method = RequestMethod.GET)
    public String storeDelete(@PathVariable Long id, Model model) {

        storeService.deleteStore(id);
        model.addAttribute("stores", storeService.getAllStores());
        return "storelist";
    }

    @RequestMapping(value = "/updatestore", method = RequestMethod.POST)
    public String storeUpdate(@ModelAttribute Store store, Model model) {
        storeService.updateStore(store);
        model.addAttribute("stores", storeService.getAllStores());
        return "storelist";
    }

    @RequestMapping(value = "/editstore/{id}", method = RequestMethod.GET)
    public String storeEdit(@PathVariable Long id, Model model) {
        model.addAttribute("store", storeService.getStore(id));
        return "editstore";
    }
}
