package com.softserve.set.practicalTasks.n3_ConditionalStatements.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContryOfCont {
    public static void main(String[] args) throws IOException {

        Continents continents = Continents.EUROPE;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter country:");
        String n = br.readLine();
        switch (n) {
            case "Ukraine":
            case "Poland":
            case "United Kingdom":
            case "Germany":
            case "Nethelands":

                continents = Continents.EUROPE;
                break;
            case "China":
            case "India":
            case "Japan":
            case "Russia":
            case "South Korea":
                continents = Continents.ASIA;
                break;
            case "Australia":
            case "Fiji":
            case "New Zealand":
            case "Samoa":
            case "Tonga":

                continents = Continents.AUSTRALIA;
                break;
            case "Nigeria":
            case "South Africa":
            case "Egypt":
            case "Morocco":
            case "Angola":
                continents = Continents.AFRICA;
                break;
            default:
                break;
        }
        System.out.println(continents);
    }
}
