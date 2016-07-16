/*
 * SWGRateDataResponse.h
 * 
 * 
 */

#ifndef SWGRateDataResponse_H_
#define SWGRateDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGRateData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGRateDataResponse: public SWGObject {
public:
    SWGRateDataResponse();
    SWGRateDataResponse(QString* json);
    virtual ~SWGRateDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGRateDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGRateData* getMessage();
    void setMessage(SWGRateData* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGRateData* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGRateDataResponse_H_ */
