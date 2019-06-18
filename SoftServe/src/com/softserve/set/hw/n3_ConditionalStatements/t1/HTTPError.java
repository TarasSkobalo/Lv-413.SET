package com.softserve.set.hw.n3_ConditionalStatements.t1;

public enum HTTPError {
    Err400("400 Bad Request "),
    Err401("401 Unauthorized "),
    Err402("402 Payment Required "),
    Err403("403 Forbidden "),
    Err404("404 Not Found ");


    private final String name;

    public String getName() {
        return name;
    }

    HTTPError(String name) {
        this.name = name;
    }
}
