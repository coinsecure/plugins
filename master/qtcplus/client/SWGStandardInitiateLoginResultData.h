/*
 * SWGStandardInitiateLoginResultData.h
 * 
 * 
 */

#ifndef SWGStandardInitiateLoginResultData_H_
#define SWGStandardInitiateLoginResultData_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGSuccessInitiateLoginResponse.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGStandardInitiateLoginResultData: public SWGObject {
public:
    SWGStandardInitiateLoginResultData();
    SWGStandardInitiateLoginResultData(QString* json);
    virtual ~SWGStandardInitiateLoginResultData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGStandardInitiateLoginResultData* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGSuccessInitiateLoginResponse* getMessage();
    void setMessage(SWGSuccessInitiateLoginResponse* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGSuccessInitiateLoginResponse* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGStandardInitiateLoginResultData_H_ */
