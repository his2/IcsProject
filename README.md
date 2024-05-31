# IcsProject - A Java Project

## Goals (to be updated)
### 1. Split Into Classes

## The Query

Take the following query:
```
tSSH.py -t https://dss.%s.concur.global -u ${USER:u} \
    -s %s\\\\${USER:u}-a \
    -v -d bast.service.cnqr.tech \
     \"curl -X 'GET' \
        'https://financial-integration.service.cnqr.tech/fi/v1/companies/1/transactiontypes/expense/transactions?limit=0&docId=%s&ignoreDocumentStatus=yes' \
        -H 'accept: application/json' \
        -H 'documentFormatAs: json' \
        -H 'Authorization: Bearer $JWT'\" \
        > ~/Downloads/%s.json;
```

## Breaking it Down
Task #1: Split the query into sections:

Proxy:
```
tSSH.py -t https://dss.%s.concur.global -u ${USER:u} \
    -s %s\\\\${USER:u}-a \
    -v -d bast.service.cnqr.tech \
```

Curl:
```
\"curl -X 'GET' \
        'https://financial-integration.service.cnqr.tech/fi/v1/companies/1/transactiontypes/expense/transactions?limit=0&docId=%s&ignoreDocumentStatus=yes' \
        -H 'accept: application/json' \
        -H 'documentFormatAs: json' \
        -H 'Authorization: Bearer $JWT'\" \
        > ~/Downloads/%s.json;
```

Task #2: Create a model for each section:

The proxy command, using the tSSH.py command, could be represented by a ProxyCommand class:
```Java
public class ProxyCommand {
    private String url;
    private String user;
    private String server;
    private String destination;
    
    public ProxyCommand(String url, String user, String server, String destination) {
        this.url = url;
        this.user = user;
        this.server = server;
        this.destination = destination;
    }

    /* ...getters and setters... */
}
```

The curl command could be represented by a CurlCommand class:
```Java
public class CurlCommand {
    private String method;
    private String url;
    private String accept;
    private String documentFormatAs;
    private String authorization;
    private String output;
    
    public CurlCommand(String method, String url, String accept, String documentFormatAs, String authorization, String output) {
        this.method = method;
        this.url = url;
        this.accept = accept;
        this.documentFormatAs = documentFormatAs;
        this.authorization = authorization;
        this.output = output;
    }
    
    /* ...getters and setters... */
}
```

#### These, too, still have pieces which can break down for further clarity. Some examples:

You could have a URL class for the URL, company, transactionType, transactions, limit, docId, and ignoreDocumentStatus:
```Java
public class Url {
    private String url;
    private String company;
    private String transactionType;
    private String transactions;
    private String limit;
    private String docId;
    private String ignoreDocumentStatus;
    
    public Url(String url, String company, String transactionType, String transactions, String limit, String docId, String ignoreDocumentStatus) {
        this.url = url;
        this.company = company;
        this.transactionType = transactionType;
        this.transactions = transactions;
        this.limit = limit;
        this.docId = docId;
        this.ignoreDocumentStatus = ignoreDocumentStatus;
    }

    /* ...getters and setters... */
}
```

You could use a Header class for the JWT, accept, and documentFormatAs:
```Java
public class Header {
    private String accept;
    private String documentFormatAs;
    private String authorization;
    
    public Header(String accept, String documentFormatAs, String authorization) {
        this.accept = accept;
        this.documentFormatAs = documentFormatAs;
        this.authorization = authorization;
    }

    /* ...getters and setters... */
}
```

At the moment, these exercises are to break down code until it is meaningful as a single piece of something that does
one thing, and does it perfectly. This is the essence of object-oriented programming.
