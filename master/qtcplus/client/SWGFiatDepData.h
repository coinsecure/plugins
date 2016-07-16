/*
 * SWGFiatDepData.h
 * 
 * 
 */

#ifndef SWGFiatDepData_H_
#define SWGFiatDepData_H_

#include <QJsonObject>


#include "SWGTimeDataCoin.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGFiatDepData: public SWGObject {
public:
    SWGFiatDepData();
    SWGFiatDepData(QString* json);
    virtual ~SWGFiatDepData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGFiatDepData* fromJson(QString &jsonString);

    SWGTimeDataCoin* getTimeDetails();
    void setTimeDetails(SWGTimeDataCoin* timeDetails);
QString* getDepositID();
    void setDepositID(QString* depositID);
qint64 getValue();
    void setValue(qint64 value);
QString* getAccount();
    void setAccount(QString* account);
QString* getReason();
    void setReason(QString* reason);

private:
    SWGTimeDataCoin* timeDetails;
QString* depositID;
qint64 value;
QString* account;
QString* reason;
};

} /* namespace Swagger */

#endif /* SWGFiatDepData_H_ */
