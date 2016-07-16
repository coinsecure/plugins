/*
 * SWGJsValue.h
 * 
 * 
 */

#ifndef SWGJsValue_H_
#define SWGJsValue_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGJsValue: public SWGObject {
public:
    SWGJsValue();
    SWGJsValue(QString* json);
    virtual ~SWGJsValue();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGJsValue* fromJson(QString &jsonString);

    
private:
    };

} /* namespace Swagger */

#endif /* SWGJsValue_H_ */
