package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for ProcessedTicketsStack
 */

class ProcessedTicketsStackTest {

    private ProcessedTicketsStack stack;
    private Ticket ticket;

    @BeforeEach
    void setUp() {
        stack = new ProcessedTicketsStack();
        ticket = new Ticket(1, "Issue with login");
    }

    @Test
    void addAndPeekLastProcessedTicket() {
        stack.addProcessedTicket(ticket);
        assertEquals(1, stack.getProcessedTicketsCount);

        Ticket ticket = stack.peekLastProcessesTicket();
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
}