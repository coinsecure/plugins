/*
 * SWGWalletCoinWithdrawData.h
 * 
 * 
 */

#ifndef SWGWalletCoinWithdrawData_H_
#define SWGWalletCoinWithdrawData_H_

#include <QJsonObject>


#include "SWGTimeData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGWalletCoinWithdrawData: public SWGObject {
public:
    SWGWalletCoinWithdrawData();
    SWGWalletCoinWithdrawData(QString* json);
    virtual ~SWGWalletCoinWithdrawData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGWalletCoinWithdrawData* fromJson(QString &jsonString);

    SWGTimeData* getTimeDetails();
    void setTimeDetails(SWGTimeData* timeDetails);
QString* getTxID();
    void setTxID(QString* txID);
QString* getMessage();
    void setMessage(QString* message);
qint64 getSatoshis();
    void setSatoshis(qint64 satoshis);
QString* getWalletID();
    void setWalletID(QString* walletID);
QString* getWithdrawID();
    void setWithdrawID(QString* withdrawID);
QString* getSentTo();
    void setSentTo(QString* sentTo);

private:
    SWGTimeData* timeDetails;
QString* txID;
QString* message;
qint64 satoshis;
QString* walletID;
QString* withdrawID;
QString* sentTo;
};

} /* namespace Swagger */

#endif /* SWGWalletCoinWithdrawData_H_ */
