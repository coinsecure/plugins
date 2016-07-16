
#include "SWGSuccRefData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSuccRefData::SWGSuccRefData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSuccRefData::SWGSuccRefData() {
    init();
}

SWGSuccRefData::~SWGSuccRefData() {
    this->cleanup();
}

void
SWGSuccRefData::init() {
    refPercent = 0.0;
time = 0L;
refID = new QString("");
emailVerified = false;
kycComplete = false;
btcEarned = 0L;
fiatEarned = 0L;
}

void
SWGSuccRefData::cleanup() {
    

if(refID != NULL) {
        delete refID;
    }




}

SWGSuccRefData*
SWGSuccRefData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSuccRefData::fromJsonObject(QJsonObject &pJson) {
    setValue(&refPercent, pJson["refPercent"], "double", "");
setValue(&time, pJson["time"], "qint64", "");
setValue(&refID, pJson["refID"], "QString", "QString");
setValue(&emailVerified, pJson["emailVerified"], "bool", "");
setValue(&kycComplete, pJson["kycComplete"], "bool", "");
setValue(&btcEarned, pJson["btcEarned"], "qint64", "");
setValue(&fiatEarned, pJson["fiatEarned"], "qint64", "");
}

QString
SWGSuccRefData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSuccRefData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("refPercent", QJsonValue(refPercent));
obj->insert("time", QJsonValue(time));

    
    toJsonValue(QString("refID"), refID, obj, QString("QString"));
    
        
obj->insert("emailVerified", QJsonValue(emailVerified));
obj->insert("kycComplete", QJsonValue(kycComplete));
obj->insert("btcEarned", QJsonValue(btcEarned));
obj->insert("fiatEarned", QJsonValue(fiatEarned));

    return obj;
}

double
SWGSuccRefData::getRefPercent() {
    return refPercent;
}
void
SWGSuccRefData::setRefPercent(double refPercent) {
    this->refPercent = refPercent;
}

qint64
SWGSuccRefData::getTime() {
    return time;
}
void
SWGSuccRefData::setTime(qint64 time) {
    this->time = time;
}

QString*
SWGSuccRefData::getRefID() {
    return refID;
}
void
SWGSuccRefData::setRefID(QString* refID) {
    this->refID = refID;
}

bool
SWGSuccRefData::getEmailVerified() {
    return emailVerified;
}
void
SWGSuccRefData::setEmailVerified(bool emailVerified) {
    this->emailVerified = emailVerified;
}

bool
SWGSuccRefData::getKycComplete() {
    return kycComplete;
}
void
SWGSuccRefData::setKycComplete(bool kycComplete) {
    this->kycComplete = kycComplete;
}

qint64
SWGSuccRefData::getBtcEarned() {
    return btcEarned;
}
void
SWGSuccRefData::setBtcEarned(qint64 btcEarned) {
    this->btcEarned = btcEarned;
}

qint64
SWGSuccRefData::getFiatEarned() {
    return fiatEarned;
}
void
SWGSuccRefData::setFiatEarned(qint64 fiatEarned) {
    this->fiatEarned = fiatEarned;
}



} /* namespace Swagger */

