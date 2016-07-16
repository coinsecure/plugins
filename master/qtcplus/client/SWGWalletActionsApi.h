#ifndef _SWG_SWGWalletActionsApi_H_
#define _SWG_SWGWalletActionsApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGNewAddress.h"
#include "SWGFailResult.h"
#include "SWGWalletAddressDataResponse.h"
#include "SWGNewWallet.h"
#include "SWGSendCoinWallet.h"
#include "SWGSuccessResult.h"
#include "SWGSendExchange.h"
#include "SWGWithdrawID.h"
#include "SWGCode.h"

#include <QObject>

namespace Swagger {

class SWGWalletActionsApi: public QObject {
    Q_OBJECT

public:
    SWGWalletActionsApi();
    SWGWalletActionsApi(QString host, QString basePath);
    ~SWGWalletActionsApi();

    QString host;
    QString basePath;

    void /v1/user/wallet/coin/address/new(SWGNewAddress body, QString* authorization, QString* accept);
    void /v1/user/wallet/coin/new(SWGNewWallet body, QString* authorization, QString* accept);
    void /v1/user/wallet/coin/withdraw/initiate(SWGSendCoinWallet body, QString* authorization, QString* accept);
    void /v1/user/wallet/coin/withdraw/sendToExchange(SWGSendExchange body, QString* authorization, QString* accept);
    void /v1/user/wallet/coin/withdraw/unverified/cancel(QString* authorization, SWGWithdrawID body, QString* accept);
    void /v1/user/wallet/coin/withdraw/verify(QString* authorization, SWGCode body, QString* accept);
    void /v1/wallet/coin/withdraw/newVerifycode(SWGWithdrawID body, QString* authorization, QString* accept);
    
private:
    void /v1/user/wallet/coin/address/newCallback (HttpRequestWorker * worker);
    void /v1/user/wallet/coin/newCallback (HttpRequestWorker * worker);
    void /v1/user/wallet/coin/withdraw/initiateCallback (HttpRequestWorker * worker);
    void /v1/user/wallet/coin/withdraw/sendToExchangeCallback (HttpRequestWorker * worker);
    void /v1/user/wallet/coin/withdraw/unverified/cancelCallback (HttpRequestWorker * worker);
    void /v1/user/wallet/coin/withdraw/verifyCallback (HttpRequestWorker * worker);
    void /v1/wallet/coin/withdraw/newVerifycodeCallback (HttpRequestWorker * worker);
    
signals:
    void /v1/user/wallet/coin/address/newSignal(SWGWalletAddressDataResponse* summary);
    void /v1/user/wallet/coin/newSignal(SWGWalletAddressDataResponse* summary);
    void /v1/user/wallet/coin/withdraw/initiateSignal(SWGSuccessResult* summary);
    void /v1/user/wallet/coin/withdraw/sendToExchangeSignal(SWGSuccessResult* summary);
    void /v1/user/wallet/coin/withdraw/unverified/cancelSignal(SWGSuccessResult* summary);
    void /v1/user/wallet/coin/withdraw/verifySignal(SWGSuccessResult* summary);
    void /v1/wallet/coin/withdraw/newVerifycodeSignal(SWGSuccessResult* summary);
    
};
}
#endif