package org.example;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit tests for ProcessedTicketsStack.
 */
public class ProcessedTicketsStackTest {

    private  ProcessedTicketsStack stack ;
    private   Ticket ticket;

    @BeforeEach
    void steUp(){
        stack = new ProcessedTicketsStack();
        ticket = new Ticket(1, "Issue with login");


    }

    @Test
    public void testAddAndPeekProcessedTicket(){

        stack.addProcessedTicket(ticket);
        assertEquals(1, stack.getProcessedTicketsCount());

        Ticket peeked = stack.peekLastProcessedTicket();
        assertEquals(ticket, peeked);
        assertEquals(1, stack.getProcessedTicketsCount());


    }

    @Test
    public void testRemoveLastProcessedTicket(){
        stack.addProcessedTicket(ticket);
        Ticket removed = stack.removeLastProcessedTicket();
        assertEquals(ticket, removed);
        assertEquals(0, stack.getProcessedTicketsCount());
    }


}