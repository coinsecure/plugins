#ifndef _SWG_SWGBlockchainToolsApi_H_
#define _SWG_SWGBlockchainToolsApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGValidAddressSearchDataResponse.h"
#include "SWGFailResult.h"
#include "SWGConfirmDataResponse.h"

#include <QObject>

namespace Swagger {

class SWGBlockchainToolsApi: public QObject {
    Q_OBJECT

public:
    SWGBlockchainToolsApi();
    SWGBlockchainToolsApi(QString host, QString basePath);
    ~SWGBlockchainToolsApi();

    QString host;
    QString basePath;

    void /v1/bitcoin/search/Address(QString* any, QString* accept);
    void /v1/bitcoin/search/Txid(QString* txid, QString* accept);
    
private:
    void /v1/bitcoin/search/AddressCallback (HttpRequestWorker * worker);
    void /v1/bitcoin/search/TxidCallback (HttpRequestWorker * worker);
    
signals:
    void /v1/bitcoin/search/AddressSignal(SWGValidAddressSearchDataResponse* summary);
    void /v1/bitcoin/search/TxidSignal(SWGConfirmDataResponse* summary);
    
};
}
#endif