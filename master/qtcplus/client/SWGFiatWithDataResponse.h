/*
 * SWGFiatWithDataResponse.h
 * 
 * 
 */

#ifndef SWGFiatWithDataResponse_H_
#define SWGFiatWithDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGFiatWithData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGFiatWithDataResponse: public SWGObject {
public:
    SWGFiatWithDataResponse();
    SWGFiatWithDataResponse(QString* json);
    virtual ~SWGFiatWithDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGFiatWithDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGFiatWithData*>* getMessage();
    void setMessage(QList<SWGFiatWithData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGFiatWithData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGFiatWithDataResponse_H_ */
