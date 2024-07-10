import model.IcsExpenseQuery;

public class Main {
    public static void main(String[] args) {
        /**
         * After we finish this project, the following string will be produced, exactly as written here:
         *  "tSSH.py -t https://dss.%s.concur.global -u ${USER:u} -s %s\\\\${USER:u}-a -v -d bast.service.cnqr.tech \"curl -X 'GET' 'https://financial-integration.service.cnqr.tech/fi/v1/companies/1/transactiontypes/expense/transactions?limit=0&docId=%s&ignoreDocumentStatus=yes' -H 'accept: application/json' -H 'documentFormatAs: json' -H 'Authorization: Bearer $JWT'\" > ~/Downloads/%s.json";
         */

        /*
        We have officially entered github.
         */

        String env = args[0];
        String docId = args[1];
        String fileName = args[2];

        String api = "fi";
        String apiVersion = "v1";
        String path = "companies/1/transactiontypes/expense/transactions";
        int limitQuery = 0;
        boolean ignoreDocumentStatusQuery = true;

        IcsExpenseQuery query = new IcsExpenseQuery(api, apiVersion, path, limitQuery, docId, ignoreDocumentStatusQuery);

        System.out.println(String.format("%s/%s", Constants.BASE_URL_FINANCIAL_INTEGRATION, query.toRunnable()));

        // https://financial-integration.service.cnqr.tech/fi/v1/companies/1/transactiontypes/expense/transactions?limit=0&docId=5833B65A4C374FA3A86A&ignoreDocumentStatus=yes
    }
}