/*
 * SWGSuccCoinRefDataResponse.h
 * 
 * 
 */

#ifndef SWGSuccCoinRefDataResponse_H_
#define SWGSuccCoinRefDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGSuccCoinRefData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGSuccCoinRefDataResponse: public SWGObject {
public:
    SWGSuccCoinRefDataResponse();
    SWGSuccCoinRefDataResponse(QString* json);
    virtual ~SWGSuccCoinRefDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGSuccCoinRefDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGSuccCoinRefData*>* getMessage();
    void setMessage(QList<SWGSuccCoinRefData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGSuccCoinRefData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGSuccCoinRefDataResponse_H_ */
