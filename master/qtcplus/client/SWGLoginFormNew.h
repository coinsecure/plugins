/*
 * SWGLoginFormNew.h
 * 
 * 
 */

#ifndef SWGLoginFormNew_H_
#define SWGLoginFormNew_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGLoginFormNew: public SWGObject {
public:
    SWGLoginFormNew();
    SWGLoginFormNew(QString* json);
    virtual ~SWGLoginFormNew();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGLoginFormNew* fromJson(QString &jsonString);

    QString* getEmail();
    void setEmail(QString* email);
QString* getToken();
    void setToken(QString* token);
QString* getPassword();
    void setPassword(QString* password);
QString* getGcmCode();
    void setGcmCode(QString* gcmCode);
QString* getPin();
    void setPin(QString* pin);

private:
    QString* email;
QString* token;
QString* password;
QString* gcmCode;
QString* pin;
};

} /* namespace Swagger */

#endif /* SWGLoginFormNew_H_ */
