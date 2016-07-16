/*
 * SWGMinFiat.h
 * 
 * 
 */

#ifndef SWGMinFiat_H_
#define SWGMinFiat_H_

#include <QJsonObject>



#include "SWGObject.h"


namespace Swagger {

class SWGMinFiat: public SWGObject {
public:
    SWGMinFiat();
    SWGMinFiat(QString* json);
    virtual ~SWGMinFiat();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGMinFiat* fromJson(QString &jsonString);

    qint64 getMinFiat();
    void setMinFiat(qint64 minFiat);

private:
    qint64 minFiat;
};

} /* namespace Swagger */

#endif /* SWGMinFiat_H_ */
