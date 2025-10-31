    package org.solvd.ticket;
    
    public enum Ticket {
        ONETIME(1),
        WEEKLY(5),
        MONTHLY(20),
        YEARLY(100);
    
        private final int value;
    
        Ticket(int value) {
            this.value = value;
        }
    
        public int getValue() {
            return value;
        }
    }
