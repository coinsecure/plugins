
#include "SWGCode.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGCode::SWGCode(QString* json) {
    init();
    this->fromJson(*json);
}

SWGCode::SWGCode() {
    init();
}

SWGCode::~SWGCode() {
    this->cleanup();
}

void
SWGCode::init() {
    code = new QString("");
}

void
SWGCode::cleanup() {
    if(code != NULL) {
        delete code;
    }
}

SWGCode*
SWGCode::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGCode::fromJsonObject(QJsonObject &pJson) {
    setValue(&code, pJson["code"], "QString", "QString");
}

QString
SWGCode::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGCode::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    
    toJsonValue(QString("code"), code, obj, QString("QString"));
    
        

    return obj;
}

QString*
SWGCode::getCode() {
    return code;
}
void
SWGCode::setCode(QString* code) {
    this->code = code;
}



} /* namespace Swagger */

