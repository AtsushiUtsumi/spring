package com.example.hoge;

import java.util.Map;
import java.util.HashMap;

public abstract class SearchParams {

    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<String, String>();
        return map;
    }

    public String toLogString() {
        return toMap().toString();
    }
}
