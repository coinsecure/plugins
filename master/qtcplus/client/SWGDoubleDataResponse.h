/*
 * SWGDoubleDataResponse.h
 * 
 * 
 */

#ifndef SWGDoubleDataResponse_H_
#define SWGDoubleDataResponse_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGDoubleData.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGDoubleDataResponse: public SWGObject {
public:
    SWGDoubleDataResponse();
    SWGDoubleDataResponse(QString* json);
    virtual ~SWGDoubleDataResponse();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGDoubleDataResponse* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGDoubleData* getMessage();
    void setMessage(SWGDoubleData* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGDoubleData* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGDoubleDataResponse_H_ */
