/*
 * SWGValidAddressSearchDataResponse.h
 * 
 * 
 */

#ifndef SWGValidAddressSearchDataResponse_H_
#define SWGValidAddressSearchDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGValidAddressSearchData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGValidAddressSearchDataResponse: public SWGObject {
public:
    SWGValidAddressSearchDataResponse();
    SWGValidAddressSearchDataResponse(QString* json);
    virtual ~SWGValidAddressSearchDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGValidAddressSearchDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGValidAddressSearchData* getMessage();
    void setMessage(SWGValidAddressSearchData* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGValidAddressSearchData* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGValidAddressSearchDataResponse_H_ */
