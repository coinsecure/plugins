/*
 * SWGResetPassword.h
 * 
 * 
 */

#ifndef SWGResetPassword_H_
#define SWGResetPassword_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGResetPassword: public SWGObject {
public:
    SWGResetPassword();
    SWGResetPassword(QString* json);
    virtual ~SWGResetPassword();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGResetPassword* fromJson(QString &jsonString);

    QString* getToken();
    void setToken(QString* token);
QString* getPassword();
    void setPassword(QString* password);
QString* getRepeatPassword();
    void setRepeatPassword(QString* repeatPassword);

private:
    QString* token;
QString* password;
QString* repeatPassword;
};

} /* namespace Swagger */

#endif /* SWGResetPassword_H_ */
