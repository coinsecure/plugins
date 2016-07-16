/*
 * SWGSendExchange.h
 * 
 * 
 */

#ifndef SWGSendExchange_H_
#define SWGSendExchange_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGSendExchange: public SWGObject {
public:
    SWGSendExchange();
    SWGSendExchange(QString* json);
    virtual ~SWGSendExchange();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGSendExchange* fromJson(QString &jsonString);

    qint64 getAmt();
    void setAmt(qint64 amt);
QString* getWalletID();
    void setWalletID(QString* walletID);
QString* getMsg();
    void setMsg(QString* msg);

private:
    qint64 amt;
QString* walletID;
QString* msg;
};

} /* namespace Swagger */

#endif /* SWGSendExchange_H_ */
