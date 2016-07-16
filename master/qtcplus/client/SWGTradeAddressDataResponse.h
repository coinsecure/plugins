/*
 * SWGTradeAddressDataResponse.h
 * 
 * 
 */

#ifndef SWGTradeAddressDataResponse_H_
#define SWGTradeAddressDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGTradeAddressData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGTradeAddressDataResponse: public SWGObject {
public:
    SWGTradeAddressDataResponse();
    SWGTradeAddressDataResponse(QString* json);
    virtual ~SWGTradeAddressDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGTradeAddressDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGTradeAddressData*>* getMessage();
    void setMessage(QList<SWGTradeAddressData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGTradeAddressData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGTradeAddressDataResponse_H_ */
