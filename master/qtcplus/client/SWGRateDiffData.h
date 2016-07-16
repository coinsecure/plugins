/*
 * SWGRateDiffData.h
 * 
 * 
 */

#ifndef SWGRateDiffData_H_
#define SWGRateDiffData_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGRateDiffData: public SWGObject {
public:
    SWGRateDiffData();
    SWGRateDiffData(QString* json);
    virtual ~SWGRateDiffData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGRateDiffData* fromJson(QString &jsonString);

    qint64 getRate();
    void setRate(qint64 rate);
qint64 getDifference();
    void setDifference(qint64 difference);

private:
    qint64 rate;
qint64 difference;
};

} /* namespace Swagger */

#endif /* SWGRateDiffData_H_ */
