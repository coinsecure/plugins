/*
 * SWGSuccessResult.h
 * 
 * 
 */

#ifndef SWGSuccessResult_H_
#define SWGSuccessResult_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGJsValue.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGSuccessResult: public SWGObject {
public:
    SWGSuccessResult();
    SWGSuccessResult(QString* json);
    virtual ~SWGSuccessResult();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGSuccessResult* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGJsValue* getMessage();
    void setMessage(SWGJsValue* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGJsValue* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGSuccessResult_H_ */
