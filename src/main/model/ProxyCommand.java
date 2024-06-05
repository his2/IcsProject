package main.model;

public class ProxyCommand {
    private String url;
    private String user;
    private String server;

    public ProxyCommand(String url, String user, String server) {
        this.url = url;
        this.user = user;
        this.server = server;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
}
