/*
 * SWGWithdrawFiat.h
 * 
 * 
 */

#ifndef SWGWithdrawFiat_H_
#define SWGWithdrawFiat_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGWithdrawFiat: public SWGObject {
public:
    SWGWithdrawFiat();
    SWGWithdrawFiat(QString* json);
    virtual ~SWGWithdrawFiat();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGWithdrawFiat* fromJson(QString &jsonString);

    qint64 getFiat();
    void setFiat(qint64 fiat);
QString* getAccount();
    void setAccount(QString* account);
QString* getMsg();
    void setMsg(QString* msg);
QString* getPin();
    void setPin(QString* pin);

private:
    qint64 fiat;
QString* account;
QString* msg;
QString* pin;
};

} /* namespace Swagger */

#endif /* SWGWithdrawFiat_H_ */
