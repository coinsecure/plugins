
#include "SWGNewBankForm.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGNewBankForm::SWGNewBankForm(QString* json) {
    init();
    this->fromJson(*json);
}

SWGNewBankForm::SWGNewBankForm() {
    init();
}

SWGNewBankForm::~SWGNewBankForm() {
    this->cleanup();
}

void
SWGNewBankForm::init() {
    acct_nick = new QString("");
name = new QString("");
ban = new QString("");
ifsc = new QString("");
message = new QString("");
banType = new QString("");
phone = new QString("");
otp = new QString("");
}

void
SWGNewBankForm::cleanup() {
    if(acct_nick != NULL) {
        delete acct_nick;
    }
if(name != NULL) {
        delete name;
    }
if(ban != NULL) {
        delete ban;
    }
if(ifsc != NULL) {
        delete ifsc;
    }
if(message != NULL) {
        delete message;
    }
if(banType != NULL) {
        delete banType;
    }
if(phone != NULL) {
        delete phone;
    }
if(otp != NULL) {
        delete otp;
    }
}

SWGNewBankForm*
SWGNewBankForm::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGNewBankForm::fromJsonObject(QJsonObject &pJson) {
    setValue(&acct_nick, pJson["acct_nick"], "QString", "QString");
setValue(&name, pJson["name"], "QString", "QString");
setValue(&ban, pJson["ban"], "QString", "QString");
setValue(&ifsc, pJson["ifsc"], "QString", "QString");
setValue(&message, pJson["message"], "QString", "QString");
setValue(&banType, pJson["banType"], "QString", "QString");
setValue(&phone, pJson["phone"], "QString", "QString");
setValue(&otp, pJson["otp"], "QString", "QString");
}

QString
SWGNewBankForm::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGNewBankForm::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("acct_nick"), acct_nick, obj, QString("QString"));
    
        

    
    toJsonValue(QString("name"), name, obj, QString("QString"));
    
        

    
    toJsonValue(QString("ban"), ban, obj, QString("QString"));
    
        

    
    toJsonValue(QString("ifsc"), ifsc, obj, QString("QString"));
    
        

    
    toJsonValue(QString("message"), message, obj, QString("QString"));
    
        

    
    toJsonValue(QString("banType"), banType, obj, QString("QString"));
    
        

    
    toJsonValue(QString("phone"), phone, obj, QString("QString"));
    
        

    
    toJsonValue(QString("otp"), otp, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGNewBankForm::getAcctNick() {
    return acct_nick;
}
void
SWGNewBankForm::setAcctNick(QString* acct_nick) {
    this->acct_nick = acct_nick;
}

QString*
SWGNewBankForm::getName() {
    return name;
}
void
SWGNewBankForm::setName(QString* name) {
    this->name = name;
}

QString*
SWGNewBankForm::getBan() {
    return ban;
}
void
SWGNewBankForm::setBan(QString* ban) {
    this->ban = ban;
}

QString*
SWGNewBankForm::getIfsc() {
    return ifsc;
}
void
SWGNewBankForm::setIfsc(QString* ifsc) {
    this->ifsc = ifsc;
}

QString*
SWGNewBankForm::getMessage() {
    return message;
}
void
SWGNewBankForm::setMessage(QString* message) {
    this->message = message;
}

QString*
SWGNewBankForm::getBanType() {
    return banType;
}
void
SWGNewBankForm::setBanType(QString* banType) {
    this->banType = banType;
}

QString*
SWGNewBankForm::getPhone() {
    return phone;
}
void
SWGNewBankForm::setPhone(QString* phone) {
    this->phone = phone;
}

QString*
SWGNewBankForm::getOtp() {
    return otp;
}
void
SWGNewBankForm::setOtp(QString* otp) {
    this->otp = otp;
}



} /* namespace Swagger */

