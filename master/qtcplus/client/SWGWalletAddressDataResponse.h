/*
 * SWGWalletAddressDataResponse.h
 * 
 * 
 */

#ifndef SWGWalletAddressDataResponse_H_
#define SWGWalletAddressDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGWalletAddressData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGWalletAddressDataResponse: public SWGObject {
public:
    SWGWalletAddressDataResponse();
    SWGWalletAddressDataResponse(QString* json);
    virtual ~SWGWalletAddressDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGWalletAddressDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGWalletAddressData*>* getMessage();
    void setMessage(QList<SWGWalletAddressData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGWalletAddressData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGWalletAddressDataResponse_H_ */
