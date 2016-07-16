/*
 * SWGSendCoin.h
 * 
 * 
 */

#ifndef SWGSendCoin_H_
#define SWGSendCoin_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGSendCoin: public SWGObject {
public:
    SWGSendCoin();
    SWGSendCoin(QString* json);
    virtual ~SWGSendCoin();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGSendCoin* fromJson(QString &jsonString);

    qint64 getSatoshis();
    void setSatoshis(qint64 satoshis);
QString* getToAddr();
    void setToAddr(QString* toAddr);
QString* getMsg();
    void setMsg(QString* msg);
QString* getPin();
    void setPin(QString* pin);

private:
    qint64 satoshis;
QString* toAddr;
QString* msg;
QString* pin;
};

} /* namespace Swagger */

#endif /* SWGSendCoin_H_ */
