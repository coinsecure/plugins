/*
 * SWGNewBankForm.h
 * 
 * 
 */

#ifndef SWGNewBankForm_H_
#define SWGNewBankForm_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGNewBankForm: public SWGObject {
public:
    SWGNewBankForm();
    SWGNewBankForm(QString* json);
    virtual ~SWGNewBankForm();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGNewBankForm* fromJson(QString &jsonString);

    QString* getAcctNick();
    void setAcctNick(QString* acct_nick);
QString* getName();
    void setName(QString* name);
QString* getBan();
    void setBan(QString* ban);
QString* getIfsc();
    void setIfsc(QString* ifsc);
QString* getMessage();
    void setMessage(QString* message);
QString* getBanType();
    void setBanType(QString* banType);
QString* getPhone();
    void setPhone(QString* phone);
QString* getOtp();
    void setOtp(QString* otp);

private:
    QString* acct_nick;
QString* name;
QString* ban;
QString* ifsc;
QString* message;
QString* banType;
QString* phone;
QString* otp;
};

} /* namespace Swagger */

#endif /* SWGNewBankForm_H_ */
