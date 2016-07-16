/*
 * SWGCode.h
 * 
 * 
 */

#ifndef SWGCode_H_
#define SWGCode_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGCode: public SWGObject {
public:
    SWGCode();
    SWGCode(QString* json);
    virtual ~SWGCode();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGCode* fromJson(QString &jsonString);

    QString* getCode();
    void setCode(QString* code);

private:
    QString* code;
};

} /* namespace Swagger */

#endif /* SWGCode_H_ */
