/*
 * SWGTradeCoinWithdrawDataResponse.h
 * 
 * 
 */

#ifndef SWGTradeCoinWithdrawDataResponse_H_
#define SWGTradeCoinWithdrawDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGTradeCoinWithdrawData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGTradeCoinWithdrawDataResponse: public SWGObject {
public:
    SWGTradeCoinWithdrawDataResponse();
    SWGTradeCoinWithdrawDataResponse(QString* json);
    virtual ~SWGTradeCoinWithdrawDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGTradeCoinWithdrawDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGTradeCoinWithdrawData*>* getMessage();
    void setMessage(QList<SWGTradeCoinWithdrawData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGTradeCoinWithdrawData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGTradeCoinWithdrawDataResponse_H_ */
