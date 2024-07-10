package model;
//not sure why we have this URL when there is one above it in the Curl class
public class URLCommand {
    private String URLs;
    //not sure why we have this URL when there is one above it in the Curl class
    private String company;
    // not sure how this one fits in, but adding it anyhow
    private String transactionTypes;
    private String transaction;
    private String limit;
    private String docID;
    private String ignoreDocumentStatus;

    public URLCommand(String URLs, String company, String transactionTypes, String transaction, String limit, String docID, String ignoreDocumentStatus) {
        this.URLs = URLs;
        this.company = company;
        this.transactionTypes = transactionTypes;
        this.transaction = transaction;
        this.limit = limit;
        this.docID = docID;
        this.ignoreDocumentStatus = ignoreDocumentStatus;
    }

    public void setURLs(String URLs) {
        this.URLs = URLs;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTransactionTypes() {
        return transactionTypes;
    }

    public void setTransactionTypes(String transactionTypes) {
        this.transactionTypes = transactionTypes;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getDocID() {
        return docID;
    }

    public void setDocID(String docID) {
        this.docID = docID;
    }

    public String getIgnoreDocumentStatus() {
        return ignoreDocumentStatus;
    }

    public void setIgnoreDocumentStatus(String ignoreDocumentStatus) {
        this.ignoreDocumentStatus = ignoreDocumentStatus;
    }

}
