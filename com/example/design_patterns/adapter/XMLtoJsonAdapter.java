package com.example.design_patterns.adapter;

public class XMLtoJsonAdapter implements JsonUserService{

    XMLUserService xmlUserService;

    public XMLtoJsonAdapter(XMLUserService xmlUserService) {
        this.xmlUserService = xmlUserService;
    }

    @Override
    public String getUserJson() {
        String data = xmlUserService.getUserXML();
        // dummy conversion
        return "{\"name\":\"Amit\", \"email\": \"amitthatera@gmail.com\"}";
    }
}
