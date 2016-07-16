/*
 * SWGTradeCoinWithdrawData.h
 * 
 * 
 */

#ifndef SWGTradeCoinWithdrawData_H_
#define SWGTradeCoinWithdrawData_H_

#include <QJsonObject>


#include "SWGTimeData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGTradeCoinWithdrawData: public SWGObject {
public:
    SWGTradeCoinWithdrawData();
    SWGTradeCoinWithdrawData(QString* json);
    virtual ~SWGTradeCoinWithdrawData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGTradeCoinWithdrawData* fromJson(QString &jsonString);

    SWGTimeData* getTimeDetails();
    void setTimeDetails(SWGTimeData* timeDetails);
QString* getAddress();
    void setAddress(QString* address);
qint64 getValue();
    void setValue(qint64 value);
qint64 getFees();
    void setFees(qint64 fees);
QString* getWithdrawID();
    void setWithdrawID(QString* withdrawID);
QString* getTxHash();
    void setTxHash(QString* txHash);

private:
    SWGTimeData* timeDetails;
QString* address;
qint64 value;
qint64 fees;
QString* withdrawID;
QString* txHash;
};

} /* namespace Swagger */

#endif /* SWGTradeCoinWithdrawData_H_ */
