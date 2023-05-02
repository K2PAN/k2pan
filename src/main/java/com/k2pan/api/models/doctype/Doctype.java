package com.k2pan.api.models.doctype;

import javax.sql.DataSource;

import org.json.JSONObject;
import org.springframework.jdbc.core.JdbcTemplate;

public class Doctype {
    private final JdbcTemplate jdbcTemplate;

    public Doctype(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void createDoctype(JSONObject json) {
        String tableName = json.getString("tablename");
        JSONObject fields = json.getJSONObject("field");
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("CREATE TABLE ").append(tableName).append(" (");
        for (String columnName : fields.keySet()) {
            String columnType = fields.getString(columnName);
            queryBuilder.append(columnName).append(" ").append(columnType).append(",");
        }
        queryBuilder.deleteCharAt(queryBuilder.length() - 1);
        queryBuilder.append(");");
        jdbcTemplate.execute(queryBuilder.toString());
    }
    
}
