/*
 * SWGNewAddress.h
 * 
 * 
 */

#ifndef SWGNewAddress_H_
#define SWGNewAddress_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGNewAddress: public SWGObject {
public:
    SWGNewAddress();
    SWGNewAddress(QString* json);
    virtual ~SWGNewAddress();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGNewAddress* fromJson(QString &jsonString);

    QString* getWalletID();
    void setWalletID(QString* walletID);
QString* getInfo();
    void setInfo(QString* info);

private:
    QString* walletID;
QString* info;
};

} /* namespace Swagger */

#endif /* SWGNewAddress_H_ */
