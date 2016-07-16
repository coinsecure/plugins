/*
 * SWGStandardLoginResultData.h
 * 
 * 
 */

#ifndef SWGStandardLoginResultData_H_
#define SWGStandardLoginResultData_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGSuccessLoginResponse.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGStandardLoginResultData: public SWGObject {
public:
    SWGStandardLoginResultData();
    SWGStandardLoginResultData(QString* json);
    virtual ~SWGStandardLoginResultData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGStandardLoginResultData* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGSuccessLoginResponse* getMessage();
    void setMessage(SWGSuccessLoginResponse* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGSuccessLoginResponse* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGStandardLoginResultData_H_ */
