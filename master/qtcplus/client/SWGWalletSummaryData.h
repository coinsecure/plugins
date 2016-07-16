/*
 * SWGWalletSummaryData.h
 * 
 * 
 */

#ifndef SWGWalletSummaryData_H_
#define SWGWalletSummaryData_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGWalletSummaryData: public SWGObject {
public:
    SWGWalletSummaryData();
    SWGWalletSummaryData(QString* json);
    virtual ~SWGWalletSummaryData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGWalletSummaryData* fromJson(QString &jsonString);

    qint64 getWalletConfirmedBalance();
    void setWalletConfirmedBalance(qint64 walletConfirmedBalance);
qint64 getWalletUncofirmedBalance();
    void setWalletUncofirmedBalance(qint64 walletUncofirmedBalance);
bool getHasWalletNetki();
    void setHasWalletNetki(bool hasWalletNetki);
QString* getWalletNetki();
    void setWalletNetki(QString* walletNetki);
QString* getWalletNetkiAddress();
    void setWalletNetkiAddress(QString* walletNetkiAddress);
QString* getWalletNetkiWalletId();
    void setWalletNetkiWalletId(QString* walletNetkiWalletId);

private:
    qint64 walletConfirmedBalance;
qint64 walletUncofirmedBalance;
bool hasWalletNetki;
QString* walletNetki;
QString* walletNetkiAddress;
QString* walletNetkiWalletId;
};

} /* namespace Swagger */

#endif /* SWGWalletSummaryData_H_ */
