/*
 * SWGFiatBankData.h
 * 
 * 
 */

#ifndef SWGFiatBankData_H_
#define SWGFiatBankData_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGFiatBankData: public SWGObject {
public:
    SWGFiatBankData();
    SWGFiatBankData(QString* json);
    virtual ~SWGFiatBankData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGFiatBankData* fromJson(QString &jsonString);

    qint64 getTime();
    void setTime(qint64 time);
QString* getStatus();
    void setStatus(QString* status);
qint64 getUpdateTime();
    void setUpdateTime(qint64 updateTime);
QString* getUpdateMessage();
    void setUpdateMessage(QString* updateMessage);
QString* getBankID();
    void setBankID(QString* bankID);
QString* getInfo();
    void setInfo(QString* info);
QString* getAccountNumber();
    void setAccountNumber(QString* accountNumber);
QString* getAccountNick();
    void setAccountNick(QString* accountNick);
QString* getAccountType();
    void setAccountType(QString* accountType);

private:
    qint64 time;
QString* status;
qint64 updateTime;
QString* updateMessage;
QString* bankID;
QString* info;
QString* accountNumber;
QString* accountNick;
QString* accountType;
};

} /* namespace Swagger */

#endif /* SWGFiatBankData_H_ */
