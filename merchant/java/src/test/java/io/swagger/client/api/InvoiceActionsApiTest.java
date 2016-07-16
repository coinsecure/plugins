package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.SuccessInvoice;
import io.swagger.client.model.FailInvoice;
import io.swagger.client.model.NewInvoice;
import io.swagger.client.model.ActionAnyContent;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoiceActionsApi
 */
public class InvoiceActionsApiTest {

    private final InvoiceActionsApi api = new InvoiceActionsApi();

    
    /**
     * NEW INVOICE
     *
     * Allows user to create a new Invoice.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNewInvoiceTest() throws ApiException {
        String apikey = null;
        NewInvoice body = null;
        // SuccessInvoice response = api.createNewInvoice(apikey, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loadInvoiceTest() throws ApiException {
        String invoiceID = null;
        // ActionAnyContent response = api.loadInvoice(invoiceID);

        // TODO: test validations
    }
    
}
