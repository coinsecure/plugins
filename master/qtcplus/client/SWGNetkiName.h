/*
 * SWGNetkiName.h
 * 
 * 
 */

#ifndef SWGNetkiName_H_
#define SWGNetkiName_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGNetkiName: public SWGObject {
public:
    SWGNetkiName();
    SWGNetkiName(QString* json);
    virtual ~SWGNetkiName();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGNetkiName* fromJson(QString &jsonString);

    QString* getNetkiName();
    void setNetkiName(QString* netkiName);

private:
    QString* netkiName;
};

} /* namespace Swagger */

#endif /* SWGNetkiName_H_ */
