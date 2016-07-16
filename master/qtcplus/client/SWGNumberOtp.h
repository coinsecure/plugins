/*
 * SWGNumberOtp.h
 * 
 * 
 */

#ifndef SWGNumberOtp_H_
#define SWGNumberOtp_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGNumberOtp: public SWGObject {
public:
    SWGNumberOtp();
    SWGNumberOtp(QString* json);
    virtual ~SWGNumberOtp();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGNumberOtp* fromJson(QString &jsonString);

    QString* getNumber();
    void setNumber(QString* number);
QString* getOtp();
    void setOtp(QString* otp);

private:
    QString* number;
QString* otp;
};

} /* namespace Swagger */

#endif /* SWGNumberOtp_H_ */
