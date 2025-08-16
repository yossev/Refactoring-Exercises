class InvoicePrinter {
    public void printInvoice() { // 👈 Smelly
        System.out.println("Fetching customer data...");
        System.out.println("Calculating totals...");
        System.out.println("Formatting invoice...");
        System.out.println("Printing invoice...");
    }
}

// Question : How would you refactor printInvoice()?