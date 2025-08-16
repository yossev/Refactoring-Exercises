/*
 * The PdfExporter class and the WordWriter class can be both linked under one
 * Interface Called DocumentWriter, it just makes sense to me.
 * 
 */

interface DocumentExporter {
    void export();
}

class pdfExporter implements DocumentExporter {

    @Override
    public void export() {
        // Do Something
        //
        //
        System.out.println("Exporting PDF");
    }

}

class WordWriter implements DocumentExporter {

    @Override
    public void export() {
        // Do Something
        //
        //
        System.out.println("Writing Word");
    }

}

// Now the classes are unified the code is much cleaner to scale up.