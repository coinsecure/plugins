
#include "SWGValidAddressSearchData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGValidAddressSearchData::SWGValidAddressSearchData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGValidAddressSearchData::SWGValidAddressSearchData() {
    init();
}

SWGValidAddressSearchData::~SWGValidAddressSearchData() {
    this->cleanup();
}

void
SWGValidAddressSearchData::init() {
    address = new QString("");
balance = 0L;
totalReceived = 0L;
unconfirmedBalance = 0L;
unconfirmedTxApperances = 0;
txApperances = 0;
transactions = new QList<QString*>();
}

void
SWGValidAddressSearchData::cleanup() {
    if(address != NULL) {
        delete address;
    }





if(transactions != NULL) {
        QList<QString*>* arr = transactions;
        foreach(QString* o, *arr) {
            delete o;
        }
        delete transactions;
    }
}

SWGValidAddressSearchData*
SWGValidAddressSearchData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGValidAddressSearchData::fromJsonObject(QJsonObject &pJson) {
    setValue(&address, pJson["address"], "QString", "QString");
setValue(&balance, pJson["balance"], "qint64", "");
setValue(&totalReceived, pJson["totalReceived"], "qint64", "");
setValue(&unconfirmedBalance, pJson["unconfirmedBalance"], "qint64", "");
setValue(&unconfirmedTxApperances, pJson["unconfirmedTxApperances"], "qint32", "");
setValue(&txApperances, pJson["txApperances"], "qint32", "");
setValue(&transactions, pJson["transactions"], "QList", "QString");
}

QString
SWGValidAddressSearchData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGValidAddressSearchData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("address"), address, obj, QString("QString"));
    
        
obj->insert("balance", QJsonValue(balance));
obj->insert("totalReceived", QJsonValue(totalReceived));
obj->insert("unconfirmedBalance", QJsonValue(unconfirmedBalance));
obj->insert("unconfirmedTxApperances", QJsonValue(unconfirmedTxApperances));
obj->insert("txApperances", QJsonValue(txApperances));

    
    QList<QString*>* transactionsList = transactions;
    QJsonArray transactionsJsonArray;
    toJsonArray((QList<void*>*)transactions, &transactionsJsonArray, "transactions", "QString");

    obj->insert("transactions", transactionsJsonArray);
    

    return obj;
}

QString*
SWGValidAddressSearchData::getAddress() {
    return address;
}
void
SWGValidAddressSearchData::setAddress(QString* address) {
    this->address = address;
}

qint64
SWGValidAddressSearchData::getBalance() {
    return balance;
}
void
SWGValidAddressSearchData::setBalance(qint64 balance) {
    this->balance = balance;
}

qint64
SWGValidAddressSearchData::getTotalReceived() {
    return totalReceived;
}
void
SWGValidAddressSearchData::setTotalReceived(qint64 totalReceived) {
    this->totalReceived = totalReceived;
}

qint64
SWGValidAddressSearchData::getUnconfirmedBalance() {
    return unconfirmedBalance;
}
void
SWGValidAddressSearchData::setUnconfirmedBalance(qint64 unconfirmedBalance) {
    this->unconfirmedBalance = unconfirmedBalance;
}

qint32
SWGValidAddressSearchData::getUnconfirmedTxApperances() {
    return unconfirmedTxApperances;
}
void
SWGValidAddressSearchData::setUnconfirmedTxApperances(qint32 unconfirmedTxApperances) {
    this->unconfirmedTxApperances = unconfirmedTxApperances;
}

qint32
SWGValidAddressSearchData::getTxApperances() {
    return txApperances;
}
void
SWGValidAddressSearchData::setTxApperances(qint32 txApperances) {
    this->txApperances = txApperances;
}

QList<QString*>*
SWGValidAddressSearchData::getTransactions() {
    return transactions;
}
void
SWGValidAddressSearchData::setTransactions(QList<QString*>* transactions) {
    this->transactions = transactions;
}



} /* namespace Swagger */

