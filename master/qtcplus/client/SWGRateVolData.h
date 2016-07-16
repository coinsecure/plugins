/*
 * SWGRateVolData.h
 * 
 * 
 */

#ifndef SWGRateVolData_H_
#define SWGRateVolData_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGRateVolData: public SWGObject {
public:
    SWGRateVolData();
    SWGRateVolData(QString* json);
    virtual ~SWGRateVolData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGRateVolData* fromJson(QString &jsonString);

    qint64 getRate();
    void setRate(qint64 rate);
qint64 getVol();
    void setVol(qint64 vol);

private:
    qint64 rate;
qint64 vol;
};

} /* namespace Swagger */

#endif /* SWGRateVolData_H_ */
