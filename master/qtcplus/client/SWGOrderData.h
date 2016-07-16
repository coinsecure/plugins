/*
 * SWGOrderData.h
 * 
 * 
 */

#ifndef SWGOrderData_H_
#define SWGOrderData_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGOrderData: public SWGObject {
public:
    SWGOrderData();
    SWGOrderData(QString* json);
    virtual ~SWGOrderData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGOrderData* fromJson(QString &jsonString);

    qint64 getTime();
    void setTime(qint64 time);
qint64 getRate();
    void setRate(qint64 rate);
qint64 getVol();
    void setVol(qint64 vol);
QString* getOrderID();
    void setOrderID(QString* orderID);
QString* getStatus();
    void setStatus(QString* status);

private:
    qint64 time;
qint64 rate;
qint64 vol;
QString* orderID;
QString* status;
};

} /* namespace Swagger */

#endif /* SWGOrderData_H_ */
