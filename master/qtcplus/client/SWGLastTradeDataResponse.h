/*
 * SWGLastTradeDataResponse.h
 * 
 * 
 */

#ifndef SWGLastTradeDataResponse_H_
#define SWGLastTradeDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGLastTradeData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGLastTradeDataResponse: public SWGObject {
public:
    SWGLastTradeDataResponse();
    SWGLastTradeDataResponse(QString* json);
    virtual ~SWGLastTradeDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGLastTradeDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGLastTradeData* getMessage();
    void setMessage(SWGLastTradeData* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGLastTradeData* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGLastTradeDataResponse_H_ */
