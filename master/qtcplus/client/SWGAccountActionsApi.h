#ifndef _SWG_SWGAccountActionsApi_H_
#define _SWG_SWGAccountActionsApi_H_

#include "SWGHttpRequest.h"

#include "SWGLoginFormNew.h"
#include <QString>
#include "SWGFailResult.h"
#include "SWGStandardLoginResultData.h"
#include "SWGStandardInitiateLoginResultData.h"
#include "SWGLoginId.h"
#include "SWGSuccessResult.h"
#include "SWGEmail.h"
#include "SWGSignupForm.h"
#include "SWGHttpRequest.h"
#include "SWGNetkiNameAddress.h"
#include "SWGAddress.h"
#include "SWGNetkiName.h"
#include "SWGNumberOtp.h"

#include <QObject>

namespace Swagger {

class SWGAccountActionsApi: public QObject {
    Q_OBJECT

public:
    SWGAccountActionsApi();
    SWGAccountActionsApi(QString host, QString basePath);
    ~SWGAccountActionsApi();

    QString host;
    QString basePath;

    void /v1/login(SWGLoginFormNew body, QString* accept);
    void /v1/login/initiate(SWGLoginId body, QString* accept);
    void /v1/login/password/forgot(SWGEmail body, QString* accept);
    void /v1/signup(SWGSignupForm body, QString* accept);
    void /v1/user/bank/otp/Number(QString* number, QString* authorization, QString* accept);
    void /v1/user/exchange/kyc(QString* panNumber, QString* acctNick, QString* name, QString* ban, QString* ifsc, QString* acctType, QString* banType, QString* phone, QString* otp, SWGHttpRequestInputFileElement* file, QString* authorization, QString* message, QString* accept);
    void /v1/user/gcm/Code(QString* code, QString* authorization, QString* accept);
    void /v1/user/kyc/otp/Number(QString* number, QString* authorization, QString* accept);
    void /v1/user/logout(QString* authorization, QString* accept);
    void /v1/user/netki/create(SWGNetkiNameAddress body, QString* authorization, QString* accept);
    void /v1/user/netki/update(SWGAddress body, QString* authorization, QString* accept);
    void /v1/user/profile/image/delete(SWGNetkiName body, QString* authorization, QString* accept);
    void /v1/user/profile/image/update(QString* netkiName, bool isPublic, SWGHttpRequestInputFileElement* file, QString* authorization, QString* accept);
    void /v1/user/profile/phone(SWGNumberOtp body, QString* authorization, QString* accept);
    void /v1/user/profile/phone/Number(QString* authorization, QString* accept);
    void /v1/user/profile/phone/otp/Number(QString* number, QString* authorization, QString* accept);
    
private:
    void /v1/loginCallback (HttpRequestWorker * worker);
    void /v1/login/initiateCallback (HttpRequestWorker * worker);
    void /v1/login/password/forgotCallback (HttpRequestWorker * worker);
    void /v1/signupCallback (HttpRequestWorker * worker);
    void /v1/user/bank/otp/NumberCallback (HttpRequestWorker * worker);
    void /v1/user/exchange/kycCallback (HttpRequestWorker * worker);
    void /v1/user/gcm/CodeCallback (HttpRequestWorker * worker);
    void /v1/user/kyc/otp/NumberCallback (HttpRequestWorker * worker);
    void /v1/user/logoutCallback (HttpRequestWorker * worker);
    void /v1/user/netki/createCallback (HttpRequestWorker * worker);
    void /v1/user/netki/updateCallback (HttpRequestWorker * worker);
    void /v1/user/profile/image/deleteCallback (HttpRequestWorker * worker);
    void /v1/user/profile/image/updateCallback (HttpRequestWorker * worker);
    void /v1/user/profile/phoneCallback (HttpRequestWorker * worker);
    void /v1/user/profile/phone/NumberCallback (HttpRequestWorker * worker);
    void /v1/user/profile/phone/otp/NumberCallback (HttpRequestWorker * worker);
    
signals:
    void /v1/loginSignal(SWGStandardLoginResultData* summary);
    void /v1/login/initiateSignal(SWGStandardInitiateLoginResultData* summary);
    void /v1/login/password/forgotSignal(SWGSuccessResult* summary);
    void /v1/signupSignal(SWGSuccessResult* summary);
    void /v1/user/bank/otp/NumberSignal(SWGStandardInitiateLoginResultData* summary);
    void /v1/user/exchange/kycSignal(SWGSuccessResult* summary);
    void /v1/user/gcm/CodeSignal(SWGSuccessResult* summary);
    void /v1/user/kyc/otp/NumberSignal(SWGSuccessResult* summary);
    void /v1/user/logoutSignal(SWGSuccessResult* summary);
    void /v1/user/netki/createSignal(SWGSuccessResult* summary);
    void /v1/user/netki/updateSignal(SWGSuccessResult* summary);
    void /v1/user/profile/image/deleteSignal(SWGSuccessResult* summary);
    void /v1/user/profile/image/updateSignal(SWGSuccessResult* summary);
    void /v1/user/profile/phoneSignal(SWGSuccessResult* summary);
    void /v1/user/profile/phone/NumberSignal(SWGSuccessResult* summary);
    void /v1/user/profile/phone/otp/NumberSignal(SWGSuccessResult* summary);
    
};
}
#endif