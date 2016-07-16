/*
 * SWGSignupForm.h
 * 
 * 
 */

#ifndef SWGSignupForm_H_
#define SWGSignupForm_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGSignupForm: public SWGObject {
public:
    SWGSignupForm();
    SWGSignupForm(QString* json);
    virtual ~SWGSignupForm();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGSignupForm* fromJson(QString &jsonString);

    QString* getName();
    void setName(QString* name);
QString* getEmail();
    void setEmail(QString* email);
QString* getPassword();
    void setPassword(QString* password);
QString* getRepeatPassword();
    void setRepeatPassword(QString* repeatPassword);
QString* getRefID();
    void setRefID(QString* refID);

private:
    QString* name;
QString* email;
QString* password;
QString* repeatPassword;
QString* refID;
};

} /* namespace Swagger */

#endif /* SWGSignupForm_H_ */
