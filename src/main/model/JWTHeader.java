package main.model;
//model for: JWT=$(hmcOktaJWT.py -o cnqr.okta.com -H 'HMC - US2' -e p00849947wds -R 22717526)
public class JWTHeader {
    private String PythonCall;
    private String url;
    private String dataCenter;
    private String entity;
    private String CaseNumber;

    public JWTHeader(String pythonCall, String url, String dataCenter, String entity, String caseNumber) {
        PythonCall = pythonCall;
        this.url = url;
        this.dataCenter = dataCenter;
        this.entity = entity;
        CaseNumber = caseNumber;
    }

    public String getPythonCall() {
        return PythonCall;
    }

    public void setPythonCall(String pythonCall) {
        PythonCall = pythonCall;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getCaseNumber() {
        return CaseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        CaseNumber = caseNumber;
    }

}
