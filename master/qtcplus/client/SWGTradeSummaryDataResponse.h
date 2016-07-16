/*
 * SWGTradeSummaryDataResponse.h
 * 
 * 
 */

#ifndef SWGTradeSummaryDataResponse_H_
#define SWGTradeSummaryDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGTradeSummaryData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGTradeSummaryDataResponse: public SWGObject {
public:
    SWGTradeSummaryDataResponse();
    SWGTradeSummaryDataResponse(QString* json);
    virtual ~SWGTradeSummaryDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGTradeSummaryDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGTradeSummaryData* getMessage();
    void setMessage(SWGTradeSummaryData* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGTradeSummaryData* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGTradeSummaryDataResponse_H_ */
