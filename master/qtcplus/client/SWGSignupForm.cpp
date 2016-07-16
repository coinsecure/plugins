
#include "SWGSignupForm.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSignupForm::SWGSignupForm(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSignupForm::SWGSignupForm() {
    init();
}

SWGSignupForm::~SWGSignupForm() {
    this->cleanup();
}

void
SWGSignupForm::init() {
    name = new QString("");
email = new QString("");
password = new QString("");
repeatPassword = new QString("");
refID = new QString("");
}

void
SWGSignupForm::cleanup() {
    if(name != NULL) {
        delete name;
    }
if(email != NULL) {
        delete email;
    }
if(password != NULL) {
        delete password;
    }
if(repeatPassword != NULL) {
        delete repeatPassword;
    }
if(refID != NULL) {
        delete refID;
    }
}

SWGSignupForm*
SWGSignupForm::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSignupForm::fromJsonObject(QJsonObject &pJson) {
    setValue(&name, pJson["name"], "QString", "QString");
setValue(&email, pJson["email"], "QString", "QString");
setValue(&password, pJson["password"], "QString", "QString");
setValue(&repeatPassword, pJson["repeatPassword"], "QString", "QString");
setValue(&refID, pJson["refID"], "QString", "QString");
}

QString
SWGSignupForm::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSignupForm::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("name"), name, obj, QString("QString"));
    
        

    
    toJsonValue(QString("email"), email, obj, QString("QString"));
    
        

    
    toJsonValue(QString("password"), password, obj, QString("QString"));
    
        

    
    toJsonValue(QString("repeatPassword"), repeatPassword, obj, QString("QString"));
    
        

    
    toJsonValue(QString("refID"), refID, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGSignupForm::getName() {
    return name;
}
void
SWGSignupForm::setName(QString* name) {
    this->name = name;
}

QString*
SWGSignupForm::getEmail() {
    return email;
}
void
SWGSignupForm::setEmail(QString* email) {
    this->email = email;
}

QString*
SWGSignupForm::getPassword() {
    return password;
}
void
SWGSignupForm::setPassword(QString* password) {
    this->password = password;
}

QString*
SWGSignupForm::getRepeatPassword() {
    return repeatPassword;
}
void
SWGSignupForm::setRepeatPassword(QString* repeatPassword) {
    this->repeatPassword = repeatPassword;
}

QString*
SWGSignupForm::getRefID() {
    return refID;
}
void
SWGSignupForm::setRefID(QString* refID) {
    this->refID = refID;
}



} /* namespace Swagger */

