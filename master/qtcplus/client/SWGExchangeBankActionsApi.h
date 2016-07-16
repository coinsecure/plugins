#ifndef _SWG_SWGExchangeBankActionsApi_H_
#define _SWG_SWGExchangeBankActionsApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGSuccessResult.h"
#include "SWGFailResult.h"
#include "SWGSendCoin.h"
#include "SWGWithdrawID.h"
#include "SWGCode.h"
#include "SWGNewBankForm.h"
#include "SWGDepositID.h"
#include "SWGNewFiatBankDeposit.h"
#include "SWGWithdrawFiat.h"

#include <QObject>

namespace Swagger {

class SWGExchangeBankActionsApi: public QObject {
    Q_OBJECT

public:
    SWGExchangeBankActionsApi();
    SWGExchangeBankActionsApi(QString host, QString basePath);
    ~SWGExchangeBankActionsApi();

    QString host;
    QString basePath;

    void /v1/user/exchange/bank/coin/withdraw/initiate(SWGSendCoin body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/coin/withdraw/newVerifycode(SWGWithdrawID body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/coin/withdraw/unverified/cancel(SWGWithdrawID body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/coin/withdraw/verify(SWGCode body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/account/new(SWGNewBankForm body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/deposit/cancel(SWGDepositID body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/deposit/new(SWGNewFiatBankDeposit body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/withdraw/initiate(SWGWithdrawFiat body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/withdraw/newVerifycode(SWGWithdrawID body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/withdraw/unverified/cancel(SWGWithdrawID body, QString* authorization, QString* accept);
    void /v1/user/exchange/bank/fiat/withdraw/verify(SWGCode body, QString* authorization, QString* accept);
    
private:
    void /v1/user/exchange/bank/coin/withdraw/initiateCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/withdraw/newVerifycodeCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/withdraw/unverified/cancelCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/coin/withdraw/verifyCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/account/newCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/deposit/cancelCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/deposit/newCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/withdraw/initiateCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/withdraw/newVerifycodeCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/withdraw/unverified/cancelCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/bank/fiat/withdraw/verifyCallback (HttpRequestWorker * worker);
    
signals:
    void /v1/user/exchange/bank/coin/withdraw/initiateSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/coin/withdraw/newVerifycodeSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/coin/withdraw/unverified/cancelSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/coin/withdraw/verifySignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/account/newSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/deposit/cancelSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/deposit/newSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/withdraw/initiateSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/withdraw/newVerifycodeSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/withdraw/unverified/cancelSignal(SWGSuccessResult* summary);
    void /v1/user/exchange/bank/fiat/withdraw/verifySignal(SWGSuccessResult* summary);
    
};
}
#endif