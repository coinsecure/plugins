/*
 * SWGTimeKYCData.h
 * 
 * 
 */

#ifndef SWGTimeKYCData_H_
#define SWGTimeKYCData_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGTimeKYCData: public SWGObject {
public:
    SWGTimeKYCData();
    SWGTimeKYCData(QString* json);
    virtual ~SWGTimeKYCData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGTimeKYCData* fromJson(QString &jsonString);

    qint64 getTime();
    void setTime(qint64 time);
qint64 getUpdateTime();
    void setUpdateTime(qint64 updateTime);

private:
    qint64 time;
qint64 updateTime;
};

} /* namespace Swagger */

#endif /* SWGTimeKYCData_H_ */
