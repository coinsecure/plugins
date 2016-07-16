#include "SWGBlockchainToolsApi.h"
#include "SWGHelpers.h"
#include "SWGModelFactory.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace Swagger {
SWGBlockchainToolsApi::SWGBlockchainToolsApi() {}

SWGBlockchainToolsApi::~SWGBlockchainToolsApi() {}

SWGBlockchainToolsApi::SWGBlockchainToolsApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
SWGBlockchainToolsApi::/v1/bitcoin/search/Address(QString* any, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/bitcoin/search/{any}");

    QString anyPathParam("{"); anyPathParam.append("any").append("}");
    fullPath.replace(anyPathParam, stringValue(any));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGBlockchainToolsApi::/v1/bitcoin/search/AddressCallback);

    worker->execute(&input);
}

void
SWGBlockchainToolsApi::/v1/bitcoin/search/AddressCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGValidAddressSearchDataResponse* output = static_cast<SWGValidAddressSearchDataResponse*>(create(json, QString("SWGValidAddressSearchDataResponse")));
    

    worker->deleteLater();

    emit /v1/bitcoin/search/AddressSignal(output);
    
}
void
SWGBlockchainToolsApi::/v1/bitcoin/search/Txid(QString* txid, QString* accept) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/v1/bitcoin/search/confirmation/{txid}");

    QString txidPathParam("{"); txidPathParam.append("txid").append("}");
    fullPath.replace(txidPathParam, stringValue(txid));


    HttpRequestWorker *worker = new HttpRequestWorker();
    HttpRequestInput input(fullPath, "GET");

    


    // TODO: add header support

    connect(worker,
            &HttpRequestWorker::on_execution_finished,
            this,
            &SWGBlockchainToolsApi::/v1/bitcoin/search/TxidCallback);

    worker->execute(&input);
}

void
SWGBlockchainToolsApi::/v1/bitcoin/search/TxidCallback(HttpRequestWorker * worker) {
    QString msg;
    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    
        QString json(worker->response);
    SWGConfirmDataResponse* output = static_cast<SWGConfirmDataResponse*>(create(json, QString("SWGConfirmDataResponse")));
    

    worker->deleteLater();

    emit /v1/bitcoin/search/TxidSignal(output);
    
}
} /* namespace Swagger */
