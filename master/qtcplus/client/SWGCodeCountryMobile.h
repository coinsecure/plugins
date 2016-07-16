/*
 * SWGCodeCountryMobile.h
 * 
 * 
 */

#ifndef SWGCodeCountryMobile_H_
#define SWGCodeCountryMobile_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGCodeCountryMobile: public SWGObject {
public:
    SWGCodeCountryMobile();
    SWGCodeCountryMobile(QString* json);
    virtual ~SWGCodeCountryMobile();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGCodeCountryMobile* fromJson(QString &jsonString);

    QString* getCode();
    void setCode(QString* code);
qint32 getCountryCode();
    void setCountryCode(qint32 countryCode);
qint64 getPhoneNumber();
    void setPhoneNumber(qint64 phoneNumber);

private:
    QString* code;
qint32 countryCode;
qint64 phoneNumber;
};

} /* namespace Swagger */

#endif /* SWGCodeCountryMobile_H_ */
