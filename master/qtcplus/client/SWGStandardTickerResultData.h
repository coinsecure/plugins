/*
 * SWGStandardTickerResultData.h
 * 
 * 
 */

#ifndef SWGStandardTickerResultData_H_
#define SWGStandardTickerResultData_H_

#include <QJsonObject>


#include "QDateTime.h"
#include "SWGSuccessTickerResponse.h"
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGStandardTickerResultData: public SWGObject {
public:
    SWGStandardTickerResultData();
    SWGStandardTickerResultData(QString* json);
    virtual ~SWGStandardTickerResultData();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGStandardTickerResultData* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
SWGSuccessTickerResponse* getMessage();
    void setMessage(SWGSuccessTickerResponse* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
SWGSuccessTickerResponse* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGStandardTickerResultData_H_ */
