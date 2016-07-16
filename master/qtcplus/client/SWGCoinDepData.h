/*
 * SWGCoinDepData.h
 * 
 * 
 */

#ifndef SWGCoinDepData_H_
#define SWGCoinDepData_H_

#include <QJsonObject>


#include "SWGTimeDataCoin.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGCoinDepData: public SWGObject {
public:
    SWGCoinDepData();
    SWGCoinDepData(QString* json);
    virtual ~SWGCoinDepData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGCoinDepData* fromJson(QString &jsonString);

    SWGTimeDataCoin* getTimeDetails();
    void setTimeDetails(SWGTimeDataCoin* timeDetails);
QString* getAddress();
    void setAddress(QString* address);
qint64 getValue();
    void setValue(qint64 value);
QString* getTxHash();
    void setTxHash(QString* txHash);
QString* getDepositID();
    void setDepositID(QString* depositID);
QString* getReason();
    void setReason(QString* reason);

private:
    SWGTimeDataCoin* timeDetails;
QString* address;
qint64 value;
QString* txHash;
QString* depositID;
QString* reason;
};

} /* namespace Swagger */

#endif /* SWGCoinDepData_H_ */
