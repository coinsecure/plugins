/*
 * SWGLastTradeData.h
 * 
 * 
 */

#ifndef SWGLastTradeData_H_
#define SWGLastTradeData_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGLastTradeData: public SWGObject {
public:
    SWGLastTradeData();
    SWGLastTradeData(QString* json);
    virtual ~SWGLastTradeData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGLastTradeData* fromJson(QString &jsonString);

    qint64 getTime();
    void setTime(qint64 time);
qint64 getAvgRate();
    void setAvgRate(qint64 avgRate);
qint64 getVol();
    void setVol(qint64 vol);
QString* getOrdType();
    void setOrdType(QString* ordType);

private:
    qint64 time;
qint64 avgRate;
qint64 vol;
QString* ordType;
};

} /* namespace Swagger */

#endif /* SWGLastTradeData_H_ */
