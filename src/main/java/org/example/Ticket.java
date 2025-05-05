package org.example;

public class Ticket {
    // Constant fields: id, description
    private final int id;
    private final String description;

    /**
     *
     * @param id the unique id if the ticket
     * @param description the description of the issue
     */
    public Ticket(int id, String description) {
        this.id = id;
        this.description = description;
    }

    /**
     *
     * @return the ticket id
     */

    public int getId() {
        return id;
    }

    /**
     *
     * @return the issue description
     */

    public String getDescription() {
        return description;
    }


}
