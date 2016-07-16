/*
 * SWGRateData.h
 * 
 * 
 */

#ifndef SWGRateData_H_
#define SWGRateData_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGRateData: public SWGObject {
public:
    SWGRateData();
    SWGRateData(QString* json);
    virtual ~SWGRateData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGRateData* fromJson(QString &jsonString);

    qint64 getRate();
    void setRate(qint64 rate);

private:
    qint64 rate;
};

} /* namespace Swagger */

#endif /* SWGRateData_H_ */
