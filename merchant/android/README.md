# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.InvoiceActionsApi;

public class InvoiceActionsApiExample {

    public static void main(String[] args) {
        InvoiceActionsApi apiInstance = new InvoiceActionsApi();
        String apikey = "apikey_example"; // String | Enter User Key
        NewInvoice body = new NewInvoice(); // NewInvoice | Enter details to create an Invoice
        try {
            SuccessInvoice result = apiInstance.createNewInvoice(apikey, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InvoiceActionsApi#createNewInvoice");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://pay.coinsecure.in/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*InvoiceActionsApi* | [**createNewInvoice**](docs/InvoiceActionsApi.md#createNewInvoice) | **POST** /invoice/createNewInvoice | NEW INVOICE
*InvoiceActionsApi* | [**loadInvoice**](docs/InvoiceActionsApi.md#loadInvoice) | **GET** /invoice/{invoiceID} | 
*InvoiceDataApi* | [**getCancInvoices**](docs/InvoiceDataApi.md#getCancInvoices) | **POST** /invoice/getCancInvoices | GET ALL CANCELLED INVOICES
*InvoiceDataApi* | [**getCompleteInvoices**](docs/InvoiceDataApi.md#getCompleteInvoices) | **POST** /invoice/getCompleteInvoices | GET ALL COMPLETED INVOICES
*InvoiceDataApi* | [**getConfInvoices**](docs/InvoiceDataApi.md#getConfInvoices) | **POST** /invoice/getConfInvoices | GET ALL CONFIRMED INVOICES
*InvoiceDataApi* | [**getInvoiceFromID**](docs/InvoiceDataApi.md#getInvoiceFromID) | **GET** /invoice/getInvoiceFromID/{invoiceID} | GET INVOICE FROM ID
*InvoiceDataApi* | [**getPaidInvoices**](docs/InvoiceDataApi.md#getPaidInvoices) | **POST** /invoice/getPaidInvoices | GET ALL PAID INVOICES
*InvoiceDataApi* | [**getRefundInvoices**](docs/InvoiceDataApi.md#getRefundInvoices) | **POST** /invoice/getRefundInvoices | GET ALL REFUND INVOICES
*InvoiceDataApi* | [**getUnprocessedInvoices**](docs/InvoiceDataApi.md#getUnprocessedInvoices) | **POST** /invoice/getUnprocessedInvoices | GET ALL UNPROCESSED INVOICES
*UserDataApi* | [**getMerchant**](docs/UserDataApi.md#getMerchant) | **GET** /user/getMerchant | GET MERCHANT


## Documentation for Models

 - [ActionAnyContent](docs/ActionAnyContent.md)
 - [FailInvoice](docs/FailInvoice.md)
 - [FailMerchant](docs/FailMerchant.md)
 - [Invoice](docs/Invoice.md)
 - [InvoiceIDFull](docs/InvoiceIDFull.md)
 - [JsValue](docs/JsValue.md)
 - [Merchant](docs/Merchant.md)
 - [NewInvoice](docs/NewInvoice.md)
 - [SuccessInvoice](docs/SuccessInvoice.md)
 - [SuccessInvoices](docs/SuccessInvoices.md)
 - [SuccessMerchant](docs/SuccessMerchant.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



