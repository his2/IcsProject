package main.model;
/* Model for the curl command: \"curl -X 'GET' \
       'https://financial-integration.service.cnqr.tech/fi/v1/companies/1/transactiontypes/expense/transactions?limit=0&docId=%s&ignoreDocumentStatus=yes' \
       -H 'accept: application/json' \
       -H 'documentFormatAs: json' \
      -H 'Authorization: Bearer $JWT'\" \
       > ~/Downloads/%s.json;
*/
public class CurlCommand {
    private String method;
    private String url;
    private String ignoreDocStatus;
    private String  accept;
    private String documentFormat;
    private String authorization;
    private String destination;
    private String output;

    public CurlCommand(String method, String url, String ignoreDocStatus, String accept, String documentFormat, String authorization, String destination, String output) {
        this.method = method;
        this.url = url;
        this.ignoreDocStatus = ignoreDocStatus;
        this.accept = accept;
        this.documentFormat = documentFormat;
        this.authorization = authorization;
        this.destination = destination;
        this.output = output;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIgnoreDocStatus() {
        return ignoreDocStatus;
    }

    public void setIgnoreDocStatus(String ignoreDocStatus) {
        this.ignoreDocStatus = ignoreDocStatus;
    }

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getDocumentFormat() {
        return documentFormat;
    }

    public void setDocumentFormat(String documentFormat) {
        this.documentFormat = documentFormat;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }


}
