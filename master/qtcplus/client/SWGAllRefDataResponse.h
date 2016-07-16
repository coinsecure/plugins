/*
 * SWGAllRefDataResponse.h
 * 
 * 
 */

#ifndef SWGAllRefDataResponse_H_
#define SWGAllRefDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGAllRefData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGAllRefDataResponse: public SWGObject {
public:
    SWGAllRefDataResponse();
    SWGAllRefDataResponse(QString* json);
    virtual ~SWGAllRefDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGAllRefDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGAllRefData*>* getMessage();
    void setMessage(QList<SWGAllRefData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGAllRefData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGAllRefDataResponse_H_ */
