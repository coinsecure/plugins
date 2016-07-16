/*
 * SWGUserSummaryData.h
 * 
 * 
 */

#ifndef SWGUserSummaryData_H_
#define SWGUserSummaryData_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGUserSummaryData: public SWGObject {
public:
    SWGUserSummaryData();
    SWGUserSummaryData(QString* json);
    virtual ~SWGUserSummaryData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGUserSummaryData* fromJson(QString &jsonString);

    QString* getKycStatus();
    void setKycStatus(QString* kycStatus);
QString* getBankLinkStatus();
    void setBankLinkStatus(QString* bankLinkStatus);
QString* getTradeReady();
    void setTradeReady(QString* tradeReady);
bool getIsDisabledAccount();
    void setIsDisabledAccount(bool isDisabledAccount);
QString* getFaSecure();
    void setFaSecure(QString* faSecure);
QString* getHasPhone();
    void setHasPhone(QString* hasPhone);

private:
    QString* kycStatus;
QString* bankLinkStatus;
QString* tradeReady;
bool isDisabledAccount;
QString* faSecure;
QString* hasPhone;
};

} /* namespace Swagger */

#endif /* SWGUserSummaryData_H_ */
