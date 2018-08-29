package runner;

public class ConfigFileReader {
    public static String getReportConfigPath() {

        String reportConfigPath = System.getProperty("user.dir") + "/configs/extent-config.xml";
        if (reportConfigPath != null) {
            return reportConfigPath;
        } else {
            throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
        }
    }
}
