package org.solvd.metro.parser;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SaxParser {

    public static void main(String[] args) {
        try {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();

            Handler handler = new Handler();
            saxParser.parse(new File("src\\main\\resources\\metro.xml"), handler);

            System.out.println("Parsed Trains: " + handler.getTrains());
            System.out.println("Parsed Stations: " + handler.getStations());
            System.out.println("Parsed Passengers: " + handler.getPassengers());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}