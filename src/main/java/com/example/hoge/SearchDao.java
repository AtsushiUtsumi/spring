package com.example.hoge;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SearchDao<F, P extends SearchParams> {

    /**
     * 検索条件
     * 
     * @param params
     * @return
     */
    public List<F> search(P params) {
        System.err.println(params.getClass());
        return new ArrayList<F>();
    }

    /**
     * 検索条件
     * 
     * @param params
     * @param perPage
     * @return
     */
    public List<F> search(P params, int perPage) {
        System.err.println(params.getClass());
        return new ArrayList<F>();
    }
}
