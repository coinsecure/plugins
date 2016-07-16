/*
 * SWGFiatBankDataResponse.h
 * 
 * 
 */

#ifndef SWGFiatBankDataResponse_H_
#define SWGFiatBankDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGFiatBankData.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGFiatBankDataResponse: public SWGObject {
public:
    SWGFiatBankDataResponse();
    SWGFiatBankDataResponse(QString* json);
    virtual ~SWGFiatBankDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGFiatBankDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<SWGFiatBankData*>* getMessage();
    void setMessage(QList<SWGFiatBankData*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<SWGFiatBankData*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGFiatBankDataResponse_H_ */
