/*
 * SWGLoginId.h
 * 
 * 
 */

#ifndef SWGLoginId_H_
#define SWGLoginId_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGLoginId: public SWGObject {
public:
    SWGLoginId();
    SWGLoginId(QString* json);
    virtual ~SWGLoginId();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGLoginId* fromJson(QString &jsonString);

    QString* getLoginID();
    void setLoginID(QString* loginID);

private:
    QString* loginID;
};

} /* namespace Swagger */

#endif /* SWGLoginId_H_ */
