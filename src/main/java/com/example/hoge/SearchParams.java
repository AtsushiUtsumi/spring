package com.example.hoge;

import java.util.Map;

import lombok.Data;

import java.util.HashMap;

@Data
public abstract class SearchParams {

    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<String, String>();
        return map;
    }

    public String toLogString() {
        return toMap().toString();
    }
}
