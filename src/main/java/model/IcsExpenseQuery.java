package model;

public class IcsExpenseQuery {
    private String api;
    private String apiVersion;
    private String path;
    private int limitQuery;
    private String docIdQuery;
    private boolean ignoreDocumentStatusQuery;


    public IcsExpenseQuery(String api, String apiVersion, String path, int limitQuery, String docIdQuery, boolean ignoreDocumentStatusQuery) {
        this.api = api;
        this.apiVersion = apiVersion;
        this.path = path;
        this.limitQuery = limitQuery;
        this.docIdQuery = docIdQuery;
        this.ignoreDocumentStatusQuery = ignoreDocumentStatusQuery;
    }

    public IcsExpenseQuery() {
        System.out.println("HA! BUilt an Empty one!");
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getLimitQuery() {
        return limitQuery;
    }

    public void setLimitQuery(int limitQuery) {
        this.limitQuery = limitQuery;
    }

    public String getDocIdQuery() {
        return docIdQuery;
    }

    public void setDocIdQuery(String docIdQuery) {
        this.docIdQuery = docIdQuery;
    }

    public String getIgnoreDocumentStatusQuery() {
        return ignoreDocumentStatusQuery ? "yes" : "no";
    }

    public void setIgnoreDocumentStatusQuery(boolean ignoreDocumentStatusQuery) {
        this.ignoreDocumentStatusQuery = ignoreDocumentStatusQuery;
    }

    @Override
    public String toString() {
        return "IcsExpenseQuery{" +
                "api='" + api + '\'' +
                ", apiVersion='" + apiVersion + '\'' +
                ", path='" + path + '\'' +
                ", limitQuery=" + limitQuery +
                ", docIdQuery='" + docIdQuery + '\'' +
                ", ignoreDocumentStatusQuery=" + ignoreDocumentStatusQuery +
                '}';
    }

    public String toRunnable() {
        return String.format("%s/%s/%s?limit=%d&docId=%s&ignoreDocumentStatus=%s",
                getApi(), getApiVersion(), getPath(), getLimitQuery(), getDocIdQuery(), getIgnoreDocumentStatusQuery());
    }
}
