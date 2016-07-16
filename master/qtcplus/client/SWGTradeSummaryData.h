/*
 * SWGTradeSummaryData.h
 * 
 * 
 */

#ifndef SWGTradeSummaryData_H_
#define SWGTradeSummaryData_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGTradeSummaryData: public SWGObject {
public:
    SWGTradeSummaryData();
    SWGTradeSummaryData(QString* json);
    virtual ~SWGTradeSummaryData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGTradeSummaryData* fromJson(QString &jsonString);

    qint64 getCompletedAsksSum();
    void setCompletedAsksSum(qint64 completedAsksSum);
qint64 getCompletedBidsSum();
    void setCompletedBidsSum(qint64 completedBidsSum);
qint64 getCompletedAsksCount();
    void setCompletedAsksCount(qint64 completedAsksCount);
qint64 getCompletedBidsCount();
    void setCompletedBidsCount(qint64 completedBidsCount);
qint64 getPendingAsksCount();
    void setPendingAsksCount(qint64 pendingAsksCount);
qint64 getPendingBidsCount();
    void setPendingBidsCount(qint64 pendingBidsCount);

private:
    qint64 completedAsksSum;
qint64 completedBidsSum;
qint64 completedAsksCount;
qint64 completedBidsCount;
qint64 pendingAsksCount;
qint64 pendingBidsCount;
};

} /* namespace Swagger */

#endif /* SWGTradeSummaryData_H_ */
