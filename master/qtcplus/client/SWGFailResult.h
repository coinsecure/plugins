/*
 * SWGFailResult.h
 * 
 * 
 */

#ifndef SWGFailResult_H_
#define SWGFailResult_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGJsValue.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGFailResult: public SWGObject {
public:
    SWGFailResult();
    SWGFailResult(QString* json);
    virtual ~SWGFailResult();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGFailResult* fromJson(QString &jsonString);

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

#endif /* SWGFailResult_H_ */
