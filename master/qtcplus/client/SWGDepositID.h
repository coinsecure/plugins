/*
 * SWGDepositID.h
 * 
 * 
 */

#ifndef SWGDepositID_H_
#define SWGDepositID_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGDepositID: public SWGObject {
public:
    SWGDepositID();
    SWGDepositID(QString* json);
    virtual ~SWGDepositID();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGDepositID* fromJson(QString &jsonString);

    QString* getDepositID();
    void setDepositID(QString* depositID);

private:
    QString* depositID;
};

} /* namespace Swagger */

#endif /* SWGDepositID_H_ */
