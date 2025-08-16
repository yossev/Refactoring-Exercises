/*
 * Since tempData is used only in one method, its better to make it a local
 * variable.
 */

class ReportGenerator {

    public String generate() {
        String tempData = fetchData(); // <- Local Var
        return "Report: " + tempData;
    }

    private String fetchData() {
        return "DB result";
    }
}