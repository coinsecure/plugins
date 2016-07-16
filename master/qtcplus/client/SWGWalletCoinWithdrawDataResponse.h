/*
 * SWGWalletCoinWithdrawDataResponse.h
 * 
 * 
 */

#ifndef SWGWalletCoinWithdrawDataResponse_H_
#define SWGWalletCoinWithdrawDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGWalletCoinWithdrawData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGWalletCoinWithdrawDataResponse: public SWGObject {
public:
    SWGWalletCoinWithdrawDataResponse();
    SWGWalletCoinWithdrawDataResponse(QString* json);
    virtual ~SWGWalletCoinWithdrawDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGWalletCoinWithdrawDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGWalletCoinWithdrawData*>* getMessage();
    void setMessage(QList<SWGWalletCoinWithdrawData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGWalletCoinWithdrawData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGWalletCoinWithdrawDataResponse_H_ */
