/*
 * SWGMethodCountryMobile.h
 * 
 * 
 */

#ifndef SWGMethodCountryMobile_H_
#define SWGMethodCountryMobile_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGMethodCountryMobile: public SWGObject {
public:
    SWGMethodCountryMobile();
    SWGMethodCountryMobile(QString* json);
    virtual ~SWGMethodCountryMobile();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGMethodCountryMobile* fromJson(QString &jsonString);

    QString* getMethod();
    void setMethod(QString* method);
qint32 getCountryCode();
    void setCountryCode(qint32 countryCode);
qint64 getPhoneNumber();
    void setPhoneNumber(qint64 phoneNumber);

private:
    QString* method;
qint32 countryCode;
qint64 phoneNumber;
};

} /* namespace Swagger */

#endif /* SWGMethodCountryMobile_H_ */
