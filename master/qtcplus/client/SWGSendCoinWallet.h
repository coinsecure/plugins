/*
 * SWGSendCoinWallet.h
 * 
 * 
 */

#ifndef SWGSendCoinWallet_H_
#define SWGSendCoinWallet_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGSendCoinWallet: public SWGObject {
public:
    SWGSendCoinWallet();
    SWGSendCoinWallet(QString* json);
    virtual ~SWGSendCoinWallet();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGSendCoinWallet* fromJson(QString &jsonString);

    QString* getWalletID();
    void setWalletID(QString* walletID);
qint64 getAmt();
    void setAmt(qint64 amt);
QString* getToAddr();
    void setToAddr(QString* toAddr);
QString* getMsg();
    void setMsg(QString* msg);
QString* getPin();
    void setPin(QString* pin);

private:
    QString* walletID;
qint64 amt;
QString* toAddr;
QString* msg;
QString* pin;
};

} /* namespace Swagger */

#endif /* SWGSendCoinWallet_H_ */
