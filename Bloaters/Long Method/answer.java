class InvoicePrinter {
    public void printInvoice() {
        fetchCustomerData();
        calculateTotals();
        formatInvoice();
        sendToPrinter();
    }

    private void fetchCustomerData() {
        System.out.println("Fetching customer data...");
    }

    private void calculateTotals() {
        System.out.println("Calculating totals...");
    }

    private void formatInvoice() {
        System.out.println("Formatting invoice...");
    }

    private void sendToPrinter() {
        System.out.println("Printing invoice...");
    }
}

// this solution uses 'Extract method' method