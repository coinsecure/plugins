/*
 * SWGWalletSummaryDataResponse.h
 * 
 * 
 */

#ifndef SWGWalletSummaryDataResponse_H_
#define SWGWalletSummaryDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGWalletSummaryData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGWalletSummaryDataResponse: public SWGObject {
public:
    SWGWalletSummaryDataResponse();
    SWGWalletSummaryDataResponse(QString* json);
    virtual ~SWGWalletSummaryDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGWalletSummaryDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGWalletSummaryData* getMessage();
    void setMessage(SWGWalletSummaryData* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGWalletSummaryData* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGWalletSummaryDataResponse_H_ */
