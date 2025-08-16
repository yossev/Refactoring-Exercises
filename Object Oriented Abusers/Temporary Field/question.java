class ReportGenerator {
    private String tempData; // 👈 only used in one method

    public void prepareData() {
        tempData = fetchData();
    }

    public String generate() {
        return "Report: " + tempData;
    }

    private String fetchData() {
        return "DB result";
    }
}

// Question: How would you refactor generate()?