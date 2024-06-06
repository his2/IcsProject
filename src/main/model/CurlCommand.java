package main.model;
/* Model for the curl command: \"curl -X 'GET' \
       'https://financial-integration.service.cnqr.tech/fi/v1/companies/1/transactiontypes/expense/transactions?limit=0&docId=%s&ignoreDocumentStatus=yes' \
       -H 'accept: application/json' \
       -H 'documentFormatAs: json' \
      -H 'Authorization: Bearer $JWT'\" \
       > ~/Downloads/%s.json;
       Additional note:
When you run a Python script with the -H flag, it requests that the security policy sets the HOME environment
variable to the home directory of the target user (usually root by default) as specified in the password database.
This behavior ensures that the script runs with the correct user context, including the appropriate home directory.
*/
public class CurlCommand {
    private String method;
    //method describes what the curl command will do "get"
    private String url;
    //The url is everything from https to the ? after "transactions"
    private boolean ignoreDocStatus;
    //We usually don't care about the status of the document, we just want to obtain it, so "true" is the default
    //The next three are Python using -H as defined above to run commands in the FI database.
    private String  accept;
    //If I understand correctly, this is set to obtain the existing information from the DB, which is the json format
    private String documentFormat;
    // Python selects "json" from the list of available document formats for the format output
    private String authorization;
    //Python sends the JWT provided from the first process
    private String destination;
    //Python sends the file to the user's download directory
    private String output;

    public CurlCommand(String method, String url, boolean ignoreDocStatus, String accept, String documentFormat, String authorization, String destination, String output) {
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
