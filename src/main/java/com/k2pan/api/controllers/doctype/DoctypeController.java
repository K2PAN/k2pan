package com.k2pan.api.controllers.doctype;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.k2pan.api.services.doctype.DoctypeService;

@RestController
@RequestMapping("/doctype")
public class DoctypeController {

    @Autowired
    private DoctypeService doctypeService;

    @PostMapping
    public void createDoctype(@RequestBody Map<String, Object> json) {
        JSONObject myJson = new JSONObject(json);
        doctypeService.createDoctype(myJson);
    }

    @DeleteMapping
    public void removeDoctype(@RequestBody Map<String, Object> json) {
        JSONObject myJson = new JSONObject(json);
        doctypeService.removeDoctype(myJson);

    }

}
