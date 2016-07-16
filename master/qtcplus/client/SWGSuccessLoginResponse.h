/*
 * SWGSuccessLoginResponse.h
 * 
 * 
 */

#ifndef SWGSuccessLoginResponse_H_
#define SWGSuccessLoginResponse_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGSuccessLoginResponse: public SWGObject {
public:
    SWGSuccessLoginResponse();
    SWGSuccessLoginResponse(QString* json);
    virtual ~SWGSuccessLoginResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGSuccessLoginResponse* fromJson(QString &jsonString);

    QString* getInfo();
    void setInfo(QString* info);
QString* getKeyType();
    void setKeyType(QString* keyType);
QString* getKeyNeeded();
    void setKeyNeeded(QString* keyNeeded);

private:
    QString* info;
QString* keyType;
QString* keyNeeded;
};

} /* namespace Swagger */

#endif /* SWGSuccessLoginResponse_H_ */
