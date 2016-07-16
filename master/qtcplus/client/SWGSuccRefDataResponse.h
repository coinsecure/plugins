/*
 * SWGSuccRefDataResponse.h
 * 
 * 
 */

#ifndef SWGSuccRefDataResponse_H_
#define SWGSuccRefDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGSuccRefData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGSuccRefDataResponse: public SWGObject {
public:
    SWGSuccRefDataResponse();
    SWGSuccRefDataResponse(QString* json);
    virtual ~SWGSuccRefDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGSuccRefDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGSuccRefData*>* getMessage();
    void setMessage(QList<SWGSuccRefData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGSuccRefData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGSuccRefDataResponse_H_ */
