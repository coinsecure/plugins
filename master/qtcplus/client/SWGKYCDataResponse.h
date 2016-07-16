/*
 * SWGKYCDataResponse.h
 * 
 * 
 */

#ifndef SWGKYCDataResponse_H_
#define SWGKYCDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGKYCData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGKYCDataResponse: public SWGObject {
public:
    SWGKYCDataResponse();
    SWGKYCDataResponse(QString* json);
    virtual ~SWGKYCDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGKYCDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGKYCData*>* getMessage();
    void setMessage(QList<SWGKYCData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGKYCData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGKYCDataResponse_H_ */
