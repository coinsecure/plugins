/*
 * SWGConfirmData.h
 * 
 * 
 */

#ifndef SWGConfirmData_H_
#define SWGConfirmData_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGConfirmData: public SWGObject {
public:
    SWGConfirmData();
    SWGConfirmData(QString* json);
    virtual ~SWGConfirmData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGConfirmData* fromJson(QString &jsonString);

    qint64 getConfirmations();
    void setConfirmations(qint64 confirmations);

private:
    qint64 confirmations;
};

} /* namespace Swagger */

#endif /* SWGConfirmData_H_ */
