/*
 * SWGEmail.h
 * 
 * 
 */

#ifndef SWGEmail_H_
#define SWGEmail_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGEmail: public SWGObject {
public:
    SWGEmail();
    SWGEmail(QString* json);
    virtual ~SWGEmail();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGEmail* fromJson(QString &jsonString);

    QString* getEmail();
    void setEmail(QString* email);

private:
    QString* email;
};

} /* namespace Swagger */

#endif /* SWGEmail_H_ */
