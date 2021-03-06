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


#include "SWGTimeData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGTimeData::SWGTimeData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGTimeData::SWGTimeData() {
    init();
}

SWGTimeData::~SWGTimeData() {
    this->cleanup();
}

void
SWGTimeData::init() {
    time = 0L;
    verified_time = 0L;
    completed_time = 0L;
}

void
SWGTimeData::cleanup() {
    


}

SWGTimeData*
SWGTimeData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTimeData::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&time, pJson["time"], "qint64", "");
    ::Swagger::setValue(&verified_time, pJson["verified_time"], "qint64", "");
    ::Swagger::setValue(&completed_time, pJson["completed_time"], "qint64", "");
}

QString
SWGTimeData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGTimeData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    obj->insert("time", QJsonValue(time));

    obj->insert("verified_time", QJsonValue(verified_time));

    obj->insert("completed_time", QJsonValue(completed_time));

    return obj;
}

qint64
SWGTimeData::getTime() {
    return time;
}
void
SWGTimeData::setTime(qint64 time) {
    this->time = time;
}

qint64
SWGTimeData::getVerifiedTime() {
    return verified_time;
}
void
SWGTimeData::setVerifiedTime(qint64 verified_time) {
    this->verified_time = verified_time;
}

qint64
SWGTimeData::getCompletedTime() {
    return completed_time;
}
void
SWGTimeData::setCompletedTime(qint64 completed_time) {
    this->completed_time = completed_time;
}



} /* namespace Swagger */

