/*
 * SWGVolDataResponse.h
 * 
 * 
 */

#ifndef SWGVolDataResponse_H_
#define SWGVolDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGVolData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGVolDataResponse: public SWGObject {
public:
    SWGVolDataResponse();
    SWGVolDataResponse(QString* json);
    virtual ~SWGVolDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGVolDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGVolData* getMessage();
    void setMessage(SWGVolData* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGVolData* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGVolDataResponse_H_ */
