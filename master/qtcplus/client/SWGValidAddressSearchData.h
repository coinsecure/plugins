/*
 * SWGValidAddressSearchData.h
 * 
 * 
 */

#ifndef SWGValidAddressSearchData_H_
#define SWGValidAddressSearchData_H_

#include <QJsonObject>


#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGValidAddressSearchData: public SWGObject {
public:
    SWGValidAddressSearchData();
    SWGValidAddressSearchData(QString* json);
    virtual ~SWGValidAddressSearchData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGValidAddressSearchData* fromJson(QString &jsonString);

    QString* getAddress();
    void setAddress(QString* address);
qint64 getBalance();
    void setBalance(qint64 balance);
qint64 getTotalReceived();
    void setTotalReceived(qint64 totalReceived);
qint64 getUnconfirmedBalance();
    void setUnconfirmedBalance(qint64 unconfirmedBalance);
qint32 getUnconfirmedTxApperances();
    void setUnconfirmedTxApperances(qint32 unconfirmedTxApperances);
qint32 getTxApperances();
    void setTxApperances(qint32 txApperances);
QList<QString*>* getTransactions();
    void setTransactions(QList<QString*>* transactions);

private:
    QString* address;
qint64 balance;
qint64 totalReceived;
qint64 unconfirmedBalance;
qint32 unconfirmedTxApperances;
qint32 txApperances;
QList<QString*>* transactions;
};

} /* namespace Swagger */

#endif /* SWGValidAddressSearchData_H_ */
