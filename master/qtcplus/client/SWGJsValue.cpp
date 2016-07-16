
#include "SWGJsValue.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGJsValue::SWGJsValue(QString* json) {
    init();
    this->fromJson(*json);
}

SWGJsValue::SWGJsValue() {
    init();
}

SWGJsValue::~SWGJsValue() {
    this->cleanup();
}

void
SWGJsValue::init() {
    }

void
SWGJsValue::cleanup() {
    }

SWGJsValue*
SWGJsValue::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGJsValue::fromJsonObject(QJsonObject &pJson) {
    }

QString
SWGJsValue::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGJsValue::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    return obj;
}



} /* namespace Swagger */

