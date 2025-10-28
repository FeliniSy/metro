package org.solvd.station;

class StationNode {

    String address;
    StationNode prev;
    StationNode next;

    StationNode(String address) {
        this.address = address;
        prev = next = null;
    }
}
