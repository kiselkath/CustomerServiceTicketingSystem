package org.example;

import java.util.Scanner;

/**
 * CLI demo for Customer Service Ticketing System.
 * Demonstrates Queue (FIFO) and Stack (LIFO) behaviors.
 */
public class App {

    // Fields
    private static final TicketQueue ticketQueue = new TicketQueue();
    private static final ProcessedTicketsStack processedStack = new ProcessedTicketsStack();
    private static int ticketIdCounter = 1;

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("🎫 Welcome to the Customer Service Ticketing System");
        System.out.println("Demonstrating FIFO (Queue) and LIFO (Stack)");

        while (!exit){
            printMenu();
            System.out.print("Select an option: ");
            String input = scanner.nextLine();

            switch (input){
                case "1":
                    addNewTicket(scanner);
                    break;
                case "2":
                    processTicket();
                    break;
                case "3":
                    viewLastProcessedTicket();
                    break;
                case "4":
                    undoLastProcessedTicket();
                    break;
                case "5":
                    exit = true;
                    System.out.println("👋 Exiting system. Bye!");
                    break;
                default:
                    System.out.println("❗ Invalid option, please try again.");
            }
        }

        scanner.close();

    }

    private static void undoLastProcessedTicket() {
        Ticket ticket =  processedStack.removeLastProcessesTicket();
        if (ticket == null) {
            System.out.println("⚠️ No ticket to undo.");
            return;
        }
        ticketQueue.addTicket(ticket);
        System.out.println("↩️ Undid Ticket: " + ticket.getDescription() + " (ID: " + ticket.getId() + ")");
    }

    private static void viewLastProcessedTicket() {
        Ticket ticket =  processedStack.peekLastProcessesTicket();
        if (ticket == null) {
            System.out.println("⚠️ No processed tickets yet.");
            return;
        }
        System.out.println("👀 Last Processed Ticket: " + ticket.getDescription() + " (ID: " + ticket.getId() + ")");

    }

    private static void processTicket() {
        Ticket ticket = ticketQueue.processNextTicket();
        if(ticket == null){
            System.out.println("⚠️ No tickets to process.");
            return;
        }
        processedStack.addProcessedTicket(ticket);
        System.out.println("🛠️ Processed Ticket: " + ticket.getDescription() + " (ID: " + ticket.getId() + ")");
    }

    private static void addNewTicket(Scanner scanner) {
        System.out.print("Enter ticket description: ");
        String description = scanner.nextLine();
        Ticket ticket = new Ticket(ticketIdCounter++, description);
        ticketQueue.addTicket(ticket);
        System.out.println("✅ Ticket added to queue: " + ticket.getDescription());
    }

    private static void printMenu() {
        System.out.println("\n📋 MENU:");
        System.out.println("1. Add New Ticket");
        System.out.println("2. Process Next Ticket (FIFO)");
        System.out.println("3. View Last Processed Ticket (LIFO)");
        System.out.println("4. Undo Last Processed Ticket (LIFO)");
        System.out.println("5. Exit");
    }
}