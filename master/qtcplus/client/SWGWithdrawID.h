/*
 * SWGWithdrawID.h
 * 
 * 
 */

#ifndef SWGWithdrawID_H_
#define SWGWithdrawID_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGWithdrawID: public SWGObject {
public:
    SWGWithdrawID();
    SWGWithdrawID(QString* json);
    virtual ~SWGWithdrawID();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGWithdrawID* fromJson(QString &jsonString);

    QString* getWithdrawID();
    void setWithdrawID(QString* withdrawID);

private:
    QString* withdrawID;
};

} /* namespace Swagger */

#endif /* SWGWithdrawID_H_ */
