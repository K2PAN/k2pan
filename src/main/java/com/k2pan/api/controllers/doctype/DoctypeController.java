package com.k2pan.api.controllers.doctype;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.k2pan.api.services.doctype.DoctypeService;

@RestController
@RequestMapping("/doctype")
public class DoctypeController {

    @Autowired
    private DoctypeService doctypeService;

    @PostMapping
    public void createDoctype(@RequestBody Map<String, Object> json) {
        // System.out.println(json.get("field"));
        JSONObject myJson = new JSONObject(json);
        doctypeService.createDoctype(myJson);
    }

    @PostMapping("/login")
    public Map<String, Object> loginFrappe(@RequestBody Map<String, Object> json)
            throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        // create the request body as a Map
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("usr", "Administrator");
        requestBody.put("pwd", "123321");

        // create the request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://axcelavietnam.viis.tech/api/method/login"))
                .header("Content-Type", "application/json")
                .POST(BodyPublishers.ofString(new ObjectMapper().writeValueAsString(requestBody)))
                .build();

        // send the request and get the response
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        // print the response body
        Map<String, Object> resultMap = new ObjectMapper().readValue(response.body(), Map.class);

        return resultMap;
    }

    @DeleteMapping
    public void removeDoctype(@RequestBody Map<String, Object> json) {
        JSONObject myJson = new JSONObject(json);
        doctypeService.removeDoctype(myJson);

    }

}
