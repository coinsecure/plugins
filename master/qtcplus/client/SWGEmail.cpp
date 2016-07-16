
#include "SWGEmail.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGEmail::SWGEmail(QString* json) {
    init();
    this->fromJson(*json);
}

SWGEmail::SWGEmail() {
    init();
}

SWGEmail::~SWGEmail() {
    this->cleanup();
}

void
SWGEmail::init() {
    email = new QString("");
}

void
SWGEmail::cleanup() {
    if(email != NULL) {
        delete email;
    }
}

SWGEmail*
SWGEmail::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGEmail::fromJsonObject(QJsonObject &pJson) {
    setValue(&email, pJson["email"], "QString", "QString");
}

QString
SWGEmail::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGEmail::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("email"), email, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGEmail::getEmail() {
    return email;
}
void
SWGEmail::setEmail(QString* email) {
    this->email = email;
}



} /* namespace Swagger */

