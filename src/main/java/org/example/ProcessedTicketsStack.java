package org.example;

import java.util.Stack;

/**
 * Manages a stack of processed tickets.
 */

public class ProcessedTicketsStack {
    private final Stack<Ticket> processedTickets;

    /**
     * Constructs a new {@code ProcessedTicketsStack} instance.
     * */
    public ProcessedTicketsStack() {
        this.processedTickets = new Stack<>();
    }

    /**
     * Adds a ticket to the stack of processed tickets
     * ticket would be pushed on top of {@code processedTicket} stack
     * @param ticket the ticket to add
     *
     */
    public void addProcessedTicket(Ticket ticket){
        this.processedTickets.push(ticket);
    }

    /**
     * Returns a copy of the ticket at the top - NO REMOVING
     * @return null if stack isEmpty or last added ticket if stack is not empty
     */
    public Ticket peekLastProcessesTicket(){
        return (this.processedTickets.isEmpty()) ? null : this.processedTickets.peek();
    }

    /**
     * Returns and removes the ticket at the top
     * @return null if stack isEmpty or last added ticket if stack is not empty
     */

    public Ticket removeLastProcessesTicket(){
        return (this.processedTickets.isEmpty()) ? null : this.processedTickets.pop();
    }

    /**
     * Returns the number of processed tickets.
     *
     * @return the size of the stack
     */
    public int getProcessedTicketsCount() {
        return this.processedTickets.size();
    }


}
