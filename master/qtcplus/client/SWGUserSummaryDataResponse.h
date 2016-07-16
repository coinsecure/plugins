/*
 * SWGUserSummaryDataResponse.h
 * 
 * 
 */

#ifndef SWGUserSummaryDataResponse_H_
#define SWGUserSummaryDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGUserSummaryData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGUserSummaryDataResponse: public SWGObject {
public:
    SWGUserSummaryDataResponse();
    SWGUserSummaryDataResponse(QString* json);
    virtual ~SWGUserSummaryDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGUserSummaryDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGUserSummaryData* getMessage();
    void setMessage(SWGUserSummaryData* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGUserSummaryData* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGUserSummaryDataResponse_H_ */
