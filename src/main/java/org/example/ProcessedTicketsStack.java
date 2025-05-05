package org.example;

import java.util.Stack;

public class ProcessedTicketsStack {
    private final Stack<Ticket> processedTickets;

    /**
     *
     * @param processedTicket stack of processed tickets LIFO
     */
    public ProcessedTicketsStack(Stack<Ticket> processedTicket) {
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


}
