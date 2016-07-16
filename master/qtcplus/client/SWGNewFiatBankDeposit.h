/*
 * SWGNewFiatBankDeposit.h
 * 
 * 
 */

#ifndef SWGNewFiatBankDeposit_H_
#define SWGNewFiatBankDeposit_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGNewFiatBankDeposit: public SWGObject {
public:
    SWGNewFiatBankDeposit();
    SWGNewFiatBankDeposit(QString* json);
    virtual ~SWGNewFiatBankDeposit();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGNewFiatBankDeposit* fromJson(QString &jsonString);

    qint64 getAmount();
    void setAmount(qint64 amount);
QString* getMessage();
    void setMessage(QString* message);
QString* getBank();
    void setBank(QString* bank);
QString* getDepType();
    void setDepType(QString* depType);

private:
    qint64 amount;
QString* message;
QString* bank;
QString* depType;
};

} /* namespace Swagger */

#endif /* SWGNewFiatBankDeposit_H_ */
