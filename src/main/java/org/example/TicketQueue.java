package org.example;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Manages a queue of customer service tickets.
 */
public class TicketQueue{

    /**
     * Создание очереди
     * Это поле хранит очередь заявок (Ticket).
     * Используется интерфейс Queue, а реализуется через LinkedList.
     */
    private final Queue<Ticket> ticketQueue;  // final: makes final reference, re-assignment is not allowed!


    /**
     * Инициализация очереди
     * LinkedList здесь выступает как реализация очереди.
     */
    public TicketQueue() {
        this.ticketQueue = new LinkedList<>();
    }

    /**
     * Добавление заявки
     * @param ticket
     * @method offer() добавляет заявку в конец очереди.
     */
    public void addTicket(Ticket ticket){
        this.ticketQueue.offer(ticket);
    }

    /**
     * Метод poll() извлекает первую заявку из очереди и удаляет её.
     * @return Если очередь пуста — возвращает null.
     */
    public Ticket processNextTicket(){
        return this.ticketQueue.poll();
    }

    /**
     * Returns the number of tickets in the queue.
     *
     * @return the size of the queue
     */
    public int getQueueSize(){
        return this.ticketQueue.size();
    }
}
