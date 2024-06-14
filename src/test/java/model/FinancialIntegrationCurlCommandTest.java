package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinancialIntegrationCurlCommandTest {
    @Test
    public void httpMethodConstructTest() {

        FinancialIntegrationCurlCommand financialIntegrationCurlCommand = new FinancialIntegrationCurlCommand(
                "GET",
                "https://financial-integration.service.cnqr.tech/fi/v1/companies/1/transactiontypes/expense/transactions",
                true,
                "application/json",
                "json",
                "Bearer $JWT",
                "~/Downloads/fiResults.json");

        assertEquals(financialIntegrationCurlCommand.getHttpMethod(),"GET");

        assertEquals(financialIntegrationCurlCommand.getFinancialIntegrationBaseUrl(),
                "https://financial-integration.service.cnqr.tech/fi/v1/companies/1/transactiontypes/expense/transactions");

        assertEquals(financialIntegrationCurlCommand.isIgnoreDocStatusQuery(), true);

        assertEquals(financialIntegrationCurlCommand.getContentTypeHeader(), "application/json");

        assertEquals(financialIntegrationCurlCommand.getDocumentFormatHeader(), "json");

        assertEquals(financialIntegrationCurlCommand.getAuthorizationHeader(), "Bearer $JWT");

    }
}
