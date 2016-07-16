/*
 * SWGChangePassword.h
 * 
 * 
 */

#ifndef SWGChangePassword_H_
#define SWGChangePassword_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGChangePassword: public SWGObject {
public:
    SWGChangePassword();
    SWGChangePassword(QString* json);
    virtual ~SWGChangePassword();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGChangePassword* fromJson(QString &jsonString);

    QString* getPassword();
    void setPassword(QString* password);
QString* getRepeatPassword();
    void setRepeatPassword(QString* repeatPassword);

private:
    QString* password;
QString* repeatPassword;
};

} /* namespace Swagger */

#endif /* SWGChangePassword_H_ */
