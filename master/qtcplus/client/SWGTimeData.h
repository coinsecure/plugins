/*
 * SWGTimeData.h
 * 
 * 
 */

#ifndef SWGTimeData_H_
#define SWGTimeData_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGTimeData: public SWGObject {
public:
    SWGTimeData();
    SWGTimeData(QString* json);
    virtual ~SWGTimeData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGTimeData* fromJson(QString &jsonString);

    qint64 getTime();
    void setTime(qint64 time);
qint64 getVerifiedTime();
    void setVerifiedTime(qint64 verifiedTime);
qint64 getCompletedTime();
    void setCompletedTime(qint64 completedTime);

private:
    qint64 time;
qint64 verifiedTime;
qint64 completedTime;
};

} /* namespace Swagger */

#endif /* SWGTimeData_H_ */
