/*
 * SWGRateDiffDataResponse.h
 * 
 * 
 */

#ifndef SWGRateDiffDataResponse_H_
#define SWGRateDiffDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGRateDiffData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGRateDiffDataResponse: public SWGObject {
public:
    SWGRateDiffDataResponse();
    SWGRateDiffDataResponse(QString* json);
    virtual ~SWGRateDiffDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGRateDiffDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGRateDiffData* getMessage();
    void setMessage(SWGRateDiffData* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGRateDiffData* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGRateDiffDataResponse_H_ */
