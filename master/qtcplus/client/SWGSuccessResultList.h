/*
 * SWGSuccessResultList.h
 * 
 * 
 */

#ifndef SWGSuccessResultList_H_
#define SWGSuccessResultList_H_

#include <QJsonObject>


#include "QDateTime.h"
#include <QList>
#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGSuccessResultList: public SWGObject {
public:
    SWGSuccessResultList();
    SWGSuccessResultList(QString* json);
    virtual ~SWGSuccessResultList();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGSuccessResultList* fromJson(QString &jsonString);

    bool getSuccess();
    void setSuccess(bool success);
QList<QString*>* getMessage();
    void setMessage(QList<QString*>* message);
QString* getMethod();
    void setMethod(QString* method);
QString* getTitle();
    void setTitle(QString* title);
QDateTime* getTime();
    void setTime(QDateTime* time);

private:
    bool success;
QList<QString*>* message;
QString* method;
QString* title;
QDateTime* time;
};

} /* namespace Swagger */

#endif /* SWGSuccessResultList_H_ */
