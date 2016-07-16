/*
 * SWGAllRefData.h
 * 
 * 
 */

#ifndef SWGAllRefData_H_
#define SWGAllRefData_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGAllRefData: public SWGObject {
public:
    SWGAllRefData();
    SWGAllRefData(QString* json);
    virtual ~SWGAllRefData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGAllRefData* fromJson(QString &jsonString);

    double getRefPercent();
    void setRefPercent(double refPercent);
qint64 getTime();
    void setTime(qint64 time);
QString* getRefID();
    void setRefID(QString* refID);

private:
    double refPercent;
qint64 time;
QString* refID;
};

} /* namespace Swagger */

#endif /* SWGAllRefData_H_ */
