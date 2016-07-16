/*
 * SWGNewWallet.h
 * 
 * 
 */

#ifndef SWGNewWallet_H_
#define SWGNewWallet_H_

#include <QJsonObject>


#include <QString>

#include "SWGObject.h"


namespace Swagger {

class SWGNewWallet: public SWGObject {
public:
    SWGNewWallet();
    SWGNewWallet(QString* json);
    virtual ~SWGNewWallet();
    void init();
    void cleanup();

    QString asJson ();
    QJsonObject* asJsonObject();
    void fromJsonObject(QJsonObject &json);
    SWGNewWallet* fromJson(QString &jsonString);

    QString* getWalletName();
    void setWalletName(QString* walletName);
QString* getInfo();
    void setInfo(QString* info);

private:
    QString* walletName;
QString* info;
};

} /* namespace Swagger */

#endif /* SWGNewWallet_H_ */
