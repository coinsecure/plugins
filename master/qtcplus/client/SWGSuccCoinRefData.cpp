
#include "SWGSuccCoinRefData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSuccCoinRefData::SWGSuccCoinRefData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSuccCoinRefData::SWGSuccCoinRefData() {
    init();
}

SWGSuccCoinRefData::~SWGSuccCoinRefData() {
    this->cleanup();
}

void
SWGSuccCoinRefData::init() {
    refPercent = 0.0;
time = 0L;
orderID = new QString("");
refID = new QString("");
tradeID = new QString("");
newUserIDMasked = new QString("");
depositID = new QString("");
amtPaid = 0L;
}

void
SWGSuccCoinRefData::cleanup() {
    

if(orderID != NULL) {
        delete orderID;
    }
if(refID != NULL) {
        delete refID;
    }
if(tradeID != NULL) {
        delete tradeID;
    }
if(newUserIDMasked != NULL) {
        delete newUserIDMasked;
    }
if(depositID != NULL) {
        delete depositID;
    }

}

SWGSuccCoinRefData*
SWGSuccCoinRefData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSuccCoinRefData::fromJsonObject(QJsonObject &pJson) {
    setValue(&refPercent, pJson["refPercent"], "double", "");
setValue(&time, pJson["time"], "qint64", "");
setValue(&orderID, pJson["orderID"], "QString", "QString");
setValue(&refID, pJson["refID"], "QString", "QString");
setValue(&tradeID, pJson["tradeID"], "QString", "QString");
setValue(&newUserIDMasked, pJson["newUserIDMasked"], "QString", "QString");
setValue(&depositID, pJson["depositID"], "QString", "QString");
setValue(&amtPaid, pJson["amtPaid"], "qint64", "");
}

QString
SWGSuccCoinRefData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSuccCoinRefData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("refPercent", QJsonValue(refPercent));
obj->insert("time", QJsonValue(time));

    
    toJsonValue(QString("orderID"), orderID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("refID"), refID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("tradeID"), tradeID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("newUserIDMasked"), newUserIDMasked, obj, QString("QString"));
    
        

    
    toJsonValue(QString("depositID"), depositID, obj, QString("QString"));
    
        
obj->insert("amtPaid", QJsonValue(amtPaid));

    return obj;
}

double
SWGSuccCoinRefData::getRefPercent() {
    return refPercent;
}
void
SWGSuccCoinRefData::setRefPercent(double refPercent) {
    this->refPercent = refPercent;
}

qint64
SWGSuccCoinRefData::getTime() {
    return time;
}
void
SWGSuccCoinRefData::setTime(qint64 time) {
    this->time = time;
}

QString*
SWGSuccCoinRefData::getOrderID() {
    return orderID;
}
void
SWGSuccCoinRefData::setOrderID(QString* orderID) {
    this->orderID = orderID;
}

QString*
SWGSuccCoinRefData::getRefID() {
    return refID;
}
void
SWGSuccCoinRefData::setRefID(QString* refID) {
    this->refID = refID;
}

QString*
SWGSuccCoinRefData::getTradeID() {
    return tradeID;
}
void
SWGSuccCoinRefData::setTradeID(QString* tradeID) {
    this->tradeID = tradeID;
}

QString*
SWGSuccCoinRefData::getNewUserIDMasked() {
    return newUserIDMasked;
}
void
SWGSuccCoinRefData::setNewUserIDMasked(QString* newUserIDMasked) {
    this->newUserIDMasked = newUserIDMasked;
}

QString*
SWGSuccCoinRefData::getDepositID() {
    return depositID;
}
void
SWGSuccCoinRefData::setDepositID(QString* depositID) {
    this->depositID = depositID;
}

qint64
SWGSuccCoinRefData::getAmtPaid() {
    return amtPaid;
}
void
SWGSuccCoinRefData::setAmtPaid(qint64 amtPaid) {
    this->amtPaid = amtPaid;
}



} /* namespace Swagger */

