package model;
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
public class FinancialIntegrationCurlCommand {
    private String httpMethod;
    private String financialIntegrationBaseUrl;
    private boolean ignoreDocStatusQuery;
    private String contentTypeHeader;
    private String documentFormatHeader;
    private String authorizationHeader;
    private String downloadDestination;

    public FinancialIntegrationCurlCommand(String httpMethod, String financialIntegrationBaseUrl, boolean ignoreDocStatusQuery, String contentTypeHeader, String documentFormatHeader, String authorizationHeader, String downloadDestination) {
        this.httpMethod = httpMethod;
        this.financialIntegrationBaseUrl = financialIntegrationBaseUrl;
        this.ignoreDocStatusQuery = ignoreDocStatusQuery;
        this.contentTypeHeader = contentTypeHeader;
        this.documentFormatHeader = documentFormatHeader;
        this.authorizationHeader = authorizationHeader;
        this.downloadDestination = downloadDestination;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getFinancialIntegrationBaseUrl() {
        return financialIntegrationBaseUrl;
    }

    public void setFinancialIntegrationBaseUrl(String financialIntegrationBaseUrl) {
        this.financialIntegrationBaseUrl = financialIntegrationBaseUrl;
    }

    public boolean isIgnoreDocStatusQuery() {
        return ignoreDocStatusQuery;
    }

    public void setIgnoreDocStatusQuery(boolean ignoreDocStatusQuery) {
        this.ignoreDocStatusQuery = ignoreDocStatusQuery;
    }

    public String getContentTypeHeader() {
        return contentTypeHeader;
    }

    public void setContentTypeHeader(String contentTypeHeader) {
        this.contentTypeHeader = contentTypeHeader;
    }

    public String getDocumentFormatHeader() {
        return documentFormatHeader;
    }

    public void setDocumentFormatHeader(String documentFormatHeader) {
        this.documentFormatHeader = documentFormatHeader;
    }

    public String getAuthorizationHeader() {
        return authorizationHeader;
    }

    public void setAuthorizationHeader(String authorizationHeader) {
        this.authorizationHeader = authorizationHeader;
    }

    public String getDownloadDestination() {
        return downloadDestination;
    }

    public void setDownloadDestination(String downloadDestination) {
        this.downloadDestination = downloadDestination;
    }

    @Override
    public String toString() {
        return "FinancialIntegrationCurlCommand{" +
                "httpMethod='" + httpMethod + '\'' +
                ", financialIntegrationBaseUrl='" + financialIntegrationBaseUrl + '\'' +
                ", ignoreDocStatusQuery=" + ignoreDocStatusQuery +
                ", contentTypeHeader='" + contentTypeHeader + '\'' +
                ", documentFormatHeader='" + documentFormatHeader + '\'' +
                ", authorizationHeader='" + authorizationHeader + '\'' +
                ", downloadDestination='" + downloadDestination + '\'' +
                '}';
    }
}

