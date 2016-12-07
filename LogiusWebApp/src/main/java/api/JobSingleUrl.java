package api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JobSingleUrl {
    private String id;
    private String url;
    private String status;
    private String reportUrl;

    public JobSingleUrl() {
        // Jackson deserialization
    }

    public JobSingleUrl(String id, String url, String status, String reportUrl) {
        this.id = id;
        this.url = url;
        this.status = status;
        this.reportUrl = reportUrl;
    }

    @JsonProperty
    public String getId() {
        return id;
    }

    @JsonProperty
    public String getUrl() {
        return url;
    }

    @JsonProperty
    public String getStatus() {
        return status;
    }

    @JsonProperty
    public void setStatus(String status) { this.status = status; }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty
    public String getReportUrl() {return reportUrl;}

    public void setReportUrl(String reportUrl) { this.reportUrl = reportUrl; }
}