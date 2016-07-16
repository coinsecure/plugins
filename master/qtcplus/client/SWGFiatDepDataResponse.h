/*
 * SWGFiatDepDataResponse.h
 * 
 * 
 */

#ifndef SWGFiatDepDataResponse_H_
#define SWGFiatDepDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGFiatDepData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGFiatDepDataResponse: public SWGObject {
public:
    SWGFiatDepDataResponse();
    SWGFiatDepDataResponse(QString* json);
    virtual ~SWGFiatDepDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGFiatDepDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGFiatDepData*>* getMessage();
    void setMessage(QList<SWGFiatDepData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGFiatDepData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGFiatDepDataResponse_H_ */
