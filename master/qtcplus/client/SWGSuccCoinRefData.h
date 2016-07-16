/*
 * SWGSuccCoinRefData.h
 * 
 * 
 */

#ifndef SWGSuccCoinRefData_H_
#define SWGSuccCoinRefData_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGSuccCoinRefData: public SWGObject {
public:
    SWGSuccCoinRefData();
    SWGSuccCoinRefData(QString* json);
    virtual ~SWGSuccCoinRefData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGSuccCoinRefData* fromJson(QString &jsonString);

    double getRefPercent();
    void setRefPercent(double refPercent);
qint64 getTime();
    void setTime(qint64 time);
QString* getOrderID();
    void setOrderID(QString* orderID);
QString* getRefID();
    void setRefID(QString* refID);
QString* getTradeID();
    void setTradeID(QString* tradeID);
QString* getNewUserIDMasked();
    void setNewUserIDMasked(QString* newUserIDMasked);
QString* getDepositID();
    void setDepositID(QString* depositID);
qint64 getAmtPaid();
    void setAmtPaid(qint64 amtPaid);

private:
    double refPercent;
qint64 time;
QString* orderID;
QString* refID;
QString* tradeID;
QString* newUserIDMasked;
QString* depositID;
qint64 amtPaid;
};

} /* namespace Swagger */

#endif /* SWGSuccCoinRefData_H_ */
