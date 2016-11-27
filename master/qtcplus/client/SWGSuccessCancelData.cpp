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


#include "SWGSuccessCancelData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGSuccessCancelData::SWGSuccessCancelData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGSuccessCancelData::SWGSuccessCancelData() {
    init();
}

SWGSuccessCancelData::~SWGSuccessCancelData() {
    this->cleanup();
}

void
SWGSuccessCancelData::init() {
    vol = 0L;
    rate = 0L;
}

void
SWGSuccessCancelData::cleanup() {
    

}

SWGSuccessCancelData*
SWGSuccessCancelData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGSuccessCancelData::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&vol, pJson["vol"], "qint64", "");
    ::Swagger::setValue(&rate, pJson["rate"], "qint64", "");
}

QString
SWGSuccessCancelData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGSuccessCancelData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    obj->insert("vol", QJsonValue(vol));

    obj->insert("rate", QJsonValue(rate));

    return obj;
}

qint64
SWGSuccessCancelData::getVol() {
    return vol;
}
void
SWGSuccessCancelData::setVol(qint64 vol) {
    this->vol = vol;
}

qint64
SWGSuccessCancelData::getRate() {
    return rate;
}
void
SWGSuccessCancelData::setRate(qint64 rate) {
    this->rate = rate;
}



} /* namespace Swagger */
