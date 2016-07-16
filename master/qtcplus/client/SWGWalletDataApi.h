#ifndef _SWG_SWGWalletDataApi_H_
#define _SWG_SWGWalletDataApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGFailResult.h"
#include "SWGWalletAddressDataResponse.h"
#include "SWGWalletsDataResponse.h"
#include "SWGWalletCoinWithdrawDataResponse.h"

#include <QObject>

namespace Swagger {

class SWGWalletDataApi: public QObject {
    Q_OBJECT

public:
    SWGWalletDataApi();
    SWGWalletDataApi(QString host, QString basePath);
    ~SWGWalletDataApi();

    QString host;
    QString basePath;

    void /v1/user/wallet/coin/address/WalletID(QString* walletID, QString* authorization, QString* accept);
    void /v1/user/wallet/coin/deposit/confirmed/WalletID(QString* walletID, QString* authorization, QString* accept);
    void /v1/user/wallet/coin/deposit/confirmed/all(QString* authorization, QString* accept);
    void /v1/user/wallet/coin/deposit/unconfirmed/WalletID(QString* walletID, QString* authorization, QString* accept);
    void /v1/user/wallet/coin/deposit/unconfirmed/all(QString* authorization, QString* accept);
    void /v1/user/wallet/coin/wallets(QString* authorization, QString* accept);
    void /v1/wallet/withdraw/cancelled(QString* authorization, QString* accept);
    void /v1/wallet/withdraw/completed(QString* authorization, QString* accept);
    void /v1/wallet/withdraw/unverified(QString* authorization, QString* accept);
    void /v1/wallet/withdraw/verified(QString* authorization, QString* accept);
    
private:
    void /v1/user/wallet/coin/address/WalletIDCallback (HttpRequestWorker * worker);
    void /v1/user/wallet/coin/deposit/confirmed/WalletIDCallback (HttpRequestWorker * worker);
    void /v1/user/wallet/coin/deposit/confirmed/allCallback (HttpRequestWorker * worker);
    void /v1/user/wallet/coin/deposit/unconfirmed/WalletIDCallback (HttpRequestWorker * worker);
    void /v1/user/wallet/coin/deposit/unconfirmed/allCallback (HttpRequestWorker * worker);
    void /v1/user/wallet/coin/walletsCallback (HttpRequestWorker * worker);
    void /v1/wallet/withdraw/cancelledCallback (HttpRequestWorker * worker);
    void /v1/wallet/withdraw/completedCallback (HttpRequestWorker * worker);
    void /v1/wallet/withdraw/unverifiedCallback (HttpRequestWorker * worker);
    void /v1/wallet/withdraw/verifiedCallback (HttpRequestWorker * worker);
    
signals:
    void /v1/user/wallet/coin/address/WalletIDSignal(SWGWalletAddressDataResponse* summary);
    void /v1/user/wallet/coin/deposit/confirmed/WalletIDSignal(SWGWalletAddressDataResponse* summary);
    void /v1/user/wallet/coin/deposit/confirmed/allSignal(SWGWalletAddressDataResponse* summary);
    void /v1/user/wallet/coin/deposit/unconfirmed/WalletIDSignal();
    void /v1/user/wallet/coin/deposit/unconfirmed/allSignal();
    void /v1/user/wallet/coin/walletsSignal(SWGWalletsDataResponse* summary);
    void /v1/wallet/withdraw/cancelledSignal(SWGWalletCoinWithdrawDataResponse* summary);
    void /v1/wallet/withdraw/completedSignal(SWGWalletCoinWithdrawDataResponse* summary);
    void /v1/wallet/withdraw/unverifiedSignal(SWGWalletCoinWithdrawDataResponse* summary);
    void /v1/wallet/withdraw/verifiedSignal(SWGWalletCoinWithdrawDataResponse* summary);
    
};
}
#endif