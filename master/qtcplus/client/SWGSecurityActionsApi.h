#ifndef _SWG_SWGSecurityActionsApi_H_
#define _SWG_SWGSecurityActionsApi_H_

#include "SWGHttpRequest.h"

#include <QString>
#include "SWGMethodCountryMobile.h"
#include "SWGSuccessResult.h"
#include "SWGFailResult.h"
#include "SWGCode.h"
#include "SWGCodeCountryMobile.h"
#include "SWGChangePassword.h"
#include "SWGResetPassword.h"

#include <QObject>

namespace Swagger {

class SWGSecurityActionsApi: public QObject {
    Q_OBJECT

public:
    SWGSecurityActionsApi();
    SWGSecurityActionsApi(QString host, QString basePath);
    ~SWGSecurityActionsApi();

    QString host;
    QString basePath;

    void /v1/mfa/authy/initiate(SWGMethodCountryMobile body, QString* authorization, QString* accept);
    void /v1/mfa/ga/initiate(SWGMethodCountryMobile body, QString* authorization, QString* accept);
    void /v1/user/mfa/authy/call(QString* authorization, QString* accept);
    void /v1/user/mfa/authy/disable(SWGCode body, QString* authorization, QString* accept);
    void /v1/user/mfa/authy/initiate/enable(SWGCodeCountryMobile body, QString* authorization, QString* accept);
    void /v1/user/mfa/authy/sms(QString* authorization, QString* accept);
    void /v1/user/mfa/ga/disable(SWGCode body, QString* authorization, QString* accept);
    void /v1/user/mfa/ga/initiate/enable(SWGCodeCountryMobile body, QString* authorization, QString* accept);
    void /v1/user/password/change(SWGChangePassword body, QString* authorization, QString* accept);
    void /v1/user/password/reset(SWGResetPassword body, QString* accept);
    
private:
    void /v1/mfa/authy/initiateCallback (HttpRequestWorker * worker);
    void /v1/mfa/ga/initiateCallback (HttpRequestWorker * worker);
    void /v1/user/mfa/authy/callCallback (HttpRequestWorker * worker);
    void /v1/user/mfa/authy/disableCallback (HttpRequestWorker * worker);
    void /v1/user/mfa/authy/initiate/enableCallback (HttpRequestWorker * worker);
    void /v1/user/mfa/authy/smsCallback (HttpRequestWorker * worker);
    void /v1/user/mfa/ga/disableCallback (HttpRequestWorker * worker);
    void /v1/user/mfa/ga/initiate/enableCallback (HttpRequestWorker * worker);
    void /v1/user/password/changeCallback (HttpRequestWorker * worker);
    void /v1/user/password/resetCallback (HttpRequestWorker * worker);
    
signals:
    void /v1/mfa/authy/initiateSignal(SWGSuccessResult* summary);
    void /v1/mfa/ga/initiateSignal(SWGSuccessResult* summary);
    void /v1/user/mfa/authy/callSignal(SWGSuccessResult* summary);
    void /v1/user/mfa/authy/disableSignal(SWGSuccessResult* summary);
    void /v1/user/mfa/authy/initiate/enableSignal(SWGSuccessResult* summary);
    void /v1/user/mfa/authy/smsSignal(SWGSuccessResult* summary);
    void /v1/user/mfa/ga/disableSignal(SWGSuccessResult* summary);
    void /v1/user/mfa/ga/initiate/enableSignal(SWGSuccessResult* summary);
    void /v1/user/password/changeSignal(SWGSuccessResult* summary);
    void /v1/user/password/resetSignal(SWGSuccessResult* summary);
    
};
}
#endif