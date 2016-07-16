/*
 * SWGRateVolDataResponse.h
 * 
 * 
 */

#ifndef SWGRateVolDataResponse_H_
#define SWGRateVolDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGRateVolData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGRateVolDataResponse: public SWGObject {
public:
    SWGRateVolDataResponse();
    SWGRateVolDataResponse(QString* json);
    virtual ~SWGRateVolDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGRateVolDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGRateVolData*>* getMessage();
    void setMessage(QList<SWGRateVolData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGRateVolData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGRateVolDataResponse_H_ */
