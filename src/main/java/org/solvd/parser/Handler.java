package org.solvd.parser;

import org.solvd.carriage.Carriage;
import org.solvd.passenger.Passenger;
import org.solvd.station.Station;
import org.solvd.ticket.Ticket;
import org.solvd.train.Train;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class Handler extends DefaultHandler {
    private List<Train> trains = new ArrayList<>();
    private List<Station> stations = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();

    private Train currentTrain;
    private Carriage currentCarriage;
    private Passenger currentPassenger;

    private Station fromStation;
    private Station toStation;
    private StringBuilder data = new StringBuilder();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "Train":
                currentTrain = new Train(Integer.parseInt(attributes.getValue("number")));
                break;

            case "Carriage":
                int id = Integer.parseInt(attributes.getValue("id"));
                currentCarriage = new Carriage(id, 0);
                break;

            case "Seats":
                int quantity = Integer.parseInt(attributes.getValue("quantity"));
                String type = attributes.getValue("type");
                currentCarriage = new Carriage(currentCarriage.getId(), quantity);
                for (int i = 1; i <= quantity; i++) {
                    currentCarriage.changeSeatName(i, type);
                }
                break;

            case "Station":
                int stationId = Integer.parseInt(attributes.getValue("id"));
                String city = attributes.getValue("city");
                String address = attributes.getValue("address");
                stations.add(new Station(stationId, address, city));
                break;

            case "Passenger":
                int passengerId = Integer.parseInt(attributes.getValue("id"));
                currentPassenger = new Passenger(passengerId, null, null);
                break;

            default:
                data.setLength(0);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        data.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "Carriage":
                currentTrain.addCarriage(currentCarriage);
                break;

            case "Train":
                trains.add(currentTrain);
                break;

            case "FromStation":
                fromStation = stations.stream()
                        .filter(s -> s.getAddress().equalsIgnoreCase(data.toString().trim()))
                        .findFirst()
                        .orElse(null);
                break;

            case "ToStation":
                toStation = stations.stream()
                        .filter(s -> s.getAddress().equalsIgnoreCase(data.toString().trim()))
                        .findFirst()
                        .orElse(null);
                break;

            case "Ticket":
                if (currentPassenger != null) {
                    String ticketType = data.toString().trim();
                    if (ticketType.equalsIgnoreCase("ONETIME"))
                        currentPassenger.getTicket(Ticket.ONETIME);
                }
                break;

            case "Passenger":
                if (currentPassenger != null) {
                    currentPassenger = new Passenger(currentPassenger.getPassengerId(), fromStation, toStation);
                    passengers.add(currentPassenger);
                }
                break;
        }
    }

    public List<Train> getTrains() { return trains; }
    public List<Station> getStations() { return stations; }
    public List<Passenger> getPassengers() { return passengers; }
}
