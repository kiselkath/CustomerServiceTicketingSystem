package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for TicketQueue
 */
public class TicketQueueTest {

    @Test
    void TestAddAndProcessTicket() {
        TicketQueue queue = new TicketQueue();
        Ticket ticket = new Ticket(1, "Issue with login");
        queue.addTicket(ticket);
        assertEquals(1, queue.getQueueSize());

        Ticket procesed = queue.processNextTicket();
        assertEquals(ticket, procesed);

        assertEquals(0, queue.getQueueSize());
    }
}