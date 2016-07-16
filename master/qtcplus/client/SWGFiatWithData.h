/*
 * SWGFiatWithData.h
 * 
 * 
 */

#ifndef SWGFiatWithData_H_
#define SWGFiatWithData_H_

#include <QJsonObject>


#include "SWGTimeDataCoin.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGFiatWithData: public SWGObject {
public:
    SWGFiatWithData();
    SWGFiatWithData(QString* json);
    virtual ~SWGFiatWithData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGFiatWithData* fromJson(QString &jsonString);

    SWGTimeDataCoin* getTimeDetails();
    void setTimeDetails(SWGTimeDataCoin* timeDetails);
QString* getWithdrawID();
    void setWithdrawID(QString* withdrawID);
qint64 getValue();
    void setValue(qint64 value);
QString* getAccount();
    void setAccount(QString* account);
QString* getReason();
    void setReason(QString* reason);

private:
    SWGTimeDataCoin* timeDetails;
QString* withdrawID;
qint64 value;
QString* account;
QString* reason;
};

} /* namespace Swagger */

#endif /* SWGFiatWithData_H_ */
