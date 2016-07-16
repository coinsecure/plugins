/*
 * SWGOrderDataResponse.h
 * 
 * 
 */

#ifndef SWGOrderDataResponse_H_
#define SWGOrderDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGOrderData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGOrderDataResponse: public SWGObject {
public:
    SWGOrderDataResponse();
    SWGOrderDataResponse(QString* json);
    virtual ~SWGOrderDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGOrderDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGOrderData*>* getMessage();
    void setMessage(QList<SWGOrderData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGOrderData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGOrderDataResponse_H_ */
