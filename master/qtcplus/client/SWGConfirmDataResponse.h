/*
 * SWGConfirmDataResponse.h
 * 
 * 
 */

#ifndef SWGConfirmDataResponse_H_
#define SWGConfirmDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGConfirmData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGConfirmDataResponse: public SWGObject {
public:
    SWGConfirmDataResponse();
    SWGConfirmDataResponse(QString* json);
    virtual ~SWGConfirmDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGConfirmDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGConfirmData* getMessage();
    void setMessage(SWGConfirmData* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGConfirmData* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGConfirmDataResponse_H_ */
