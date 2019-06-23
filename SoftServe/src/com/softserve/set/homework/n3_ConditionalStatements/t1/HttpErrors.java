package com.softserve.set.homework.n3_ConditionalStatements.t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpErrors {
    public static void main(String[] args) throws IOException {
        HTTPError error = HTTPError.Err404;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Error number [400 - 404]");
        int numError = Integer.parseInt(br.readLine());
        switch (numError) {
            case 400:
                error = HTTPError.Err400;
                break;
            case 401:
                error = HTTPError.Err401;
                break;
            case 402:
                error = HTTPError.Err402;
                break;
            case 403:
                error = HTTPError.Err403;
                break;
            case 404:
                error = HTTPError.Err404;
                break;
            default:
                System.out.println("PLS Enter correct Error number");
                break;

        }
        if (numError >= 400 && numError <= 404) {
            System.out.println("Error description: " + error.getName());
        }
    }
}
