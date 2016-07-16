/*
 * SWGCoinDepDataResponse.h
 * 
 * 
 */

#ifndef SWGCoinDepDataResponse_H_
#define SWGCoinDepDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGCoinDepData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGCoinDepDataResponse: public SWGObject {
public:
    SWGCoinDepDataResponse();
    SWGCoinDepDataResponse(QString* json);
    virtual ~SWGCoinDepDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGCoinDepDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGCoinDepData*>* getMessage();
    void setMessage(QList<SWGCoinDepData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGCoinDepData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGCoinDepDataResponse_H_ */
