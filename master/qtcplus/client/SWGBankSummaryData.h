/*
 * SWGBankSummaryData.h
 * 
 * 
 */

#ifndef SWGBankSummaryData_H_
#define SWGBankSummaryData_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGBankSummaryData: public SWGObject {
public:
    SWGBankSummaryData();
    SWGBankSummaryData(QString* json);
    virtual ~SWGBankSummaryData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGBankSummaryData* fromJson(QString &jsonString);

    qint64 getPendingCoinBalance();
    void setPendingCoinBalance(qint64 pendingCoinBalance);
qint64 getPendingFiatBalance();
    void setPendingFiatBalance(qint64 pendingFiatBalance);
qint64 getAvailableCoinBalance();
    void setAvailableCoinBalance(qint64 availableCoinBalance);
qint64 getAvailableFiatBalance();
    void setAvailableFiatBalance(qint64 availableFiatBalance);
qint64 getTotalCoinBalance();
    void setTotalCoinBalance(qint64 totalCoinBalance);
qint64 getTotalFiatBalance();
    void setTotalFiatBalance(qint64 totalFiatBalance);
double getCoinFeePercentage();
    void setCoinFeePercentage(double coinFeePercentage);
double getFiatFeePercentage();
    void setFiatFeePercentage(double fiatFeePercentage);
QString* getBankLinkStatus();
    void setBankLinkStatus(QString* bankLinkStatus);
bool getHasTradeNetki();
    void setHasTradeNetki(bool hasTradeNetki);
QString* getTradeNetkiName();
    void setTradeNetkiName(QString* tradeNetkiName);
QString* getTradeNetkiAddress();
    void setTradeNetkiAddress(QString* tradeNetkiAddress);

private:
    qint64 pendingCoinBalance;
qint64 pendingFiatBalance;
qint64 availableCoinBalance;
qint64 availableFiatBalance;
qint64 totalCoinBalance;
qint64 totalFiatBalance;
double coinFeePercentage;
double fiatFeePercentage;
QString* bankLinkStatus;
bool hasTradeNetki;
QString* tradeNetkiName;
QString* tradeNetkiAddress;
};

} /* namespace Swagger */

#endif /* SWGBankSummaryData_H_ */
