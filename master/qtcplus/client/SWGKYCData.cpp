
#include "SWGKYCData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGKYCData::SWGKYCData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGKYCData::SWGKYCData() {
    init();
}

SWGKYCData::~SWGKYCData() {
    this->cleanup();
}

void
SWGKYCData::init() {
    timeDetails = new SWGTimeKYCData();
kycID = new QString("");
firstName = new QString("");
lastName = new QString("");
status = new QString("");
userType = new QString("");
info = new QString("");
}

void
SWGKYCData::cleanup() {
    if(timeDetails != NULL) {
        delete timeDetails;
    }
if(kycID != NULL) {
        delete kycID;
    }
if(firstName != NULL) {
        delete firstName;
    }
if(lastName != NULL) {
        delete lastName;
    }
if(status != NULL) {
        delete status;
    }
if(userType != NULL) {
        delete userType;
    }
if(info != NULL) {
        delete info;
    }
}

SWGKYCData*
SWGKYCData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGKYCData::fromJsonObject(QJsonObject &pJson) {
    setValue(&timeDetails, pJson["timeDetails"], "SWGTimeKYCData", "SWGTimeKYCData");
setValue(&kycID, pJson["kycID"], "QString", "QString");
setValue(&firstName, pJson["firstName"], "QString", "QString");
setValue(&lastName, pJson["lastName"], "QString", "QString");
setValue(&status, pJson["status"], "QString", "QString");
setValue(&userType, pJson["userType"], "QString", "QString");
setValue(&info, pJson["info"], "QString", "QString");
}

QString
SWGKYCData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGKYCData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("timeDetails"), timeDetails, obj, QString("SWGTimeKYCData"));
    
        

    
    toJsonValue(QString("kycID"), kycID, obj, QString("QString"));
    
        

    
    toJsonValue(QString("firstName"), firstName, obj, QString("QString"));
    
        

    
    toJsonValue(QString("lastName"), lastName, obj, QString("QString"));
    
        

    
    toJsonValue(QString("status"), status, obj, QString("QString"));
    
        

    
    toJsonValue(QString("userType"), userType, obj, QString("QString"));
    
        

    
    toJsonValue(QString("info"), info, obj, QString("QString"));
    
        

    return obj;
}

SWGTimeKYCData*
SWGKYCData::getTimeDetails() {
    return timeDetails;
}
void
SWGKYCData::setTimeDetails(SWGTimeKYCData* timeDetails) {
    this->timeDetails = timeDetails;
}

QString*
SWGKYCData::getKycID() {
    return kycID;
}
void
SWGKYCData::setKycID(QString* kycID) {
    this->kycID = kycID;
}

QString*
SWGKYCData::getFirstName() {
    return firstName;
}
void
SWGKYCData::setFirstName(QString* firstName) {
    this->firstName = firstName;
}

QString*
SWGKYCData::getLastName() {
    return lastName;
}
void
SWGKYCData::setLastName(QString* lastName) {
    this->lastName = lastName;
}

QString*
SWGKYCData::getStatus() {
    return status;
}
void
SWGKYCData::setStatus(QString* status) {
    this->status = status;
}

QString*
SWGKYCData::getUserType() {
    return userType;
}
void
SWGKYCData::setUserType(QString* userType) {
    this->userType = userType;
}

QString*
SWGKYCData::getInfo() {
    return info;
}
void
SWGKYCData::setInfo(QString* info) {
    this->info = info;
}



} /* namespace Swagger */

