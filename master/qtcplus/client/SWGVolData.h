/*
 * SWGVolData.h
 * 
 * 
 */

#ifndef SWGVolData_H_
#define SWGVolData_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGVolData: public SWGObject {
public:
    SWGVolData();
    SWGVolData(QString* json);
    virtual ~SWGVolData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGVolData* fromJson(QString &jsonString);

    qint64 getVol();
    void setVol(qint64 vol);

private:
    qint64 vol;
};

} /* namespace Swagger */

#endif /* SWGVolData_H_ */
