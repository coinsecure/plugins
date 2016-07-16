/*
 * SWGBankSummaryDataResponse.h
 * 
 * 
 */

#ifndef SWGBankSummaryDataResponse_H_
#define SWGBankSummaryDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGBankSummaryData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGBankSummaryDataResponse: public SWGObject {
public:
    SWGBankSummaryDataResponse();
    SWGBankSummaryDataResponse(QString* json);
    virtual ~SWGBankSummaryDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGBankSummaryDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGBankSummaryData* getMessage();
    void setMessage(SWGBankSummaryData* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGBankSummaryData* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGBankSummaryDataResponse_H_ */
