/*
 * SWGSuccessInitiateLoginResponse.h
 * 
 * 
 */

#ifndef SWGSuccessInitiateLoginResponse_H_
#define SWGSuccessInitiateLoginResponse_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGSuccessInitiateLoginResponse: public SWGObject {
public:
    SWGSuccessInitiateLoginResponse();
    SWGSuccessInitiateLoginResponse(QString* json);
    virtual ~SWGSuccessInitiateLoginResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGSuccessInitiateLoginResponse* fromJson(QString &jsonString);

    QString* getInfo();
    void setInfo(QString* info);
qint64 getValidTill();
    void setValidTill(qint64 validTill);
QString* getMfa();
    void setMfa(QString* mfa);
QString* getToken();
    void setToken(QString* token);

private:
    QString* info;
qint64 validTill;
QString* mfa;
QString* token;
};

} /* namespace Swagger */

#endif /* SWGSuccessInitiateLoginResponse_H_ */
