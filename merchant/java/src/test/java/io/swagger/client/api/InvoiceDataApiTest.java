package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.FailInvoice;
import io.swagger.client.model.InvoiceIDFull;
import io.swagger.client.model.SuccessInvoices;
import io.swagger.client.model.SuccessInvoice;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoiceDataApi
 */
public class InvoiceDataApiTest {

    private final InvoiceDataApi api = new InvoiceDataApi();

    
    /**
     * GET ALL CANCELLED INVOICES
     *
     * Gets All Cancelled Invoice Details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCancInvoicesTest() throws ApiException {
        String apikey = null;
        InvoiceIDFull body = null;
        // SuccessInvoices response = api.getCancInvoices(apikey, body);

        // TODO: test validations
    }
    
    /**
     * GET ALL COMPLETED INVOICES
     *
     * Gets All Completed Invoice Details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCompleteInvoicesTest() throws ApiException {
        String apikey = null;
        InvoiceIDFull body = null;
        // SuccessInvoices response = api.getCompleteInvoices(apikey, body);

        // TODO: test validations
    }
    
    /**
     * GET ALL CONFIRMED INVOICES
     *
     * Gets All Confirmed Invoice Details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfInvoicesTest() throws ApiException {
        String apikey = null;
        InvoiceIDFull body = null;
        // SuccessInvoices response = api.getConfInvoices(apikey, body);

        // TODO: test validations
    }
    
    /**
     * GET INVOICE FROM ID
     *
     * Gets Details of an Invoice ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInvoiceFromIDTest() throws ApiException {
        String invoiceID = null;
        String apikey = null;
        // SuccessInvoice response = api.getInvoiceFromID(invoiceID, apikey);

        // TODO: test validations
    }
    
    /**
     * GET ALL PAID INVOICES
     *
     * Gets All Paid Invoice Details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaidInvoicesTest() throws ApiException {
        String apikey = null;
        InvoiceIDFull body = null;
        // SuccessInvoices response = api.getPaidInvoices(apikey, body);

        // TODO: test validations
    }
    
    /**
     * GET ALL REFUND INVOICES
     *
     * Gets All Refund Invoice Details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRefundInvoicesTest() throws ApiException {
        String apikey = null;
        InvoiceIDFull body = null;
        // SuccessInvoices response = api.getRefundInvoices(apikey, body);

        // TODO: test validations
    }
    
    /**
     * GET ALL UNPROCESSED INVOICES
     *
     * Gets All Unprocessed Invoice Details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUnprocessedInvoicesTest() throws ApiException {
        String apikey = null;
        InvoiceIDFull body = null;
        // SuccessInvoices response = api.getUnprocessedInvoices(apikey, body);

        // TODO: test validations
    }
    
}
