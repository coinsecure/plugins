/*
 * SWGWalletsDataResponse.h
 * 
 * 
 */

#ifndef SWGWalletsDataResponse_H_
#define SWGWalletsDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGWalletsData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGWalletsDataResponse: public SWGObject {
public:
    SWGWalletsDataResponse();
    SWGWalletsDataResponse(QString* json);
    virtual ~SWGWalletsDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGWalletsDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGWalletsData*>* getMessage();
    void setMessage(QList<SWGWalletsData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGWalletsData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGWalletsDataResponse_H_ */
