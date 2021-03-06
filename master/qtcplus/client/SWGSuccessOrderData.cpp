/**
 * Coinsecure Api Documentation
 * To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.
 *
 * OpenAPI spec version: beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


#include "SWGSuccessOrderData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSuccessOrderData::SWGSuccessOrderData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSuccessOrderData::SWGSuccessOrderData() {
    init();
}

SWGSuccessOrderData::~SWGSuccessOrderData() {
    this->cleanup();
}

void
SWGSuccessOrderData::init() {
    time = 0L;
    vol = 0L;
    rate = 0L;
    order_id = new QString("");
    status = new QString("");
    human_time = new QString("");
}

void
SWGSuccessOrderData::cleanup() {
    



    if(order_id != nullptr) {
        delete order_id;
    }

    if(status != nullptr) {
        delete status;
    }

    if(human_time != nullptr) {
        delete human_time;
    }
}

SWGSuccessOrderData*
SWGSuccessOrderData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSuccessOrderData::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&time, pJson["time"], "qint64", "");
    ::Swagger::setValue(&vol, pJson["vol"], "qint64", "");
    ::Swagger::setValue(&rate, pJson["rate"], "qint64", "");
    ::Swagger::setValue(&order_id, pJson["order_id"], "QString", "QString");
    ::Swagger::setValue(&status, pJson["status"], "QString", "QString");
    ::Swagger::setValue(&human_time, pJson["human_time"], "QString", "QString");
}

QString
SWGSuccessOrderData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSuccessOrderData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    obj->insert("time", QJsonValue(time));

    obj->insert("vol", QJsonValue(vol));

    obj->insert("rate", QJsonValue(rate));

    toJsonValue(QString("order_id"), order_id, obj, QString("QString"));

    toJsonValue(QString("status"), status, obj, QString("QString"));

    toJsonValue(QString("human_time"), human_time, obj, QString("QString"));

    return obj;
}

qint64
SWGSuccessOrderData::getTime() {
    return time;
}
void
SWGSuccessOrderData::setTime(qint64 time) {
    this->time = time;
}

qint64
SWGSuccessOrderData::getVol() {
    return vol;
}
void
SWGSuccessOrderData::setVol(qint64 vol) {
    this->vol = vol;
}

qint64
SWGSuccessOrderData::getRate() {
    return rate;
}
void
SWGSuccessOrderData::setRate(qint64 rate) {
    this->rate = rate;
}

QString*
SWGSuccessOrderData::getOrderId() {
    return order_id;
}
void
SWGSuccessOrderData::setOrderId(QString* order_id) {
    this->order_id = order_id;
}

QString*
SWGSuccessOrderData::getStatus() {
    return status;
}
void
SWGSuccessOrderData::setStatus(QString* status) {
    this->status = status;
}

QString*
SWGSuccessOrderData::getHumanTime() {
    return human_time;
}
void
SWGSuccessOrderData::setHumanTime(QString* human_time) {
    this->human_time = human_time;
}



} /* namespace Swagger */

