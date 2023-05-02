package com.k2pan.api.services.doctype;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.k2pan.api.database.DatabaseConnection;
import com.k2pan.api.models.doctype.Doctype;

@Service
public class DoctypeService {
    private Doctype doctype;
    private DatabaseConnection databaseConnection;

    public DoctypeService() {
        this.databaseConnection = DatabaseConnection.getInstance();
        this.doctype = new Doctype(databaseConnection.getDataSource());
    }

    public void createDoctype(JSONObject json) {
        doctype.createDoctype(json);
    }
}
