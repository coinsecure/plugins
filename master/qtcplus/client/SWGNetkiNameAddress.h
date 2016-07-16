/*
 * SWGNetkiNameAddress.h
 * 
 * 
 */

#ifndef SWGNetkiNameAddress_H_
#define SWGNetkiNameAddress_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGNetkiNameAddress: public SWGObject {
public:
    SWGNetkiNameAddress();
    SWGNetkiNameAddress(QString* json);
    virtual ~SWGNetkiNameAddress();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGNetkiNameAddress* fromJson(QString &jsonString);

    QString* getNetkiName();
    void setNetkiName(QString* netkiName);
QString* getAddress();
    void setAddress(QString* address);

private:
    QString* netkiName;
QString* address;
};

} /* namespace Swagger */

#endif /* SWGNetkiNameAddress_H_ */
