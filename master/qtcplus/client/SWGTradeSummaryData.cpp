
#include "SWGTradeSummaryData.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGTradeSummaryData::SWGTradeSummaryData(QString* json) {
    init();
    this->fromJson(*json);
}

SWGTradeSummaryData::SWGTradeSummaryData() {
    init();
}

SWGTradeSummaryData::~SWGTradeSummaryData() {
    this->cleanup();
}

void
SWGTradeSummaryData::init() {
    completedAsksSum = 0L;
completedBidsSum = 0L;
completedAsksCount = 0L;
completedBidsCount = 0L;
pendingAsksCount = 0L;
pendingBidsCount = 0L;
}

void
SWGTradeSummaryData::cleanup() {
    





}

SWGTradeSummaryData*
SWGTradeSummaryData::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTradeSummaryData::fromJsonObject(QJsonObject &pJson) {
    setValue(&completedAsksSum, pJson["completedAsksSum"], "qint64", "");
setValue(&completedBidsSum, pJson["completedBidsSum"], "qint64", "");
setValue(&completedAsksCount, pJson["completedAsksCount"], "qint64", "");
setValue(&completedBidsCount, pJson["completedBidsCount"], "qint64", "");
setValue(&pendingAsksCount, pJson["pendingAsksCount"], "qint64", "");
setValue(&pendingBidsCount, pJson["pendingBidsCount"], "qint64", "");
}

QString
SWGTradeSummaryData::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGTradeSummaryData::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    obj->insert("completedAsksSum", QJsonValue(completedAsksSum));
obj->insert("completedBidsSum", QJsonValue(completedBidsSum));
obj->insert("completedAsksCount", QJsonValue(completedAsksCount));
obj->insert("completedBidsCount", QJsonValue(completedBidsCount));
obj->insert("pendingAsksCount", QJsonValue(pendingAsksCount));
obj->insert("pendingBidsCount", QJsonValue(pendingBidsCount));

    return obj;
}

qint64
SWGTradeSummaryData::getCompletedAsksSum() {
    return completedAsksSum;
}
void
SWGTradeSummaryData::setCompletedAsksSum(qint64 completedAsksSum) {
    this->completedAsksSum = completedAsksSum;
}

qint64
SWGTradeSummaryData::getCompletedBidsSum() {
    return completedBidsSum;
}
void
SWGTradeSummaryData::setCompletedBidsSum(qint64 completedBidsSum) {
    this->completedBidsSum = completedBidsSum;
}

qint64
SWGTradeSummaryData::getCompletedAsksCount() {
    return completedAsksCount;
}
void
SWGTradeSummaryData::setCompletedAsksCount(qint64 completedAsksCount) {
    this->completedAsksCount = completedAsksCount;
}

qint64
SWGTradeSummaryData::getCompletedBidsCount() {
    return completedBidsCount;
}
void
SWGTradeSummaryData::setCompletedBidsCount(qint64 completedBidsCount) {
    this->completedBidsCount = completedBidsCount;
}

qint64
SWGTradeSummaryData::getPendingAsksCount() {
    return pendingAsksCount;
}
void
SWGTradeSummaryData::setPendingAsksCount(qint64 pendingAsksCount) {
    this->pendingAsksCount = pendingAsksCount;
}

qint64
SWGTradeSummaryData::getPendingBidsCount() {
    return pendingBidsCount;
}
void
SWGTradeSummaryData::setPendingBidsCount(qint64 pendingBidsCount) {
    this->pendingBidsCount = pendingBidsCount;
}



} /* namespace Swagger */

